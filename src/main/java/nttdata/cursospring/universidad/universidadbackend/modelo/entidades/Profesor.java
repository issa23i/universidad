package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.math.BigDecimal;

public class Profesor extends Persona {
	
	private BigDecimal sueldo;
	
	public Profesor() {
		super();
	}

	public Profesor(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo) {
		super(id, nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	
}
