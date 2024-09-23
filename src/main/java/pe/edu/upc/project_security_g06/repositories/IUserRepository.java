package pe.edu.upc.project_security_g06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.project_security_g06.dtos.UsuarioDispositivoRolDTO;
import pe.edu.upc.project_security_g06.entities.Users;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    public Users findOneByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);


    @Query(value= "SELECT u.us_nombre, u.us_apellido,  d.nombre_dispositivo, r.rol)"+
            "FROM users u"+
            "JOIN roles r"+
            "ON u.id_usario = r.user_id"+
            "JOIN Dispositivo d"+
            "ON u.id_usario = d.id_usario",nativeQuery = true)
    public List<String[]> findUsuariosWithDevicesAndRoles();


    @Query(value = "SELECT u.us_nombre, u.us_apellido, a.nombre_alergias, e.nombre_enfermedad " +
            "FROM users u " +
            "JOIN historial_clinico hc ON u.id_usario = hc.id_usuario " +
            "JOIN detalle_medico dm ON hc.id_historial_clinico = dm.id_historial_clinico " +
            "JOIN alergias a ON dm.id_alergias = a.id_alergias " +
            "JOIN enfermedades e ON dm.id_enfermedades = e.id_enfermedades " +
            "WHERE u.id_usario = :idUsuario", nativeQuery = true)
    List<String[]> findInformacionClinicaByUsuarioId(Long idUsuario);

    @Query(value = "SELECT u.us_nombre, u.us_apellido, COUNT(d.Idispositivo) AS cantidad_dispositivos " +
            "FROM users u " +
            "LEFT JOIN dispositivo d ON u.IdUsario = d.IdUsario " +
            "GROUP BY u.us_nombre, u.us_apellido", nativeQuery = true)
    List<String[]> findCantidadDispositivosPorUsuario();

}