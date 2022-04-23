package com.colegio.service;

import com.colegio.entity.Aula;
import com.colegio.entity.Seccion;
import com.colegio.repository.AulaRepository;
import com.colegio.repository.SeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServicioImpl implements AulaServicio {
	
	@Autowired
	private AulaRepository repositorio;
	
	@Override
	public Aula insertaAula(Aula obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Aula> listarAulas() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Aula> buscarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminarAula(int id) {
		repositorio.deleteById(id);
		
	}

}
