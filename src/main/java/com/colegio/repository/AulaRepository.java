package com.colegio.repository;

import com.colegio.entity.Aula;
import com.colegio.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AulaRepository extends JpaRepository<Aula, Integer> {
	
}
