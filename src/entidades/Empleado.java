package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "EMPLEADO")
public class Empleado {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "NUMERO_LEGAJO")
	private Integer numeroLegajo;
	
	@Column (name = "NOMBRE")
	private String nombre;
	@Column (name = "TELEFONO_INTERNO")
	private String telefonoInterno;
	@Column (name = "TELEFONO_DIRECTO")
	private String telefonoDirecto;
	@Column (name = "DESCRIPCION_CARGO")
	private String descripcionCargo;
	
	
	public Empleado() {
		
	}
	
	public Empleado(String n, Integer legajo) {
		this.nombre = n;
		this.numeroLegajo = legajo;
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
