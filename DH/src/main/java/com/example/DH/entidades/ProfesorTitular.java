package com.example.DH.entidades;

import javax.persistence.Entity;

@Entity
public class ProfesorTitular extends Profesor{
	//Atributos
	private String especialidad;
	
	//Constructor
	public ProfesorTitular() {}
	//Getters and Setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	//Responsabilidades
}
