package todas;

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
	private JTextField txtNombre;
	private JLabel lblDescripcion;
	private JLabel lblGruposResolucion;

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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(612, 253, 327, 139);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(612, 253, 327, 139);
		scrollPane.setViewportView(textAreaDescripcion);
		contentPane.add(textAreaDescripcion);
		
		
		
		JLabel lblRegistrarClasificacion = new JLabel("Registar clasificacion de ticket");
		lblRegistrarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarClasificacion.setBounds(373, 20, 602, 54);
		contentPane.add(lblRegistrarClasificacion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(407, 157, 193, 31);
		contentPane.add(lblNombre);
		
		JLabel errorGrupo = new JLabel("* Debe seleccionar una opcion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(990, 467, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorDescripcionVacio = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcionVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDescripcionVacio.setForeground(Color.RED);
		errorDescripcionVacio.setBounds(990, 254, 400, 20);
		errorDescripcionVacio.setVisible(false);
		contentPane.add(errorDescripcionVacio);
		
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
		
		
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(407, 247, 193, 31);
		contentPane.add(lblDescripcion);
		
		lblGruposResolucion = new JLabel("Grupos de Resolucion:");
		lblGruposResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposResolucion.setBounds(407, 457, 193, 37);
		contentPane.add(lblGruposResolucion);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setBounds(612, 163, 327, 24);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electronico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio tecnico", "Unidades de soporte"}));
		comboBoxGrupo.setBounds(612, 465, 327, 24);
		contentPane.add(comboBoxGrupo);
		
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnRegistrar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textAreaDescripcion.getText().isEmpty()) errorDescripcionVacio.setVisible(true);;
				if(comboBoxGrupo.getSelectedIndex() == 0) errorGrupo.setVisible(true);;
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}