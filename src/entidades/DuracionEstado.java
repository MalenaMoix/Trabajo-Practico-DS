package entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "DURACION_ESTADO")
public class DuracionEstado {
	
	//FALTA AGREGAR EL ID
	
	@Column (name ="FECHA_INICIO")
	private LocalDate fechaInicio;
	@Column (name ="FECHA_FIN")
	private LocalDate fechaFin;
	@Column (name ="OBSERVACIONES")
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
