package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.ContenidoModel;
import repositories.IContenidoRepository;

@Service
public class ContenidoService {
	
	
	@Autowired
	IContenidoRepository contenidorepositori;
	
	public ArrayList<ContenidoModel> getContenido(){
		
		return (ArrayList<ContenidoModel>) contenidorepositori.findAll();
	}
	
	public ContenidoModel saveContenido(ContenidoModel contenido) {
		
		return contenidorepositori.save(contenido);
	}
	
	public Optional<ContenidoModel> getById(long id){
		
		return contenidorepositori.findById(id);
	}
}
