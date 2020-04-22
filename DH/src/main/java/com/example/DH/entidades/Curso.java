package com.example.DH.entidades;

import java.util.List;

public class Curso {
	//Atributos
	private String nombre;
	private Integer codigoDeCurso;
	private ProfesorTitular profesorTitular;
	private ProfesorAdjunto profesorAdjunto;
	private Integer cupoMaximoDeAlumnos;
	private List<Alumno> listaAlumnosInscriptos;
	
	//Constructor
	public Curso() {}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoDeCurso() {
		return codigoDeCurso;
	}

	public void setCodigoDeCurso(Integer codigoDeCurso) {
		this.codigoDeCurso = codigoDeCurso;
	};
	public ProfesorTitular getProfesorTitular() {
		return profesorTitular;
	}

	public void setProfesorTitular(ProfesorTitular profesorTitular) {
		this.profesorTitular = profesorTitular;
	}

	public ProfesorAdjunto getProfesorAdjunto() {
		return profesorAdjunto;
	}

	public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
		this.profesorAdjunto = profesorAdjunto;
	}

	public Integer getCupoMaximoDeAlumnos() {
		return cupoMaximoDeAlumnos;
	}

	public void setCupoMaximoDeAlumnos(Integer cupoMaximoDeAlumnos) {
		this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
	}

	public List<Alumno> getListaAlumnosInscriptos() {
		return listaAlumnosInscriptos;
	}

	public void setListaAlumnosInscriptos(List<Alumno> listaAlumnosInscriptos) {
		this.listaAlumnosInscriptos = listaAlumnosInscriptos;
	}

	//Responsabilidades
	public boolean equals(Curso comparable) {
		if(this.codigoDeCurso == comparable.codigoDeCurso) {
			return true;
		} else {
			return false;
		}
	}
	public boolean agregarUnAlumno (Alumno unAlumno) {
		if(this.listaAlumnosInscriptos.size() < this.cupoMaximoDeAlumnos) {
			return true;
		} else {
			return false;
		}
	}
	public void eliminarAlumno (Alumno unAlumno) {
		this.listaAlumnosInscriptos.remove(unAlumno);
	}
}
