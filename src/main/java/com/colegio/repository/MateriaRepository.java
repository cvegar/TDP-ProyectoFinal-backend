package com.colegio.repository;

import com.colegio.entity.Materia;
import com.colegio.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MateriaRepository extends JpaRepository<Materia, Integer> {



}
