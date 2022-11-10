package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CursoMaterial {
	private String url;

	@JsonIgnore
	@OneToOne
	private Curso curso;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CursoMaterial [curso=" + curso + ", url=" + url + "]";
	}

	public CursoMaterial(Curso curso, String url) {
		super();
		this.curso = curso;
		this.url = url;
	}

	public CursoMaterial() {

	}

}
