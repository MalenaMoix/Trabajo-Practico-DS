package entidades;

import java.time.LocalDate;

public class DuracionEstado {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String observaciones;
	
	
	public DuracionEstado() {
		
	}
	
	public DuracionEstado(LocalDate fInicio) {
		this.fechaInicio = fInicio;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
