package services;

import org.springframework.stereotype.Service;

import models.UsuarioModel;
import repositories.IUsuarioRepositori;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioService {
	
	@Autowired
	IUsuarioRepositori usuarioRepositori;
	
	public ArrayList<UsuarioModel> getUsuarios(){
		
		return (ArrayList<UsuarioModel>) usuarioRepositori.findAll();
	}
	
	public UsuarioModel saveUsuario(UsuarioModel usuario) {
		return usuarioRepositori.save(usuario);
	}
	
	
	public Optional<UsuarioModel> getById(long id){
		
		return usuarioRepositori.findById(id);
		
	}
	

}
