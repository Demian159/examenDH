package com.example.DH.entidades;

import javax.persistence.Entity;

@Entity
public class Alumno {
	//Atributos
	private String nombre;
	private String apellido;
	private Integer codigoDeAlumno;
	
	//Constructor
	public Alumno (String nombre, String apellido, Integer codigoDeAlumno) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoDeAlumno = codigoDeAlumno;
	}
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCodigoDeAlumno() {
		return codigoDeAlumno;
	}

	public void setCodigoDeAlumno(Integer codigoDeAlumno) {
		this.codigoDeAlumno = codigoDeAlumno;
	}
	//Responsabilidades
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Alumno) {
			Alumno temporal = (Alumno) obj;
			if(this.codigoDeAlumno == temporal.codigoDeAlumno) {
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}
}
