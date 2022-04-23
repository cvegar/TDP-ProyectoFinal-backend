package com.colegio.entity;



import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seccion")
public class Seccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSeccion;
	private String codigo;
	private String estado;

	@ManyToOne
	@JoinColumn(name = "idAula")
	private Aula aula;
	
	

	

	
}
