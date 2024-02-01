package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Carrera implements Serializable {
	
	private Integer id;
	private String nombre;
	private Integer cantidadMaterias;
	private Integer cantidadAnyos;
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaModificacion;
	
	public Carrera() {}

	public Carrera(Integer id, String nombre, Integer cantidadMaterias, Integer cantidadAnyos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadMaterias = cantidadMaterias;
		this.cantidadAnyos = cantidadAnyos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(Integer cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	public Integer getCantidadAnyos() {
		return cantidadAnyos;
	}

	public void setCantidadAnyos(Integer cantidadAnyos) {
		this.cantidadAnyos = cantidadAnyos;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		return "Carrera {id=" + id + ", nombre=" + nombre + ", cantidadMaterias=" + cantidadMaterias
				+ ", cantidadAnyos=" + cantidadAnyos + ", fechaAlta=" + fechaAlta + ", fechaModificacion="
				+ fechaModificacion + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
	
	 
	

}
