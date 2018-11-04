package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CLASIFICACION_TICKET")
public class ClasificacionTicket implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="ID_CLASIFICACION")
	private Integer id_ClasificacionTicket;
	
	@Column (name ="NOMBRE")
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
	
	public Integer getId_ClasificacionTicket() {
		return id_ClasificacionTicket;
	}

	public void setId_ClasificacionTicket(Integer id_ClasificacionTicket) {
		this.id_ClasificacionTicket = id_ClasificacionTicket;
	}

}
