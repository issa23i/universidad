package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.time.LocalDateTime;

public class Alumno extends Persona {

	public Alumno() {
		super();
	}

	public Alumno(Integer id, String nombre, String apellido, String dni, Direccion direccion) {
		super(id, nombre, apellido, dni, direccion);
		
	}
	
}
