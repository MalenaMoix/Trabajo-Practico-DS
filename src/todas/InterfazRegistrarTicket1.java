package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;
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

public class InterfazRegistrarTicket1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaApertura;
	private JTextField txtHoraApertura;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRegistrarTicket1 frame = new InterfazRegistrarTicket1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfazRegistrarTicket1() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1366, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(230, 230, 250));
		
		JLabel lblNumeroTicket = new JLabel("Numero de ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroTicket.setBounds(379, 130, 156, 28);
		contentPane.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero de Legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroLegajo.setBounds(379, 253, 156, 23);
		contentPane.add(lblNumeroLegajo);
		
		JLabel lblClasificacionTicket = new JLabel("Clasificacion de ticket:");
		lblClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacionTicket.setBounds(379, 598, 172, 36);
		contentPane.add(lblClasificacionTicket);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showConfirmDialog(null, "�Desea cancelar el registro de este ticket?", "Registrar ticket", JOptionPane.YES_NO_OPTION);
				JOptionPane.showConfirmDialog(null, "�Desea cancelar el registro de este ticket? No se guardaran los cambios realizados.", "Registrar ticket", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		});
		
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazRegistrarTicket2 observaciones = new InterfazRegistrarTicket2();
				observaciones.setVisible(true);
				InterfazRegistrarTicket1.this.dispose();
			}
		});
		
		btnAceptar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnAceptar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnAceptar);
		
		JLabel lblDescripcion = new JLabel("Descripcion del problema:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcion.setBounds(379, 305, 229, 29);
		contentPane.add(lblDescripcion);
		
		JComboBox comboBoxClasificacionTicket = new JComboBox();
		comboBoxClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacionTicket.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Configuraci\u00F3n de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacionTicket.setBounds(611, 605, 365, 24);
		contentPane.add(comboBoxClasificacionTicket);
		
		JLabel lblFechaApertura = new JLabel("Fecha de apertura:");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblFechaApertura.setBounds(379, 171, 142, 28);
		contentPane.add(lblFechaApertura);
		
		JLabel lblHoraApertura = new JLabel("Hora de apertura:");
		lblHoraApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblHoraApertura.setBounds(379, 212, 133, 28);
		contentPane.add(lblHoraApertura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(611, 310, 365, 280);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setLineWrap(true);
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(526, 20, 298, 59);
		contentPane.add(lblRegistrarTicket);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 90, 760, 2);
		contentPane.add(separator);
		
		txtFechaApertura = new JTextField();
		txtFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtFechaApertura.setBackground(new Color(220, 220, 220));
		txtFechaApertura.setBounds(611, 174, 365, 24);
		contentPane.add(txtFechaApertura);
		txtFechaApertura.setColumns(10);
		
		txtHoraApertura = new JTextField();
		txtHoraApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtHoraApertura.setBackground(new Color(220, 220, 220));
		txtHoraApertura.setColumns(10);
		txtHoraApertura.setBounds(611, 215, 365, 24);
		contentPane.add(txtHoraApertura);
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setColumns(10);
		txtNumeroTicket.setBackground(new Color(220, 220, 220));
		txtNumeroTicket.setBounds(611, 133, 365, 24);
		contentPane.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		txtNumeroLegajo.setBounds(611, 253, 365, 24);
		contentPane.add(txtNumeroLegajo);
		
		JLabel lblNewLabel = new JLabel("* Este campo no puede estar vacio.");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel.setBounds(988, 253, 219, 24);
		contentPane.add(lblNewLabel);
		
		JLabel errorDescripcionVacio = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcionVacio.setForeground(Color.RED);
		errorDescripcionVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDescripcionVacio.setBounds(988, 308, 219, 24);
		contentPane.add(errorDescripcionVacio);
		
		JLabel errorDebeElegir = new JLabel("* Debe elegir una opcion.");
		errorDebeElegir.setForeground(Color.RED);
		errorDebeElegir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDebeElegir.setBounds(988, 605, 219, 24);
		contentPane.add(errorDebeElegir);
		
		JLabel lblEsteNumero = new JLabel("* Este numero de legajo no se encuentra en el sistema.");
		lblEsteNumero.setForeground(Color.RED);
		lblEsteNumero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblEsteNumero.setBounds(988, 253, 339, 24);
		contentPane.add(lblEsteNumero);
	}
}
