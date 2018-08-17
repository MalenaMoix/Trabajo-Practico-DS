package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class InterfazDerivarTicket1 extends JPanel {

	private JFrame ventana;

	public InterfazDerivarTicket1(JFrame frame) {
		
		//LA LISTA DE GRUPO RESOLUCION DEPENDE DE LA CLASIFICACION DEL PROBLEMA
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(301, 90, 760, 2);
		this.add(separator);
		
		
		JLabel lblDerivarTicket = new JLabel("Derivar ticket");
		lblDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblDerivarTicket.setBounds(550, 20, 262, 54);
		this.add(lblDerivarTicket);
		
		JLabel lblSeleccione = new JLabel("Seleccione grupo de resolucion:");
		lblSeleccione.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblSeleccione.setBounds(364, 130, 262, 31);
		this.add(lblSeleccione);
		
		
		
		JRadioButton radioButtonMesaAyuda = new JRadioButton("Mesa de ayuda");
		radioButtonMesaAyuda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonMesaAyuda.setBackground(new Color(230, 230, 250));
		radioButtonMesaAyuda.setBounds(658, 169, 222, 23);
		this.add(radioButtonMesaAyuda);
		
		JRadioButton radioButtonUnidadesSoporte = new JRadioButton("Unidades de soporte");
		radioButtonUnidadesSoporte.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonUnidadesSoporte.setBackground(new Color(230, 230, 250));
		radioButtonUnidadesSoporte.setBounds(658, 212, 222, 23);
		this.add(radioButtonUnidadesSoporte);
		
		JRadioButton radioButtonServicioTecnico = new JRadioButton("Servicio tecnico");
		radioButtonServicioTecnico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonServicioTecnico.setBackground(new Color(230, 230, 250));
		radioButtonServicioTecnico.setBounds(658, 253, 222, 23);
		this.add(radioButtonServicioTecnico);
		
		JRadioButton radioButtonAdministradorDeBD = new JRadioButton("Administrador de Base de Datos");
		radioButtonAdministradorDeBD.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorDeBD.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorDeBD.setBounds(658, 293, 262, 23);
		this.add(radioButtonAdministradorDeBD);
		
		JRadioButton radioButtonAdministradorSuseLinux = new JRadioButton("Administrador SUSE Linux");
		radioButtonAdministradorSuseLinux.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorSuseLinux.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorSuseLinux.setBounds(658, 333, 222, 23);
		this.add(radioButtonAdministradorSuseLinux);
		
		JRadioButton radioButtonAdministradorProxy = new JRadioButton("Administrador Proxy y correo electronico");
		radioButtonAdministradorProxy.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorProxy.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorProxy.setBounds(658, 374, 317, 23);
		this.add(radioButtonAdministradorProxy);
		
		JRadioButton radioButtonAdministradorDebian = new JRadioButton("Administrador DEBIAN");
		radioButtonAdministradorDebian.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorDebian.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorDebian.setBounds(658, 416, 222, 23);
		this.add(radioButtonAdministradorDebian);
		
		JRadioButton radioButtonRedesLan = new JRadioButton("Redes LAN");
		radioButtonRedesLan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonRedesLan.setBackground(new Color(230, 230, 250));
		radioButtonRedesLan.setBounds(658, 457, 222, 23);
		this.add(radioButtonRedesLan);
		
		JRadioButton radioButtonComunicaciones = new JRadioButton("Comunicaciones");
		radioButtonComunicaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonComunicaciones.setBackground(new Color(230, 230, 250));
		radioButtonComunicaciones.setBounds(658, 499, 222, 23);
		this.add(radioButtonComunicaciones);
		
		JRadioButton radioButtonDesarrolloSistemaComercial = new JRadioButton("Desarrollo Sistema Comercial");
		radioButtonDesarrolloSistemaComercial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaComercial.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaComercial.setBounds(658, 541, 242, 23);
		this.add(radioButtonDesarrolloSistemaComercial);
		
		JRadioButton radioButtonDesarrolloSistemaRRHH = new JRadioButton("Desarrollo Sistema RRHH");
		radioButtonDesarrolloSistemaRRHH.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaRRHH.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaRRHH.setBounds(658, 584, 222, 23);
		this.add(radioButtonDesarrolloSistemaRRHH);
		
		JRadioButton radioButtonDesarrolloSistemaReclamos = new JRadioButton("Desarrollo Sistema de Reclamos");
		radioButtonDesarrolloSistemaReclamos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaReclamos.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaReclamos.setBounds(658, 626, 242, 23);
		this.add(radioButtonDesarrolloSistemaReclamos);
		
		
		
		JButton btnDerivar = new JButton("Derivar");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivar.setBounds(1020, 655, 133, 37);
		this.add(btnDerivar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnAtras.setBounds(1207, 655, 133, 37);
		this.add(btnAtras);
		
		
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazDerivarTicket2(ventana));
				ventana.pack();
			}
		});
		

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazRegistrarTicket2(ventana));
				ventana.pack();
			}
		});
	}
}
