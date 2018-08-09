package todas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazVisualizacionTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescripcionCargo;
	private JTextField txtLegajo;
	private JTextField txtApellidoNombre;
	private JTextField txtTelefonoInterno;
	private JTextField txtTelefonoDirecto;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtPiso;
	private JTextField txtOficina;
	private JTable table;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizacionTicket frame = new InterfazVisualizacionTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazVisualizacionTicket() {
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
		
		JLabel lblVisualizacionTicket = new JLabel("Visualizaci\u00F3n ticket");
		lblVisualizacionTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizacionTicket.setBounds(481, 20, 385, 48);
		contentPane.add(lblVisualizacionTicket);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JLabel lblDatosUsuario = new JLabel("Datos usuario: ");
		lblDatosUsuario.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosUsuario.setBounds(190, 135, 156, 26);
		contentPane.add(lblDatosUsuario);
		
		JLabel lblHistorialTicket = new JLabel("Historial ticket: ");
		lblHistorialTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblHistorialTicket.setBounds(679, 136, 172, 24);
		contentPane.add(lblHistorialTicket);
		
		JLabel lblLegajo = new JLabel("Legajo: ");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblLegajo.setBounds(220, 184, 156, 24);
		contentPane.add(lblLegajo);
		
		JLabel lblNombreYApellido = new JLabel("Apellido y nombre: ");
		lblNombreYApellido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombreYApellido.setBounds(220, 221, 156, 24);
		contentPane.add(lblNombreYApellido);
		
		JLabel lblTelefonoInterno = new JLabel("Tel\u00E9fono interno: ");
		lblTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoInterno.setBounds(220, 258, 156, 24);
		contentPane.add(lblTelefonoInterno);
		
		JLabel lblTelefonoDirecto = new JLabel("Tel\u00E9fono directo: ");
		lblTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoDirecto.setBounds(220, 295, 156, 24);
		contentPane.add(lblTelefonoDirecto);
		
		JLabel lblDescripcionCargo = new JLabel("Descripci\u00F3n de cargo: ");
		lblDescripcionCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblDescripcionCargo.setBounds(220, 332, 148, 24);
		contentPane.add(lblDescripcionCargo);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n: ");
		lblDireccion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		lblDireccion.setBounds(220, 434, 156, 24);
		contentPane.add(lblDireccion);
		
		JLabel lblCalle = new JLabel("Calle: ");
		lblCalle.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCalle.setBounds(220, 471, 72, 24);
		contentPane.add(lblCalle);
		
		JLabel lblNumero = new JLabel("N\u00FAmero: ");
		lblNumero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumero.setBounds(220, 510, 72, 24);
		contentPane.add(lblNumero);
		
		JLabel lblPiso = new JLabel("Piso: ");
		lblPiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblPiso.setBounds(220, 547, 72, 24);
		contentPane.add(lblPiso);
		
		JLabel lblOficina = new JLabel("Oficina: ");
		lblOficina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblOficina.setBounds(220, 584, 72, 24);
		contentPane.add(lblOficina);
		
		txtDescripcionCargo = new JTextField();
		txtDescripcionCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtDescripcionCargo.setBackground(new Color(220, 220, 220));
		txtDescripcionCargo.setBounds(380, 332, 245, 73);
		contentPane.add(txtDescripcionCargo);
		txtDescripcionCargo.setColumns(10);
		
		txtLegajo = new JTextField();
		txtLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtLegajo.setColumns(10);
		txtLegajo.setBackground(new Color(220, 220, 220));
		txtLegajo.setBounds(380, 184, 245, 24);
		contentPane.add(txtLegajo);
		
		txtApellidoNombre = new JTextField();
		txtApellidoNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtApellidoNombre.setColumns(10);
		txtApellidoNombre.setBackground(new Color(220, 220, 220));
		txtApellidoNombre.setBounds(380, 221, 245, 24);
		contentPane.add(txtApellidoNombre);
		
		txtTelefonoInterno = new JTextField();
		txtTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtTelefonoInterno.setColumns(10);
		txtTelefonoInterno.setBackground(new Color(220, 220, 220));
		txtTelefonoInterno.setBounds(380, 258, 245, 24);
		contentPane.add(txtTelefonoInterno);
		
		txtTelefonoDirecto = new JTextField();
		txtTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtTelefonoDirecto.setColumns(10);
		txtTelefonoDirecto.setBackground(new Color(220, 220, 220));
		txtTelefonoDirecto.setBounds(380, 295, 245, 24);
		contentPane.add(txtTelefonoDirecto);
		
		txtCalle = new JTextField();
		txtCalle.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCalle.setColumns(10);
		txtCalle.setBackground(new Color(220, 220, 220));
		txtCalle.setBounds(327, 471, 180, 24);
		contentPane.add(txtCalle);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumero.setColumns(10);
		txtNumero.setBackground(new Color(220, 220, 220));
		txtNumero.setBounds(327, 510, 180, 24);
		contentPane.add(txtNumero);
		
		txtPiso = new JTextField();
		txtPiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPiso.setColumns(10);
		txtPiso.setBackground(new Color(220, 220, 220));
		txtPiso.setBounds(327, 547, 180, 24);
		contentPane.add(txtPiso);
		
		txtOficina = new JTextField();
		txtOficina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtOficina.setColumns(10);
		txtOficina.setBackground(new Color(220, 220, 220));
		txtOficina.setBounds(327, 584, 180, 24);
		contentPane.add(txtOficina);
		
		JLabel label_6 = new JLabel((String) null);
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_6.setBounds(780, 550, 123, 24);
		contentPane.add(label_6);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnAceptar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnAceptar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnAceptar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(701, 182, 578, 223);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Fecha", "Hora", "Operador", "Estado", "Grupo de resol.", "Clasif. ticket"
			}
		));
		
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		scrollPane_1.setViewportView(table);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblObservaciones.setBounds(701, 434, 115, 24);
		contentPane.add(lblObservaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(820, 438, 458, 170);
		contentPane.add(scrollPane);
		
		JTextArea textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		scrollPane.setViewportView(textAreaObservaciones);
		textAreaObservaciones.setBackground(new Color(220, 220, 220));
		
	}
}