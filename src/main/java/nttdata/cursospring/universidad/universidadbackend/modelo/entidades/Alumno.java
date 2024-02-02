package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import javax.persistence.*;
@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona {

	@ManyToOne(
			optional = true,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			},
			fetch = FetchType.LAZY
	)
	@JoinColumn(name = "carrera_id")
	public Carrera carrera;
	public Alumno() {
		super();
	}

	public Alumno(Integer id, String nombre, String apellido, String dni, Direccion direccion) {
		super(id, nombre, apellido, dni, direccion);
		// probar git
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return super.toString() +
				"Alumno{}";
	}
}
