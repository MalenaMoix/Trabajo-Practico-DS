package interfacesGraficas;

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
	private JTextField txtNombre;
	private JTextField textFieldNumeroTicket;
	private JTextField textFieldNumeroLegajo;
	private JTextField textFieldClasificacion;
	private JTextField textFieldEstadoActual;
	private JTextField textFieldFechaApertura;
	private JTextField textFieldFechaUltimoCambio;
	private JTextField textFieldUltimoGrupo;
	private JTextField textFieldClasificacionEnForma;
	private JTextField txtCantidadPaginacion;
	private JTextField textField_1;

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
		
		
		JPanel txtPaginacion = new JPanel();
		txtPaginacion.setLayout(null);
		txtPaginacion.setPreferredSize(new Dimension(1300, 980));
		txtPaginacion.setBackground(new Color(230, 230, 250));
		txtPaginacion.setBounds(0, 0, 1327, 980);
		contentPane.add(txtPaginacion);
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		txtPaginacion.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 464, 1171, 176);
		txtPaginacion.add(scrollPane);
		
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por clasificacion");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(269, 20, 828, 54);
		txtPaginacion.add(lblVisualizando);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setBounds(12, 80, 222, 26);
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		txtPaginacion.add(lblCriterios);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setBounds(41, 111, 209, 21);
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo: ");
		lblNumeroLegajo.setBounds(41, 136, 209, 21);
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificacion actual del ticket: ");
		lblClasificacionActual.setBounds(41, 161, 209, 21);
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setBounds(419, 111, 252, 21);
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setBounds(419, 136, 252, 21);
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha del ultimo cambio de estado: ");
		lblFechaUltimoCambio.setBounds(419, 161, 252, 21);
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("-Ultimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setBounds(840, 111, 269, 21);
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblUltimoGrupo);
		
		JLabel lblNumeroLegajoForma = new JLabel("-Clasificacion actual del ticket en forma: ");
		lblNumeroLegajoForma.setBounds(840, 136, 269, 21);
		lblNumeroLegajoForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtPaginacion.add(lblNumeroLegajoForma);
		
		JLabel lblDatosTicket = new JLabel("Criterios de ordenamiento:");
		lblDatosTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosTicket.setBounds(12, 195, 261, 26);
		txtPaginacion.add(lblDatosTicket);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("Numero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(57, 223, 141, 21);
		txtPaginacion.add(lblNumeroTicketOrdenamiento);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl1.setBounds(41, 220, 96, 26);
		txtPaginacion.add(lbl1);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl2.setBounds(297, 220, 96, 26);
		txtPaginacion.add(lbl2);
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificacion actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(313, 223, 261, 21);
		txtPaginacion.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblClasificacion = new JLabel("Clasificacion        de ");
		lblClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacion.setBounds(560, 293, 207, 37);
		txtPaginacion.add(lblClasificacion);
		
		JLabel lblDatosClasificacion = new JLabel("Datos de la clasificacion:");
		lblDatosClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosClasificacion.setBounds(12, 334, 329, 37);
		txtPaginacion.add(lblDatosClasificacion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombre.setBounds(41, 380, 78, 21);
		txtPaginacion.add(lblNombre);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(12, 414, 261, 37);
		txtPaginacion.add(lblTicketsAsociados);
		
		
		
		
		txtCantidadPaginacion = new JTextField();
		txtCantidadPaginacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCantidadPaginacion.setColumns(10);
		txtCantidadPaginacion.setBounds(681, 301, 33, 22);
		txtPaginacion.add(txtCantidadPaginacion);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setBounds(131, 381, 440, 20);
		txtPaginacion.add(txtNombre);
		
		
		textFieldNumeroTicket = new JTextField();
		textFieldNumeroTicket.setBounds(247, 112, 150, 21);
		txtPaginacion.add(textFieldNumeroTicket);
		textFieldNumeroTicket.setColumns(10);
		textFieldNumeroTicket.setEditable(false);
		
		textFieldNumeroLegajo = new JTextField();
		textFieldNumeroLegajo.setColumns(10);
		textFieldNumeroLegajo.setBounds(247, 137, 150, 21);
		txtPaginacion.add(textFieldNumeroLegajo);
		textFieldNumeroLegajo.setEditable(false);
		
		textFieldClasificacion = new JTextField();
		textFieldClasificacion.setColumns(10);
		textFieldClasificacion.setBounds(247, 162, 150, 21);
		txtPaginacion.add(textFieldClasificacion);
		textFieldClasificacion.setEditable(false);
		
		textFieldEstadoActual = new JTextField();
		textFieldEstadoActual.setColumns(10);
		textFieldEstadoActual.setBounds(665, 112, 150, 21);
		txtPaginacion.add(textFieldEstadoActual);
		textFieldEstadoActual.setEditable(false);
		
		textFieldFechaApertura = new JTextField();
		textFieldFechaApertura.setColumns(10);
		textFieldFechaApertura.setBounds(665, 137, 150, 21);
		txtPaginacion.add(textFieldFechaApertura);
		textFieldFechaApertura.setEditable(false);
		
		textFieldFechaUltimoCambio = new JTextField();
		textFieldFechaUltimoCambio.setColumns(10);
		textFieldFechaUltimoCambio.setBounds(665, 162, 150, 21);
		txtPaginacion.add(textFieldFechaUltimoCambio);
		textFieldFechaUltimoCambio.setEditable(false);
		
		textFieldUltimoGrupo = new JTextField();
		textFieldUltimoGrupo.setColumns(10);
		textFieldUltimoGrupo.setBounds(1121, 112, 150, 21);
		txtPaginacion.add(textFieldUltimoGrupo);
		textFieldUltimoGrupo.setEditable(false);
		
		textFieldClasificacionEnForma = new JTextField();
		textFieldClasificacionEnForma.setColumns(10);
		textFieldClasificacionEnForma.setBounds(1121, 137, 150, 21);
		txtPaginacion.add(textFieldClasificacionEnForma);
		textFieldClasificacionEnForma.setEditable(false);
		
		
		
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
		txtPaginacion.add(btnCerrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(1187, 670, 133, 28);
		txtPaginacion.add(btnImprimir);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(818, 301, 44, 25);
		txtPaginacion.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(864, 301, 42, 25);
		txtPaginacion.add(btnDerecha);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(751, 303, 44, 22);
		txtPaginacion.add(textField_1);
	}
}