package todas;

import java.awt.BorderLayout;
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
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class InterfazVisualizacionTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel lblNewLabel = new JLabel("Visualizaci\u00F3n ticket");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(481, 20, 385, 48);
		contentPane.add(lblNewLabel);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Legajo: ");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(220, 184, 156, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombreYApellido = new JLabel("Apellido y nombre: ");
		lblNombreYApellido.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombreYApellido.setBounds(220, 221, 156, 24);
		contentPane.add(lblNombreYApellido);
		
		JLabel lblTelfonoInterno = new JLabel("Tel\u00E9fono interno: ");
		lblTelfonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelfonoInterno.setBounds(220, 258, 156, 24);
		contentPane.add(lblTelfonoInterno);
		
		JLabel lblTelfonoDirecto = new JLabel("Tel\u00E9fono directo: ");
		lblTelfonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelfonoDirecto.setBounds(220, 295, 156, 24);
		contentPane.add(lblTelfonoDirecto);
		
		JLabel lblDescripcinDeCargo = new JLabel("Descripci\u00F3n de cargo: ");
		lblDescripcinDeCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblDescripcinDeCargo.setBounds(220, 332, 148, 24);
		contentPane.add(lblDescripcinDeCargo);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
		lblDireccin.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		lblDireccin.setBounds(220, 434, 156, 24);
		contentPane.add(lblDireccin);
		
		JLabel lblCalle = new JLabel("Calle: ");
		lblCalle.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCalle.setBounds(220, 471, 72, 24);
		contentPane.add(lblCalle);
		
		JLabel lblNmero = new JLabel("N\u00FAmero: ");
		lblNmero.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNmero.setBounds(220, 510, 72, 24);
		contentPane.add(lblNmero);
		
		JLabel lblPiso = new JLabel("Piso: ");
		lblPiso.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblPiso.setBounds(220, 547, 72, 24);
		contentPane.add(lblPiso);
		
		JLabel lblOficina = new JLabel("Oficina: ");
		lblOficina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblOficina.setBounds(220, 584, 72, 24);
		contentPane.add(lblOficina);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(380, 332, 245, 73);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(380, 184, 245, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(380, 221, 245, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(380, 258, 245, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(380, 295, 245, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setBounds(327, 471, 180, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(220, 220, 220));
		textField_6.setBounds(327, 510, 180, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(220, 220, 220));
		textField_7.setBounds(327, 547, 180, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(220, 220, 220));
		textField_8.setBounds(327, 584, 180, 24);
		contentPane.add(textField_8);
		
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
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(220, 220, 220));
		
		
	}
}

