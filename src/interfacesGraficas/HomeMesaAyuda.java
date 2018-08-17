package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JSeparator;

public class HomeMesaAyuda extends JPanel {

	private JFrame ventana;

	public HomeMesaAyuda(JFrame frame) {

		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 90, 760, 2);
		this.add(separator);
		
		
		JLabel lblHomeMesa = new JLabel("Home: Mesa de Ayuda");
		lblHomeMesa.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblHomeMesa.setBounds(462, 20, 437, 62);
		this.add(lblHomeMesa);
		
		
		
		JButton btnRegistrarTicket = new JButton("Registrar ticket");
		btnRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnRegistrarTicket.setBounds(491, 260, 380, 45);
		this.add(btnRegistrarTicket);
		
		JButton btnConsultarTicket = new JButton("Consultar ticket");
		btnConsultarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnConsultarTicket.setBounds(491, 345, 380, 45);
		this.add(btnConsultarTicket);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnSalir.setBounds(491, 428, 380, 45);
		this.add(btnSalir);
		
		
		
		btnRegistrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new InterfazRegistrarTicket1(ventana));
				ventana.pack();
			}
		});
		
		
		btnConsultarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazConsultarTicket(ventana));
				ventana.pack();
			}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}