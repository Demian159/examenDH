package com.example.DH.entidades;

import java.util.List;

public class DigitalHouseManager {
	//Atributos
	private List<Alumno> listaDeAlumnos;
	private List<Profesor> listaDeProfesores;
	private List<Curso> listaDeCursos;
	private List<Inscripcion> listaDeInscripciones;
	
	//Constructor
	public DigitalHouseManager () {
		
	}
	//Getters and Setters
	public List<Alumno> getListaDeAlumnos() {
		return listaDeAlumnos;
	}

	public void setListaDeAlumnos(List<Alumno> listaDeAlumnos) {
		this.listaDeAlumnos = listaDeAlumnos;
	}

	public List<Profesor> getListaDeProfesores() {
		return listaDeProfesores;
	}

	public void setListaDeProfesores(List<Profesor> listaDeProfesores) {
		this.listaDeProfesores = listaDeProfesores;
	}

	public List<Curso> getListaDeCursos() {
		return listaDeCursos;
	}

	public void setListaDeCursos(List<Curso> listaDeCursos) {
		this.listaDeCursos = listaDeCursos;
	}

	public List<Inscripcion> getListaDeInscripciones() {
		return listaDeInscripciones;
	}

	public void setListaDeInscripciones(List<Inscripcion> listaDeInscripciones) {
		this.listaDeInscripciones = listaDeInscripciones;
	}
	
	//Responsabilidades
	public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDeAlumnos) {
		Curso Creando = new Curso();
		Creando.setNombre(nombre);
		Creando.setCodigoDeCurso(codigoCurso);
		Creando.setCupoMaximoDeAlumnos(cupoMaximoDeAlumnos);
		this.listaDeCursos.add(Creando);
	}
	public void bajaCurso(Integer codigoCurso) {
		for(Curso cursoBuscado: this.listaDeCursos) {
			if(cursoBuscado.getCodigoDeCurso() == codigoCurso) {
				listaDeCursos.remove(cursoBuscado);
			} else {
				System.out.println("El codigo de Curso no coincide con ningun curso en este listado");
			}
		}
	}
	public void altaProfesorAdjunto(String nombre, String apellido, Integer	codigoDeProfesor, Integer horasDeConsulta) {
		ProfesorAdjunto Creando = new ProfesorAdjunto ();
		Creando.setNombre(nombre);
		Creando.setApellido(apellido);
		Creando.setCodigoDeProfesor(codigoDeProfesor);
		Creando.setHorasDeConsulta(horasDeConsulta);
		Creando.setAntiguedad(0);
		this.listaDeProfesores.add(Creando);
	}
	public void altaProfesorTitular(String nombre, String apellido, Integer	codigoDeProfesor, String especialidad) {
		ProfesorTitular Creando = new ProfesorTitular ();
		Creando.setNombre(nombre);
		Creando.setApellido(apellido);
		Creando.setCodigoDeProfesor(codigoDeProfesor);
		Creando.setEspecialidad(especialidad);
		Creando.setAntiguedad(0);
		this.listaDeProfesores.add(Creando);
	}
	public void bajaProfesor(Integer codigoProfesor) {
		for(Profesor Buscado: this.listaDeProfesores) {
			if(Buscado.getCodigoDeProfesor() == codigoProfesor) {
				listaDeCursos.remove(Buscado);
			} else {
				System.out.println("El codigo de Profesor no coincide con ningun curso en este listado");
			}
		}
	}
	public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
		Alumno Creando = new Alumno(nombre, apellido, codigoAlumno);
		this.listaDeAlumnos.add(Creando);
	}
	public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
		Curso cursoAInscribir = null;
		for(Curso buscado : this.listaDeCursos) {
			if(buscado.getCodigoDeCurso() == codigoCurso) {
				cursoAInscribir = buscado;
			}
		}
		Alumno alumnoAInscribir = null;
		for(Alumno buscado : this.listaDeAlumnos) {
			if(buscado.getCodigoDeAlumno() == codigoAlumno) {
				alumnoAInscribir = buscado;
			}
		}
		if(cursoAInscribir.agregarUnAlumno(alumnoAInscribir)) {
			Inscripcion inscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribir);
			System.out.println("Se realizo la inscripcion " + inscripcion);
		} else {
			System.out.println("No se pudo realizar la inscripcion, no hay espacion en el curso");
		}		
	}
	public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular,Integer codigoProfesorAdjunto) {
		Curso cursoAInscribir = null;
		for(Curso buscado : this.listaDeCursos) {
			if(buscado.getCodigoDeCurso() == codigoCurso) {
				cursoAInscribir = buscado;
			}
		}
		List<ProfesorTitular> listProfTitu = null;
		for(Profesor buscado : this.listaDeProfesores) {
			if(buscado instanceof ProfesorTitular) {
				ProfesorTitular prof1 = (ProfesorTitular) buscado;
				listProfTitu.add(prof1);
			}
		}
		ProfesorTitular profesorTituAInscribir = null;
		for(ProfesorTitular buscado : listProfTitu) {
				if(buscado.getCodigoDeProfesor() == codigoProfesorTitular) {
					profesorTituAInscribir = buscado;
				}
		}
		List<ProfesorAdjunto> listProfAdju= null;
		for(Profesor buscado : this.listaDeProfesores) {
			if(buscado instanceof ProfesorAdjunto) {
				ProfesorAdjunto prof1 = (ProfesorAdjunto) buscado;
				listProfAdju.add(prof1);
			}
		}
		ProfesorAdjunto ProfesorAdjuAInscribir = null;
		for(ProfesorAdjunto buscado : listProfAdju) {
				if(buscado.getCodigoDeProfesor() == codigoProfesorAdjunto) {
					ProfesorAdjuAInscribir = buscado;
				}
		}
		cursoAInscribir.setProfesorTitular(profesorTituAInscribir);
		cursoAInscribir.setProfesorAdjunto(ProfesorAdjuAInscribir);
	}
	

}
