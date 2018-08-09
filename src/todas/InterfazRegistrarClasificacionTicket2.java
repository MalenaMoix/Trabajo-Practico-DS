package todas;

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
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtActor;

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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(294, 80, 760, 2);
		contentPane.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(610, 262, 393, 155);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		textAreaDescripcion.setBounds(669, 253, 295, 139);
		scrollPane.setViewportView(textAreaDescripcion);
		contentPane.add(textAreaDescripcion);
		
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(335, 139, 263, 31);
		contentPane.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigo.setBounds(335, 201, 263, 31);
		contentPane.add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(335, 262, 263, 31);
		contentPane.add(lblDescripcion);
		
		JLabel lblGruposResolucion = new JLabel("Grupos de Resolucion:");
		lblGruposResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposResolucion.setBounds(335, 469, 263, 22);
		contentPane.add(lblGruposResolucion);
		
		JLabel lblActor = new JLabel("Actor que realizo la registracion:");
		lblActor.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblActor.setBounds(335, 526, 263, 31);
		contentPane.add(lblActor);
		
		JLabel lblFechaSolicitud = new JLabel("Fecha de solicitud:");
		lblFechaSolicitud.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaSolicitud.setBounds(335, 592, 263, 22);
		contentPane.add(lblFechaSolicitud);
		
		JLabel lblRegistrarClasificacion = new JLabel("Registar clasificacion de ticket");
		lblRegistrarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarClasificacion.setBounds(373, 20, 602, 54);
		contentPane.add(lblRegistrarClasificacion);
		
		
		JFormattedTextField formattedTextFieldFechaSolicitud = new JFormattedTextField();
		formattedTextFieldFechaSolicitud.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		formattedTextFieldFechaSolicitud.setBackground(new Color(220, 220, 220));
		formattedTextFieldFechaSolicitud.setEditable(false);
		formattedTextFieldFechaSolicitud.setBounds(610, 594, 393, 24);
		contentPane.add(formattedTextFieldFechaSolicitud);
		
		
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtCodigo.setBackground(new Color(220, 220, 220));
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(610, 207, 393, 24);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setEditable(false);
		txtNombre.setBounds(610, 145, 393, 24);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtActor = new JTextField();
		txtActor.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtActor.setBackground(new Color(220, 220, 220));
		txtActor.setEditable(false);
		txtActor.setBounds(610, 532, 393, 24);
		contentPane.add(txtActor);
		txtActor.setColumns(10);
		
		
		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electronico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio tecnico", "Unidades de soporte"}));
		comboBoxGrupo.setBackground(new Color(220, 220, 220));
		comboBoxGrupo.setBounds(610, 470, 393, 24);
		contentPane.add(comboBoxGrupo);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}
