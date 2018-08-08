package todas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Toolkit;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.DropMode;

public class InterfazDerivarTicket2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtestadoX;
	private JTextField txtdescripcinX;
	private JTextField txtAbiertoDerivado;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel lblNewLabel = new JLabel("Derivar ticket");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(535, 20, 280, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNroTicket = new JLabel("N\u00FAmero Ticket: ");
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
		
		JLabel lblDescripcionDelProblema = new JLabel("Descripci\u00F3n del problema: ");
		lblDescripcionDelProblema.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblDescripcionDelProblema.setBounds(465, 287, 187, 37);
		contentPane.add(lblDescripcionDelProblema);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado: ");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNuevoEstado.setBounds(465, 337, 149, 37);
		contentPane.add(lblNuevoEstado);
		
		JLabel lblClasificacinDelTicket = new JLabel("Clasificaci\u00F3n del ticket: ");
		lblClasificacinDelTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblClasificacinDelTicket.setBounds(465, 385, 170, 37);
		contentPane.add(lblClasificacinDelTicket);
		
		JLabel lblGrupoDeResolucin = new JLabel("Grupo de resoluci\u00F3n: ");
		lblGrupoDeResolucin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblGrupoDeResolucin.setBounds(465, 437, 149, 37);
		contentPane.add(lblGrupoDeResolucin);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblObservaciones.setBounds(465, 498, 149, 37);
		contentPane.add(lblObservaciones);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnNewButton.setBounds(1207, 650, 133, 37);
		contentPane.add(btnNewButton);
		
		JLabel errorGrupo = new JLabel("* Debes seleccionar una opci\u00F3n.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(970, 447, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorObs = new JLabel("* Este campo no puede estar vac\u00EDo.");
		errorObs.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		errorObs.setForeground(Color.RED);
		errorObs.setBounds(970, 507, 400, 20);
		errorObs.setVisible(false);
		contentPane.add(errorObs);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBounds(692, 148, 252, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(692, 197, 252, 22);
		contentPane.add(textField_1);
		
		txtestadoX = new JTextField();
		txtestadoX.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtestadoX.setEditable(false);
		txtestadoX.setBorder(new LineBorder(Color.gray));
		txtestadoX.setText(" (Estado X)");
		txtestadoX.setBackground(new Color(220, 220, 220));
		txtestadoX.setColumns(10);
		txtestadoX.setBounds(692, 247, 252, 22);
		contentPane.add(txtestadoX);
		
		txtdescripcinX = new JTextField();
		txtdescripcinX.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtdescripcinX.setEditable(false);
		txtdescripcinX.setBorder(new LineBorder(Color.gray));
		txtdescripcinX.setText(" (Descripci\u00F3n X)");
		txtdescripcinX.setBackground(new Color(220, 220, 220));
		txtdescripcinX.setColumns(10);
		txtdescripcinX.setBounds(692, 295, 252, 22);
		contentPane.add(txtdescripcinX);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox.setBounds(692, 445, 252, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Configuraci\u00F3n de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBox_1.setBounds(692, 393, 252, 22);
		contentPane.add(comboBox_1);
	
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		txtAbiertoDerivado = new JTextField();
		txtAbiertoDerivado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtAbiertoDerivado.setText(" Abierto derivado");
		txtAbiertoDerivado.setEditable(false);
		txtAbiertoDerivado.setBackground(new Color(220, 220, 220));
		txtAbiertoDerivado.setBounds(692, 345, 252, 22);
		txtAbiertoDerivado.setEditable(false);
		txtAbiertoDerivado.setBorder(new LineBorder(Color.gray));
		contentPane.add(txtAbiertoDerivado);
		txtAbiertoDerivado.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(692, 507, 252, 95);
		contentPane.add(scrollPane);
		
		JTextArea observaciones = new JTextArea();
		scrollPane.setViewportView(observaciones);
		
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (observaciones.getText().isEmpty()) errorObs.setVisible(true);;
				if(comboBox.getSelectedIndex() == 0) errorGrupo.setVisible(true);;
				
			}
		});
		
		}
}
