package todas;

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
	private JTextField textFieldNombre;
	private JTextField textFieldCodigo;


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
		
		JLabel lblBuscarClasificacion = new JLabel("Buscar clasificaci\u00F3n de tickets");
		lblBuscarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblBuscarClasificacion.setBounds(385, 27, 579, 38);
		contentPane.add(lblBuscarClasificacion);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		JLabel lblParteNombre = new JLabel("Parte nombre:");
		lblParteNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblParteNombre.setBounds(392, 156, 142, 31);
		contentPane.add(lblParteNombre);
		
		
		JLabel lblCodigoNumerico = new JLabel("C\u00F3digo num\u00E9rico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(392, 235, 142, 31);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblDescripcion = new JLabel("Parte de la descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(392, 321, 242, 31);
		contentPane.add(lblDescripcion);
		
		JLabel lblGruposDeResolucion = new JLabel("Grupos de resoluci\u00F3n relacionados:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucion.setBounds(392, 476, 284, 31);
		contentPane.add(lblGruposDeResolucion);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(392, 550, 263, 20);
		contentPane.add(lblEstado);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBounds(696, 161, 296, 24);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBounds(696, 240, 296, 24);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(696, 321, 296, 114);
		contentPane.add(scrollPane);
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		
		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxGrupo.setBounds(696, 481, 296, 24);
		contentPane.add(comboBoxGrupo);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n...", "Abierto derivado", "Abierto sin derivar", "Cerrado", "Solucionado en la espera de OK"}));
		comboBoxEstado.setBounds(696, 550, 296, 24);
		contentPane.add(comboBoxEstado);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen clasificaciones de tickets que cumplan con los criterios ingresados.");
				InterfazBuscarClasificacionTicketPaginacion comentario = new InterfazBuscarClasificacionTicketPaginacion();
				comentario.setVisible(true);
				InterfazBuscarClasificacionTicket.this.dispose();
			}
		});
	}
}