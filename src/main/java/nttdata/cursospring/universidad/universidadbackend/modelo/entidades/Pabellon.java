package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pabellon implements Serializable{
	
	private Integer id;
	private Double mts2;
	private String nombre;
	private Direccion direccion;
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaModificacion;
	

	public Pabellon() {}


	public Pabellon(Integer id, Double mts2, String nombre, Direccion direccion) {
		super();
		this.id = id;
		this.mts2 = mts2;
		this.nombre = nombre;
		this.direccion = direccion;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Double getMts2() {
		return mts2;
	}


	public void setMts2(Double mts2) {
		this.mts2 = mts2;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
		return "Pabellon {id=" + id + ", mts2=" + mts2 + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", fechaAlta=" + fechaAlta + ", fechaModificacion=" + fechaModificacion + "}";
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
		Pabellon other = (Pabellon) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
	
	
}
