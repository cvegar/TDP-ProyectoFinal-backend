package com.colegio.service;

import com.colegio.entity.Opcion;
import com.colegio.entity.Rol;
import com.colegio.entity.Usuario;
import com.colegio.entity.UsuarioHasRol;
import com.colegio.repository.UsuarioHasRolRepositorio;
import com.colegio.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioHasRolServicioImpl implements UsuarioHasRolServicio{

	@Autowired
	private UsuarioHasRolRepositorio repositorio;


	@Override
	public UsuarioHasRol insertaUsuario(UsuarioHasRol obj) {
		return repositorio.save(obj);
	}
}
