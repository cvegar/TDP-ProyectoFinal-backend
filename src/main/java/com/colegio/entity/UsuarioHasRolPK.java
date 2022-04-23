package com.colegio.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Embeddable
public class UsuarioHasRolPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idUsuario; 
	private int idRol;
	
	
	
	
}
