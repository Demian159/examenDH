package com.example.DH.entidades;

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
	public boolean equals(Profesor comparable) {
		if(this.codigoDeProfesor == comparable.codigoDeProfesor) {
			return true;
		} else {
			return false;
		}
	}

	
}
