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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class InterfazVisualizandoInfoPorGrupoResolucion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorGrupoResolucion frame = new InterfazVisualizandoInfoPorGrupoResolucion();
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
	public InterfazVisualizandoInfoPorGrupoResolucion() {
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
		
		JLabel label = new JLabel("Visualizando informacion por grupo de resolucion");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		label.setBounds(170, 20, 986, 54);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(265, 90, 800, 2);
		panel.add(separator);
		
		JLabel label_1 = new JLabel("Criterios:");
		label_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_1.setBounds(64, 80, 261, 26);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Criterios de ordenamiento:");
		label_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_2.setBounds(64, 188, 261, 37);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(74, 120, 8, 8);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Numero de ticket: 205");
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_4.setBounds(86, 114, 183, 21);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Numero de legajo: 15");
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_5.setBounds(86, 139, 183, 21);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Clasificacion actual del ticket: Otros ");
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_6.setBounds(86, 164, 270, 21);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Estado actual del ticket: Abierto derivado");
		label_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_7.setBounds(419, 114, 282, 21);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Fecha Apertura: 04/09/2000");
		label_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_8.setBounds(419, 139, 282, 21);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Fecha del ultimo cambio de estado: 11/01/2005");
		label_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_9.setBounds(419, 164, 324, 21);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Ultimo grupo de resolucion asignado: Mesa de ayuda");
		label_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_10.setBounds(815, 114, 509, 21);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Ultimo grupo de resolucion en forma ascendente");
		label_11.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_11.setBounds(815, 139, 331, 21);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Numero de ticket");
		label_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_12.setBounds(90, 230, 261, 21);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("1.");
		label_13.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_13.setBounds(74, 227, 96, 26);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("2.");
		label_14.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_14.setBounds(330, 227, 96, 26);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Clasificacion actual del ticket");
		label_15.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_15.setBounds(346, 230, 261, 21);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Grupo de resolucion        de 23");
		label_16.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		label_16.setBounds(522, 270, 282, 37);
		panel.add(label_16);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(710, 278, 33, 22);
		panel.add(textField);
		
		JLabel label_17 = new JLabel("Datos del grupo de resolucion:");
		label_17.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_17.setBounds(64, 310, 329, 37);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Nombre del grupo de resolucion:");
		label_18.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_18.setBounds(74, 352, 232, 21);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("Grafico de torta con la distribucion porcentual de los tickets en base a su estado:");
		label_19.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_19.setBounds(74, 386, 541, 21);
		panel.add(label_19);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(318, 353, 362, 20);
		panel.add(textField_1);
		
		JLabel label_20 = new JLabel("Tickets asociados:");
		label_20.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_20.setBounds(64, 447, 261, 37);
		panel.add(label_20);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 481, 1260, 171);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Fecha de apertura", "Clasificacion actual","Estado actual","Estado de la intervencion","Observaciones registradas","Tiempo real de atencion","Tiempo total asignado"
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
		
		JLabel label_21 = new JLabel("-");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_21.setBounds(74, 144, 8, 8);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("-");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_22.setBounds(74, 169, 8, 8);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("-");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_23.setBounds(409, 119, 8, 8);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("-");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(409, 144, 8, 8);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("-");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(409, 169, 8, 8);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("-");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(803, 119, 8, 8);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("-");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(803, 144, 8, 8);
		panel.add(label_27);
		
		JButton button_2 = new JButton("<");
		button_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_2.setBounds(824, 278, 44, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton(">");
		button_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_3.setBounds(870, 278, 42, 25);
		panel.add(button_3);

	}
}
