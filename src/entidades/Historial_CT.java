package entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "HISTORIAL_CT")
public class Historial_CT {
	
	@Column (name = "NUMERO_TICKET")
	private Integer numeroTicket;
	@Column (name = "ID_CLASIFICACION_TICKET")
	private Integer id_ClasificacionTicket;
	@Column (name = "FECHA_INICIO")
	private LocalDate fechaInicio;
	@Column (name = "FECHA_FIN")
	private LocalDate fechaFin;
	
	
	public Historial_CT () {
		
	}
	
	public Historial_CT (LocalDate fInicio, LocalDate fFin) {
		this.fechaInicio = fInicio;
		this.fechaFin = fFin;
	}

	
	
	public Integer getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(Integer numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public Integer getId_ClasificacionTicket() {
		return id_ClasificacionTicket;
	}

	public void setId_ClasificacionTicket(Integer id_ClasificacionTicket) {
		this.id_ClasificacionTicket = id_ClasificacionTicket;
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
