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

import models.ContenidoModel;
import services.ContenidoService;

@RestController
@RequestMapping("api/Contenido")
public class ContenidoController {
	
	@Autowired
	private ContenidoService contenidoservicio;
	
	@GetMapping
	public ArrayList<ContenidoModel> getContenido(){
		
		return this.contenidoservicio.getContenido();
	}
	
	@PostMapping
	public ContenidoModel saveContenido(@RequestBody ContenidoModel contenido) {
		return this.contenidoservicio.saveContenido(contenido);
		
	}
	
	@GetMapping(path="/{id}")
	public Optional<ContenidoModel> getContenidoById(@PathVariable long id){
		return this.contenidoservicio.getById(id);
	}

}
