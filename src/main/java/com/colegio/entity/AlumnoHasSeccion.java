package com.colegio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "alumno_has_seccion")
public class AlumnoHasSeccion {

	
	@EmbeddedId
	private AlumnoHasSeccionPK alumnoHasSeccionPK;

	@ManyToOne
	@JoinColumn(name = "idSeccion", nullable = false, insertable = false,updatable = false)
	private Seccion seccion;
	
	@ManyToOne
	@JoinColumn(name = "idAlumno", nullable = false, insertable = false,updatable = false)
	private Usuario alumno;
	
	
}
