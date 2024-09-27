package pe.edu.upc.project_security_g06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
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


    @Query(value= "SELECT u.us_nombre, u.us_apellido,  d.nombre_dispositivo, r.rol"+
            " FROM Users u"+
            " JOIN roles r"+
            " ON u.id_usario = r.user_id"+
            " JOIN Dispositivo d"+
            " ON u.id_usario = d.id_usario",nativeQuery = true)
    public List<String[]> findUsuariosWithDevicesAndRoles();


    @Query(value = "SELECT u.us_nombre, u.us_apellido, a.nombre_alergias, e.nombre_enfermedad\n" +
            "FROM users u\n" +
            "JOIN historial_clinico hc ON u.id_usario = hc.id_usario\n" +
            "JOIN detalle_medico dm ON hc.id_historial_clinico = dm.id_historial_clinico\n" +
            "JOIN alergias a ON dm.id_alergias = a.id_alergias\n" +
            "JOIN enfermedades e ON dm.id_enfermedades = e.id_enfermedades\n" +
            "WHERE u.id_usario = hc.id_usario;", nativeQuery = true)
    public List<String[]> findInformacionClinicaByUsuarioId(@Param("idUsuario") int idUsuario);

    @Query(value = "SELECT CONCAT(u.us_nombre, ' ' ,u.us_apellido) AS Usuario,\n" +
            "       COUNT(DISTINCT a.id_alergias) AS cantidad_alergias,\n" +
            "\t   COUNT(DISTINCT e.id_enfermedades) AS cantidad_enfermedades,\n" +
            "\t   STRING_AGG(DISTINCT e.tipo_enfermedad, ',' ORDER BY e.tipo_enfermedad ) AS tipos_enfermedades\n" +
            "FROM users u\n" +
            "JOIN historial_clinico hc ON u.id_usario = hc.id_usario\n" +
            "JOIN detalle_medico dm ON hc.id_historial_clinico = dm.id_historial_clinico\n" +
            "LEFT JOIN enfermedades e ON e.id_enfermedades = dm.id_enfermedades\n" +
            "LEFT JOIN alergias a ON dm.id_alergias = a.id_alergias\n" +
            "WHERE u.us_nombre like %:username% \n" +
            "GROUP BY u.us_nombre,u.us_apellido;", nativeQuery = true)
    public List<String[]> findConteoAlergiaYtipoEnfermedadXusuario(@Param("username") String username);


}