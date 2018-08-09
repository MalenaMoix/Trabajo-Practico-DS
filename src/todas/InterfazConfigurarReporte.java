package todas;

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
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblConfigurarReporte = new JLabel("Configurar reporte");
		lblConfigurarReporte.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConfigurarReporte.setBounds(482, 10, 385, 60);
		contentPane.add(lblConfigurarReporte);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JLabel lblCriterioAgrupar = new JLabel("Criterio para agrupar los datos:  ");
		lblCriterioAgrupar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterioAgrupar.setBounds(360, 200, 223, 27);
		contentPane.add(lblCriterioAgrupar);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button.setBounds(1207, 655, 133, 37);
		contentPane.add(button);
		
		JButton btnVerDescendente = new JButton("Ver en forma descendente");
		btnVerDescendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerDescendente.setBounds(964, 655, 200, 37);
		contentPane.add(btnVerDescendente);
		
		JButton btnVerAscendente = new JButton("Ver en forma ascendente");
		btnVerAscendente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerAscendente.setBounds(726, 655, 200, 37);
		contentPane.add(btnVerAscendente);
		
		JRadioButton radioButtonNumeroTicket = new JRadioButton("Numero de ticket");
		radioButtonNumeroTicket.setBackground(new Color(230, 230, 250));
		radioButtonNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonNumeroTicket.setBounds(700, 271, 256, 20);
		contentPane.add(radioButtonNumeroTicket);
		
		JRadioButton radioButtonNumeroLegajo = new JRadioButton("Numero de legajo");
		radioButtonNumeroLegajo.setBackground(new Color(230, 230, 250));
		radioButtonNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonNumeroLegajo.setBounds(700, 341, 256, 20);
		contentPane.add(radioButtonNumeroLegajo);
		
		JRadioButton radioButtonEstadoActual = new JRadioButton("Estado actual del ticket");
		radioButtonEstadoActual.setBackground(new Color(230, 230, 250));
		radioButtonEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonEstadoActual.setBounds(700, 404, 256, 20);
		contentPane.add(radioButtonEstadoActual);
		
		JRadioButton radioButtonUltimoGrupo = new JRadioButton("Ultimo grupo de resolucion");
		radioButtonUltimoGrupo.setBackground(new Color(230, 230, 250));
		radioButtonUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonUltimoGrupo.setBounds(700, 470, 256, 20);
		contentPane.add(radioButtonUltimoGrupo);
		
		JRadioButton radioButtonClasificacinActual = new JRadioButton("Clasificacion actual del ticket");
		radioButtonClasificacinActual.setBackground(new Color(230, 230, 250));
		radioButtonClasificacinActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonClasificacinActual.setBounds(700, 536, 256, 20);
		contentPane.add(radioButtonClasificacinActual);
	}
}
