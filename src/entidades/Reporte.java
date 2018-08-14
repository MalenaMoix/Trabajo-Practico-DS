package entidades;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Reporte {
	
	private Date fechaEjecucion;
	private Time horaEjecucion;

	private List<Ticket> listaTickets;


	public Reporte() {
		
	}
	
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public Time getHoraEjecucion() {
		return horaEjecucion;
	}

	public void setHoraEjecucion(Time horaEjecucion) {
		this.horaEjecucion = horaEjecucion;
	}
	
	public List<Ticket> getListaTickets() {
		return listaTickets;
	}

}
