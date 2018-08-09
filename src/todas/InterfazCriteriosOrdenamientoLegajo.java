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

public class InterfazCriteriosOrdenamientoLegajo extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCriteriosOrdenamientoLegajo frame = new InterfazCriteriosOrdenamientoLegajo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfazCriteriosOrdenamientoLegajo() {
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
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblCriteriosOrdenamiento.setBounds(417, 20, 515, 61);
		contentPane.add(lblCriteriosOrdenamiento);
		
		JLabel lblSeleccionarCriterios = new JLabel("Seleccionar criterios por los que desea ordenar la visualizacion por legajo: ");
		lblSeleccionarCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriterios.setBounds(312, 200, 723, 32);
		contentPane.add(lblSeleccionarCriterios);
		
		JLabel lblCriterio1 = new JLabel("Criterio 1: ");
		lblCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio1.setBounds(437, 294, 103, 22);
		contentPane.add(lblCriterio1);
		
		JLabel lblCriterio2 = new JLabel("Criterio 2: ");
		lblCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio2.setBounds(437, 341, 86, 22);
		contentPane.add(lblCriterio2);
		
		JLabel lblCriterio3 = new JLabel("Criterio 3: ");
		lblCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio3.setBounds(437, 391, 103, 22);
		contentPane.add(lblCriterio3);
		
		JLabel lblCriterio4 = new JLabel("Criterio 4: ");
		lblCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio4.setBounds(437, 441, 103, 22);
		contentPane.add(lblCriterio4);
		
		JLabel lblCriterio5 = new JLabel("Criterio 5: ");
		lblCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio5.setBounds(437, 491, 103, 22);
		contentPane.add(lblCriterio5);
		
		JLabel lblCriterio6 = new JLabel("Criterio 6: ");
		lblCriterio6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblCriterio6.setBounds(437, 541, 103, 22);
		contentPane.add(lblCriterio6);
		
		JComboBox comboBoxCriterio1 = new JComboBox();
		comboBoxCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio1.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio1.setBounds(637, 294, 275, 22);
		contentPane.add(comboBoxCriterio1);
		
		JComboBox comboBoxCriterio2 = new JComboBox();
		comboBoxCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio2.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio2.setBounds(637, 341, 275, 22);
		contentPane.add(comboBoxCriterio2);
		
		JComboBox comboBoxCriterio3 = new JComboBox();
		comboBoxCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio3.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio3.setBounds(637, 391, 275, 22);
		contentPane.add(comboBoxCriterio3);
		
		JComboBox comboBoxCriterio4 = new JComboBox();
		comboBoxCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio4.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio4.setBounds(637, 441, 275, 22);
		contentPane.add(comboBoxCriterio4);
		
		JComboBox comboBoxCriterio5 = new JComboBox();
		comboBoxCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio5.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio5.setBounds(637, 491, 275, 22);
		contentPane.add(comboBoxCriterio5);
		
		JComboBox comboBoxCriterio6 = new JComboBox();
		comboBoxCriterio6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio6.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Clasificacion actual del ticket", "Estado actual del ticket", "Fecha apertura", "Fecha ultimo cambio de estado", "Numero de ticket", "Ultimo grupo de resolucion"}));
		comboBoxCriterio6.setBounds(637, 541, 275, 22);
		contentPane.add(comboBoxCriterio6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizandoInfoPorLegajo verlegajo = new InterfazVisualizandoInfoPorLegajo();
				verlegajo.setVisible(true);
				InterfazCriteriosOrdenamientoLegajo.this.dispose();
			}
		});
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnConfirmar);
		
	}

}
