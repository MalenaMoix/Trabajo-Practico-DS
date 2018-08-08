package todas;

import java.awt.BorderLayout;

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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class InterfazConsultarIntervencionesPaginacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel lblClasificacionActualDel = new JLabel("Clasificaci\u00F3n actual del ticket:");
		lblClasificacionActualDel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblClasificacionActualDel.setBounds(189, 358, 235, 22);
		contentPane.add(lblClasificacionActualDel);
		
		JLabel lblEstadoDelTicket = new JLabel("Estado del ticket:");
		lblEstadoDelTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoDelTicket.setBounds(189, 407, 235, 22);
		contentPane.add(lblEstadoDelTicket);
		
		JLabel lblFechaDeApertura = new JLabel("Fecha de apertura:");
		lblFechaDeApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaDeApertura.setBounds(189, 456, 235, 22);
		contentPane.add(lblFechaDeApertura);
		
		JLabel lblFechaAsignacionDe = new JLabel("Fecha asignaci\u00F3n de intervenci\u00F3n:");
		lblFechaAsignacionDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaAsignacionDe.setBounds(694, 260, 271, 25);
		contentPane.add(lblFechaAsignacionDe);
		
		JLabel lblEstadoIntervencion = new JLabel("Estado intervenci\u00F3n:");
		lblEstadoIntervencion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoIntervencion.setBounds(694, 310, 270, 22);
		contentPane.add(lblEstadoIntervencion);
		
		JLabel lblGrupoDeResolucion = new JLabel("Grupo de resoluci\u00F3n:");
		lblGrupoDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGrupoDeResolucion.setBounds(694, 357, 270, 25);
		contentPane.add(lblGrupoDeResolucion);
		
		JLabel lblObservacionesDeLa = new JLabel("Observaciones de la intervenci\u00F3n:");
		lblObservacionesDeLa.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblObservacionesDeLa.setBounds(694, 406, 270, 25);
		contentPane.add(lblObservacionesDeLa);
		
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
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnNewButton.setBounds(1207, 650, 133, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(436, 264, 202, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(436, 313, 202, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(436, 459, 202, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(436, 361, 202, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(436, 410, 202, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setBounds(977, 264, 202, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(220, 220, 220));
		textField_6.setBounds(976, 313, 202, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(220, 220, 220));
		textField_7.setBounds(976, 361, 202, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios de b\u00FAsqueda de intervenciones asignadas:");
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosDeBusqueda.setBounds(80, 35, 516, 31);
		contentPane.add(lblCriteriosDeBusqueda);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificaci\u00F3n de ticket        de ");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacionDeTicket.setBounds(532, 200, 285, 22);
		contentPane.add(lblClasificacionDeTicket);
		
		JLabel lblnmeroTicket = new JLabel("-N\u00FAmero ticket:");
		lblnmeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblnmeroTicket.setBounds(169, 92, 183, 21);
		contentPane.add(lblnmeroTicket);
		
		JLabel lblnmeroLegajo = new JLabel("-N\u00FAmero legajo:");
		lblnmeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblnmeroLegajo.setBounds(169, 160, 241, 21);
		contentPane.add(lblnmeroLegajo);
		
		JLabel lblestado = new JLabel("-Estado:");
		lblestado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblestado.setBounds(169, 126, 241, 21);
		contentPane.add(lblestado);
		
		JLabel lblfechaDesde = new JLabel("-Fecha desde:");
		lblfechaDesde.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblfechaDesde.setBounds(502, 94, 102, 16);
		contentPane.add(lblfechaDesde);
		
		JLabel lblfechaHasta = new JLabel("-Fecha hasta:");
		lblfechaHasta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblfechaHasta.setBounds(502, 128, 86, 16);
		contentPane.add(lblfechaHasta);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		textField_9.setBounds(731, 203, 34, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(976, 407, 202, 113);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(true);
		scrollPane.setViewportView(textArea);
		
		textField_8 = new JTextField();
		textField_8.setBounds(803, 203, 57, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button = new JButton("<");
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button.setBounds(880, 202, 44, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">");
		button_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_1.setBounds(926, 202, 42, 25);
		contentPane.add(button_1);
	}
}
