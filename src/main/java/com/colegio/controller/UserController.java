package com.colegio.controller;

import java.util.List;

import com.colegio.entity.*;
import com.colegio.service.UsuarioHasRolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.service.TipoUsuarioServicio;
import com.colegio.service.UsuarioServicio;

@RestController
@RequestMapping("/api/rest/usuario")
public class UserController {

	
	@Autowired
	private UsuarioServicio usuarioService;
	
	@Autowired
	private TipoUsuarioServicio tipoUsuarioService;

	@Autowired
	private UsuarioHasRolServicio usuarioHasRolServicio;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listaUsuario()
	{
		return ResponseEntity.ok(usuarioService.listarUsuario());
	}
	
	@GetMapping("/listarxfiltro")
	public ResponseEntity<List<Usuario>> listaUsuario(@RequestParam("nombre")String filtro)
	{
		return ResponseEntity.ok(usuarioService.listarPorNombre(filtro));
	}

	
	@GetMapping("/listaTipoUsuario")
	public ResponseEntity<List<TipoUsuario>> listaTipoUsuario()
	{
		return ResponseEntity.ok(tipoUsuarioService.listarTipoUsuario());
	}

	@GetMapping("/listaDocentes")
	public ResponseEntity<List<Usuario>> listarDocente()
	{
		return ResponseEntity.ok(usuarioService.listarDocente());
	}

	@GetMapping("/listaAlumnos")
	public ResponseEntity<List<Usuario>> listarAlumnos()
	{
		return ResponseEntity.ok(usuarioService.listarAlumnos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> CosultarParaAct(@PathVariable("id") int id)
	{
				return	ResponseEntity.ok(usuarioService.listarPorUsuario(id));
	}


	@PostMapping
	public ResponseEntity<UsuarioHasRol> insertaUsuario(@RequestBody UsuarioHasRol usuarioHasRol) {
		usuarioService.insertaUsuario(usuarioHasRol.getUsuario());
		UsuarioHasRolPK usuarioHasRolPK = new UsuarioHasRolPK();

		usuarioHasRolPK.setIdUsuario(usuarioHasRol.getUsuario().getIdUsuario());
		usuarioHasRolPK.setIdRol(usuarioHasRol.getUsuario().getTipoUsuario().getIdTipoUsuario());
		usuarioHasRol.setUsuarioHasRolPk(usuarioHasRolPK);

		UsuarioHasRol Obj = new UsuarioHasRol(usuarioHasRolPK, usuarioHasRol.getUsuario(), usuarioHasRol.getRol());

		return ResponseEntity.ok(usuarioHasRolServicio.insertaUsuario(Obj));
	}


	@PutMapping
	public ResponseEntity<UsuarioHasRol> actualizaUsuario(@RequestBody UsuarioHasRol usuarioHasRol)
	{
		usuarioService.insertaUsuario(usuarioHasRol.getUsuario());
		UsuarioHasRolPK usuarioHasRolPK = new UsuarioHasRolPK();

		usuarioHasRolPK.setIdUsuario(usuarioHasRol.getUsuario().getIdUsuario());
		usuarioHasRolPK.setIdRol(usuarioHasRol.getUsuario().getTipoUsuario().getIdTipoUsuario());
		usuarioHasRol.setUsuarioHasRolPk(usuarioHasRolPK);

		UsuarioHasRol Obj = new UsuarioHasRol(usuarioHasRolPK, usuarioHasRol.getUsuario(), usuarioHasRol.getRol());

		return ResponseEntity.ok(usuarioHasRolServicio.insertaUsuario(Obj));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarUsuario(@PathVariable int id)
	{
	
			usuarioService.eliminarUsuario(id);
				return	ResponseEntity.ok().build();
		
	} 
}
