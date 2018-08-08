package todas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InterfazRegistrarClasificacionTicket1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblDescripcion;
	private JLabel lblGruposDeResolucion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRegistrarClasificacionTicket1 frame = new InterfazRegistrarClasificacionTicket1();
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
	public InterfazRegistrarClasificacionTicket1() {
		
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
		
		JLabel lblNewLabel = new JLabel("Registar clasificaci\u00F3n de ticket");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(373, 20, 602, 54);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(407, 157, 193, 31);
		contentPane.add(lblNombre);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(407, 247, 193, 31);
		contentPane.add(lblDescripcion);
		
		lblGruposDeResolucion = new JLabel("Grupos de Resoluci\u00F3n:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucion.setBounds(407, 457, 193, 37);
		contentPane.add(lblGruposDeResolucion);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBounds(612, 163, 327, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBox.setBounds(612, 465, 327, 24);
		contentPane.add(comboBox);
		
		JButton btnDerivar = new JButton("Registrar");
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
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(612, 253, 327, 139);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(612, 253, 327, 139);
		scrollPane.setViewportView(textArea);
		//contentPane.add(textArea);
		
		
		JLabel errorGrupo = new JLabel("* Debe seleccionar una opcion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(990, 467, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorObs = new JLabel("* Este campo no puede estar vacio.");
		errorObs.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorObs.setForeground(Color.RED);
		errorObs.setBounds(990, 254, 400, 20);
		errorObs.setVisible(false);
		contentPane.add(errorObs);
		
		JLabel lblNewLabel_1 = new JLabel("* Este campo no puede estar vacio.");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(990, 164, 225, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("* Este nombre ya existe en el sistema.");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(990, 157, 254, 28);
		contentPane.add(lblNewLabel_2);
		
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textArea.getText().isEmpty()) errorObs.setVisible(true);;
				if(comboBox.getSelectedIndex() == 0) errorGrupo.setVisible(true);;
			}
		});
		
		
		
	}

}
