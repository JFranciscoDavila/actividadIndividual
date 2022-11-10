package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(mappedBy = "curso")
	private CursoMaterial cursoMaterial;
	
	public CursoMaterial getCursoMaterial() {
		return cursoMaterial;
	}

	public void setCursoMaterial(CursoMaterial cursoMaterial) {
		this.cursoMaterial = cursoMaterial;
	}

	String titulo;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Curso( String titulo) {
		super();
		
		this.titulo = titulo;
	}

	public Curso() {
		
	}
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + "]";
	}

	
}
