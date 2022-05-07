package com.colegio.repository;

import com.colegio.entity.AlumnoHasSeccion;
import com.colegio.entity.AlumnoHasSeccionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AlumnoHasSeccionRepositorio extends JpaRepository<AlumnoHasSeccion, AlumnoHasSeccionPK>{



}
