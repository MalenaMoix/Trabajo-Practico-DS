package entidades;

public class Empleado {
	
	private Integer dni;
	private String nombre;
	private Integer numeroLegajo;
	private String mail;
	
	public Empleado() {
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
