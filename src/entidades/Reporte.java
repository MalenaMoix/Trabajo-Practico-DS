package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Reporte {
	
	private LocalDate fechaEjecucion;
	private LocalTime horaEjecucion;

	private List<Ticket> listaTickets;


	public Reporte() {
		
	}
	
	public Reporte(LocalDate fechaEjec, LocalTime horaEjec) {
		this.fechaEjecucion = fechaEjec;
		this.horaEjecucion = horaEjec;
	}


	
	public LocalDate getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(LocalDate fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public LocalTime getHoraEjecucion() {
		return horaEjecucion;
	}

	public void setHoraEjecucion(LocalTime horaEjecucion) {
		this.horaEjecucion = horaEjecucion;
	}
	
	public List<Ticket> getListaTickets() {
		return listaTickets;
	}

}
