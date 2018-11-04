package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "INTERVENCION")
public class Intervencion {
	
	@Column (name = "ESTADO")
	private String estado;
	@Column (name = "ID_INTERVENCION")
	private Integer id_Intervencion;
	@Column (name = "FECHA_ASIGNACION")
	private LocalDate fechaAsignacion;
	@Column (name = "FECHA_FIN_ASIGNACION")
	private LocalDate fechaFinAsignacion;
	@Column (name = "HORA_ASIGNACION")
	private LocalTime horaAsignacion;
	@Column (name = "HORA_FIN_ASIGNACION")
	private LocalTime horaFinAsignacion;
	
	
	
	public Intervencion() {
		
	}
	
	public Intervencion(String est, LocalDate fechaAsig, LocalTime horaAsig) {
		this.estado = est;
		this.fechaAsignacion = fechaAsig;
		this.horaAsignacion = horaAsig;
	}

	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(LocalDate fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public LocalDate getFechaFinAsignacion() {
		return fechaFinAsignacion;
	}

	public void setFechaFinAsignacion(LocalDate fechaFinAsignacion) {
		this.fechaFinAsignacion = fechaFinAsignacion;
	}

	public LocalTime getHoraAsignacion() {
		return horaAsignacion;
	}

	public void setHoraAsignacion(LocalTime horaAsignacion) {
		this.horaAsignacion = horaAsignacion;
	}

	public LocalTime getHoraFinAsignacion() {
		return horaFinAsignacion;
	}

	public void setHoraFinAsignacion(LocalTime horaFinAsignacion) {
		this.horaFinAsignacion = horaFinAsignacion;
	}
	
	public Integer getId_Intervencion() {
		return id_Intervencion;
	}

	public void setId_Intervencion(Integer id_Intervencion) {
		this.id_Intervencion = id_Intervencion;
	}
}