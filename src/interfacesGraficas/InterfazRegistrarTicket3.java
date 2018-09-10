package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class InterfazRegistrarTicket3 extends JPanel{
	
	private JFrame ventana;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;
	private JTextField txtEstado;
	private JTextField txtClasificacion;
	
	
	public InterfazRegistrarTicket3(JFrame frame, String numeroTicket, String numeroLegajo, Object clasificacion, String observaciones) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(301, 90, 760, 2);
		this.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(627, 443, 359, 170);
		this.add(scrollPane);
		
		JTextArea txtObservaciones = new JTextArea();
		txtObservaciones.setEditable(false);
		txtObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		scrollPane.setViewportView(txtObservaciones);
		txtObservaciones.setLineWrap(true);
		txtObservaciones.setText(observaciones);
		
		
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(532, 20, 298, 54);
		this.add(lblRegistrarTicket);
		
		JLabel lblRegistro = new JLabel("El ticket se registro exitosamente!");
		lblRegistro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblRegistro.setBounds(520, 164, 326, 30);
		this.add(lblRegistro);
		
		JLabel lblNumeroTicket = new JLabel("Numero de Ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblNumeroTicket.setBounds(380, 257, 185, 22);
		add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero de Legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblNumeroLegajo.setBounds(380, 307, 185, 22);
		add(lblNumeroLegajo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblEstado.setBounds(380, 353, 185, 22);
		add(lblEstado);
		
		JLabel lblClasificacion = new JLabel("Clasificacion del Ticket:");
		lblClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblClasificacion.setBounds(380, 399, 185, 22);
		add(lblClasificacion);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblObservaciones.setBounds(380, 443, 185, 22);
		add(lblObservaciones);
		
		
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setEditable(false);
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setBounds(627, 257, 359, 22);
		add(txtNumeroTicket);
		txtNumeroTicket.setColumns(10);
		txtNumeroTicket.setText(numeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setEditable(false);
		txtNumeroLegajo.setBounds(627, 307, 359, 22);
		add(txtNumeroLegajo);
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setText(numeroLegajo);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setText("Abierto en Mesa de Ayuda");
		txtEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtEstado.setBounds(627, 353, 359, 22);
		add(txtEstado);
		txtEstado.setColumns(10);
		
		txtClasificacion = new JTextField();
		txtClasificacion.setEditable(false);
		txtClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtClasificacion.setBounds(627, 399, 359, 22);
		add(txtClasificacion);
		txtClasificacion.setColumns(10);
		txtClasificacion.setText(clasificacion.toString());
		
		
		
		JButton btnDerivarTicket = new JButton("Derivar ticket");
		btnDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivarTicket.setBounds(1020, 655, 133, 37);
		this.add(btnDerivarTicket);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCerrarTicket.setBounds(1207, 655, 133, 37);
		this.add(btnCerrarTicket);
		
		
		btnDerivarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		

		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});	
	}
}