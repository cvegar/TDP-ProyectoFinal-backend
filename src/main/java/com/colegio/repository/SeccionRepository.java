package com.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.Seccion;


public interface SeccionRepository extends JpaRepository<Seccion, Integer> {
	
}
