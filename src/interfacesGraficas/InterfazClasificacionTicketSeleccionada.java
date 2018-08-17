package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

public class InterfazClasificacionTicketSeleccionada extends JPanel {

	private JFrame ventana;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldEstado;
	private JTable table_1;
	private JTextField txtCantidad;
	private JTextField txtCantidadTotal;

	public InterfazClasificacionTicketSeleccionada(JFrame frame) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(797, 85, 296, 114);
		this.add(scrollPane);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(113, 352, 1092, 280);
		this.add(scrollPane1);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(103, 79, 183, 25);
		this.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(103, 123, 192, 25);
		this.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(103, 165, 153, 31);
		this.add(lblEstado);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripcion completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(591, 79, 203, 25);
		this.add(lblDescripcionCompleta);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificacion de ticket seleccionada:");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblClasificacionDeTicket.setBounds(80, 35, 553, 25);
		this.add(lblClasificacionDeTicket);
		
		JLabel lblCantidadDeTickets = new JLabel("Cantidad de tickets abiertos:");
		lblCantidadDeTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadDeTickets.setBounds(103, 241, 230, 25);
		this.add(lblCantidadDeTickets);
		
		JLabel lblCantidadTotalTickets = new JLabel("Cantidad total de tickets:");
		lblCantidadTotalTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCantidadTotalTickets.setBounds(103, 277, 209, 25);
		this.add(lblCantidadTotalTickets);
		
		JLabel lblListaTickets = new JLabel("Lista de tickets actualmente derivados al Actor:");
		lblListaTickets.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblListaTickets.setBounds(103, 316, 385, 25);
		this.add(lblListaTickets);
		
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBackground(new Color(220, 220, 220));
		textFieldCodigo.setEditable(false);
		textFieldCodigo.setBounds(315, 82, 183, 22);
		textFieldCodigo.setColumns(10);
		this.add(textFieldCodigo);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(315, 126, 183, 22);
		this.add(textFieldNombre);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setEditable(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setBounds(315, 171, 183, 22);
		this.add(textFieldEstado);
		
		
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
			new String[] {"Ticket", "Legajo", "Apellido y Nombre", "Telefono Interno", "Telefono Directo", "Fecha derivacion", "Hora derivacion", "Estado intervencion"}
		));
		
		
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCantidad.setBounds(345, 245, 81, 22);
		txtCantidad.setColumns(10);
		txtCantidad.setEditable(false);
		this.add(txtCantidad);
		
		txtCantidadTotal = new JTextField();
		txtCantidadTotal.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCantidadTotal.setColumns(10);
		txtCantidadTotal.setBounds(345, 281, 81, 22);
		txtCantidadTotal.setEditable(false);
		this.add(txtCantidadTotal);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new InterfazBuscarClasificacionTicketPaginacion(ventana));
				ventana.pack();
			}
		});
	}
}