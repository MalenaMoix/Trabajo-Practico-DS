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
	private JTextField textFieldNumeroTicket;
	private JTextField textFieldNumeroLegajo;
	private JTextField textFieldClasificacion;
	private JTextField textFieldEstadoActual;
	private JTextField textFieldFechaApertura;
	private JTextField textFieldFechaUltimoCambio;
	private JTextField textFieldUltimoGrupo;
	private JTextField textFieldNumeroLegajoEnForma;
	private JTextField txtCantidadPaginacion;


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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 482, 1139, 144);
		panel.add(scrollPane);
		
		
		JTextArea textAreaDescripcionCargo = new JTextArea();
		textAreaDescripcionCargo.setEditable(false);
		textAreaDescripcionCargo.setBackground(new Color(220, 220, 220));
		textAreaDescripcionCargo.setBounds(953, 369, 312, 65);
		panel.add(textAreaDescripcionCargo);
		
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por legajo");
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblVisualizando.setBounds(330, 20, 706, 54);
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
		
		JLabel lblNumeroLegajoForma = new JLabel("-Numero de legajo en forma: ");
		lblNumeroLegajoForma.setBounds(840, 136, 269, 21);
		lblNumeroLegajoForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroLegajoForma);
		
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
		
		JLabel lblClasificacionActualOrdenamiento = new JLabel("Clasificacion actual del ticket");
		lblClasificacionActualOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualOrdenamiento.setBounds(313, 223, 261, 21);
		panel.add(lblClasificacionActualOrdenamiento);
		
		JLabel lblLegajo = new JLabel("Legajo        de ");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblLegajo.setBounds(559, 259, 141, 30);
		panel.add(lblLegajo);
		
		JLabel lblDatosUsuario = new JLabel("Datos del usuario:");
		lblDatosUsuario.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosUsuario.setBounds(12, 295, 261, 26);
		panel.add(lblDatosUsuario);
		
		JLabel lblNumeroLegajoUsuario = new JLabel("Numero de legajo:");
		lblNumeroLegajoUsuario.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoUsuario.setBounds(74, 334, 141, 21);
		panel.add(lblNumeroLegajoUsuario);
		
		JLabel lblApellidoNombre = new JLabel("Apellido y Nombre:");
		lblApellidoNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblApellidoNombre.setBounds(74, 368, 141, 21);
		panel.add(lblApellidoNombre);
		
		JLabel lblTelefonoInterno = new JLabel("Telefono interno:");
		lblTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoInterno.setBounds(478, 334, 129, 21);
		panel.add(lblTelefonoInterno);
		
		JLabel lblTelefonoDirecto = new JLabel("Telefono directo:");
		lblTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTelefonoDirecto.setBounds(478, 368, 129, 21);
		panel.add(lblTelefonoDirecto);
		
		JLabel lblUbicacion = new JLabel("Ubicacion:");
		lblUbicacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUbicacion.setBounds(792, 334, 149, 21);
		panel.add(lblUbicacion);
		
		JLabel lblDescripcionCargo = new JLabel("Descripcion de cargo:");
		lblDescripcionCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblDescripcionCargo.setBounds(792, 368, 149, 21);
		panel.add(lblDescripcionCargo);
		
		JLabel lblTicketsAsociados = new JLabel("Tickets asociados:");
		lblTicketsAsociados.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblTicketsAsociados.setBounds(64, 443, 261, 37);
		panel.add(lblTicketsAsociados);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(626, 265, 33, 22);
		panel.add(textField);
		
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
		
		txtCantidadPaginacion = new JTextField();
		txtCantidadPaginacion.setEditable(false);
		txtCantidadPaginacion.setBounds(699, 266, 44, 22);
		panel.add(txtCantidadPaginacion);
		txtCantidadPaginacion.setColumns(10);
		
		
		
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
		
		textFieldNumeroLegajoEnForma = new JTextField();
		textFieldNumeroLegajoEnForma.setColumns(10);
		textFieldNumeroLegajoEnForma.setBounds(1103, 137, 150, 21);
		panel.add(textFieldNumeroLegajoEnForma);
		textFieldNumeroLegajoEnForma.setEditable(false);
		
		
		
		
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
			new String[] {"Ticket", "Fecha de apertura", "Estado", "Fecha ultimo cambio de estado","Clasificacion actual","Ultimo grupo de resolucion","Ultima observacion"}
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
		btnIzquierda.setBounds(764, 264, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(810, 264, 42, 25);
		panel.add(btnDerecha);
		
	}
}