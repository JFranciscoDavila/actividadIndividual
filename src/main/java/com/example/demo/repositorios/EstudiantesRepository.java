package com.example.demo.repositorios;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Curso;


public interface EstudiantesRepository extends CrudRepository<Curso, Long> {

	public List<Curso> findAll();
}
