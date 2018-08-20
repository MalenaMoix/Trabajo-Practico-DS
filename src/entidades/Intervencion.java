package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Intervencion {
	
	private String estado;
	private LocalDate fechaAsignacion;
	private LocalDate fechaFinAsignacion;
	private LocalTime horaAsignacion;
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
	
}