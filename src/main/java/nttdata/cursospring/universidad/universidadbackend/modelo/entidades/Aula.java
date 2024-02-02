package nttdata.cursospring.universidad.universidadbackend.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.*;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;

@Entity
@Table(name = "aulas")
public class Aula implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "numero_aula", nullable = false)
	private Integer numAula;
	@Column(name = "medidas_mtsxmts")
	private String medidas;
	@Column(name = "cantidad_pupitres")
	private Integer cantidadPupitres;
	@Column(name = "tipo_pizarron")
	@Enumerated(EnumType.STRING)
	private Pizarron pizarron;
	@Column(name = "fecha_alta")
	private LocalDateTime fechaAlta;
	@Column(name = "fecha_modificacion")
	private LocalDateTime fechaModificacion;
	@ManyToOne(
			optional = true,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			}
			)
	@JoinColumn(
			name = "pabellon_id",
			foreignKey = @ForeignKey(name = "FK_PABELLON_ID")
			)
	private Pabellon pabellon;
	
	public Aula() {}

	public Aula(Integer id, Integer numAula, String medidas, Integer cantidadPupitres, Pizarron pizarron) {
		super();
		this.id = id;
		this.numAula = numAula;
		this.medidas = medidas;
		this.cantidadPupitres = cantidadPupitres;
		this.pizarron = pizarron;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumAula() {
		return numAula;
	}

	public void setNumAula(Integer numAula) {
		this.numAula = numAula;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public Integer getCantidadPupitres() {
		return cantidadPupitres;
	}

	public void setCantidadPupitres(Integer cantidadPupitres) {
		this.cantidadPupitres = cantidadPupitres;
	}

	public Pizarron getPizarron() {
		return pizarron;
	}

	public void setPizarron(Pizarron pizarron) {
		this.pizarron = pizarron;
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

	
	public Pabellon getPabellon() {
		return pabellon;
	}

	public void setPabellon(Pabellon pabellon) {
		this.pabellon = pabellon;
	}

	@PrePersist
	private void antesDePersistir() {
		this.fechaAlta = LocalDateTime.now();
	}
	
	@PreUpdate
	private void antesDeUpdate() {
		this.fechaModificacion = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "Aula {id=" + id + ", numAula=" + numAula + ", medidas=" + medidas + ", cantidadPupitres="
				+ cantidadPupitres + ", pizarron=" + pizarron + ", fechaAlta=" + fechaAlta + ", fechaModificacion="
				+ fechaModificacion + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numAula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(id, other.id) && Objects.equals(numAula, other.numAula);
	}

		
	
	
}
