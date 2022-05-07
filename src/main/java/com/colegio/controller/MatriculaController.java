package com.colegio.controller;

import com.colegio.entity.AlumnoHasSeccion;
import com.colegio.entity.AlumnoHasSeccionPK;
import com.colegio.entity.Materia;
import com.colegio.entity.Seccion;
import com.colegio.service.AlumnoHasSeccionServicio;
import com.colegio.service.MateriaServicio;
import com.colegio.service.SeccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rest/matricula")
public class MatriculaController {


	@Autowired
	private AlumnoHasSeccionServicio matriculaServicio;

	@Autowired
	private SeccionServicio seccionServicio;

	@GetMapping
	public ResponseEntity<List<AlumnoHasSeccion>> listaMateria()
	{
		return ResponseEntity.ok(matriculaServicio.listarMatricula());
	}


	@PostMapping
	public ResponseEntity<AlumnoHasSeccion> insertaMatricula(@RequestBody AlumnoHasSeccionPK matricula) {

		AlumnoHasSeccion alumnoHasSeccion = new AlumnoHasSeccion();
		AlumnoHasSeccionPK alumnoHasSeccionPK = new AlumnoHasSeccionPK();
		alumnoHasSeccionPK.setIdAlumno(matricula.getIdAlumno());
		alumnoHasSeccionPK.setIdSeccion(matricula.getIdSeccion());
		alumnoHasSeccion.setAlumnoHasSeccionPK(alumnoHasSeccionPK);


		return ResponseEntity.ok(matriculaServicio.insertaMatricula(alumnoHasSeccion));
	}
	@PutMapping
	public ResponseEntity<AlumnoHasSeccion> actualizaMatricula(@RequestBody AlumnoHasSeccionPK matricula) {

		AlumnoHasSeccion alumnoHasSeccion = new AlumnoHasSeccion();
		AlumnoHasSeccionPK alumnoHasSeccionPK = new AlumnoHasSeccionPK();
		alumnoHasSeccionPK.setIdAlumno(matricula.getIdAlumno());
		alumnoHasSeccionPK.setIdSeccion(matricula.getIdSeccion());
		alumnoHasSeccion.setAlumnoHasSeccionPK(alumnoHasSeccionPK);


		return ResponseEntity.ok(matriculaServicio.insertaMatricula(alumnoHasSeccion));
	}
	@GetMapping("/buscarPorId")
	public ResponseEntity<String> buscarPorId(@RequestParam Integer IdAlumno, @RequestParam Integer IdSeccion )
	{
		AlumnoHasSeccionPK alumnoHasSeccionPK = new AlumnoHasSeccionPK();
		alumnoHasSeccionPK.setIdSeccion(IdSeccion);
		alumnoHasSeccionPK.setIdAlumno(IdAlumno);
		Optional<AlumnoHasSeccion> alumnoHasSeccion =matriculaServicio.buscarUsuarioPorId(alumnoHasSeccionPK);
		if(alumnoHasSeccion.isPresent())
		{
			matriculaServicio.eliminarMatricula(alumnoHasSeccionPK);
		}

		return ResponseEntity.ok().build();
	}

	@GetMapping("/listaCursosMatriculados")
	public ResponseEntity<List<Seccion>> listaMateria(@RequestParam Integer idAlumno)
	{

		return ResponseEntity.ok(seccionServicio.listarSeccionesMatriculadas(idAlumno));
	}

/*
	@PutMapping
	public ResponseEntity<Materia> actualizaMateria(@RequestBody Materia materia)
	{
		return ResponseEntity.ok(materiaServicio.insertaMateria(materia));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarMateria(@PathVariable int id)
	{
	
			materiaServicio.eliminarMateria(id);
				return	ResponseEntity.ok().build();
		
	} */
}
