package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorClasificacion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorClasificacion frame = new InterfazVisualizandoInfoPorClasificacion();
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
	public InterfazVisualizandoInfoPorClasificacion() {
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1300, 980));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 1327, 980);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Visualizando informaci\u00F3n por clasificaci\u00F3n");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		label.setBounds(269, 20, 828, 54);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		JLabel label_1 = new JLabel("Criterios:");
		label_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_1.setBounds(64, 104, 261, 26);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Criterios de ordenamiento:");
		label_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_2.setBounds(64, 219, 261, 37);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(74, 141, 8, 8);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("N\u00FAmero de ticket: 205");
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_4.setBounds(86, 135, 183, 21);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("-");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(74, 166, 8, 8);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(74, 191, 8, 8);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("-");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(409, 141, 8, 8);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("-");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(409, 166, 8, 8);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(409, 191, 8, 8);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("-");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(803, 141, 8, 8);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("N\u00FAmero de legajo: 15");
		label_11.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_11.setBounds(86, 160, 183, 21);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Clasificaci\u00F3n actual del ticket: Otros ");
		label_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_12.setBounds(86, 185, 270, 21);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Estado actual del ticket: Abierto derivado");
		label_13.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_13.setBounds(419, 135, 282, 21);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Fecha Apertura: 04/09/2000");
		label_14.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_14.setBounds(419, 160, 282, 21);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Fecha del \u00FAltimo cambio de estado: 11/01/2005");
		label_15.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_15.setBounds(419, 185, 324, 21);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: Mesa de ayuda");
		label_16.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_16.setBounds(815, 135, 509, 21);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("-");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(803, 166, 8, 8);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Clasificaci\u00F3n actual del ticket en forma ascendente");
		label_18.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_18.setBounds(815, 160, 361, 21);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("N\u00FAmero de ticket");
		label_19.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_19.setBounds(95, 259, 261, 21);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("1.");
		label_20.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_20.setBounds(74, 256, 96, 26);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("2.");
		label_21.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_21.setBounds(368, 254, 96, 26);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("Clasificaci\u00F3n actual del ticket");
		label_22.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_22.setBounds(389, 259, 261, 21);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("Clasificaci\u00F3n        de 23");
		label_23.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		label_23.setBounds(560, 293, 207, 37);
		panel.add(label_23);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(681, 301, 33, 22);
		panel.add(textField);
		
		JLabel label_24 = new JLabel("Datos de la clasificaci\u00F3n:");
		label_24.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_24.setBounds(64, 334, 329, 37);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("Nombre:");
		label_25.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_25.setBounds(74, 378, 78, 21);
		panel.add(label_25);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(164, 379, 440, 20);
		panel.add(textField_1);
		
		JLabel label_26 = new JLabel("Tickets asociados:");
		label_26.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_26.setBounds(64, 414, 261, 37);
		panel.add(label_26);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 464, 1171, 176);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Legajo", "Estado actual","Fecha de apertura","Ultimo grupo de resolucion"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Cerrar");
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button.setBounds(1000, 670, 133, 28);
		panel.add(button);
		
		JButton button_1 = new JButton("Imprimir");
		button_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button_1.setBounds(1187, 670, 133, 28);
		panel.add(button_1);
		
		JButton button_2 = new JButton("<");
		button_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_2.setBounds(797, 301, 44, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton(">");
		button_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_3.setBounds(843, 301, 42, 25);
		panel.add(button_3);
		
	}
}