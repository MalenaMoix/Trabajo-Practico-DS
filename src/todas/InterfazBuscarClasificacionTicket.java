package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class InterfazBuscarClasificacionTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazBuscarClasificacionTicket frame = new InterfazBuscarClasificacionTicket();
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
	public InterfazBuscarClasificacionTicket() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarClasificacionDe = new JLabel("Buscar clasificaci\u00F3n de tickets");
		lblBuscarClasificacionDe.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblBuscarClasificacionDe.setBounds(385, 27, 579, 38);
		contentPane.add(lblBuscarClasificacionDe);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Parte nombre:");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel.setBounds(392, 156, 142, 31);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo num\u00E9rico:");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(392, 235, 142, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescripcion = new JLabel("Parte de la descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(392, 321, 242, 31);
		contentPane.add(lblDescripcion);
		
		JLabel lblGruposDeResolucion = new JLabel("Grupos de resoluci\u00F3n relacionados:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucion.setBounds(392, 476, 284, 31);
		contentPane.add(lblGruposDeResolucion);
		
		JLabel lblActorQueRealizo = new JLabel("Estado:");
		lblActorQueRealizo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblActorQueRealizo.setBounds(392, 550, 263, 20);
		contentPane.add(lblActorQueRealizo);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBounds(696, 161, 296, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBounds(696, 240, 296, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(696, 321, 296, 114);
		contentPane.add(scrollPane);
		
		
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox.setBounds(696, 481, 296, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Abierto derivado", "Abierto sin derivar", "Cerrado", "Solucionado en la espera de OK"}));
		comboBox_1.setBounds(696, 550, 296, 24);
		contentPane.add(comboBox_1);
		
		
		JButton btnDerivar = new JButton("Buscar");
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
		
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen clasificaciones de tickets que cumplan con los criterios ingresados.");
				
				
				InterfazBuscarClasificacionTicketPaginacion comentario = new InterfazBuscarClasificacionTicketPaginacion();
				comentario.setVisible(true);
				InterfazBuscarClasificacionTicket.this.dispose();
			}
		});
	}

}