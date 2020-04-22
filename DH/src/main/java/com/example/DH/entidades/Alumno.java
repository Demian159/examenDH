package com.example.DH.entidades;

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
	public boolean equals(Alumno comparable) {
		if(this.codigoDeAlumno == comparable.codigoDeAlumno) {
			return true;
		} else {
			return false;
		}
	}

	//Atributos
	
	//Constructor
	
	//Getters and Setters
	
	//Responsabilidades
	public boolean equals(Alumno comparable) {
		if(this.codigoDeAlumno == comparable.codigoDeAlumno) {
			return true;
		} else {
			return false;
		}
	}
}
