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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorGrupoResolucion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombreGrupo;
	private JTable table;
	private JTextField textFieldNumeroTicket;
	private JTextField textFieldNumeroLegajo;
	private JTextField textFieldClasificacion;
	private JTextField textFieldEstadoActual;
	private JTextField textFieldFechaApertura;
	private JTextField textFieldFechaUltimoCambio;
	private JTextField textFieldUltimoGrupo;
	private JTextField textFieldGrupoEnForma;
	private JTextField txtCantidadPaginacion;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorGrupoResolucion frame = new InterfazVisualizandoInfoPorGrupoResolucion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazVisualizandoInfoPorGrupoResolucion() {
		
		//TIEMPO REAL DE ATENCION
		//TIEMPOTOTALASIGNADO
		
		
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
		separator.setBounds(265, 90, 800, 2);
		panel.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 481, 1260, 171);
		panel.add(scrollPane);
		
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por grupo de resolucion");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(170, 20, 986, 54);
		panel.add(lblVisualizando);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setBounds(12, 80, 222, 26);
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		panel.add(lblCriterios);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setBounds(41, 111, 209, 21);
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo: ");
		lblNumeroLegajo.setBounds(41, 136, 209, 21);
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificacion actual del ticket: ");
		lblClasificacionActual.setBounds(41, 161, 209, 21);
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setBounds(419, 111, 252, 21);
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setBounds(419, 136, 252, 21);
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha del ultimo cambio de estado: ");
		lblFechaUltimoCambio.setBounds(419, 161, 252, 21);
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("-Ultimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setBounds(840, 111, 269, 21);
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblUltimoGrupo);
		
		JLabel lblNumeroGrupoForma = new JLabel("-Grupo de resolucion en forma: ");
		lblNumeroGrupoForma.setBounds(840, 136, 269, 21);
		lblNumeroGrupoForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroGrupoForma);
		
		JLabel lblDatosTicket = new JLabel("Criterios de ordenamiento:");
		lblDatosTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosTicket.setBounds(12, 195, 261, 26);
		panel.add(lblDatosTicket);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("Numero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(57, 223, 141, 21);
		panel.add(lblNumeroTicketOrdenamiento);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl1.setBounds(41, 220, 96, 26);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl2.setBounds(297, 220, 96, 26);
		panel.add(lbl2);
		
		JLabel lblGrupoResolucion = new JLabel("Grupo de resolucion        de ");
		lblGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblGrupoResolucion.setBounds(522, 270, 261, 37);
		panel.add(lblGrupoResolucion);
		
		JLabel lblDatosGrupo = new JLabel("Datos del grupo de resolucion:");
		lblDatosGrupo.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosGrupo.setBounds(12, 310, 329, 37);
		panel.add(lblDatosGrupo);
		
		JLabel lblNombreGrupo = new JLabel("Nombre del grupo de resolucion:");
		lblNombreGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombreGrupo.setBounds(41, 360, 232, 21);
		panel.add(lblNombreGrupo);
		
		JLabel lblGraficoTorta = new JLabel("Grafico de torta con la distribucion porcentual de los tickets en base a su estado:");
		lblGraficoTorta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGraficoTorta.setBounds(41, 394, 541, 21);
		panel.add(lblGraficoTorta);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 447, 261, 37);
		panel.add(lblTicketsAsociados);
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificacion actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(313, 223, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(710, 278, 33, 22);
		panel.add(textField);
		
		txtCantidadPaginacion = new JTextField();
		txtCantidadPaginacion.setEditable(false);
		txtCantidadPaginacion.setColumns(10);
		txtCantidadPaginacion.setBounds(781, 280, 44, 22);
		panel.add(txtCantidadPaginacion);
		
		textFieldNumeroTicket = new JTextField();
		textFieldNumeroTicket.setBounds(247, 112, 150, 21);
		panel.add(textFieldNumeroTicket);
		textFieldNumeroTicket.setColumns(10);
		textFieldNumeroTicket.setEditable(false);
		
		textFieldNumeroLegajo = new JTextField();
		textFieldNumeroLegajo.setColumns(10);
		textFieldNumeroLegajo.setBounds(247, 137, 150, 21);
		panel.add(textFieldNumeroLegajo);
		textFieldNumeroLegajo.setEditable(false);
		
		textFieldClasificacion = new JTextField();
		textFieldClasificacion.setColumns(10);
		textFieldClasificacion.setBounds(247, 162, 150, 21);
		panel.add(textFieldClasificacion);
		textFieldClasificacion.setEditable(false);
		
		textFieldEstadoActual = new JTextField();
		textFieldEstadoActual.setColumns(10);
		textFieldEstadoActual.setBounds(665, 112, 150, 21);
		panel.add(textFieldEstadoActual);
		textFieldEstadoActual.setEditable(false);
		
		textFieldFechaApertura = new JTextField();
		textFieldFechaApertura.setColumns(10);
		textFieldFechaApertura.setBounds(665, 137, 150, 21);
		panel.add(textFieldFechaApertura);
		textFieldFechaApertura.setEditable(false);
		
		textFieldFechaUltimoCambio = new JTextField();
		textFieldFechaUltimoCambio.setColumns(10);
		textFieldFechaUltimoCambio.setBounds(665, 162, 150, 21);
		panel.add(textFieldFechaUltimoCambio);
		textFieldFechaUltimoCambio.setEditable(false);
		
		textFieldUltimoGrupo = new JTextField();
		textFieldUltimoGrupo.setColumns(10);
		textFieldUltimoGrupo.setBounds(1103, 112, 150, 21);
		panel.add(textFieldUltimoGrupo);
		textFieldUltimoGrupo.setEditable(false);
		
		textFieldGrupoEnForma = new JTextField();
		textFieldGrupoEnForma.setColumns(10);
		textFieldGrupoEnForma.setBounds(1103, 137, 150, 21);
		panel.add(textFieldGrupoEnForma);
		textFieldGrupoEnForma.setEditable(false);
		
		
		
		
		txtNombreGrupo = new JTextField();
		txtNombreGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombreGrupo.setEditable(false);
		txtNombreGrupo.setColumns(10);
		txtNombreGrupo.setBackground(new Color(220, 220, 220));
		txtNombreGrupo.setBounds(297, 361, 362, 20);
		panel.add(txtNombreGrupo);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {"Ticket", "Fecha de apertura", "Clasificacion actual","Estado actual","Estado de la intervencion","Observaciones registradas","Tiempo real de atencion","Tiempo total asignado"}
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
		btnIzquierda.setBounds(837, 278, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(883, 278, 42, 25);
		panel.add(btnDerecha);
		
	}
}