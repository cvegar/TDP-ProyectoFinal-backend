package com.colegio.repository;

import com.colegio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.Seccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SeccionRepository extends JpaRepository<Seccion, Integer> {

    @Query("select s from Seccion s, AlumnoHasSeccion a, Usuario u where s.idSeccion = a.seccion.idSeccion and "
            + "u.idUsuario = a.alumno.idUsuario and u.idUsuario = :var_idUsuario ")
    public abstract List<Seccion> listarSeccionesMatriculadas(@Param("var_idUsuario") int idUsuario);

    @Query("select s from Seccion s where s.materia.estado like 'activo'")
    public abstract List<Seccion> listaCursosHabiles();

}
