package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO")
public class Usuario {
	
	@Column (name = "PASSWORD")
	private Integer password;
	@Column (name = "NOMBRE")
	private String nombre;
	@Column (name = "NUMERO_LEGAJO")
	private Integer numeroLegajo;
	
	
	
	public Usuario() {
		
	}
	
	public Usuario(Integer passw, String n, Integer legajo) {
		this.password = passw;
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

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

}
