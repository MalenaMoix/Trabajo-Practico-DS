package todas;
import java.awt.BorderLayout;

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
import javax.swing.JProgressBar;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import java.awt.Color;

public class InterfazRegistrarTicket1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel lblNumeroDeTicket = new JLabel("Numero de ticket:");
		lblNumeroDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroDeTicket.setBounds(379, 130, 156, 28);
		contentPane.add(lblNumeroDeTicket);
		
		JLabel lblNumeroDeLegajo = new JLabel("Numero de Legajo:");
		lblNumeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNumeroDeLegajo.setBounds(379, 253, 156, 23);
		contentPane.add(lblNumeroDeLegajo);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificacion de ticket:");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacionDeTicket.setBounds(379, 598, 172, 36);
		contentPane.add(lblClasificacionDeTicket);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro de este ticket?", "Registrar ticket", JOptionPane.YES_NO_OPTION);
				JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro de este ticket? No se guardaran los cambios realizados.", "Registrar ticket", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		});
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazRegistrarTicket2 observaciones = new InterfazRegistrarTicket2();
				observaciones.setVisible(true);
				InterfazRegistrarTicket1.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnNewButton.setBounds(1020, 655, 133, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblDescripcionDelProblema = new JLabel("Descripcion del problema:");
		lblDescripcionDelProblema.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcionDelProblema.setBounds(379, 305, 229, 29);
		contentPane.add(lblDescripcionDelProblema);
		
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacion.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Configuraci\u00F3n de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(611, 605, 365, 24);
		contentPane.add(comboBoxClasificacion);
		
		JLabel lblFechaDeApertura = new JLabel("Fecha de apertura:");
		lblFechaDeApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblFechaDeApertura.setBounds(379, 171, 142, 28);
		contentPane.add(lblFechaDeApertura);
		
		JLabel lblFechaDeCierre = new JLabel("Hora de apertura:");
		lblFechaDeCierre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblFechaDeCierre.setBounds(379, 212, 133, 28);
		contentPane.add(lblFechaDeCierre);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(611, 310, 365, 280);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(526, 20, 298, 59);
		contentPane.add(lblRegistrarTicket);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 90, 760, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(611, 174, 365, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setColumns(10);
		textField_1.setBounds(611, 215, 365, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(611, 133, 365, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(611, 253, 365, 24);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("* Este campo no puede estar vacio.");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel.setBounds(988, 253, 219, 24);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("* Este campo no puede estar vacio.");
		label.setForeground(Color.RED);
		label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		label.setBounds(988, 308, 219, 24);
		contentPane.add(label);
		
		JLabel lblDebeElegir = new JLabel("* Debe elegir una opcion.");
		lblDebeElegir.setForeground(Color.RED);
		lblDebeElegir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblDebeElegir.setBounds(988, 605, 219, 24);
		contentPane.add(lblDebeElegir);
		
		JLabel lblEsteNumero = new JLabel("* Este numero de legajo no se encuentra en el sistema.");
		lblEsteNumero.setForeground(Color.RED);
		lblEsteNumero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblEsteNumero.setBounds(988, 253, 339, 24);
		contentPane.add(lblEsteNumero);
	}
}
