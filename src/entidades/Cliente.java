package entidades;

public class Cliente {
	
	private String nombre;
	private Integer numeroLegajo;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String n, Integer legajo) {
		this.nombre = n;
		this.numeroLegajo = legajo;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(Integer numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

}
