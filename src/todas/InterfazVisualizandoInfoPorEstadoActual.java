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
import javax.swing.JTextArea;

public class InterfazVisualizandoInfoPorEstadoActual extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtPaginacion;
	private JTextField txtNombre;
	private JTextField txtTotalTicketsEnEstado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorEstadoActual frame = new InterfazVisualizandoInfoPorEstadoActual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazVisualizandoInfoPorEstadoActual() {
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
		
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setEditable(false);
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setBounds(827, 351, 418, 71);
		panel.add(textAreaDescripcion);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 481, 1139, 171);
		panel.add(scrollPane);
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por estado actual");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(259, 20, 847, 54);
		panel.add(lblVisualizando);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 80, 261, 26);
		panel.add(lblCriterios);
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento:");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosOrdenamiento.setBounds(64, 188, 261, 37);
		panel.add(lblCriteriosOrdenamiento);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicket.setBounds(86, 114, 183, 21);
		panel.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo: ");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajo.setBounds(86, 139, 183, 21);
		panel.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificacion actual del ticket: ");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActual.setBounds(86, 164, 270, 21);
		panel.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActual.setBounds(419, 114, 282, 21);
		panel.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaApertura.setBounds(419, 139, 282, 21);
		panel.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha del ultimo cambio de estado: ");
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambio.setBounds(419, 164, 324, 21);
		panel.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("-Ultimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupo.setBounds(815, 114, 509, 21);
		panel.add(lblUltimoGrupo);
		
		JLabel lblEstadoActualForma = new JLabel("-Estado actual del ticket en forma ascendente");
		lblEstadoActualForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActualForma.setBounds(815, 139, 297, 21);
		panel.add(lblEstadoActualForma);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("Numero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(90, 230, 162, 21);
		panel.add(lblNumeroTicketOrdenamiento);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl1.setBounds(74, 227, 96, 26);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl2.setBounds(330, 227, 96, 26);
		panel.add(lbl2);
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificacion actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(346, 230, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblGrupoResolucion = new JLabel("Grupo de resolucion        de 23");
		lblGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblGrupoResolucion.setBounds(522, 275, 282, 26);
		panel.add(lblGrupoResolucion);
		
		JLabel lblDatosEstado = new JLabel("Datos del estado:");
		lblDatosEstado.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosEstado.setBounds(64, 309, 329, 37);
		panel.add(lblDatosEstado);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombre.setBounds(74, 350, 197, 21);
		panel.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblDescripcion.setBounds(715, 350, 96, 21);
		panel.add(lblDescripcion);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 440, 261, 37);
		panel.add(lblTicketsAsociados);
		
		JLabel lblTotalTickets = new JLabel("Total de tickets en el estado:");
		lblTotalTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTotalTickets.setBounds(74, 384, 197, 21);
		panel.add(lblTotalTickets);
		
		
		
		txtPaginacion = new JTextField();
		txtPaginacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.setColumns(10);
		txtPaginacion.setBounds(715, 280, 33, 22);
		panel.add(txtPaginacion);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setBounds(283, 352, 352, 20);
		panel.add(txtNombre);
		
		txtTotalTicketsEnEstado = new JTextField();
		txtTotalTicketsEnEstado.setEditable(false);
		txtTotalTicketsEnEstado.setColumns(10);
		txtTotalTicketsEnEstado.setBackground(new Color(220, 220, 220));
		txtTotalTicketsEnEstado.setBounds(283, 385, 352, 20);
		panel.add(txtTotalTicketsEnEstado);
		
		
		
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
			},
			new String[] {"Ticket", "Fecha de apertura", "Legajo", "Clasificacion actual","Ultimo grupo de resolucion","Tiempo acumulado total de atencion"}
		));
		scrollPane.setViewportView(table);
		
		
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrar.setBounds(1000, 665, 133, 28);
		panel.add(btnCerrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(1187, 665, 133, 28);
		panel.add(btnImprimir);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(839, 276, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(885, 276, 42, 25);
		panel.add(btnDerecha);
	}
}