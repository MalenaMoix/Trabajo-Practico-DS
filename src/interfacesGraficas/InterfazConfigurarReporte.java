package interfacesGraficas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
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

public class InterfazConfigurarReporte extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazConfigurarReporte frame = new InterfazConfigurarReporte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazConfigurarReporte() {
		
		//SELECCIONA UN SOLO CRITERIO
		
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
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		
		JLabel lblConfigurarReporte = new JLabel("Configurar reporte");
		lblConfigurarReporte.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConfigurarReporte.setBounds(482, 10, 385, 60);
		contentPane.add(lblConfigurarReporte);
		
		JLabel lblCriterioAgrupar = new JLabel("Criterio para agrupar los datos:  ");
		lblCriterioAgrupar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterioAgrupar.setBounds(358, 267, 256, 25);
		contentPane.add(lblCriterioAgrupar);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Numero de ticket", "Numero de legajo", "Estado actual del ticket", "Ultimo grupo de resolucion", "Clasificacion actual del ticket"}));
		comboBox.setBounds(655, 268, 298, 25);
		contentPane.add(comboBox);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnVerDescendente = new JButton("Ver en forma descendente");
		btnVerDescendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerDescendente.setBounds(964, 655, 200, 37);
		contentPane.add(btnVerDescendente);
		
		JButton btnVerAscendente = new JButton("Ver en forma ascendente");
		btnVerAscendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerAscendente.setBounds(726, 655, 200, 37);
		contentPane.add(btnVerAscendente);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
