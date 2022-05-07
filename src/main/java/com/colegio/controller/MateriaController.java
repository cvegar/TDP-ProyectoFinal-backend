package com.colegio.controller;

import com.colegio.entity.Materia;
import com.colegio.service.MateriaServicio;
import com.colegio.service.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rest/materia")
public class MateriaController {


	@Autowired
	private MateriaServicio materiaServicio;
	
	@GetMapping("/listaMateria")
	public ResponseEntity<List<Materia>> listaMateria()
	{
		return ResponseEntity.ok(materiaServicio.listarMaterias());
	}


	@PostMapping
	public ResponseEntity<Materia> insertaMateria(@RequestBody Materia materia) {
		return ResponseEntity.ok(materiaServicio.insertaMateria(materia));
	}


	@PutMapping
	public ResponseEntity<Materia> actualizaMateria(@RequestBody Materia materia)
	{
		return ResponseEntity.ok(materiaServicio.insertaMateria(materia));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarMateria(@PathVariable int id)
	{
	
			materiaServicio.eliminarMateria(id);
				return	ResponseEntity.ok().build();
		
	} 
}
