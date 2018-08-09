package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class InterfazConsultarIntervencionesPaginacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;
	private JTextField txtFechaApertura;
	private JTextField txtClasificacion;
	private JTextField txtEstadoTicket;
	private JTextField txtFechaAsignacion;
	private JTextField txtEstadoIntervencion;
	private JTextField txtGrupoResolucion;
	private JTextField txtNumeroPagina;
	private JTextField textFieldCantidad;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazConsultarIntervencionesPaginacion frame = new InterfazConsultarIntervencionesPaginacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazConsultarIntervencionesPaginacion() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setTitle("La llamita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroTicket = new JLabel("N\u00FAmero ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroTicket.setBounds(189, 260, 235, 25);
		contentPane.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("N\u00FAmero legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroLegajo.setBounds(189, 309, 235, 25);
		contentPane.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("Clasificaci\u00F3n actual del ticket:");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblClasificacionActual.setBounds(189, 358, 235, 22);
		contentPane.add(lblClasificacionActual);
		
		JLabel lblEstadoDelTicket = new JLabel("Estado del ticket:");
		lblEstadoDelTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoDelTicket.setBounds(189, 407, 235, 22);
		contentPane.add(lblEstadoDelTicket);
		
		JLabel lblFechaApertura = new JLabel("Fecha de apertura:");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaApertura.setBounds(189, 456, 235, 22);
		contentPane.add(lblFechaApertura);
		
		JLabel lblFechaAsignacion = new JLabel("Fecha asignaci\u00F3n de intervenci\u00F3n:");
		lblFechaAsignacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaAsignacion.setBounds(694, 260, 271, 25);
		contentPane.add(lblFechaAsignacion);
		
		JLabel lblEstadoIntervencion = new JLabel("Estado intervenci\u00F3n:");
		lblEstadoIntervencion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoIntervencion.setBounds(694, 310, 270, 22);
		contentPane.add(lblEstadoIntervencion);
		
		JLabel lblGrupoResolucion = new JLabel("Grupo de resoluci\u00F3n:");
		lblGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGrupoResolucion.setBounds(694, 357, 270, 25);
		contentPane.add(lblGrupoResolucion);
		
		JLabel lblObservaciones = new JLabel("Observaciones de la intervenci\u00F3n:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblObservaciones.setBounds(694, 406, 270, 25);
		contentPane.add(lblObservaciones);
		
		JButton btnModificarEstado = new JButton("Modificar estado");
		btnModificarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazActualizarEstadoIntervencion comentario = new InterfazActualizarEstadoIntervencion();
				comentario.setVisible(true);
				InterfazConsultarIntervencionesPaginacion.this.dispose();
			}
		});
		
		btnModificarEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnModificarEstado.setBounds(854, 650, 157, 37);
		contentPane.add(btnModificarEstado);
		
		JButton btnIngresarComentario = new JButton("Ingresar comentario");
		btnIngresarComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarComentarios comentario = new InterfazModificarComentarios();
				comentario.setVisible(true);
				InterfazConsultarIntervencionesPaginacion.this.dispose();
			}
		});
		
		btnIngresarComentario.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnIngresarComentario.setBounds(1020, 650, 157, 37);
		contentPane.add(btnIngresarComentario);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setBackground(new Color(220, 220, 220));
		txtNumeroTicket.setBounds(436, 264, 202, 22);
		contentPane.add(txtNumeroTicket);
		txtNumeroTicket.setColumns(10);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		txtNumeroLegajo.setBounds(436, 313, 202, 22);
		contentPane.add(txtNumeroLegajo);
		txtNumeroLegajo.setColumns(10);
		
		txtFechaApertura = new JTextField();
		txtFechaApertura.setBackground(new Color(220, 220, 220));
		txtFechaApertura.setBounds(436, 459, 202, 22);
		contentPane.add(txtFechaApertura);
		txtFechaApertura.setColumns(10);
		
		txtClasificacion = new JTextField();
		txtClasificacion.setBackground(new Color(220, 220, 220));
		txtClasificacion.setBounds(436, 361, 202, 22);
		contentPane.add(txtClasificacion);
		txtClasificacion.setColumns(10);
		
		txtEstadoTicket = new JTextField();
		txtEstadoTicket.setBackground(new Color(220, 220, 220));
		txtEstadoTicket.setBounds(436, 410, 202, 22);
		contentPane.add(txtEstadoTicket);
		txtEstadoTicket.setColumns(10);
		
		txtFechaAsignacion = new JTextField();
		txtFechaAsignacion.setBackground(new Color(220, 220, 220));
		txtFechaAsignacion.setBounds(977, 264, 202, 22);
		contentPane.add(txtFechaAsignacion);
		txtFechaAsignacion.setColumns(10);
		
		txtEstadoIntervencion = new JTextField();
		txtEstadoIntervencion.setBackground(new Color(220, 220, 220));
		txtEstadoIntervencion.setBounds(976, 313, 202, 22);
		contentPane.add(txtEstadoIntervencion);
		txtEstadoIntervencion.setColumns(10);
		
		txtGrupoResolucion = new JTextField();
		txtGrupoResolucion.setBackground(new Color(220, 220, 220));
		txtGrupoResolucion.setBounds(976, 361, 202, 22);
		contentPane.add(txtGrupoResolucion);
		txtGrupoResolucion.setColumns(10);
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios de b\u00FAsqueda de intervenciones asignadas:");
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosDeBusqueda.setBounds(80, 35, 516, 31);
		contentPane.add(lblCriteriosDeBusqueda);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificaci\u00F3n de ticket        de ");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacionDeTicket.setBounds(532, 200, 285, 22);
		contentPane.add(lblClasificacionDeTicket);
		
		JLabel lblNumeroTicketDeArriba = new JLabel("-N\u00FAmero ticket:");
		lblNumeroTicketDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicketDeArriba.setBounds(169, 92, 183, 21);
		contentPane.add(lblNumeroTicketDeArriba);
		
		JLabel lblNumeroLegajoDeArriba = new JLabel("-N\u00FAmero legajo:");
		lblNumeroLegajoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajoDeArriba.setBounds(169, 160, 241, 21);
		contentPane.add(lblNumeroLegajoDeArriba);
		
		JLabel lblEstadoDearriba = new JLabel("-Estado:");
		lblEstadoDearriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoDearriba.setBounds(169, 126, 241, 21);
		contentPane.add(lblEstadoDearriba);
		
		JLabel lblfechaDesdeDeArriba = new JLabel("-Fecha desde:");
		lblfechaDesdeDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblfechaDesdeDeArriba.setBounds(502, 94, 102, 16);
		contentPane.add(lblfechaDesdeDeArriba);
		
		JLabel lblfechaHastaDeArriba = new JLabel("-Fecha hasta:");
		lblfechaHastaDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblfechaHastaDeArriba.setBounds(502, 128, 86, 16);
		contentPane.add(lblfechaHastaDeArriba);
		
		txtNumeroPagina = new JTextField();
		txtNumeroPagina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		txtNumeroPagina.setBounds(731, 203, 34, 22);
		contentPane.add(txtNumeroPagina);
		txtNumeroPagina.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(976, 407, 202, 113);
		contentPane.add(scrollPane);
		
		JTextArea textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setBackground(new Color(220, 220, 220));
		textAreaObservaciones.setEditable(true);
		scrollPane.setViewportView(textAreaObservaciones);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(803, 203, 57, 22);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		JButton btnIzquierda = new JButton("<");
		btnIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnIzquierda.setBounds(880, 202, 44, 25);
		contentPane.add(btnIzquierda);
		
		JButton btnDerecha = new JButton(">");
		btnDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDerecha.setBounds(926, 202, 42, 25);
		contentPane.add(btnDerecha);
	}
}
