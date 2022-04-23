package com.colegio.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nombres;
	private String apellidos;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	private Date fechaRegistro;
	private String email;
	private String estado;
	private String celular;
	private String direccion;
	private String dni;
	private String login;
	private String password;

	/*@Transient
	private String nombreCompleto;
	

	public String getNombreCompleto() {
		return nombres.concat(" ").concat(apellidos);
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
*/
	
	@ManyToOne
	@JoinColumn(name = "idTipoUsuario")
	private TipoUsuario tipoUsuario;

	/*------------------JsonIgnore-----------------------------*/
	/*@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Horario> horarioUsuario;

	@JsonIgnore
	@OneToMany(mappedBy = "alumno")
	private List<Evaluacion> alumnoEvaluacion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "docente")
	private List<Evaluacion> docenteEvaluacion;
	*/
}
