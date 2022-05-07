package com.colegio.service;

import com.colegio.entity.Materia;

import java.util.List;
import java.util.Optional;

public interface MateriaServicio {

	public abstract Materia insertaMateria(Materia obj);

	public abstract List<Materia> listarMaterias();

	public abstract Optional<Materia> buscarPorId(int id);

	public abstract void eliminarMateria(int id);

}
