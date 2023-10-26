package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ContenidoModel;

@Repository
public interface IContenidoRepository extends JpaRepository<ContenidoModel,Long>{

}
