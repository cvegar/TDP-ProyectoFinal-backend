package com.colegio.controller;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Aula;
import com.colegio.entity.Seccion;
import com.colegio.service.AulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.service.SeccionServicio;



@RestController
@RequestMapping("/api/rest/seccion")
public class SeccionController {

	@Autowired
	private SeccionServicio aulaService;

	@Autowired
	private AulaServicio aulaServicio;
	
	@GetMapping
	public ResponseEntity<List<Seccion>> listaSeccion()
	{
		return ResponseEntity.ok(aulaService.listarSecion());
	}

	@GetMapping("/habiles")
	public ResponseEntity<List<Seccion>> listaSeccionesHabiles()
	{
		return ResponseEntity.ok(aulaService.listarSecionesHabiles());
	}


	@PostMapping
	public ResponseEntity<Seccion> insertaSeccion(@RequestBody Seccion seccion)
	{
		return ResponseEntity.ok(aulaService.insertaSecion(seccion));
	}
	@PutMapping
	public ResponseEntity<Seccion> actualizaSeccion(@RequestBody Seccion seccion)
	{
		return ResponseEntity.ok(aulaService.insertaSecion(seccion));
	}

	@GetMapping("/listaAula")
	public ResponseEntity<List<Aula>> listaAula()
	{
		return ResponseEntity.ok(aulaServicio.listarAulas());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarSeccion(@PathVariable int id)
	{
		Optional<Seccion> obj=aulaService.buscarPorId(id);
		if (obj.isPresent()) {
			aulaService.eliminarSecion(id);
				return	ResponseEntity.ok().build();
		}
		else {
				return ResponseEntity.notFound().build();
		}
	} 
}
