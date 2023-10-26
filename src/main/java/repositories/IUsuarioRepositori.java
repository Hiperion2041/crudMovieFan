package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.UsuarioModel;

@Repository
public interface IUsuarioRepositori extends JpaRepository<UsuarioModel,Long>{
	
	

}
