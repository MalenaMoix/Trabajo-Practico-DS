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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCriteriosOrdenamientoClasificacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCriteriosOrdenamientoClasificacion frame = new InterfazCriteriosOrdenamientoClasificacion();
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
	public InterfazCriteriosOrdenamientoClasificacion() {
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
		
		JLabel lblNewLabel = new JLabel("Criterios de ordenamiento");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(417, 20, 515, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblSeleccionarCriteriosPor = new JLabel("Seleccionar los criterios por los que desea ordenar la visualizaci\u00F3n por clasificaci\u00F3n actual del ticket: ");
		lblSeleccionarCriteriosPor.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriteriosPor.setBounds(187, 200, 974, 32);
		contentPane.add(lblSeleccionarCriteriosPor);
		
		JLabel lblNewLabel_1 = new JLabel("Criterio 1: ");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(437, 294, 103, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCriterio = new JLabel("Criterio 2: ");
		lblCriterio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio.setBounds(437, 358, 86, 22);
		contentPane.add(lblCriterio);
		
		JLabel lblCriterio_1 = new JLabel("Criterio 3: ");
		lblCriterio_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_1.setBounds(437, 425, 103, 22);
		contentPane.add(lblCriterio_1);
		
		JLabel lblCriterio_2 = new JLabel("Criterio 4: ");
		lblCriterio_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_2.setBounds(437, 492, 103, 22);
		contentPane.add(lblCriterio_2);
		
		JLabel lblCriterio_3 = new JLabel("Criterio 5: ");
		lblCriterio_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_3.setBounds(437, 557, 103, 22);
		contentPane.add(lblCriterio_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resoluci\u00F3n", "Legajo", "N\u00FAmero de ticket"}));
		comboBox.setBounds(637, 294, 275, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resoluci\u00F3n", "Legajo", "N\u00FAmero de ticket"}));
		comboBox_1.setBounds(637, 358, 275, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resoluci\u00F3n", "Legajo", "N\u00FAmero de ticket"}));
		comboBox_2.setBounds(637, 425, 275, 24);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resoluci\u00F3n", "Legajo", "N\u00FAmero de ticket"}));
		comboBox_3.setBounds(637, 490, 275, 24);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resoluci\u00F3n", "Legajo", "N\u00FAmero de ticket"}));
		comboBox_4.setBounds(637, 557, 275, 24);
		contentPane.add(comboBox_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizandoInfoPorClasificacion vergrupo = new InterfazVisualizandoInfoPorClasificacion();
				vergrupo.setVisible(true);
				InterfazCriteriosOrdenamientoClasificacion.this.dispose();
			}
		});
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnConfirmar);
		
	}

}