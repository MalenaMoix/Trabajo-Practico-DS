package entidades;

import java.util.Date;

public class DuracionClasificacion {
	
	private Date fechaInicio;
	private Date fechaFin;
	
	public DuracionClasificacion() {
		
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
