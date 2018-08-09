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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 464, 1171, 176);
		panel.add(scrollPane);
		
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por clasificacion");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(269, 20, 828, 54);
		panel.add(lblVisualizando);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 104, 261, 26);
		panel.add(lblCriterios);
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento:");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosOrdenamiento.setBounds(64, 219, 261, 37);
		panel.add(lblCriteriosOrdenamiento);
		
		JLabel lblNumeroTicketDeArriba = new JLabel("-Numero de ticket: ");
		lblNumeroTicketDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketDeArriba.setBounds(86, 135, 183, 21);
		panel.add(lblNumeroTicketDeArriba);
		
		JLabel lblNumeroLegajoDeArriba = new JLabel("-Numero de legajo: ");
		lblNumeroLegajoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoDeArriba.setBounds(86, 160, 183, 21);
		panel.add(lblNumeroLegajoDeArriba);
		
		JLabel lblClasificacionActualDeArriba = new JLabel("-Clasificacion actual del ticket: ");
		lblClasificacionActualDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualDeArriba.setBounds(86, 185, 270, 21);
		panel.add(lblClasificacionActualDeArriba);
		
		JLabel lblEstadoActualDeArriba = new JLabel("-Estado actual del ticket: ");
		lblEstadoActualDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActualDeArriba.setBounds(419, 135, 282, 21);
		panel.add(lblEstadoActualDeArriba);
		
		JLabel lblFechaAperturaDeArriba = new JLabel("-Fecha Apertura: ");
		lblFechaAperturaDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaAperturaDeArriba.setBounds(419, 160, 282, 21);
		panel.add(lblFechaAperturaDeArriba);
		
		JLabel lblFechaUltimoCambioDeArriba = new JLabel("-Fecha del ultimo cambio de estado: ");
		lblFechaUltimoCambioDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambioDeArriba.setBounds(419, 185, 324, 21);
		panel.add(lblFechaUltimoCambioDeArriba);
		
		JLabel lblUltimoGrupoDeArriba = new JLabel("-Ultimo grupo de resolucion asignado: ");
		lblUltimoGrupoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupoDeArriba.setBounds(815, 135, 509, 21);
		panel.add(lblUltimoGrupoDeArriba);
		
		JLabel lblClasificacionActualForma = new JLabel("-Clasificacion actual del ticket en forma ascendente");
		lblClasificacionActualForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualForma.setBounds(815, 160, 361, 21);
		panel.add(lblClasificacionActualForma);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("Numero de ticket");
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
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificacion actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(389, 259, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblClasificacion = new JLabel("Clasificacion        de 23");
		lblClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacion.setBounds(560, 293, 207, 37);
		panel.add(lblClasificacion);
		
		JLabel lblDatosClasificacion = new JLabel("Datos de la clasificacion:");
		lblDatosClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosClasificacion.setBounds(64, 334, 329, 37);
		panel.add(lblDatosClasificacion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombre.setBounds(74, 378, 78, 21);
		panel.add(lblNombre);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 414, 261, 37);
		panel.add(lblTicketsAsociados);
		
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(681, 301, 33, 22);
		panel.add(textField);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setBounds(164, 379, 440, 20);
		panel.add(txtNombre);
		
		
		
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
			new String[] {"Ticket", "Legajo", "Estado actual","Fecha de apertura","Ultimo grupo de resolucion"}
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