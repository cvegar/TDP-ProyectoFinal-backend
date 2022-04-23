package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.TipoUsuario;
import com.colegio.repository.TipoUsuarioRepositorio;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioServicio {
	
	@Autowired
	private TipoUsuarioRepositorio repositorio;
	

	@Override
	public List<TipoUsuario	> listarTipoUsuario() {
		return repositorio.findAll();
	}/*
	@Override
	public Seccion insertaAula( obj) {
		return repositorio.save(obj);
	}

	@Override
	public Optional<Seccion> buscarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminarAula(int id) {
		repositorio.deleteById(id);
		
	}*/

}
