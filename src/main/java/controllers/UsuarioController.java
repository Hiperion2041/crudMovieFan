package controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UsuarioModel;
import services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservicio;
	@GetMapping
	public ArrayList<UsuarioModel> getUsuario(){
		
		return this.usuarioservicio.getUsuarios();
	}
	
	
	@PostMapping
	public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioservicio.saveUsuario(usuario);
	}
	
	@GetMapping(path="/{id}")
	public Optional<UsuarioModel> getUsuarioById(@PathVariable long id){
		return this.usuarioservicio.getById(id);
	}
	

}
