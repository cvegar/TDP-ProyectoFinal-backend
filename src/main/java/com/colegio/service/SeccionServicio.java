package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Seccion;

public interface SeccionServicio {
	
	public abstract Seccion insertaSecion(Seccion obj);
	
	public abstract List<Seccion> listarSecion();
	
	public abstract Optional<Seccion> buscarPorId(int id);
	
	public abstract void eliminarSecion(int id);

	public abstract List<Seccion> listarSeccionesMatriculadas(Integer id);

	public abstract List<Seccion> listarSecionesHabiles();



}
