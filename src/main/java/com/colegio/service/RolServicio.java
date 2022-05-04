package com.colegio.service;

import com.colegio.entity.Rol;

import java.util.List;

public interface RolServicio {

	public abstract Rol insertaRol(Rol obj);

	public abstract List<Rol> listarRol();

	public abstract void eliminarRol(int id);

}
