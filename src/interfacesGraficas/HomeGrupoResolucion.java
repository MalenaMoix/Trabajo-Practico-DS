package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeGrupoResolucion extends JPanel {
	
	private JFrame ventana;
	
	public HomeGrupoResolucion(JFrame frame) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		this.add(separator);
		
		
		JLabel lblHomeGrupo = new JLabel("Home: Grupo de Resolucion");
		lblHomeGrupo.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblHomeGrupo.setBounds(401, 20, 546, 54);
		this.add(lblHomeGrupo);
		
		
		JButton btnConsultarIntervenciones = new JButton("Consultar intervenciones");
		btnConsultarIntervenciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnConsultarIntervenciones.setBounds(462, 183, 424, 45);
		this.add(btnConsultarIntervenciones);
		
		JButton btnRegistrarClasificacion = new JButton("Registrar clasificacion de ticket");
		btnRegistrarClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnRegistrarClasificacion.setBounds(462, 304, 424, 45);
		this.add(btnRegistrarClasificacion);
		
		JButton btnBuscarClasificacion = new JButton("Buscar clasificacion");
		btnBuscarClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnBuscarClasificacion.setBounds(462, 436, 424, 45);
		this.add(btnBuscarClasificacion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnSalir.setBounds(1207, 655, 133, 37);
		this.add(btnSalir);
		
		
		
		btnConsultarIntervenciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazConsultarIntervenciones(ventana));
				ventana.pack();
			}
		});
		
		
		btnRegistrarClasificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazRegistrarClasificacionTicket1(ventana));
				ventana.pack();
			}
		});
		
		
		btnBuscarClasificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazBuscarClasificacionTicket(ventana));
				ventana.pack();
			}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}