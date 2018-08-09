package interfacesGraficas;

import java.awt.EventQueue;
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
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class InterfazDerivarTicket2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroTicket;
	private JTextField txtLegajo;
	private JTextField txtEstadoActual;
	private JTextField txtDescripcion;
	private JTextField txtNuevoEstado;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDerivarTicket2 frame = new InterfazDerivarTicket2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfazDerivarTicket2() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(692, 507, 252, 95);
		contentPane.add(scrollPane);
		
		JTextArea txtAreaObservaciones = new JTextArea();
		scrollPane.setViewportView(txtAreaObservaciones);
		
		
		
		JLabel lblDerivarTicket = new JLabel("Derivar ticket");
		lblDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblDerivarTicket.setBounds(535, 20, 280, 43);
		contentPane.add(lblDerivarTicket);
		
		JLabel lblNroTicket = new JLabel("Numero Ticket: ");
		lblNroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNroTicket.setBounds(465, 140, 149, 37);
		contentPane.add(lblNroTicket);
		
		JLabel lblLegajo = new JLabel("Legajo: ");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblLegajo.setBounds(465, 189, 100, 37);
		contentPane.add(lblLegajo);
		
		JLabel lblEstadoActual = new JLabel("Estado actual: ");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblEstadoActual.setBounds(465, 239, 149, 37);
		contentPane.add(lblEstadoActual);
		
		JLabel lblDescripcion = new JLabel("Descripcion del problema: ");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcion.setBounds(465, 287, 187, 37);
		contentPane.add(lblDescripcion);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado: ");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNuevoEstado.setBounds(465, 337, 149, 37);
		contentPane.add(lblNuevoEstado);
		
		JLabel lblClasificacinTicket = new JLabel("Clasificacion del ticket: ");
		lblClasificacinTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacinTicket.setBounds(465, 385, 170, 37);
		contentPane.add(lblClasificacinTicket);
		
		JLabel lblGrupoResolucion = new JLabel("Grupo de resolucion: ");
		lblGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblGrupoResolucion.setBounds(465, 437, 149, 37);
		contentPane.add(lblGrupoResolucion);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblObservaciones.setBounds(465, 498, 149, 37);
		contentPane.add(lblObservaciones);
		
		
		JLabel errorGrupo = new JLabel("* Debes seleccionar una opcion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(970, 447, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorObsVacio = new JLabel("* Este campo no puede estar vacio.");
		errorObsVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorObsVacio.setForeground(Color.RED);
		errorObsVacio.setBounds(970, 507, 400, 20);
		errorObsVacio.setVisible(false);
		contentPane.add(errorObsVacio);
		
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setBounds(692, 148, 252, 22);
		contentPane.add(txtNumeroTicket);
		txtNumeroTicket.setColumns(10);
		
		txtLegajo = new JTextField();
		txtLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(692, 197, 252, 22);
		contentPane.add(txtLegajo);
		
		txtEstadoActual = new JTextField();
		txtEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtEstadoActual.setEditable(false);
		txtEstadoActual.setBorder(new LineBorder(Color.gray));
		txtEstadoActual.setBackground(new Color(220, 220, 220));
		txtEstadoActual.setColumns(10);
		txtEstadoActual.setBounds(692, 247, 252, 22);
		contentPane.add(txtEstadoActual);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtDescripcion.setEditable(false);
		txtDescripcion.setBorder(new LineBorder(Color.gray));
		txtDescripcion.setBackground(new Color(220, 220, 220));
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(692, 295, 252, 22);
		contentPane.add(txtDescripcion);
		
		txtNuevoEstado = new JTextField();
		txtNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNuevoEstado.setEditable(false);
		txtNuevoEstado.setBackground(new Color(220, 220, 220));
		txtNuevoEstado.setBounds(692, 345, 252, 22);
		txtNuevoEstado.setEditable(false);
		txtNuevoEstado.setBorder(new LineBorder(Color.gray));
		contentPane.add(txtNuevoEstado);
		txtNuevoEstado.setColumns(10);
		

		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxGrupo.setBounds(692, 445, 252, 22);
		contentPane.add(comboBoxGrupo);
		
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacion.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Configuraci\u00F3n de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(692, 393, 252, 22);
		contentPane.add(comboBoxClasificacion);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		

		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtAreaObservaciones.getText().isEmpty()) {
					errorObsVacio.setVisible(true);;
				}
				if(comboBoxGrupo.getSelectedIndex() == 0) {
					errorGrupo.setVisible(true);;
				}
				
			}
		});	
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
