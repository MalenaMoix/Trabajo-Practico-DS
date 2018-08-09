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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorLegajo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNumeroLegajo;
	private JTextField txtApellidoNombre;
	private JTextField txtTelefonoInterno;
	private JTextField txtTelefonoDirecto;
	private JTextField txtUbicacion;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorLegajo frame = new InterfazVisualizandoInfoPorLegajo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazVisualizandoInfoPorLegajo() {
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
		panel.setPreferredSize(new Dimension(1366, 940));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 1366, 940);
		contentPane.add(panel);
		
		JLabel lblVisualizando = new JLabel("Visualizando informaci\u00F3n por legajo");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(330, 20, 706, 54);
		panel.add(lblVisualizando);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 80, 222, 26);
		panel.add(lblCriterios);
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento:");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosOrdenamiento.setBounds(64, 185, 261, 37);
		panel.add(lblCriteriosOrdenamiento);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(74, 114, 8, 8);
		panel.add(label_4);
		
		JLabel lblNumeroTicket = new JLabel("N\u00FAmero de ticket: 205");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicket.setBounds(86, 108, 183, 21);
		panel.add(lblNumeroTicket);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(74, 139, 8, 8);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("-");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(74, 164, 8, 8);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("-");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(409, 114, 8, 8);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(409, 139, 8, 8);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("-");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(409, 164, 8, 8);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("-");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(803, 114, 8, 8);
		panel.add(label_11);
		
		JLabel lblNumeroLegajo = new JLabel("N\u00FAmero de legajo: 15");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajo.setBounds(86, 133, 183, 21);
		panel.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("Clasificaci\u00F3n actual del ticket: Otros ");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActual.setBounds(86, 158, 270, 21);
		panel.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("Estado actual del ticket: Abierto derivado");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActual.setBounds(419, 108, 282, 21);
		panel.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("Fecha Apertura: 04/09/2000");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaApertura.setBounds(419, 133, 282, 21);
		panel.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("Fecha del \u00FAltimo cambio de estado: 11/01/2005");
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambio.setBounds(419, 158, 324, 21);
		panel.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: Mesa de ayuda");
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupo.setBounds(815, 108, 509, 21);
		panel.add(lblUltimoGrupo);
		
		JLabel label_18 = new JLabel("-");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(803, 139, 8, 8);
		panel.add(label_18);
		
		JLabel lblNumeroLegajoForma = new JLabel("N\u00FAmero de legajo en forma ascendente");
		lblNumeroLegajoForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoForma.setBounds(815, 133, 297, 21);
		panel.add(lblNumeroLegajoForma);
		
		JLabel lblNumeroTicketOrdenamiento = new JLabel("N\u00FAmero de ticket");
		lblNumeroTicketOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketOrdenamiento.setBounds(90, 225, 141, 21);
		panel.add(lblNumeroTicketOrdenamiento);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl1.setBounds(74, 222, 96, 26);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lbl2.setBounds(330, 222, 96, 26);
		panel.add(lbl2);
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificaci\u00F3n actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(346, 225, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblLegajo = new JLabel("Legajo        de 23");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblLegajo.setBounds(559, 259, 195, 30);
		panel.add(lblLegajo);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(626, 265, 33, 22);
		panel.add(textField);
		
		JLabel lblDatosUsuario = new JLabel("Datos del usuario:");
		lblDatosUsuario.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosUsuario.setBounds(64, 294, 261, 37);
		panel.add(lblDatosUsuario);
		
		JLabel lblNumeroLegajoUsuario = new JLabel("N\u00FAmero de legajo:");
		lblNumeroLegajoUsuario.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoUsuario.setBounds(74, 334, 141, 21);
		panel.add(lblNumeroLegajoUsuario);
		
		JLabel lblApellidoNombre = new JLabel("Apellido y Nombre:");
		lblApellidoNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblApellidoNombre.setBounds(74, 368, 141, 21);
		panel.add(lblApellidoNombre);
		
		JLabel lblTelefonoInterno = new JLabel("T\u00E9lefono interno:");
		lblTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoInterno.setBounds(478, 334, 129, 21);
		panel.add(lblTelefonoInterno);
		
		JLabel lblTelefonoDirecto = new JLabel("Tel\u00E9fono directo:");
		lblTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoDirecto.setBounds(478, 368, 129, 21);
		panel.add(lblTelefonoDirecto);
		
		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUbicacion.setBounds(792, 334, 149, 21);
		panel.add(lblUbicacion);
		
		JLabel lblDescripcionCargo = new JLabel("Descripci\u00F3n de cargo:");
		lblDescripcionCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblDescripcionCargo.setBounds(792, 368, 149, 21);
		panel.add(lblDescripcionCargo);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setEditable(false);
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		txtNumeroLegajo.setBounds(215, 336, 229, 20);
		panel.add(txtNumeroLegajo);
		
		txtApellidoNombre = new JTextField();
		txtApellidoNombre.setEditable(false);
		txtApellidoNombre.setColumns(10);
		txtApellidoNombre.setBackground(new Color(220, 220, 220));
		txtApellidoNombre.setBounds(215, 368, 229, 20);
		panel.add(txtApellidoNombre);
		
		txtTelefonoInterno = new JTextField();
		txtTelefonoInterno.setEditable(false);
		txtTelefonoInterno.setColumns(10);
		txtTelefonoInterno.setBackground(new Color(220, 220, 220));
		txtTelefonoInterno.setBounds(606, 336, 149, 20);
		panel.add(txtTelefonoInterno);
		
		txtTelefonoDirecto = new JTextField();
		txtTelefonoDirecto.setEditable(false);
		txtTelefonoDirecto.setColumns(10);
		txtTelefonoDirecto.setBackground(new Color(220, 220, 220));
		txtTelefonoDirecto.setBounds(606, 370, 149, 20);
		panel.add(txtTelefonoDirecto);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setEditable(false);
		txtUbicacion.setColumns(10);
		txtUbicacion.setBackground(new Color(220, 220, 220));
		txtUbicacion.setBounds(953, 336, 312, 20);
		panel.add(txtUbicacion);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 443, 261, 37);
		panel.add(lblTicketsAsociados);
		
		
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrar.setBounds(1000, 665, 133, 28);
		panel.add(btnCerrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(1187, 665, 133, 28);
		panel.add(btnImprimir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 482, 1139, 144);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Fecha de apertura", "Estado", "Fecha ultimo cambio de estado","Clasificacion actual","Ultimo grupo de resolucion","Ultima observacion"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JTextArea textAreaDescripcionCargo = new JTextArea();
		textAreaDescripcionCargo.setEditable(false);
		textAreaDescripcionCargo.setBackground(new Color(220, 220, 220));
		textAreaDescripcionCargo.setBounds(953, 369, 312, 65);
		panel.add(textAreaDescripcionCargo);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(756, 264, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(802, 264, 42, 25);
		panel.add(btnDerecha);
	}
}