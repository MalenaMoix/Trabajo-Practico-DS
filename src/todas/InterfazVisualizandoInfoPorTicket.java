package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_1_1;
	private JTextField textField_3;
	private JTextField textField_3_1;
	private JTextField textField_2;
	private JTextField textField_2_1;
	private JTextField textField_4;
	private JTextField textField_4_1;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorTicket frame = new InterfazVisualizandoInfoPorTicket();
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
	public InterfazVisualizandoInfoPorTicket() {
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1366, 768));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 1366, 768);
		contentPane.add(panel);
		
		
		JLabel lblNewLabel = new JLabel("Visualizando informaci\u00F3n por ticket");
		lblNewLabel.setBounds(330, 20, 706, 54);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(295, 80, 760, 2);
		separator.setForeground(Color.GRAY);
		panel.add(separator);
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios:");
		lblCriteriosDeBusqueda.setBounds(64, 80, 222, 26);
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		panel.add(lblCriteriosDeBusqueda);
		
	
		JLabel label = new JLabel("-");
		label.setBounds(74, 117, 8, 8);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label);
		
		JLabel lblNumeroDeTicket = new JLabel("N\u00FAmero de ticket: 205");
		lblNumeroDeTicket.setBounds(86, 111, 183, 21);
		lblNumeroDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroDeTicket);
		
		JLabel label_2 = new JLabel("-");
		label_2.setBounds(74, 142, 8, 8);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setBounds(74, 167, 8, 8);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setBounds(409, 117, 8, 8);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("-");
		label_5.setBounds(409, 142, 8, 8);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setBounds(409, 167, 8, 8);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("-");
		label_7.setBounds(803, 117, 8, 8);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_7);
		
		JLabel lblNumeroDeLegajo = new JLabel("N\u00FAmero de legajo: 15");
		lblNumeroDeLegajo.setBounds(86, 136, 183, 21);
		lblNumeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroDeLegajo);
		
		JLabel lblClasificacionActualDel = new JLabel("Clasificaci\u00F3n actual del ticket: Otros ");
		lblClasificacionActualDel.setBounds(86, 161, 270, 21);
		lblClasificacionActualDel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblClasificacionActualDel);
		
		JLabel lblEstadoActualDel = new JLabel("Estado actual del ticket: Abierto derivado");
		lblEstadoActualDel.setBounds(419, 111, 282, 21);
		lblEstadoActualDel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblEstadoActualDel);
		
		JLabel lblFechaApertura = new JLabel("Fecha Apertura: 04/09/2000");
		lblFechaApertura.setBounds(419, 136, 282, 21);
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaApertura);
		
		JLabel lblFechaDelUltimo = new JLabel("Fecha del \u00FAltimo cambio de estado: 11/01/2005");
		lblFechaDelUltimo.setBounds(419, 161, 324, 21);
		lblFechaDelUltimo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaDelUltimo);
		
		JLabel lblUltimoGrupoDe = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: Mesa de ayuda");
		lblUltimoGrupoDe.setBounds(815, 111, 509, 21);
		lblUltimoGrupoDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblUltimoGrupoDe);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(803, 142, 8, 8);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_1);
		
		JLabel lblNumeroDeTicket_1 = new JLabel("N\u00FAmero de ticket en forma ascendente");
		lblNumeroDeTicket_1.setBounds(815, 136, 261, 21);
		lblNumeroDeTicket_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroDeTicket_1);
		
		
		JLabel lblLegajoDe = new JLabel("Ticket         de 23");
		lblLegajoDe.setBounds(462, 211, 167, 29);
		lblLegajoDe.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		panel.add(lblLegajoDe);
		
		textField = new JTextField();
		textField.setBounds(530, 215, 33, 22);
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblDatosDelTicket = new JLabel("Datos del ticket:");
		lblDatosDelTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosDelTicket.setBounds(12, 231, 167, 37);
		panel.add(lblDatosDelTicket);
		
		JLabel lblNumeroDeTicket_2 = new JLabel("N\u00FAmero de ticket:");
		lblNumeroDeTicket_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroDeTicket_2.setBounds(22, 271, 222, 21);
		panel.add(lblNumeroDeTicket_2);
		
		JLabel lblClasificacionActualDel_1 = new JLabel("Clasificaci\u00F3n actual ticket:");
		lblClasificacionActualDel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualDel_1.setBounds(345, 271, 177, 21);
		panel.add(lblClasificacionActualDel_1);
		
		JLabel lblEstadoActualDel_1 = new JLabel("Estado actual ticket:");
		lblEstadoActualDel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActualDel_1.setBounds(345, 303, 177, 21);
		panel.add(lblEstadoActualDel_1);
		
		JLabel lblTiempoAcumuladoTotal = new JLabel("Tiempo acumulado de atenci\u00F3n:");
		lblTiempoAcumuladoTotal.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTiempoAcumuladoTotal.setBounds(22, 303, 222, 21);
		panel.add(lblTiempoAcumuladoTotal);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(241, 272, 92, 20);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(521, 272, 195, 20);
		panel.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(241, 304, 91, 20);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(521, 304, 194, 20);
		panel.add(textField_4);
		
		JLabel lblDatosUsuario = new JLabel("Datos del usuario:");
		lblDatosUsuario.setBounds(719, 237, 261, 25);
		lblDatosUsuario.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		panel.add(lblDatosUsuario);
		
		JLabel lblNumeroDeLegajo_1 = new JLabel("N\u00FAmero de legajo:");
		lblNumeroDeLegajo_1.setBounds(729, 271, 132, 21);
		lblNumeroDeLegajo_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroDeLegajo_1);
		
		JLabel lblApellidoYNombre = new JLabel("Apellido y Nombre:");
		lblApellidoYNombre.setBounds(984, 271, 150, 21);
		lblApellidoYNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblApellidoYNombre);
		
		JLabel lblTelefonoInterno = new JLabel("Tel\u00E9fono interno:");
		lblTelefonoInterno.setBounds(727, 303, 132, 21);
		lblTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblTelefonoInterno);
		
		JLabel lblTelefonoDirecto = new JLabel("Tel\u00E9fono directo:");
		lblTelefonoDirecto.setBounds(984, 303, 150, 21);
		lblTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblTelefonoDirecto);
		
		JLabel lblDescripcionDeCargo = new JLabel("Ubicaci\u00F3n:");
		lblDescripcionDeCargo.setBounds(729, 335, 132, 21);
		lblDescripcionDeCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblDescripcionDeCargo);
		
		JLabel lblDescripcinDeCargo = new JLabel("Descripci\u00F3n de cargo:");
		lblDescripcinDeCargo.setBounds(984, 335, 150, 21);
		lblDescripcinDeCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblDescripcinDeCargo);
		
		textField_1_1 = new JTextField();
		textField_1_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1_1.setBounds(864, 272, 108, 20);
		textField_1_1.setEditable(false);
		textField_1_1.setColumns(10);
		textField_1_1.setBackground(new Color(220, 220, 220));
		panel.add(textField_1_1);
		
		textField_2_1 = new JTextField();
		textField_2_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2_1.setBounds(864, 304, 108, 20);
		textField_2_1.setEditable(false);
		textField_2_1.setColumns(10);
		textField_2_1.setBackground(new Color(220, 220, 220));
		panel.add(textField_2_1);
		
		textField_3_1 = new JTextField();
		textField_3_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_3_1.setBounds(1141, 272, 183, 20);
		textField_3_1.setEditable(false);
		textField_3_1.setColumns(10);
		textField_3_1.setBackground(new Color(220, 220, 220));
		panel.add(textField_3_1);
		
		textField_4_1 = new JTextField();
		textField_4_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_4_1.setBounds(1141, 304, 183, 20);
		textField_4_1.setEditable(false);
		textField_4_1.setColumns(10);
		textField_4_1.setBackground(new Color(220, 220, 220));
		panel.add(textField_4_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setBounds(864, 336, 108, 20);
		panel.add(textField_5);
		
		JLabel lblGruposDeResolucion = new JLabel("Grupos de resoluci\u00F3n que intervinieron:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblGruposDeResolucion.setBounds(64, 377, 391, 37);
		panel.add(lblGruposDeResolucion);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(86, 415, 1139, 115);
		panel.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Grupo de resolucion", "Fecha de asignacion", "Tiempo real de atencion", "Tiempo total asignado"
			}
		));
		scrollPane_2.setViewportView(table);
		
		JLabel lblReclasificacionesDelTicket = new JLabel("Reclasificaciones del ticket:");
		lblReclasificacionesDelTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblReclasificacionesDelTicket.setBounds(64, 528, 391, 37);
		panel.add(lblReclasificacionesDelTicket);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(86, 567, 1139, 115);
		panel.add(scrollPane_3);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Clasificacion anterior", "Clasificacion nueva", "Fecha"
			}
		));
		scrollPane_3.setViewportView(table_1);
		
		JButton btnDerivar = new JButton("Cerrar");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1000, 690, 133, 28);
		panel.add(btnDerivar);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnNewButton.setBounds(1187, 690, 133, 28);
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1141, 336, 183, 74);
		panel.add(textArea);
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(false);	
		
		JButton button = new JButton("<");
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button.setBounds(641, 211, 44, 25);
		panel.add(button);
		
		JButton button_1 = new JButton(">");
		button_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_1.setBounds(687, 211, 42, 25);
		panel.add(button_1);
	}
}