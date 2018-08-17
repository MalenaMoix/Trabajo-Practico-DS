package aplicacion;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import interfacesGraficas.HomeGrupoResolucion;
import interfacesGraficas.HomeMesaAyuda;

public class Principal extends JFrame {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Principal();
			}
		});
	}
	
	public Principal() {
		
		this.setTitle("La llamita");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\eclipse-workspace\\TPDS\\cool-flame-icon.png"));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setBounds(0, 0, 1366, 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		this.setVisible(true);
		
		
		//DEPENDIENDO SI SE REGISTRE COMO MESA DE AYUDA O GRUPO DE RESOLUCION
		if (true) {
			this.setContentPane(new HomeMesaAyuda(this));
			this.pack();
		}
		else {
			this.setContentPane(new HomeGrupoResolucion(this));
			this.pack();
		}
	}
}