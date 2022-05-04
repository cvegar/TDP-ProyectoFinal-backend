package com.colegio.repository;

import com.colegio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.Seccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SeccionRepository extends JpaRepository<Seccion, Integer> {


}
