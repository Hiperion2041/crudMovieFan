package models;

import jakarta.persistence.*;

@Entity
@Table(name="contenido")
public class ContenidoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Nombre;
	
	@Column
	private String Plataforma;
	
	@Column
	private String Resumen;
	
	@Column
	private String Categorizacion;
	
	@Column
	private int Temporada;
	
	@Column
	private int Capitulo;
	
	@Column
	private int Secuelas;
	
	@Column
	private int Tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPlataforma() {
		return Plataforma;
	}

	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}

	public String getResumen() {
		return Resumen;
	}

	public void setResumen(String resumen) {
		Resumen = resumen;
	}

	public String getCategorizacion() {
		return Categorizacion;
	}

	public void setCategorizacion(String categorizacion) {
		Categorizacion = categorizacion;
	}

	public int getTemporada() {
		return Temporada;
	}

	public void setTemporada(int temporada) {
		Temporada = temporada;
	}

	public int getCapitulo() {
		return Capitulo;
	}

	public void setCapitulo(int capitulo) {
		Capitulo = capitulo;
	}

	public int getSecuelas() {
		return Secuelas;
	}

	public void setSecuelas(int secuelas) {
		Secuelas = secuelas;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	
	
}
