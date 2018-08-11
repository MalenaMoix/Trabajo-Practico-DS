package interfacesGraficas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazClasificacionTicketSeleccionada extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldEstado;
	private JTable table_1;
	private JTextField txtCantidad;
	private JTextField txtCantidadTotal;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazClasificacionTicketSeleccionada frame = new InterfazClasificacionTicketSeleccionada();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazClasificacionTicketSeleccionada() {
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
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(797, 85, 296, 114);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(113, 352, 1092, 280);
		contentPane.add(scrollPane1);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(103, 79, 183, 25);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(103, 123, 192, 25);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(103, 165, 153, 31);
		contentPane.add(lblEstado);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripcion completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(591, 79, 203, 25);
		contentPane.add(lblDescripcionCompleta);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificacion de ticket seleccionada:");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblClasificacionDeTicket.setBounds(80, 35, 553, 25);
		contentPane.add(lblClasificacionDeTicket);
		
		JLabel lblCantidadDeTickets = new JLabel("Cantidad de tickets abiertos:");
		lblCantidadDeTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadDeTickets.setBounds(103, 241, 230, 25);
		contentPane.add(lblCantidadDeTickets);
		
		JLabel lblCantidadTotalTickets = new JLabel("Cantidad total de tickets:");
		lblCantidadTotalTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadTotalTickets.setBounds(103, 277, 209, 25);
		contentPane.add(lblCantidadTotalTickets);
		
		JLabel lblListaTickets = new JLabel("Lista de tickets actualmente derivados al Actor:");
		lblListaTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblListaTickets.setBounds(103, 316, 385, 25);
		contentPane.add(lblListaTickets);
		
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBackground(new Color(220, 220, 220));
		textFieldCodigo.setEditable(false);
		textFieldCodigo.setBounds(315, 82, 183, 22);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(315, 126, 183, 22);
		contentPane.add(textFieldNombre);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setEditable(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setBounds(315, 171, 183, 22);
		contentPane.add(textFieldEstado);
		
		
		table_1 = new JTable();
		scrollPane1.setViewportView(table_1);
		table_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		table_1.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Legajo", "Apellido y Nombre", "Telefono Interno", "Telefono Directo", "Fecha derivacion", "Hora derivacion", "Estado intervencion"
			}
		));
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCantidad.setBounds(345, 245, 81, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		txtCantidad.setEditable(false);
		
		txtCantidadTotal = new JTextField();
		txtCantidadTotal.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCantidadTotal.setColumns(10);
		txtCantidadTotal.setBounds(345, 281, 81, 22);
		contentPane.add(txtCantidadTotal);
		txtCantidadTotal.setEditable(false);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazBuscarClasificacionTicketPaginacion comentario = new InterfazBuscarClasificacionTicketPaginacion();
				comentario.setVisible(true);
				InterfazClasificacionTicketSeleccionada.this.dispose();
			}
		});
	}
}