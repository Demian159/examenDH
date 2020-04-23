package com.example.DH.entidades;

import javax.persistence.Entity;

@Entity
public class ProfesorAdjunto extends Profesor{
	//Atributos
	private Integer horasDeConsulta;

	//Constructor
	public ProfesorAdjunto () {}
	//Getters and Setters
	public Integer getHorasDeConsulta() {
		return horasDeConsulta;
	}

	public void setHorasDeConsulta(Integer horasDeConsulta) {
		this.horasDeConsulta = horasDeConsulta;
	}
	
	//Responsabilidades
}
