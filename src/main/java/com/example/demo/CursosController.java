package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorios.CursoMaterialRepository;
import com.example.demo.repositorios.EstudiantesRepository;

@RestController
public class CursosController {

	@Autowired
	EstudiantesRepository Estudiantesrep;
	@Autowired
	CursoMaterialRepository CursoMaterialrep;

	@GetMapping("/Cursos")
	public ResponseEntity<?> getCurso() {

		List<Curso> curso = Estudiantesrep.findAll();
		if (curso.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(curso);
		}
	}

	@GetMapping("/Cursos/{id}")
	public ResponseEntity<?> getCurso(@PathVariable long id) {

		Curso curso = Estudiantesrep.findById(id).orElse(null);
		if (curso == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(curso);
		}

	}

	@GetMapping("/CursoMaterial")
	public ResponseEntity<?> getCursoMaterial() {

		List<CursoMaterial> cursoMaterial = CursoMaterialrep.findAll();
		if (cursoMaterial.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(cursoMaterial);
		}
	}

	@GetMapping("/CursoMaterial/{id}")
	public ResponseEntity<?> getCursoMaterial(@PathVariable long id) {

		CursoMaterial cursoMaterial = CursoMaterialrep.findById(id).orElse(null);
		if (cursoMaterial == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(cursoMaterial);
		}
	}

}
