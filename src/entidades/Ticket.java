package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "TICKET")
public class Ticket {
	
	@Column (name = "NUMERO_TICKET")
	private Integer numeroTicket;
	@Column (name = "FECHA_APERTURA")
	private LocalDate fechaApertura;
	@Column (name = "FECHA_FIN")
	private LocalDate fechaFin;
	@Column (name = "HORA_APERTURA")
	private LocalTime horaApertura;
	@Column (name = "HORA_FIN")
	private LocalTime horaFin;
	
	
	public Ticket() {
		
	}
	
	public Ticket(Integer nro, LocalDate fechaAp, LocalTime horaAp) {
		this.numeroTicket = nro;
		this.fechaApertura = fechaAp;
		this.horaApertura = horaAp;
	}
	
	

	public Integer getNumero() {
		return numeroTicket;
	}

	public void setNumero(Integer numero) {
		this.numeroTicket = numero;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalTime getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(LocalTime horaApertura) {
		this.horaApertura = horaApertura;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

}
