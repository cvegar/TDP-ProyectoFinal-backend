package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Opcion;
import com.colegio.entity.Rol;
import com.colegio.entity.Usuario;
import com.colegio.repository.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Override
	public Usuario login(String usu,String pass) {
		System.out.println(usu);
		System.out.println(pass);
		
		return repositorio.login(usu,pass);
	}

	@Override
	public List<Opcion> traerEnlacesDeUsuario(int idUsuario) {
		return repositorio.traerEnlacesDeUsuario(idUsuario);
	}

	@Override
	public List<Rol> traerRolesDeUsuario(int idUsuario) {
		return repositorio.traerRolesDeUsuario(idUsuario);
	}
	/**************************************************************/
	@Override
	public Usuario insertaUsuario(Usuario obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Usuario> listarUsuario() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Usuario> buscarUsuarioPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminarUsuario(int id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Usuario> listarDocente() {
		// TODO Auto-generated method stub
		return repositorio.listarDocentes();
	}

	@Override
	public List<Usuario> listarAlumnos() {
		// TODO Auto-generated method stub
		return repositorio.listarAlumnos();
	}

	@Override
	public List<Usuario> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repositorio.listaPorNombre(nombre);
	}
	@Override
	public Usuario listarPorUsuario(int id) {
		// TODO Auto-generated method stub
		return repositorio.listaPorCodigo(id);
	}
	
	

}
