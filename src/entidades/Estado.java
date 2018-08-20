package entidades;

public class Estado {
	
	private String nombre;
	private String descripcion;
	private Integer id_estado;
	
	
	public Estado() {
		
	}
	
	public Estado(String n, String desc) {
		this.nombre = n;
		this.descripcion = desc;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId_estado() {
		return id_estado;
	}

	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}

}
