package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class InterfazRegistrarClasificacionTicket2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRegistrarClasificacionTicket2 frame = new InterfazRegistrarClasificacionTicket2();
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
	public InterfazRegistrarClasificacionTicket2() {
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
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel.setBounds(335, 139, 263, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(335, 201, 263, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(335, 262, 263, 31);
		contentPane.add(lblDescripcion);
		
		JLabel lblGruposDeResolucion = new JLabel("Grupos de Resoluci\u00F3n:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucion.setBounds(335, 469, 263, 22);
		contentPane.add(lblGruposDeResolucion);
		
		JLabel lblActorQueRealizo = new JLabel("Actor que realiz\u00F3 la registraci\u00F3n:");
		lblActorQueRealizo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblActorQueRealizo.setBounds(335, 526, 263, 31);
		contentPane.add(lblActorQueRealizo);
		
		JLabel lblFechaDeSolicitud = new JLabel("Fecha de solicitud:");
		lblFechaDeSolicitud.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaDeSolicitud.setBounds(335, 592, 263, 22);
		contentPane.add(lblFechaDeSolicitud);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBackground(new Color(220, 220, 220));
		textField.setEditable(false);
		textField.setBounds(610, 207, 393, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setEditable(false);
		textField_1.setBounds(610, 145, 393, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(610, 262, 393, 155);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(false);
		//textArea.setBounds(669, 253, 295, 139);
		scrollPane.setViewportView(textArea);
		//contentPane.add(textArea);
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setEditable(false);
		textField_2.setBounds(610, 532, 393, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		formattedTextField.setBackground(new Color(220, 220, 220));
		formattedTextField.setEditable(false);
		formattedTextField.setBounds(610, 594, 393, 24);
		contentPane.add(formattedTextField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBox.setBackground(new Color(220, 220, 220));
		comboBox.setBounds(610, 470, 393, 24);
		contentPane.add(comboBox);
		
		JButton btnDerivar = new JButton("Confirmar");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnNewButton.setBounds(1207, 650, 133, 37);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Registar clasificaci\u00F3n de ticket");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		label.setBounds(373, 20, 602, 54);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(294, 80, 760, 2);
		contentPane.add(separator);
		
	}
}
