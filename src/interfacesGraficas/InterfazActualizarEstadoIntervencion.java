package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class InterfazActualizarEstadoIntervencion extends JPanel {

	private JFrame ventana;
	private JTextField txtEstadoActual;


	public InterfazActualizarEstadoIntervencion(JFrame frame) {
		
		//ACTOR : GRUPO DE RESOLUCION
		
		//CLASIFICACION ACTUAL DEL TICKET POR DEFECTO
		
		//CUANDO EL GRUPO DE RESOLUCION RECIBE UNA ASIGNACION DEBE INGRESAR EN EL SISTEMA CUANDO COMIENZA
		//A TRABAJAR EN LA MISMA
		

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
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(666, 246, 266, 80);
		this.add(scrollPane);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(666, 502, 266, 80);
		this.add(scrollPane2);
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		scrollPane.setViewportView(textAreaDescripcion);
		
		JTextArea textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setBackground(new Color(220, 220, 220));
		textAreaObservaciones.setEditable(true);
		scrollPane2.setViewportView(textAreaObservaciones);
		
		
		JLabel lblActualizarEstadoIntervencion = new JLabel("Actualizar estado intervencion");
		lblActualizarEstadoIntervencion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblActualizarEstadoIntervencion.setBounds(377, 20, 593, 43);
		this.add(lblActualizarEstadoIntervencion);
		
		JLabel lblEstadoActual = new JLabel("Estado actual:");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoActual.setBounds(446, 165, 208, 21);
		this.add(lblEstadoActual);
		
		JLabel lblDescripcionProblema = new JLabel("Descripcion del problema:");
		lblDescripcionProblema.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionProblema.setBounds(446, 244, 208, 21);
		this.add(lblDescripcionProblema);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado:");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNuevoEstado.setBounds(446, 348, 208, 21);
		this.add(lblNuevoEstado);
		
		JLabel lblClasificacionTicket = new JLabel("Clasificacion del ticket:");
		lblClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblClasificacionTicket.setBounds(446, 424, 208, 21);
		this.add(lblClasificacionTicket);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblObservaciones.setBounds(446, 500, 208, 21);
		this.add(lblObservaciones);
		
		JLabel errorEstadoVacio = new JLabel("* Debe seleccionar una opcion.");
		errorEstadoVacio.setBackground(new Color(240, 240, 240));
		errorEstadoVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorEstadoVacio.setForeground(Color.RED);
		errorEstadoVacio.setBounds(970, 346, 400, 20);
		errorEstadoVacio.setVisible(false);
		this.add(errorEstadoVacio);
		
		JLabel errorObservacionesVacio = new JLabel("* Este campo no puede estar vacio.");
		errorObservacionesVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorObservacionesVacio.setForeground(Color.RED);
		errorObservacionesVacio.setBounds(970, 500, 400, 20);
		errorObservacionesVacio.setVisible(false);
		this.add(errorObservacionesVacio);
		
		
		txtEstadoActual = new JTextField();
		txtEstadoActual.setBounds(666, 166, 266, 25);
		txtEstadoActual.setColumns(10);
		txtEstadoActual.setEditable(false);
		this.add(txtEstadoActual);
		
		
		
		JComboBox<String> comboBoxNuevoEstado = new JComboBox<String>();
		comboBoxNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxNuevoEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Asignada", "En espera", "Terminada"}));
		comboBoxNuevoEstado.setBounds(666, 347, 266, 25);
		this.add(comboBoxNuevoEstado);
		
		JComboBox<String> comboBoxClasificacion = new JComboBox<String>();
		comboBoxClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxClasificacion.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione una opcion...", "Configuracion de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificacion en los perfiles de usuarios", "Problemas con el correo electronico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticacion", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalacion de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicacion o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(666, 423, 266, 25);
		this.add(comboBoxClasificacion);
		
		
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnActualizar.setBounds(1020, 655, 133, 37);
		this.add(btnActualizar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnSalir.setBounds(1207, 655, 133, 37);
		this.add(btnSalir);
		
		
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxNuevoEstado.getSelectedIndex() == 0){
					errorEstadoVacio.setVisible(true);
				}
				else if (textAreaObservaciones.getText().isEmpty()) {
					errorObservacionesVacio.setVisible(true);
				}
			}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ventana.setContentPane(new InterfazConsultarIntervencionesPaginacion(ventana));
				//ventana.pack();
			}
		});
	}
}
