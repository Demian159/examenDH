package com.example.DH.entidades;

import java.util.List;

import javax.persistence.Entity;

@Entity
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
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Curso) {
			Curso temporal = (Curso) obj;
			if(this.codigoDeCurso == temporal.codigoDeCurso) {
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
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
