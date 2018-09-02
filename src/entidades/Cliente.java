package entidades;

public class Cliente {
	
	private String nombre;
	private Integer numeroLegajo;
	private String telefonoInterno;
	private String telefonoDirecto;
	private String descripcionCargo;
	private String calle;
	private String numero;
	private String piso;
	private String oficina;
	
	public Cliente() {
		
	}
	
	public Cliente(String n, Integer legajo, String c, String num, String p, String ofic) {
		this.nombre = n;
		this.numeroLegajo = legajo;
		this.calle = c;
		this.numero = num;
		this.piso = p;
		this.oficina = ofic;
	}
	
	
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	
	public String getTelefonoInterno() {
		return telefonoInterno;
	}

	public void setTelefonoInterno(String telefonoInterno) {
		this.telefonoInterno = telefonoInterno;
	}

	public String getTelefonoDirecto() {
		return telefonoDirecto;
	}

	public void setTelefonoDirecto(String telefonoDirecto) {
		this.telefonoDirecto = telefonoDirecto;
	}

	public String getDescripcionCargo() {
		return descripcionCargo;
	}

	public void setDescripcionCargo(String descripcionCargo) {
		this.descripcionCargo = descripcionCargo;
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
