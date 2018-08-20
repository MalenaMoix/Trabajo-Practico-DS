package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
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

public class InterfazCriteriosOrdenamientoEstadoActual extends JPanel {

	private JFrame ventana;

	public InterfazCriteriosOrdenamientoEstadoActual(JFrame frame) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		this.add(separator);
		
		
		JLabel lblCriteriosOrdenamiento = new JLabel("Criterios de ordenamiento");
		lblCriteriosOrdenamiento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblCriteriosOrdenamiento.setBounds(417, 20, 515, 61);
		this.add(lblCriteriosOrdenamiento);
		
		JLabel lblSeleccionarCriterios = new JLabel("Seleccionar los criterios por los que desea ordenar la visualizacion por estado actual del ticket: ");
		lblSeleccionarCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriterios.setBounds(213, 200, 922, 32);
		this.add(lblSeleccionarCriterios);
		
		JLabel lblCriterio1 = new JLabel("Criterio 1: ");
		lblCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio1.setBounds(433, 294, 103, 22);
		this.add(lblCriterio1);
		
		JLabel lblCriterio2 = new JLabel("Criterio 2: ");
		lblCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio2.setBounds(433, 358, 86, 22);
		this.add(lblCriterio2);
		
		JLabel lblCriterio3 = new JLabel("Criterio 3: ");
		lblCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio3.setBounds(433, 421, 103, 22);
		this.add(lblCriterio3);
		
		JLabel lblCriterio4 = new JLabel("Criterio 4: ");
		lblCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio4.setBounds(433, 483, 103, 22);
		this.add(lblCriterio4);
		
		JLabel lblCriterio5 = new JLabel("Criterio 5: ");
		lblCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio5.setBounds(433, 544, 103, 22);
		this.add(lblCriterio5);
		
		
		
		JComboBox<String> comboBoxCriterio1 = new JComboBox<String>();
		comboBoxCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio1.setModel(new DefaultComboBoxModel<String>(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio1.setBounds(633, 294, 275, 24);
		this.add(comboBoxCriterio1);
		
		JComboBox<String> comboBoxCriterio2 = new JComboBox<String>();
		comboBoxCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio2.setModel(new DefaultComboBoxModel<String>(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio2.setBounds(633, 358, 275, 24);
		this.add(comboBoxCriterio2);
		
		JComboBox<String> comboBoxCriterio3 = new JComboBox<String>();
		comboBoxCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio3.setModel(new DefaultComboBoxModel<String>(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio3.setBounds(633, 421, 275, 24);
		this.add(comboBoxCriterio3);
		
		JComboBox<String> comboBoxCriterio4 = new JComboBox<String>();
		comboBoxCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio4.setModel(new DefaultComboBoxModel<String>(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio4.setBounds(633, 483, 275, 24);
		this.add(comboBoxCriterio4);
		
		JComboBox<String> comboBoxCriterio5 = new JComboBox<String>();
		comboBoxCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio5.setModel(new DefaultComboBoxModel<String>(new String[] {"Por defecto", "Clasificacion actual del ticket", "Fecha apertura", "N\u00FAmero de ticket", "Tiempo acumulado total de atenci\u00F3n", "Ultimo grupo de resoluci\u00F3n"}));
		comboBoxCriterio5.setBounds(633, 544, 275, 24);
		this.add(comboBoxCriterio5);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		this.add(btnConfirmar);
		
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazVisualizandoInfoPorEstadoActual(ventana));
				ventana.pack();
			}
		});
	}
}
