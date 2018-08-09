package todas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorClasificacion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField txtNombre;
	private JTable table_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorClasificacion frame = new InterfazVisualizandoInfoPorClasificacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazVisualizandoInfoPorClasificacion() {
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
		panel.setPreferredSize(new Dimension(1300, 980));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 1327, 980);
		contentPane.add(panel);
		
		JLabel lblVisualizando = new JLabel("Visualizando informaci\u00F3n por clasificaci\u00F3n");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(269, 20, 828, 54);
		panel.add(lblVisualizando);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 104, 261, 26);
		panel.add(lblCriterios);
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento:");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosOrdenamiento.setBounds(64, 219, 261, 37);
		panel.add(lblCriteriosOrdenamiento);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(74, 141, 8, 8);
		panel.add(label_3);
		
		JLabel lblNumeroTicketDeArriba = new JLabel("N\u00FAmero de ticket: 205");
		lblNumeroTicketDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketDeArriba.setBounds(86, 135, 183, 21);
		panel.add(lblNumeroTicketDeArriba);
		
		JLabel label_5 = new JLabel("-");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(74, 166, 8, 8);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(74, 191, 8, 8);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("-");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(409, 141, 8, 8);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("-");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(409, 166, 8, 8);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(409, 191, 8, 8);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("-");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(803, 141, 8, 8);
		panel.add(label_10);
		
		JLabel lblNumeroLegajoDeArriba = new JLabel("N\u00FAmero de legajo: 15");
		lblNumeroLegajoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoDeArriba.setBounds(86, 160, 183, 21);
		panel.add(lblNumeroLegajoDeArriba);
		
		JLabel lblClasificacionActualDeArriba = new JLabel("Clasificaci\u00F3n actual del ticket: Otros ");
		lblClasificacionActualDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualDeArriba.setBounds(86, 185, 270, 21);
		panel.add(lblClasificacionActualDeArriba);
		
		JLabel lblEstadoActualDeArriba = new JLabel("Estado actual del ticket: Abierto derivado");
		lblEstadoActualDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActualDeArriba.setBounds(419, 135, 282, 21);
		panel.add(lblEstadoActualDeArriba);
		
		JLabel lblFechaAperturaDeArriba = new JLabel("Fecha Apertura: 04/09/2000");
		lblFechaAperturaDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaAperturaDeArriba.setBounds(419, 160, 282, 21);
		panel.add(lblFechaAperturaDeArriba);
		
		JLabel lblFechaUltimoCambioDeArriba = new JLabel("Fecha del \u00FAltimo cambio de estado: 11/01/2005");
		lblFechaUltimoCambioDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambioDeArriba.setBounds(419, 185, 324, 21);
		panel.add(lblFechaUltimoCambioDeArriba);
		
		JLabel lblUltimoGrupoDeArriba = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: Mesa de ayuda");
		lblUltimoGrupoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupoDeArriba.setBounds(815, 135, 509, 21);
		panel.add(lblUltimoGrupoDeArriba);
		
		JLabel label_17 = new JLabel("-");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(803, 166, 8, 8);
		panel.add(label_17);
		
		JLabel lblClasificacionActualForma = new JLabel("Clasificaci\u00F3n actual del ticket en forma ascendente");
		lblClasificacionActualForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualForma.setBounds(815, 160, 361, 21);
		panel.add(lblClasificacionActualForma);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("N\u00FAmero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(95, 259, 261, 21);
		panel.add(lblNumeroTicketOrdenamiento);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl1.setBounds(74, 256, 96, 26);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl2.setBounds(368, 254, 96, 26);
		panel.add(lbl2);
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificaci\u00F3n actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(389, 259, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblClasificacion = new JLabel("Clasificaci\u00F3n        de 23");
		lblClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacion.setBounds(560, 293, 207, 37);
		panel.add(lblClasificacion);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(681, 301, 33, 22);
		panel.add(textField);
		
		JLabel lblDatosClasificacion = new JLabel("Datos de la clasificaci\u00F3n:");
		lblDatosClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosClasificacion.setBounds(64, 334, 329, 37);
		panel.add(lblDatosClasificacion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombre.setBounds(74, 378, 78, 21);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setBounds(164, 379, 440, 20);
		panel.add(txtNombre);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 414, 261, 37);
		panel.add(lblTicketsAsociados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 464, 1171, 176);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Legajo", "Estado actual","Fecha de apertura","Ultimo grupo de resolucion"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrar.setBounds(1000, 670, 133, 28);
		panel.add(btnCerrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(1187, 670, 133, 28);
		panel.add(btnImprimir);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(797, 301, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(843, 301, 42, 25);
		panel.add(btnDerecha);
		
	}
}