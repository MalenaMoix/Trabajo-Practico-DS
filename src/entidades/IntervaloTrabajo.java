package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class IntervaloTrabajo {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
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

}
