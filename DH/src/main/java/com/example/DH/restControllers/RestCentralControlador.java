package com.example.DH.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DH.entidades.Alumno;
import com.example.DH.entidades.DigitalHouseManager;

@RestController
public class RestCentralControlador {
	
	DigitalHouseManager manager1 = new DigitalHouseManager();
	
	@GetMapping("http:localhost:8000/crearTitular")
	public void altaProfeTitular(@RequestParam("nombre") String nombre,@RequestParam("apellido") String apellido,
				@RequestParam("codigoDeProfesor") Integer codigoDeProfesor,@RequestParam("especialidad") String especialidad) {
		manager1.altaProfesorTitular(nombre, apellido, codigoDeProfesor, especialidad);
	}
	@GetMapping("http:localhost:8000/crearAdjunto")
	public void altaProfeAdjunto(@RequestParam("nombre") String nombre,@RequestParam("apellido") String apellido,
				@RequestParam("codigoDeProfesor") Integer codigoDeProfesor,@RequestParam("especialidad") Integer horasConsulta) {
		manager1.altaProfesorAdjunto(nombre, apellido, codigoDeProfesor, horasConsulta);
	}
	@GetMapping("http:localhost:8000/crearCurso")
	public void altaCurso(@RequestParam("nombre") String nombre,@RequestParam("codigoCurso") Integer codigoCurso,
				@RequestParam("cupoMaximoDeAlumnos") Integer cupoMaximoDeAlumnos) {
		manager1.altaCurso(nombre, codigoCurso, cupoMaximoDeAlumnos);
	}
	@GetMapping("http:localhost:8000/asignarProfesor")
	public void asignarProfesor(@RequestParam("codigoCurso") Integer codigoCurso,@RequestParam("codigoProfesorTitular") Integer codigoProfesorTitular,
				@RequestParam("codigoDeProfesorAdjunto") Integer codigoProfesorAdjunto) {
		manager1.asignarProfesores(codigoCurso, codigoProfesorTitular, codigoProfesorAdjunto);
	}
	@GetMapping("http:localhost:8000/altaAlumno")
	public void altaAlumno(@RequestParam("nombre") String nombre,@RequestParam("apellido") String apellido,
				@RequestParam("codigoAlumno") Integer codigoAlumno) {
		manager1.altaAlumno(nombre, apellido, codigoAlumno);
	}
	@GetMapping("http:localhost:8000/inscribirAlumno")
	public void inscribirAlumno(@RequestParam("codigoAlumno") Integer codigoAlumno,@RequestParam("codigoCurso") Integer codigoCurso) {
		manager1.inscribirAlumno(codigoAlumno, codigoCurso);
	}
	@GetMapping("http:localhost:8000/bajaProfesor")
	public void bajaProfesor(@RequestParam("codigoProfesor") Integer codigoProfesor) {
		manager1.bajaProfesor(codigoProfesor);
	}
	@GetMapping("http:localhost:8000/detalleAlumno")
	public Alumno detalleAlumno(@RequestParam("nombre") String nombre) {
		Alumno alEncontrado = null;
		for(Alumno buscado : manager1.getListaDeAlumnos()) {
			if(buscado.getNombre() == nombre) {
				alEncontrado = buscado;
			}
		}
		return alEncontrado;
	}
	@GetMapping("http:localhost:8000/actualizarAlumno")
	public Alumno actualizarAlumno(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("codigoDeAlumno") Integer codigoDeAlumno) {
		Alumno alEncontrado = null;
		for(Alumno buscado : manager1.getListaDeAlumnos()) {
			if(buscado.getNombre() == nombre) {
				alEncontrado = buscado;
			}
		}
		alEncontrado.setNombre(nombre);
		alEncontrado.setApellido(apellido);
		alEncontrado.setCodigoDeAlumno(codigoDeAlumno);
		return alEncontrado;
	}
}

/*RESPUESTA PARTE K
	Tendria al metodo inscribirAlumno en la Clase Alumno, modificaria este metodo para almacenar en una variable
	tipo List<Inscripcion> las mismas y así tener un registro para consultar directamente desde el Alumno por sus 
	inscripciones.

*/
