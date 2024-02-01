package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.cglib.core.Local;

public abstract class Persona implements Serializable {

	private Integer id;
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaModificacion;
	private Direccion direccion;
	
	protected Persona() {}

	public Persona(Integer id, String nombre, String apellido, String dni, Direccion direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaAlta="
				+ fechaAlta + ", fechaModificacion=" + fechaModificacion + ", direccion=" + direccion + ", getId()="
				+ getId() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getDni()="
				+ getDni() + ", getFechaAlta()=" + getFechaAlta() + ", getFechaModificacion()=" + getFechaModificacion()
				+ ", getDireccion()=" + getDireccion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(id, other.id);
	}
	
	
	
}
