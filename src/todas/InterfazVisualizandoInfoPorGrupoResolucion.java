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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorGrupoResolucion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombreGrupo;
	private JTable table;

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
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por grupo de resolucion");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(170, 20, 986, 54);
		panel.add(lblVisualizando);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(265, 90, 800, 2);
		panel.add(separator);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 80, 261, 26);
		panel.add(lblCriterios);
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento:");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosOrdenamiento.setBounds(64, 188, 261, 37);
		panel.add(lblCriteriosOrdenamiento);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(74, 120, 8, 8);
		panel.add(label_3);
		
		JLabel lblNumeroTicket = new JLabel("Numero de ticket: 205");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicket.setBounds(86, 114, 183, 21);
		panel.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero de legajo: 15");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajo.setBounds(86, 139, 183, 21);
		panel.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("Clasificacion actual del ticket: Otros ");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActual.setBounds(86, 164, 270, 21);
		panel.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("Estado actual del ticket: Abierto derivado");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActual.setBounds(419, 114, 282, 21);
		panel.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("Fecha Apertura: 04/09/2000");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaApertura.setBounds(419, 139, 282, 21);
		panel.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("Fecha del ultimo cambio de estado: 11/01/2005");
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambio.setBounds(419, 164, 324, 21);
		panel.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("Ultimo grupo de resolucion asignado: Mesa de ayuda");
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupo.setBounds(815, 114, 509, 21);
		panel.add(lblUltimoGrupo);
		
		JLabel lblUltimoGrupoForma = new JLabel("Ultimo grupo de resolucion en forma ascendente");
		lblUltimoGrupoForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupoForma.setBounds(815, 139, 331, 21);
		panel.add(lblUltimoGrupoForma);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("Numero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(90, 230, 261, 21);
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
		lblGrupoResolucion.setBounds(522, 270, 282, 37);
		panel.add(lblGrupoResolucion);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(710, 278, 33, 22);
		panel.add(textField);
		
		JLabel lblDatosGrupo = new JLabel("Datos del grupo de resolucion:");
		lblDatosGrupo.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosGrupo.setBounds(64, 310, 329, 37);
		panel.add(lblDatosGrupo);
		
		JLabel lblNombreGrupo = new JLabel("Nombre del grupo de resolucion:");
		lblNombreGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNombreGrupo.setBounds(74, 352, 232, 21);
		panel.add(lblNombreGrupo);
		
		JLabel lblGraficoTorta = new JLabel("Grafico de torta con la distribucion porcentual de los tickets en base a su estado:");
		lblGraficoTorta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGraficoTorta.setBounds(74, 386, 541, 21);
		panel.add(lblGraficoTorta);
		
		txtNombreGrupo = new JTextField();
		txtNombreGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombreGrupo.setEditable(false);
		txtNombreGrupo.setColumns(10);
		txtNombreGrupo.setBackground(new Color(220, 220, 220));
		txtNombreGrupo.setBounds(318, 353, 362, 20);
		panel.add(txtNombreGrupo);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 447, 261, 37);
		panel.add(lblTicketsAsociados);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 481, 1260, 171);
		panel.add(scrollPane);
		
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
			new String[] {
				"Ticket", "Fecha de apertura", "Clasificacion actual","Estado actual","Estado de la intervencion","Observaciones registradas","Tiempo real de atencion","Tiempo total asignado"
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
		
		JLabel label_21 = new JLabel("-");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_21.setBounds(74, 144, 8, 8);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("-");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_22.setBounds(74, 169, 8, 8);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("-");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_23.setBounds(409, 119, 8, 8);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("-");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(409, 144, 8, 8);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("-");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(409, 169, 8, 8);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("-");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(803, 119, 8, 8);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("-");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(803, 144, 8, 8);
		panel.add(label_27);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(824, 278, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(870, 278, 42, 25);
		panel.add(btnDerecha);
	}
}