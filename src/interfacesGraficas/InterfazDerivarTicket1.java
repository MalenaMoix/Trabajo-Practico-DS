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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class InterfazDerivarTicket1 extends JPanel {

	private JFrame ventana;
	private JTextField txtNumeroDeTicket;
	private JTextField txtNumeroDeLegajo;
	private JTextField txtClasificacionDeTicket;

	public InterfazDerivarTicket1(JFrame frame, String numeroTicket, String numeroLegajo, Object clasificacion) {
		
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
		lblSeleccione.setBounds(346, 304, 262, 31);
		this.add(lblSeleccione);
		
		
		JLabel lblNumeroDeTicket = new JLabel("Numero de ticket:");
		lblNumeroDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroDeTicket.setBounds(346, 143, 262, 31);
		add(lblNumeroDeTicket);
		
		JLabel lblNumeroDeLegajo = new JLabel("Numero de legajo:");
		lblNumeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroDeLegajo.setBounds(346, 187, 262, 31);
		add(lblNumeroDeLegajo);
		
		JLabel lblNewLabel = new JLabel("Clasificacion de ticket:");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel.setBounds(346, 231, 262, 31);
		add(lblNewLabel);
		
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione una opcion...", "Mesa de ayuda", "Unidades de soporte", "Servicio tecnico", "Administrador de Base de Datos", "Administrador SUSE Linux", "Administrador Proxy y correo electronico", "Administrador DEBIAN", "Redes LAN", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema RRHH", "Desarrollo Sistema de reclamos"}));
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setBounds(620, 308, 407, 25);
		add(comboBox);
		

		
		txtNumeroDeTicket = new JTextField();
		txtNumeroDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumeroDeTicket.setEditable(false);
		txtNumeroDeTicket.setBounds(620, 150, 407, 24);
		add(txtNumeroDeTicket);
		txtNumeroDeTicket.setColumns(10);
		txtNumeroDeTicket.setText(numeroTicket);
		
		txtNumeroDeLegajo = new JTextField();
		txtNumeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumeroDeLegajo.setEditable(false);
		txtNumeroDeLegajo.setColumns(10);
		txtNumeroDeLegajo.setBounds(620, 194, 407, 24);
		add(txtNumeroDeLegajo);
		txtNumeroDeLegajo.setText(numeroLegajo);
		
		txtClasificacionDeTicket = new JTextField();
		txtClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtClasificacionDeTicket.setEditable(false);
		txtClasificacionDeTicket.setColumns(10);
		txtClasificacionDeTicket.setBounds(620, 238, 407, 24);
		add(txtClasificacionDeTicket);
		txtClasificacionDeTicket.setText(clasificacion.toString());
		
		
		
		JButton btnDerivarTicket = new JButton("Derivar Ticket");
		btnDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivarTicket.setBounds(1020, 655, 133, 37);
		this.add(btnDerivarTicket);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnAtras.setBounds(1207, 655, 133, 37);
		this.add(btnAtras);
		
		
		btnDerivarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazRegistrarTicket2(ventana, numeroTicket, numeroLegajo, clasificacion));
				ventana.pack();
			}
		});
		

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new HomeMesaAyuda(ventana));
				ventana.pack();
			}
		});
	}
}
