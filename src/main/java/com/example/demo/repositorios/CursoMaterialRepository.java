package com.example.demo.repositorios;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.CursoMaterial;


	public interface CursoMaterialRepository extends CrudRepository<CursoMaterial, Long> {

		public List<CursoMaterial> findAll();
	}


