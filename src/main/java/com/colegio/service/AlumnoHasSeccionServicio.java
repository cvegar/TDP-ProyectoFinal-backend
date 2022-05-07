package com.colegio.service;

import com.colegio.entity.AlumnoHasSeccion;
import com.colegio.entity.AlumnoHasSeccionPK;
import com.colegio.entity.Usuario;
import com.colegio.entity.UsuarioHasRol;

import java.util.List;
import java.util.Optional;

public interface AlumnoHasSeccionServicio {



	public abstract AlumnoHasSeccion insertaMatricula(AlumnoHasSeccion obj);

	public abstract List<AlumnoHasSeccion> listarMatricula();

	public abstract Optional<AlumnoHasSeccion> buscarUsuarioPorId(AlumnoHasSeccionPK id);

	public void eliminarMatricula(AlumnoHasSeccionPK id);

}