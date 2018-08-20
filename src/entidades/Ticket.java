package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
	
	private Integer numero;
	private LocalDate fechaApertura;
	private LocalDate fechaFin;
	private LocalTime horaApertura;
	private LocalTime horaFin;
	
	
	public Ticket() {
		
	}
	
	public Ticket(Integer nro, LocalDate fechaAp, LocalTime horaAp) {
		this.numero = nro;
		this.fechaApertura = fechaAp;
		this.horaApertura = horaAp;
	}
	
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
