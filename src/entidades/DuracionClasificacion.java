package entidades;

import java.time.LocalDate;

public class DuracionClasificacion {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	
	public DuracionClasificacion() {
		
	}

	public DuracionClasificacion(LocalDate fInicio) {
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

}
