package com.colegio.service;

import java.util.List;

import com.colegio.entity.Seccion;
import com.colegio.entity.TipoUsuario;

public interface TipoUsuarioServicio {
	
	//public abstract Seccion insertaAula(Seccion obj);
	
	public abstract List<TipoUsuario> listarTipoUsuario();


	/*public abstract Optional<Seccion> buscarPorId(int id);
	
	public abstract void eliminarAula(int id);*/
	
}
