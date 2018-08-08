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

public class InterfazCriteriosOrdenamientoEstadoActual extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCriteriosOrdenamientoEstadoActual frame = new InterfazCriteriosOrdenamientoEstadoActual();
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
	public InterfazCriteriosOrdenamientoEstadoActual() {
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
		
		JLabel lblSeleccionarCriteriosPor = new JLabel("Seleccionar los criterios por los que desea ordenar la visualizaci\u00F3n por estado actual del ticket: ");
		lblSeleccionarCriteriosPor.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriteriosPor.setBounds(213, 200, 922, 32);
		contentPane.add(lblSeleccionarCriteriosPor);
		
		JLabel lblNewLabel_1 = new JLabel("Criterio 1: ");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(433, 294, 103, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCriterio = new JLabel("Criterio 2: ");
		lblCriterio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio.setBounds(433, 358, 86, 22);
		contentPane.add(lblCriterio);
		
		JLabel lblCriterio_1 = new JLabel("Criterio 3: ");
		lblCriterio_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_1.setBounds(433, 421, 103, 22);
		contentPane.add(lblCriterio_1);
		
		JLabel lblCriterio_2 = new JLabel("Criterio 4: ");
		lblCriterio_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_2.setBounds(433, 483, 103, 22);
		contentPane.add(lblCriterio_2);
		
		JLabel lblCriterio_3 = new JLabel("Criterio 5: ");
		lblCriterio_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio_3.setBounds(433, 544, 103, 22);
		contentPane.add(lblCriterio_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificaci\u00F3n actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBox.setBounds(633, 294, 275, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificaci\u00F3n actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBox_1.setBounds(633, 358, 275, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificaci\u00F3n actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBox_2.setBounds(633, 421, 275, 24);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificaci\u00F3n actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBox_3.setBounds(633, 483, 275, 24);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificaci\u00F3n actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBox_4.setBounds(633, 544, 275, 24);
		contentPane.add(comboBox_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizandoInfoPorEstadoActual verestado = new InterfazVisualizandoInfoPorEstadoActual();
				verestado.setVisible(true);
				InterfazCriteriosOrdenamientoEstadoActual.this.dispose();
			}
		});
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnConfirmar);
		
	}

}
