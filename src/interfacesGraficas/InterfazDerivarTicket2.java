package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class InterfazDerivarTicket2 extends JPanel {

	private JFrame ventana;
	private JTextField txtNumeroTicket;
	private JTextField txtLegajo;
	private JTextField txtEstadoActual;
	private JTextField txtDescripcion;
	private JTextField txtNuevoEstado;
	
	public InterfazDerivarTicket2(JFrame frame) {
		
		//SI EL GRUPO AL CUAL SE ESTA DERIVANDO EL TICKET TIENE UNA INTERVENCION EN ESPERA
		//SE LLEVA A CABO UNA REASIGNACION DE DICHA INTERVENCION (NO SE CREA UNA NUEVA)
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		this.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(692, 507, 252, 95);
		this.add(scrollPane);
		
		JTextArea txtAreaObservaciones = new JTextArea();
		scrollPane.setViewportView(txtAreaObservaciones);
		
		
		
		JLabel lblDerivarTicket = new JLabel("Derivar ticket");
		lblDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblDerivarTicket.setBounds(535, 20, 280, 43);
		this.add(lblDerivarTicket);
		
		JLabel lblNroTicket = new JLabel("Numero Ticket: ");
		lblNroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNroTicket.setBounds(465, 140, 149, 37);
		this.add(lblNroTicket);
		
		JLabel lblLegajo = new JLabel("Legajo: ");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblLegajo.setBounds(465, 189, 100, 37);
		this.add(lblLegajo);
		
		JLabel lblEstadoActual = new JLabel("Estado actual: ");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblEstadoActual.setBounds(465, 239, 149, 37);
		this.add(lblEstadoActual);
		
		JLabel lblDescripcion = new JLabel("Descripcion del problema: ");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcion.setBounds(465, 287, 187, 37);
		this.add(lblDescripcion);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado: ");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNuevoEstado.setBounds(465, 337, 149, 37);
		this.add(lblNuevoEstado);
		
		JLabel lblClasificacinTicket = new JLabel("Clasificacion del ticket: ");
		lblClasificacinTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacinTicket.setBounds(465, 385, 170, 37);
		this.add(lblClasificacinTicket);
		
		JLabel lblGrupoResolucion = new JLabel("Grupo de resolucion: ");
		lblGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblGrupoResolucion.setBounds(465, 437, 149, 37);
		this.add(lblGrupoResolucion);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblObservaciones.setBounds(465, 498, 149, 37);
		this.add(lblObservaciones);
		
		
		JLabel errorGrupo = new JLabel("* Debe seleccionar una opcion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(970, 447, 400, 20);
		errorGrupo.setVisible(false);
		this.add(errorGrupo);
		
		JLabel errorObsVacio = new JLabel("* Este campo no puede estar vacio.");
		errorObsVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorObsVacio.setForeground(Color.RED);
		errorObsVacio.setBounds(970, 507, 400, 20);
		errorObsVacio.setVisible(false);
		this.add(errorObsVacio);
		
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setBounds(692, 148, 252, 22);
		txtNumeroTicket.setColumns(10);
		this.add(txtNumeroTicket);
		
		txtLegajo = new JTextField();
		txtLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(692, 197, 252, 22);
		this.add(txtLegajo);
		
		txtEstadoActual = new JTextField();
		txtEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtEstadoActual.setEditable(false);
		txtEstadoActual.setBorder(new LineBorder(Color.gray));
		txtEstadoActual.setBackground(new Color(220, 220, 220));
		txtEstadoActual.setColumns(10);
		txtEstadoActual.setBounds(692, 247, 252, 22);
		this.add(txtEstadoActual);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtDescripcion.setEditable(false);
		txtDescripcion.setBorder(new LineBorder(Color.gray));
		txtDescripcion.setBackground(new Color(220, 220, 220));
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(692, 295, 252, 22);
		this.add(txtDescripcion);
		
		txtNuevoEstado = new JTextField();
		txtNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNuevoEstado.setEditable(false);
		txtNuevoEstado.setBackground(new Color(220, 220, 220));
		txtNuevoEstado.setBounds(692, 345, 252, 22);
		txtNuevoEstado.setText("Abierto derivado");
		txtNuevoEstado.setBorder(new LineBorder(Color.gray));
		this.add(txtNuevoEstado);
		txtNuevoEstado.setColumns(10);
		

		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electronico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio tecnico", "Unidades de soporte"}));
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxGrupo.setBounds(692, 445, 252, 22);
		this.add(comboBoxGrupo);
		
		
		//SE DEBE MOSTRAR LA ACTUAL POR DEFECTO
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacion.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Configuracion de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificacion en los perfiles de usuarios", "Problemas con el correo electronico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticacion", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicacion o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(692, 393, 252, 22);
		this.add(comboBoxClasificacion);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		this.add(btnDerivar);
		

		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtAreaObservaciones.getText().isEmpty()) {
					errorObsVacio.setVisible(true);
				}
				else if(comboBoxGrupo.getSelectedIndex() == 0) {
					errorGrupo.setVisible(true);
				}
			}
		});	
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VUELVE
			}
		});
	}
}
