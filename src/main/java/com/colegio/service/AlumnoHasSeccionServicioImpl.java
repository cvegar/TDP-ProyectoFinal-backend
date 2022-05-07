package com.colegio.service;

import com.colegio.entity.AlumnoHasSeccion;
import com.colegio.entity.AlumnoHasSeccionPK;
import com.colegio.entity.Seccion;
import com.colegio.entity.UsuarioHasRol;
import com.colegio.repository.AlumnoHasSeccionRepositorio;
import com.colegio.repository.UsuarioHasRolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoHasSeccionServicioImpl implements AlumnoHasSeccionServicio {

	@Autowired
	private AlumnoHasSeccionRepositorio repositorio;


	@Override
	public AlumnoHasSeccion insertaMatricula(AlumnoHasSeccion obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<AlumnoHasSeccion> listarMatricula() {
		return repositorio.findAll();
	}

	@Override
	public Optional<AlumnoHasSeccion> buscarUsuarioPorId(AlumnoHasSeccionPK id) {
		return repositorio.findById(id);
	}
	public void eliminarMatricula(AlumnoHasSeccionPK id) {
		repositorio.deleteById(id);

	}

}
