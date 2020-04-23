package com.example.DH.entidades;

import javax.persistence.Entity;

@Entity
public class Profesor {
	//Atributos
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private Integer codigoDeProfesor;
	
	//Constructor
	public Profesor () {
		
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

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getCodigoDeProfesor() {
		return codigoDeProfesor;
	}

	public void setCodigoDeProfesor(Integer codigoDeProfesor) {
		this.codigoDeProfesor = codigoDeProfesor;
	}
	//Responsabilidades
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Profesor) {
			Profesor temporal = (Profesor) obj;
			if(this.codigoDeProfesor == temporal.codigoDeProfesor) {
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}	
}
