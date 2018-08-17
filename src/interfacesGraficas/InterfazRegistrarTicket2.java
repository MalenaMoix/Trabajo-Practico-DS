package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class InterfazRegistrarTicket2 extends JPanel {

	private JFrame ventana;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;

	public InterfazRegistrarTicket2(JFrame frame) {

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
		scrollPane.setBounds(503, 253, 520, 320);
		this.add(scrollPane);
		
		JTextArea textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreaObservaciones);
		textAreaObservaciones.setLineWrap(true);
		
		
		JLabel errorObsVacio = new JLabel("Este campo no puede estar vacio.");
		errorObsVacio.setForeground(Color.RED);
		errorObsVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorObsVacio.setBounds(1039, 253, 219, 24);
		this.add(errorObsVacio);
		errorObsVacio.setVisible(false);
		
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(532, 20, 298, 54);
		this.add(lblRegistrarTicket);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblObservaciones.setBounds(319, 251, 133, 27);
		this.add(lblObservaciones);
		
		JLabel lblNumeroTicket = new JLabel("Numero de ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNumeroTicket.setBounds(319, 152, 175, 27);
		this.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero de Legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNumeroLegajo.setBounds(319, 192, 176, 27);
		this.add(lblNumeroLegajo);
		
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		txtNumeroTicket.setBackground(new Color(220, 220, 220));
		txtNumeroTicket.setBounds(503, 158, 520, 22);
		txtNumeroTicket.setColumns(10);
		txtNumeroTicket.setEditable(false);
		this.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBackground(new Color(220, 220, 220));
		txtNumeroLegajo.setBounds(503, 198, 520, 22);
		txtNumeroLegajo.setEditable(false);
		this.add(txtNumeroLegajo);
		
		
		
		JButton btnDerivarTicket = new JButton("Derivar ticket");
		btnDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivarTicket.setBounds(1207, 655, 133, 37);
		this.add(btnDerivarTicket);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCerrarTicket.setBounds(1020, 655, 133, 37);
		this.add(btnCerrarTicket);
		
		
		btnDerivarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textAreaObservaciones.getText().isEmpty()) {
					errorObsVacio.setVisible(true);
				}
				else {
					ventana.setContentPane(new InterfazDerivarTicket1(ventana));
					ventana.pack();
				}
			}
		});
		

		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textAreaObservaciones.getText().isEmpty()) {
					errorObsVacio.setVisible(true);
				}
				else {
					ventana.setContentPane(new InterfazCerrarTicket(ventana));
					ventana.pack();
				}
			}
		});
	}
}