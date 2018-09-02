package entidades;

public class ClasificacionTicket {
	
	private String nombre;
	
	public ClasificacionTicket() {
		
	}
	
	public ClasificacionTicket(String n) {
		this.nombre = n;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
