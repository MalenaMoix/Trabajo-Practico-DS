package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterfazConfigurarReporte extends JPanel {

	private JFrame ventana;

	public InterfazConfigurarReporte(JFrame frame) {
		
		//SELECCIONA UN SOLO CRITERIO
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		this.add(separator);
		
		
		JLabel lblConfigurarReporte = new JLabel("Configurar reporte");
		lblConfigurarReporte.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConfigurarReporte.setBounds(482, 10, 385, 60);
		this.add(lblConfigurarReporte);
		
		JLabel lblCriterioAgrupar = new JLabel("Criterio para agrupar los datos:  ");
		lblCriterioAgrupar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterioAgrupar.setBounds(358, 267, 256, 25);
		this.add(lblCriterioAgrupar);
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Numero de ticket", "Numero de legajo", "Estado actual del ticket", "Ultimo grupo de resolucion", "Clasificacion actual del ticket"}));
		comboBox.setBounds(655, 268, 298, 25);
		this.add(comboBox);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 655, 133, 37);
		this.add(btnCancelar);
		
		JButton btnVerDescendente = new JButton("Ver en forma descendente");
		btnVerDescendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerDescendente.setBounds(964, 655, 200, 37);
		this.add(btnVerDescendente);
		
		JButton btnVerAscendente = new JButton("Ver en forma ascendente");
		btnVerAscendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerAscendente.setBounds(726, 655, 200, 37);
		this.add(btnVerAscendente);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VUELVE
			}
		});
	}
}