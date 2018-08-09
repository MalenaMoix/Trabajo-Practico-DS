package todas;

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
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblCriteriosOrdenamiento.setBounds(417, 20, 515, 61);
		contentPane.add(lblCriteriosOrdenamiento);
		
		JLabel lblSeleccionarCriterios = new JLabel("Seleccionar los criterios por los que desea ordenar la visualizacion por estado actual del ticket: ");
		lblSeleccionarCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriterios.setBounds(213, 200, 922, 32);
		contentPane.add(lblSeleccionarCriterios);
		
		JLabel lblCriterio1 = new JLabel("Criterio 1: ");
		lblCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio1.setBounds(433, 294, 103, 22);
		contentPane.add(lblCriterio1);
		
		JLabel lblCriterio2 = new JLabel("Criterio 2: ");
		lblCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio2.setBounds(433, 358, 86, 22);
		contentPane.add(lblCriterio2);
		
		JLabel lblCriterio3 = new JLabel("Criterio 3: ");
		lblCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio3.setBounds(433, 421, 103, 22);
		contentPane.add(lblCriterio3);
		
		JLabel lblCriterio4 = new JLabel("Criterio 4: ");
		lblCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio4.setBounds(433, 483, 103, 22);
		contentPane.add(lblCriterio4);
		
		JLabel lblCriterio5 = new JLabel("Criterio 5: ");
		lblCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio5.setBounds(433, 544, 103, 22);
		contentPane.add(lblCriterio5);
		
		
		
		JComboBox comboBoxCriterio1 = new JComboBox();
		comboBoxCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio1.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio1.setBounds(633, 294, 275, 24);
		contentPane.add(comboBoxCriterio1);
		
		JComboBox comboBoxCriterio2 = new JComboBox();
		comboBoxCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio2.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio2.setBounds(633, 358, 275, 24);
		contentPane.add(comboBoxCriterio2);
		
		JComboBox comboBoxCriterio3 = new JComboBox();
		comboBoxCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio3.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio3.setBounds(633, 421, 275, 24);
		contentPane.add(comboBoxCriterio3);
		
		JComboBox comboBoxCriterio4 = new JComboBox();
		comboBoxCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio4.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio4.setBounds(633, 483, 275, 24);
		contentPane.add(comboBoxCriterio4);
		
		JComboBox comboBoxCriterio5 = new JComboBox();
		comboBoxCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio5.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio5.setBounds(633, 544, 275, 24);
		contentPane.add(comboBoxCriterio5);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnConfirmar);
		
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizandoInfoPorEstadoActual verestado = new InterfazVisualizandoInfoPorEstadoActual();
				verestado.setVisible(true);
				InterfazCriteriosOrdenamientoEstadoActual.this.dispose();
			}
		});
	}
}
