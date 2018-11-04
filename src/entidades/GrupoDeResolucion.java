package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "GRUPO_DE_RESOLUCION")
public class GrupoDeResolucion {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID_GRUPO")
	private Integer id_Grupo;
	
	@Column (name = "NOMBRE")
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
	
	public Integer getId_Grupo() {
		return id_Grupo;
	}

	public void setId_Grupo(Integer id_Grupo) {
		this.id_Grupo = id_Grupo;
	}

}
