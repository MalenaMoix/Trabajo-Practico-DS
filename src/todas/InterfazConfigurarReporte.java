package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazConfigurarReporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		JLabel lblNewLabel = new JLabel("Configurar reporte");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(482, 10, 385, 60);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Criterio para agrupar los datos:  ");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(360, 200, 223, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button.setBounds(1207, 655, 133, 37);
		contentPane.add(button);
		
		JButton btnVerEnForma_1 = new JButton("Ver en forma descendente");
		btnVerEnForma_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerEnForma_1.setBounds(964, 655, 200, 37);
		contentPane.add(btnVerEnForma_1);
		
		JButton btnVerEnForma = new JButton("Ver en forma ascendente");
		btnVerEnForma.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVerEnForma.setBounds(726, 655, 200, 37);
		contentPane.add(btnVerEnForma);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Numero de ticket");
		rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(700, 271, 256, 20);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNmeroDeLegajo = new JRadioButton("Numero de legajo");
		rdbtnNmeroDeLegajo.setBackground(new Color(230, 230, 250));
		rdbtnNmeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnNmeroDeLegajo.setBounds(700, 341, 256, 20);
		contentPane.add(rdbtnNmeroDeLegajo);
		
		JRadioButton rdbtnEstadoActualDel = new JRadioButton("Estado actual del ticket");
		rdbtnEstadoActualDel.setBackground(new Color(230, 230, 250));
		rdbtnEstadoActualDel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnEstadoActualDel.setBounds(700, 404, 256, 20);
		contentPane.add(rdbtnEstadoActualDel);
		
		JRadioButton rdbtnltimoGrupoDe = new JRadioButton("Ultimo grupo de resolucion");
		rdbtnltimoGrupoDe.setBackground(new Color(230, 230, 250));
		rdbtnltimoGrupoDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnltimoGrupoDe.setBounds(700, 470, 256, 20);
		contentPane.add(rdbtnltimoGrupoDe);
		
		JRadioButton rdbtnClasificacinActualDel = new JRadioButton("Clasificacion actual del ticket");
		rdbtnClasificacinActualDel.setBackground(new Color(230, 230, 250));
		rdbtnClasificacinActualDel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnClasificacinActualDel.setBounds(700, 536, 256, 20);
		contentPane.add(rdbtnClasificacinActualDel);
	}
}
