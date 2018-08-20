package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

public class InterfazRegistrarTicket1 extends JPanel {

	private JFrame ventana;
	private JTextField txtFechaApertura;
	private JTextField txtHoraApertura;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;
	
	public InterfazRegistrarTicket1(JFrame frame) {

		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 90, 760, 2);
		this.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(611, 310, 365, 280);
		this.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setLineWrap(true);
		
		
		
		JLabel lblNumeroTicket = new JLabel("Numero de ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroTicket.setBounds(379, 130, 156, 28);
		this.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero de Legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroLegajo.setBounds(379, 253, 156, 23);
		this.add(lblNumeroLegajo);
		
		JLabel lblClasificacionTicket = new JLabel("Clasificacion de ticket:");
		lblClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacionTicket.setBounds(379, 598, 172, 36);
		this.add(lblClasificacionTicket);
		
		JLabel lblDescripcion = new JLabel("Descripcion del problema:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcion.setBounds(379, 305, 229, 29);
		this.add(lblDescripcion);
		
		JLabel lblFechaApertura = new JLabel("Fecha de apertura:");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblFechaApertura.setBounds(379, 171, 142, 28);
		this.add(lblFechaApertura);
		
		JLabel lblHoraApertura = new JLabel("Hora de apertura:");
		lblHoraApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblHoraApertura.setBounds(379, 212, 133, 28);
		this.add(lblHoraApertura);
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(526, 20, 298, 59);
		this.add(lblRegistrarTicket);
		
		JLabel errorLegajoVacio = new JLabel("* Este campo no puede estar vacio.");
		errorLegajoVacio.setForeground(Color.RED);
		errorLegajoVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorLegajoVacio.setBounds(988, 253, 219, 24);
		this.add(errorLegajoVacio);
		errorLegajoVacio.setVisible(false);
		
		JLabel errorDescripcionVacio = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcionVacio.setForeground(Color.RED);
		errorDescripcionVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDescripcionVacio.setBounds(988, 308, 219, 24);
		this.add(errorDescripcionVacio);
		errorDescripcionVacio.setVisible(false);
		
		JLabel errorDebeElegir = new JLabel("* Debe elegir una opcion.");
		errorDebeElegir.setForeground(Color.RED);
		errorDebeElegir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDebeElegir.setBounds(988, 605, 219, 24);
		this.add(errorDebeElegir);
		errorDebeElegir.setVisible(false);
		
		JLabel errorLegajoExistente = new JLabel("* Este numero de legajo no se encuentra en el sistema.");
		errorLegajoExistente.setForeground(Color.RED);
		errorLegajoExistente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorLegajoExistente.setBounds(988, 253, 339, 24);
		this.add(errorLegajoExistente);
		errorLegajoExistente.setVisible(false);
		
		
		
		txtFechaApertura = new JTextField();
		txtFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtFechaApertura.setBackground(new Color(220, 220, 220));
		txtFechaApertura.setBounds(611, 174, 365, 24);
		txtFechaApertura.setColumns(10);
		txtFechaApertura.setEditable(false);
		this.add(txtFechaApertura);
		
		txtHoraApertura = new JTextField();
		txtHoraApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtHoraApertura.setBackground(new Color(220, 220, 220));
		txtHoraApertura.setColumns(10);
		txtHoraApertura.setBounds(611, 215, 365, 24);
		txtHoraApertura.setEditable(false);
		this.add(txtHoraApertura);
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setColumns(10);
		txtNumeroTicket.setBackground(new Color(220, 220, 220));
		txtNumeroTicket.setBounds(611, 133, 365, 24);
		this.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		txtNumeroLegajo.setBounds(611, 253, 365, 24);
		this.add(txtNumeroLegajo);
		
		
		JComboBox comboBoxClasificacionTicket = new JComboBox();
		comboBoxClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacionTicket.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Configuracion de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacionTicket.setBounds(611, 605, 365, 24);
		this.add(comboBoxClasificacionTicket);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCancelar.setBounds(1207, 655, 133, 37);
		this.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnAceptar.setBounds(1020, 655, 133, 37);
		this.add(btnAceptar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Desea cancelar el registro del ticket? Los cambios no seran guardados.","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION){
					ventana.setContentPane(new HomeMesaAyuda(ventana));
					ventana.pack();
				}
			}
		});
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtNumeroLegajo.getText().isEmpty()) {
					errorLegajoVacio.setVisible(true);
				}
				else if (textAreaDescripcion.getText().isEmpty()) {
					errorDescripcionVacio.setVisible(true);
				}
				else if (comboBoxClasificacionTicket.getSelectedIndex()==0) {
					errorDebeElegir.setVisible(true);
				}
				else {
					ventana.setContentPane(new InterfazRegistrarTicket2(ventana,txtNumeroTicket.getText(),txtNumeroLegajo.getText()));
					ventana.pack();
				}
			}
		});
	}
}
