package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "INTERVALO_TRABAJO")
public class IntervaloTrabajo {
	
	@Column (name = "FECHA_INICIO")
	private LocalDate fechaInicio;
	@Column (name = "FECHA_FIN")
	private LocalDate fechaFin;
	@Column (name = "HORA_INICIO")
	private LocalTime horaInicio;
	@Column (name = "HORA_FIN")
	private LocalTime horaFin;
	@Column (name = "ID_INTERVALO_TRABAJO")
	private Integer id_IntervaloTrabajo;
	
	

	public IntervaloTrabajo() {
		
	}
	
	public IntervaloTrabajo(LocalDate fInicio, LocalTime hInicio) {
		this.fechaInicio = fInicio;
		this.horaInicio = hInicio;
	}
	


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	
	public Integer getId_IntervaloTrabajo() {
		return id_IntervaloTrabajo;
	}

	public void setId_IntervaloTrabajo(Integer id_IntervaloTrabajo) {
		this.id_IntervaloTrabajo = id_IntervaloTrabajo;
	}

}
