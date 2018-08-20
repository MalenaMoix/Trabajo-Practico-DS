package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazBuscarClasificacionTicketPaginacion extends JPanel {

	private JFrame ventana;
	private JTextField txtNumeroPagina;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldEstado;
	private JTextField textFieldCantidad;
	private JTextField txtCodigoNumerico;
	private JTextField txtParteNombre;
	private JTextField txtGrupo;
	private JTextField txtEstado;

	public InterfazBuscarClasificacionTicketPaginacion(JFrame frame, String codigo, String nombre, Object grupo, Object estado, String descripcion) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(529, 392, 537, 114);
		this.add(scrollPane);
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		scrollPane.setViewportView(textAreaDescripcion);
		
		
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios de busqueda de clasificacion de tickets:");
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosDeBusqueda.setBounds(80, 40, 516, 31);
		this.add(lblCriteriosDeBusqueda);
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(334, 289, 183, 25);
		this.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(334, 340, 192, 25);
		this.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(334, 529, 183, 31);
		this.add(lblEstado);
		
		JLabel lblCodigoDeArriba = new JLabel("-Codigo numerico: ");
		lblCodigoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCodigoDeArriba.setBounds(132, 84, 156, 21);
		this.add(lblCodigoDeArriba);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificacion de ticket        de ");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacionDeTicket.setBounds(489, 228, 285, 22);
		this.add(lblClasificacionDeTicket);
		
		JLabel lblParteDelNombre = new JLabel("-Parte del nombre: ");
		lblParteDelNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblParteDelNombre.setBounds(132, 116, 156, 21);
		this.add(lblParteDelNombre);
		
		JLabel lblGrupoDeResolucion = new JLabel("-Grupo de resolucion: ");
		lblGrupoDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGrupoDeResolucion.setBounds(132, 150, 156, 21);
		this.add(lblGrupoDeResolucion);
		
		JLabel lblEstadoDeArriba = new JLabel("-Estado:");
		lblEstadoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoDeArriba.setBounds(132, 181, 156, 21);
		this.add(lblEstadoDeArriba);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripcion completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(334, 390, 203, 25);
		this.add(lblDescripcionCompleta);
		
		
		txtNumeroPagina = new JTextField();
		txtNumeroPagina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumeroPagina.setText("1");
		txtNumeroPagina.setBounds(690, 229, 33, 22);
		txtNumeroPagina.setColumns(10);
		this.add(txtNumeroPagina);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBackground(new Color(220, 220, 220));
		textFieldCodigo.setEditable(false);
		textFieldCodigo.setBounds(529, 291, 537, 24);
		textFieldCodigo.setColumns(10);
		this.add(textFieldCodigo);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(529, 342, 537, 24);
		this.add(textFieldNombre);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setEditable(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setBounds(529, 534, 537, 24);
		this.add(textFieldEstado);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textFieldCantidad.setColumns(10);
		textFieldCantidad.setBounds(761, 229, 61, 22);
		this.add(textFieldCantidad);
		textFieldCantidad.setEditable(false);
		
		
		txtCodigoNumerico = new JTextField();
		txtCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtCodigoNumerico.setBounds(300, 85, 217, 21);
		txtCodigoNumerico.setColumns(10);
		txtCodigoNumerico.setEditable(false);
		this.add(txtCodigoNumerico);
		
		txtCodigoNumerico.setText(codigo);
		
		txtParteNombre = new JTextField();
		txtParteNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtParteNombre.setColumns(10);
		txtParteNombre.setBounds(300, 117, 217, 21);
		txtParteNombre.setEditable(false);
		this.add(txtParteNombre);
		
		txtParteNombre.setText(nombre);
		
		txtGrupo = new JTextField();
		txtGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtGrupo.setColumns(10);
		txtGrupo.setBounds(300, 151, 217, 21);
		txtGrupo.setEditable(false);
		this.add(txtGrupo);
		
		txtGrupo.setText((String)grupo);
		
		txtEstado = new JTextField();
		txtEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtEstado.setColumns(10);
		txtEstado.setBounds(300, 182, 217, 21);
		txtEstado.setEditable(false);
		this.add(txtEstado);
		
		txtEstado.setText((String)estado);
		
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnSeleccionar.setBounds(833, 650, 133, 37);
		this.add(btnSeleccionar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnModificar.setBounds(646, 650, 133, 37);
		this.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBorrar.setBounds(1020, 650, 133, 37);
		this.add(btnBorrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		JButton buttonIzquierda = new JButton("<");
		buttonIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		buttonIzquierda.setBounds(860, 226, 44, 25);
		this.add(buttonIzquierda);
		
		JButton buttonDerecha = new JButton(">");
		buttonDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		buttonDerecha.setBounds(906, 226, 42, 25);
		this.add(buttonDerecha);
		
		
		
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazClasificacionTicketSeleccionada(ventana, codigo, nombre, grupo, estado, descripcion));
				ventana.pack();
			}
		});
		
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazBorrarClasificacionTicket(ventana, codigo, nombre, grupo, estado, descripcion));
				ventana.pack();
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new InterfazBuscarClasificacionTicket(ventana));
				ventana.pack();
			}
		});
	}
}