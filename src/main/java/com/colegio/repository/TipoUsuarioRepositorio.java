package com.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.TipoUsuario;

public interface TipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Integer> {
	
}
