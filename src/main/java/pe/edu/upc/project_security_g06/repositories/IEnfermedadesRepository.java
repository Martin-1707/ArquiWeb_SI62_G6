package pe.edu.upc.project_security_g06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project_security_g06.entities.Enfermedades;

import java.util.List;

@Repository
public interface IEnfermedadesRepository extends JpaRepository<Enfermedades,Integer> {
    @Query("Select e from Enfermedades  e where e.nombre_enfermedad like %:nombre%" )
    public List<Enfermedades> buscar(@Param("nombre") String nombre_enfermedad);
}
