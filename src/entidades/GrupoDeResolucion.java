package entidades;

public class GrupoDeResolucion {
	
	private String nombre;
	
	
	public GrupoDeResolucion() {
		
	}
	
	public GrupoDeResolucion(String n) {
		this.nombre = n;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
