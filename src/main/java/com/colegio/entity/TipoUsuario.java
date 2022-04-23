package com.colegio.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipousuario")
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoUsuario;
	private String nombre;		
	private String estado;		

	@JsonIgnore
	@OneToMany(mappedBy = "tipoUsuario")
	private List<Usuario> usuarios;
	
	
	
}
