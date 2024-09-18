package pe.edu.upc.project_security_g06.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project_security_g06.entities.Alergias;

import java.util.List;

@Repository
public interface IAlergiasRepository extends JpaRepository<Alergias, Integer> {
    @Query("Select a from Alergias  a where a.nombre_alergias like %:nombre%" )
    public List<Alergias> buscar(@Param("nombre") String nombre);
}
