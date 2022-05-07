package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Seccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.repository.SeccionRepository;

@Service
public class SeccionServicioImpl implements SeccionServicio {
	
	@Autowired
	private SeccionRepository repositorio;
	
	@Override
	public Seccion insertaSecion(Seccion obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Seccion> listarSecion() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Seccion> buscarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminarSecion(int id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Seccion> listarSeccionesMatriculadas(Integer id) {
		return repositorio.listarSeccionesMatriculadas(id);
	}

	@Override
	public List<Seccion> listarSecionesHabiles() {
		return repositorio.listaCursosHabiles();
	}

}
