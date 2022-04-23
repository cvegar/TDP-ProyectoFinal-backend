package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Opcion;
import com.colegio.entity.Rol;
import com.colegio.entity.Usuario;

public interface UsuarioServicio {

	public abstract Usuario login(String usu,String pass);

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);
	/*--------------------------------------------------------*/
	public abstract Usuario insertaUsuario(Usuario obj);
	
	public abstract List<Usuario> listarUsuario();
	
	public abstract Optional<Usuario> buscarUsuarioPorId(int id);
	
	public abstract void eliminarUsuario(int id);
	
	public abstract List<Usuario> listarDocente();
	public abstract List<Usuario> listarAlumnos();
	public List<Usuario> listarPorNombre(String nombre);
	public Usuario listarPorUsuario(int codigo);
}