package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.math.BigDecimal;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.TipoEmpleado;

public class Empleado extends Persona{
	
	private BigDecimal sueldo;
	private TipoEmpleado tipoEmpleado;
	
	public Empleado() {
		super();
	}

	public Empleado(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo, TipoEmpleado tipoEmpleado) {
		super(id, nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
		this.tipoEmpleado= tipoEmpleado;
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	
	
}
