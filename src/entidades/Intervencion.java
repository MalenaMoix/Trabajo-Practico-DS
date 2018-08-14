package entidades;

import java.sql.Time;
import java.util.Date;

public class Intervencion {
	
	private String estado;
	private Date fechaAsignacion;
	private Date fechaFinAsignacion;
	private Time horaAsignacion;
	private Time horaFinAsignacion;
	
	public Intervencion() {
		
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaFinAsignacion() {
		return fechaFinAsignacion;
	}

	public void setFechaFinAsignacion(Date fechaFinAsignacion) {
		this.fechaFinAsignacion = fechaFinAsignacion;
	}

	public Time getHoraAsignacion() {
		return horaAsignacion;
	}

	public void setHoraAsignacion(Time horaAsignacion) {
		this.horaAsignacion = horaAsignacion;
	}

	public Time getHoraFinAsignacion() {
		return horaFinAsignacion;
	}

	public void setHoraFinAsignacion(Time horaFinAsignacion) {
		this.horaFinAsignacion = horaFinAsignacion;
	}
	
	

}
