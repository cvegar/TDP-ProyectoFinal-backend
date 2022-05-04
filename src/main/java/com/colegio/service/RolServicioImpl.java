package com.colegio.service;

import com.colegio.entity.Rol;
import com.colegio.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicioImpl implements RolServicio {
	
	@Autowired
	private RolRepository repositorio;
	
	@Override
	public Rol insertaRol(Rol obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Rol> listarRol() {
		return repositorio.findAll();
	}

	@Override
	public void eliminarRol(int id) {
		repositorio.deleteById(id);
		
	}

}
