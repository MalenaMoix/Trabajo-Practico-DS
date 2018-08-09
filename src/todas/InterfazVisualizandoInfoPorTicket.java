package todas;

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
	private JTextField txtNumeroTicketDatos;
	private JTextField txtNumeroLegajo;
	private JTextField txtClasificacionActual;
	private JTextField txtApellidoNombre;
	private JTextField txtTiempoAcumuladoAtencion;
	private JTextField txtTelefonoInterno;
	private JTextField txtEstadoActual;
	private JTextField txtTelefonoDirecto;
	private JTextField txtUbicacion;
	private JTable table;
	private JTable table_1;

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
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(295, 80, 760, 2);
		separator.setForeground(Color.GRAY);
		panel.add(separator);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(86, 415, 1139, 115);
		panel.add(scrollPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(86, 567, 1139, 115);
		panel.add(scrollPane_3);
		
		
		JTextArea textAreaDescripcionCargo = new JTextArea();
		textAreaDescripcionCargo.setBounds(1141, 336, 183, 74);
		panel.add(textAreaDescripcionCargo);
		textAreaDescripcionCargo.setBackground(new Color(220, 220, 220));
		textAreaDescripcionCargo.setEditable(false);
		
		
		
		
		JLabel lblVisualizando = new JLabel("Visualizando informacion por ticket");
		lblVisualizando.setBounds(330, 20, 706, 54);
		lblVisualizando.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		panel.add(lblVisualizando);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setBounds(64, 80, 222, 26);
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		panel.add(lblCriterios);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setBounds(86, 111, 183, 21);
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo: ");
		lblNumeroLegajo.setBounds(86, 136, 183, 21);
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificaci0n actual del ticket: ");
		lblClasificacionActual.setBounds(86, 161, 270, 21);
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setBounds(419, 111, 282, 21);
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblEstadoActual);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setBounds(419, 136, 282, 21);
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaApertura);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha del ultimo cambio de estado: ");
		lblFechaUltimoCambio.setBounds(419, 161, 324, 21);
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblFechaUltimoCambio);
		
		JLabel lblUltimoGrupo = new JLabel("-Ultimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setBounds(815, 111, 509, 21);
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblUltimoGrupo);
		
		JLabel lblNumeroTicketForma = new JLabel("-Numero de ticket en forma ascendente");
		lblNumeroTicketForma.setBounds(815, 136, 261, 21);
		lblNumeroTicketForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroTicketForma);
		
		JLabel lblTicket = new JLabel("Ticket         de 23");
		lblTicket.setBounds(462, 211, 167, 29);
		lblTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		panel.add(lblTicket);
		
		JLabel lblDatosTicket = new JLabel("Datos del ticket:");
		lblDatosTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosTicket.setBounds(12, 231, 167, 37);
		panel.add(lblDatosTicket);
		
		JLabel lblNumeroTicketDatos = new JLabel("Numero de ticket:");
		lblNumeroTicketDatos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketDatos.setBounds(22, 271, 222, 21);
		panel.add(lblNumeroTicketDatos);
		
		JLabel lblClasificacionActualDatos = new JLabel("Clasificacion actual ticket:");
		lblClasificacionActualDatos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActualDatos.setBounds(345, 271, 177, 21);
		panel.add(lblClasificacionActualDatos);
		
		JLabel lblEstadoActualDatos = new JLabel("Estado actual ticket:");
		lblEstadoActualDatos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActualDatos.setBounds(345, 303, 177, 21);
		panel.add(lblEstadoActualDatos);
		
		JLabel lblTiempoAcumuladoAtencion = new JLabel("Tiempo acumulado de atencion:");
		lblTiempoAcumuladoAtencion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblTiempoAcumuladoAtencion.setBounds(22, 303, 222, 21);
		panel.add(lblTiempoAcumuladoAtencion);
		
		JLabel lblDatosUsuario = new JLabel("Datos del usuario:");
		lblDatosUsuario.setBounds(719, 237, 261, 25);
		lblDatosUsuario.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		panel.add(lblDatosUsuario);
		
		JLabel lblNumeroLegajoUsuario = new JLabel("Numero de legajo:");
		lblNumeroLegajoUsuario.setBounds(729, 271, 132, 21);
		lblNumeroLegajoUsuario.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblNumeroLegajoUsuario);
		
		JLabel lblApellidoYNombre = new JLabel("Apellido y Nombre:");
		lblApellidoYNombre.setBounds(984, 271, 150, 21);
		lblApellidoYNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblApellidoYNombre);
		
		JLabel lblTelefonoInterno = new JLabel("Telefono interno:");
		lblTelefonoInterno.setBounds(727, 303, 132, 21);
		lblTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblTelefonoInterno);
		
		JLabel lblTelefonoDirecto = new JLabel("Telefono directo:");
		lblTelefonoDirecto.setBounds(984, 303, 150, 21);
		lblTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblTelefonoDirecto);
		
		JLabel lblUbicacion = new JLabel("Ubicacion:");
		lblUbicacion.setBounds(729, 335, 132, 21);
		lblUbicacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblUbicacion);
		
		JLabel lblDescripcinCargo = new JLabel("Descripcion de cargo:");
		lblDescripcinCargo.setBounds(984, 335, 150, 21);
		lblDescripcinCargo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		panel.add(lblDescripcinCargo);
		
		JLabel lblGruposResolucionIntervinieron = new JLabel("Grupos de resolucion que intervinieron:");
		lblGruposResolucionIntervinieron.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblGruposResolucionIntervinieron.setBounds(64, 377, 391, 37);
		panel.add(lblGruposResolucionIntervinieron);
		
		JLabel lblReclasificaciones = new JLabel("Reclasificaciones del ticket:");
		lblReclasificaciones.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblReclasificaciones.setBounds(64, 528, 391, 37);
		panel.add(lblReclasificaciones);
		
		
		
		textField = new JTextField();
		textField.setBounds(530, 215, 33, 22);
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		panel.add(textField);
		
		txtNumeroTicketDatos = new JTextField();
		txtNumeroTicketDatos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicketDatos.setEditable(false);
		txtNumeroTicketDatos.setColumns(10);
		txtNumeroTicketDatos.setBackground(new Color(220, 220, 220));
		txtNumeroTicketDatos.setBounds(241, 272, 92, 20);
		panel.add(txtNumeroTicketDatos);
		
		txtClasificacionActual = new JTextField();
		txtClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtClasificacionActual.setEditable(false);
		txtClasificacionActual.setColumns(10);
		txtClasificacionActual.setBackground(new Color(220, 220, 220));
		txtClasificacionActual.setBounds(521, 272, 195, 20);
		panel.add(txtClasificacionActual);
		
		txtTiempoAcumuladoAtencion = new JTextField();
		txtTiempoAcumuladoAtencion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtTiempoAcumuladoAtencion.setEditable(false);
		txtTiempoAcumuladoAtencion.setColumns(10);
		txtTiempoAcumuladoAtencion.setBackground(new Color(220, 220, 220));
		txtTiempoAcumuladoAtencion.setBounds(241, 304, 91, 20);
		panel.add(txtTiempoAcumuladoAtencion);
		
		txtEstadoActual = new JTextField();
		txtEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtEstadoActual.setEditable(false);
		txtEstadoActual.setColumns(10);
		txtEstadoActual.setBackground(new Color(220, 220, 220));
		txtEstadoActual.setBounds(521, 304, 194, 20);
		panel.add(txtEstadoActual);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setBounds(864, 272, 108, 20);
		txtNumeroLegajo.setEditable(false);
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		panel.add(txtNumeroLegajo);
		
		txtTelefonoInterno = new JTextField();
		txtTelefonoInterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtTelefonoInterno.setBounds(864, 304, 108, 20);
		txtTelefonoInterno.setEditable(false);
		txtTelefonoInterno.setColumns(10);
		txtTelefonoInterno.setBackground(new Color(220, 220, 220));
		panel.add(txtTelefonoInterno);
		
		txtApellidoNombre = new JTextField();
		txtApellidoNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtApellidoNombre.setBounds(1141, 272, 183, 20);
		txtApellidoNombre.setEditable(false);
		txtApellidoNombre.setColumns(10);
		txtApellidoNombre.setBackground(new Color(220, 220, 220));
		panel.add(txtApellidoNombre);
		
		txtTelefonoDirecto = new JTextField();
		txtTelefonoDirecto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtTelefonoDirecto.setBounds(1141, 304, 183, 20);
		txtTelefonoDirecto.setEditable(false);
		txtTelefonoDirecto.setColumns(10);
		txtTelefonoDirecto.setBackground(new Color(220, 220, 220));
		panel.add(txtTelefonoDirecto);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtUbicacion.setEditable(false);
		txtUbicacion.setColumns(10);
		txtUbicacion.setBackground(new Color(220, 220, 220));
		txtUbicacion.setBounds(864, 336, 108, 20);
		panel.add(txtUbicacion);
		
		
		
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
			new String[] {"Grupo de resolucion", "Fecha de asignacion", "Tiempo real de atencion", "Tiempo total asignado"}
		));
		scrollPane_2.setViewportView(table);
		
		
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
			new String[] {"Clasificacion anterior", "Clasificacion nueva", "Fecha"}
		));
		scrollPane_3.setViewportView(table_1);
		
		
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrar.setBounds(1000, 690, 133, 28);
		panel.add(btnCerrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(1187, 690, 133, 28);
		panel.add(btnImprimir);	
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(641, 211, 44, 25);
		panel.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(687, 211, 42, 25);
		panel.add(btnDerecha);
	}
}