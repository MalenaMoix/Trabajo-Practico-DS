package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "MODIFICADO_POR")
public class Modificado_Por {
	
	@Column (name = "ID_CLASIFICACION_TICKET")
	private Integer id_ClasificacionTicket;
	@Column (name = "ID_GRUPO")
	private Integer id_Grupo;
	
	
	public Modificado_Por () {
		
	}


	
	public Integer getId_ClasificacionTicket() {
		return id_ClasificacionTicket;
	}
	public void setId_ClasificacionTicket(Integer id_ClasificacionTicket) {
		this.id_ClasificacionTicket = id_ClasificacionTicket;
	}
	public Integer getId_Grupo() {
		return id_Grupo;
	}
	public void setId_Grupo(Integer id_Grupo) {
		this.id_Grupo = id_Grupo;
	}

}
