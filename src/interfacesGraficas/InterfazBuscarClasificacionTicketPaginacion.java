package interfacesGraficas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
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

public class InterfazBuscarClasificacionTicketPaginacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroPagina;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldEstado;
	private JTextField textFieldCantidad;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazBuscarClasificacionTicketPaginacion frame = new InterfazBuscarClasificacionTicketPaginacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazBuscarClasificacionTicketPaginacion() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(529, 392, 537, 114);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		scrollPane.setViewportView(textAreaDescripcion);
		
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios de busqueda de clasificacion de tickets:");
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosDeBusqueda.setBounds(80, 40, 516, 31);
		contentPane.add(lblCriteriosDeBusqueda);
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(334, 289, 183, 25);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(334, 340, 192, 25);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(334, 529, 183, 31);
		contentPane.add(lblEstado);
		
		JLabel lblCodigoDeArriba = new JLabel("Codigo numerico: ");
		lblCodigoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCodigoDeArriba.setBounds(169, 84, 183, 21);
		contentPane.add(lblCodigoDeArriba);
		
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(153, 90, 8, 8);
		contentPane.add(label);
		
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificaci\u00F3n de ticket        de ");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacionDeTicket.setBounds(489, 228, 285, 22);
		contentPane.add(lblClasificacionDeTicket);
		
		JLabel label_1 = new JLabel("-");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(153, 122, 8, 8);
		contentPane.add(label_1);
		
		JLabel lblParteDelNombre = new JLabel("Parte del nombre: ");
		lblParteDelNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblParteDelNombre.setBounds(169, 116, 183, 21);
		contentPane.add(lblParteDelNombre);
		
		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(153, 153, 8, 8);
		contentPane.add(label_2);
		
		JLabel lblGrupoDeResolucion = new JLabel("Grupo de resoluci\u00F3n: ");
		lblGrupoDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGrupoDeResolucion.setBounds(169, 150, 241, 21);
		contentPane.add(lblGrupoDeResolucion);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(153, 187, 8, 8);
		contentPane.add(label_3);
		
		JLabel lblEstadoDeArriba = new JLabel("Estado:");
		lblEstadoDeArriba.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoDeArriba.setBounds(169, 181, 241, 21);
		contentPane.add(lblEstadoDeArriba);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripci\u00F3n completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(334, 390, 203, 25);
		contentPane.add(lblDescripcionCompleta);
		
		
		txtNumeroPagina = new JTextField();
		txtNumeroPagina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumeroPagina.setText("1");
		txtNumeroPagina.setBounds(690, 229, 33, 22);
		contentPane.add(txtNumeroPagina);
		txtNumeroPagina.setColumns(10);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBackground(new Color(220, 220, 220));
		textFieldCodigo.setEditable(false);
		textFieldCodigo.setBounds(529, 291, 537, 24);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(529, 342, 537, 24);
		contentPane.add(textFieldNombre);
		
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setEditable(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setBounds(529, 534, 537, 24);
		contentPane.add(textFieldEstado);
		
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textFieldCantidad.setColumns(10);
		textFieldCantidad.setBounds(761, 229, 61, 22);
		contentPane.add(textFieldCantidad);
		
		
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnSeleccionar.setBounds(833, 650, 133, 37);
		contentPane.add(btnSeleccionar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnModificar.setBounds(646, 650, 133, 37);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBorrar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnBorrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton buttonIzquierda = new JButton("<");
		buttonIzquierda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		buttonIzquierda.setBounds(860, 226, 44, 25);
		contentPane.add(buttonIzquierda);
		
		JButton buttonDerecha = new JButton(">");
		buttonDerecha.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		buttonDerecha.setBounds(906, 226, 42, 25);
		contentPane.add(buttonDerecha);
		
		
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazClasificacionTicketSeleccionada comentario = new InterfazClasificacionTicketSeleccionada();
				comentario.setVisible(true);
				InterfazBuscarClasificacionTicketPaginacion.this.dispose();
			}
		});
		
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazBorrarClasificacionTicket vergrupo = new InterfazBorrarClasificacionTicket();
				vergrupo.setVisible(true);
				InterfazBuscarClasificacionTicketPaginacion.this.dispose();
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}