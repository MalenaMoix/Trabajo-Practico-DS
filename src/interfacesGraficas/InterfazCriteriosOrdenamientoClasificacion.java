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

public class InterfazCriteriosOrdenamientoClasificacion extends JPanel {

	private JFrame ventana;

	public InterfazCriteriosOrdenamientoClasificacion(JFrame frame) {
		
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
		
		JLabel lblSeleccionarCriterios = new JLabel("Seleccionar los criterios por los que desea ordenar la visualizacion por clasificacion actual del ticket: ");
		lblSeleccionarCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblSeleccionarCriterios.setBounds(187, 200, 974, 32);
		this.add(lblSeleccionarCriterios);
		
		JLabel lblCriterio1 = new JLabel("Criterio 1: ");
		lblCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio1.setBounds(437, 294, 103, 22);
		this.add(lblCriterio1);
		
		JLabel lblCriterio2 = new JLabel("Criterio 2: ");
		lblCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio2.setBounds(437, 358, 86, 22);
		this.add(lblCriterio2);
		
		JLabel lblCriterio3 = new JLabel("Criterio 3: ");
		lblCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio3.setBounds(437, 425, 103, 22);
		this.add(lblCriterio3);
		
		JLabel lblCriterio4 = new JLabel("Criterio 4: ");
		lblCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio4.setBounds(437, 492, 103, 22);
		this.add(lblCriterio4);
		
		JLabel lblCriterio5 = new JLabel("Criterio 5: ");
		lblCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCriterio5.setBounds(437, 557, 103, 22);
		this.add(lblCriterio5);
		
		
		
		JComboBox comboBoxCriterio1 = new JComboBox();
		comboBoxCriterio1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio1.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resolucion", "Legajo", "Numero de ticket"}));
		comboBoxCriterio1.setBounds(637, 294, 275, 24);
		this.add(comboBoxCriterio1);
		
		JComboBox comboBoxCriterio2 = new JComboBox();
		comboBoxCriterio2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio2.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resolucion", "Legajo", "Numero de ticket"}));
		comboBoxCriterio2.setBounds(637, 358, 275, 24);
		this.add(comboBoxCriterio2);
		
		JComboBox comboBoxCriterio3 = new JComboBox();
		comboBoxCriterio3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio3.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resolucion", "Legajo", "Numero de ticket"}));
		comboBoxCriterio3.setBounds(637, 425, 275, 24);
		this.add(comboBoxCriterio3);
		
		JComboBox comboBoxCriterio4 = new JComboBox();
		comboBoxCriterio4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio4.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resolucion", "Legajo", "Numero de ticket"}));
		comboBoxCriterio4.setBounds(637, 490, 275, 24);
		this.add(comboBoxCriterio4);
		
		JComboBox comboBoxCriterio5 = new JComboBox();
		comboBoxCriterio5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxCriterio5.setModel(new DefaultComboBoxModel(new String[] {"Por defecto", "Estado actual del ticket", "Fecha apertura", "Grupo actual de resolucion", "Legajo", "NuAmero de ticket"}));
		comboBoxCriterio5.setBounds(637, 557, 275, 24);
		this.add(comboBoxCriterio5);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1207, 655, 133, 37);
		this.add(btnConfirmar);
		
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazVisualizandoInfoPorClasificacion(ventana));
				ventana.pack();
			}
		});		
	}
}