package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Opcion;
import com.colegio.entity.Rol;
import com.colegio.entity.Usuario;
import com.colegio.service.UsuarioServicio;

@RestController
@RequestMapping("/api/rest")
public class LoginController {

	@Autowired
	private UsuarioServicio usuarioServicio;
	
	//para iniciar sesiòn

		
	@GetMapping("/login/{login}/{password}")
	@ResponseBody
	public ResponseEntity<Usuario> login(@PathVariable("login") String usu, 
			   @PathVariable("password") String pass) {
		
		Usuario objUsu =null;
				objUsu=usuarioServicio.login(usu,pass);
		//Usuario bean=null;
		//bean=usuarioService.iniciaSesion(vLogin, vClave);
		System.out.println(usu);
		System.out.println(pass);
		System.out.println(objUsu);
		return ResponseEntity.ok(objUsu);
	}

	
	
	@GetMapping(path ="/privilegios/{rol}" )
	@ResponseBody
	public ResponseEntity<List<Rol>> privilegios(@PathVariable("rol") int id){

		return ResponseEntity.ok(usuarioServicio.traerRolesDeUsuario(id));
	}
	
	@GetMapping(path ="/opcion/{opcion}" )
	@ResponseBody
	public ResponseEntity<List<Opcion>> opcion(@PathVariable("opcion") int id){

		return ResponseEntity.ok(usuarioServicio.traerEnlacesDeUsuario(id));
	}
	
	

}
