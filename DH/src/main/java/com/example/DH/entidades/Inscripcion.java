package com.example.DH.entidades;

import java.util.Date;

public class Inscripcion {
	//Atributos
	private Alumno alumno;
	private Curso curso;
	private Date fechaDelDia;
	
	//Constructor
	public Inscripcion(Alumno alumno, Curso curso) {
		this.alumno = alumno;
		this.curso = curso;
		this.fechaDelDia = new Date();
	}
	//Getters and Setters
	
	//Responsabilidades
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Inscripcion) {
			Inscripcion temporal = (Inscripcion) obj;
			if(this.fechaDelDia == temporal.fechaDelDia) {
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}
}
