package com.colegio.service;

import com.colegio.entity.Aula;
import com.colegio.entity.Seccion;

import java.util.List;
import java.util.Optional;

public interface AulaServicio {

	public abstract Aula insertaAula(Aula obj);

	public abstract List<Aula> listarAulas();

	public abstract Optional<Aula> buscarPorId(int id);

	public abstract void eliminarAula(int id);

}
