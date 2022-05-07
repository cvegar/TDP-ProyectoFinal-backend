package com.colegio.service;

import com.colegio.entity.Materia;
import com.colegio.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServicioImpl implements MateriaServicio {
	
	@Autowired
	private MateriaRepository repositorio;
	
	@Override
	public Materia insertaMateria(Materia obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Materia> listarMaterias() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Materia> buscarPorId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public void eliminarMateria(int id) {
		repositorio.deleteById(id);
		
	}

}
