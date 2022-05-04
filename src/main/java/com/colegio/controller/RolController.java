package com.colegio.controller;

import com.colegio.entity.Rol;
import com.colegio.service.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rest/rol")
public class RolController {


	@Autowired
	private RolServicio rolServicio;
	
	@GetMapping
	public ResponseEntity<List<Rol>> listaRol()
	{
		return ResponseEntity.ok(rolServicio.listarRol());
	}


	@PostMapping
	public ResponseEntity<Rol> insertaRol(@RequestBody Rol rol) {
		return ResponseEntity.ok(rolServicio.insertaRol(rol));
	}


	@PutMapping
	public ResponseEntity<Rol> actualizaUsuario(@RequestBody Rol rol)
	{
		return ResponseEntity.ok(rolServicio.insertaRol(rol));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarUsuario(@PathVariable int id)
	{
	
			rolServicio.eliminarRol(id);
				return	ResponseEntity.ok().build();
		
	} 
}
