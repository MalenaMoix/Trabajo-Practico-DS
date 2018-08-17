package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class InterfazRegistrarClasificacionTicket2 extends JPanel {

	private JFrame ventana;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtActor;

	public InterfazRegistrarClasificacionTicket2(JFrame frame) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(294, 80, 760, 2);
		this.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(610, 238, 393, 155);
		this.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		textAreaDescripcion.setBounds(669, 253, 295, 139);
		scrollPane.setViewportView(textAreaDescripcion);
		//this.add(textAreaDescripcion);
		
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(610, 417, 393, 87);
		this.add(scrollPane2);
		
		JTextArea txtListaGrupos = new JTextArea();
		txtListaGrupos.setBackground(new Color(220, 220, 220));
		txtListaGrupos.setEditable(false);
		txtListaGrupos.setBounds(610, 416, 393, 87);
		scrollPane2.setViewportView(txtListaGrupos);
		//this.add(txtListaGrupos);
		
		
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(335, 139, 263, 31);
		this.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigo.setBounds(335, 189, 263, 31);
		this.add(lblCodigo);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(335, 237, 263, 31);
		this.add(lblDescripcion);
		
		JLabel lblGruposResolucion = new JLabel("Grupos de Resolucion:");
		lblGruposResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposResolucion.setBounds(335, 409, 263, 31);
		this.add(lblGruposResolucion);
		
		JLabel lblActor = new JLabel("Actor que realizo la registracion:");
		lblActor.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblActor.setBounds(335, 526, 263, 31);
		this.add(lblActor);
		
		JLabel lblFechaSolicitud = new JLabel("Fecha de solicitud:");
		lblFechaSolicitud.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaSolicitud.setBounds(335, 592, 263, 22);
		this.add(lblFechaSolicitud);
		
		JLabel lblRegistrarClasificacion = new JLabel("Registar clasificacion de ticket");
		lblRegistrarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarClasificacion.setBounds(373, 20, 602, 54);
		this.add(lblRegistrarClasificacion);
		
		
		JFormattedTextField formattedTextFieldFechaSolicitud = new JFormattedTextField();
		formattedTextFieldFechaSolicitud.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		formattedTextFieldFechaSolicitud.setBackground(new Color(220, 220, 220));
		formattedTextFieldFechaSolicitud.setEditable(false);
		formattedTextFieldFechaSolicitud.setBounds(610, 594, 393, 24);
		this.add(formattedTextFieldFechaSolicitud);
		
		
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtCodigo.setBackground(new Color(220, 220, 220));
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(610, 194, 393, 24);
		txtCodigo.setColumns(10);
		this.add(txtCodigo);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setBackground(new Color(220, 220, 220));
		txtNombre.setEditable(false);
		txtNombre.setBounds(610, 145, 393, 24);
		txtNombre.setColumns(10);
		this.add(txtNombre);
		
		txtActor = new JTextField();
		txtActor.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtActor.setBackground(new Color(220, 220, 220));
		txtActor.setEditable(false);
		txtActor.setBounds(610, 532, 393, 24);
		txtActor.setColumns(10);
		this.add(txtActor);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1020, 650, 133, 37);
		this.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new InterfazRegistrarClasificacionTicket1(ventana));
				ventana.pack();
			}
		});
	}
}
