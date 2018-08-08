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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Scrollbar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfazVisualizandoInfoPorLegajo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVisualizandoInfoPorLegajo frame = new InterfazVisualizandoInfoPorLegajo();
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
	public InterfazVisualizandoInfoPorLegajo() {
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
		panel.setPreferredSize(new Dimension(1366, 940));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 1366, 940);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Visualizando informaci\u00F3n por legajo");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		label.setBounds(330, 20, 706, 54);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		panel.add(separator);
		
		JLabel lblCriterios = new JLabel("Criterios:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(64, 80, 222, 26);
		panel.add(lblCriterios);
		
		JLabel label_3 = new JLabel("Criterios de ordenamiento:");
		label_3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_3.setBounds(64, 185, 261, 37);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(74, 114, 8, 8);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("N\u00FAmero de ticket: 205");
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_5.setBounds(86, 108, 183, 21);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(74, 139, 8, 8);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("-");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(74, 164, 8, 8);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("-");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(409, 114, 8, 8);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(409, 139, 8, 8);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("-");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(409, 164, 8, 8);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("-");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(803, 114, 8, 8);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("N\u00FAmero de legajo: 15");
		label_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_12.setBounds(86, 133, 183, 21);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Clasificaci\u00F3n actual del ticket: Otros ");
		label_13.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_13.setBounds(86, 158, 270, 21);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Estado actual del ticket: Abierto derivado");
		label_14.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_14.setBounds(419, 108, 282, 21);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Fecha Apertura: 04/09/2000");
		label_15.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_15.setBounds(419, 133, 282, 21);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Fecha del \u00FAltimo cambio de estado: 11/01/2005");
		label_16.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_16.setBounds(419, 158, 324, 21);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: Mesa de ayuda");
		label_17.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_17.setBounds(815, 108, 509, 21);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("-");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(803, 139, 8, 8);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("N\u00FAmero de legajo en forma ascendente");
		label_19.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_19.setBounds(815, 133, 297, 21);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("N\u00FAmero de ticket");
		label_20.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_20.setBounds(90, 225, 141, 21);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("1.");
		label_21.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_21.setBounds(74, 222, 96, 26);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("2.");
		label_22.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_22.setBounds(330, 222, 96, 26);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("Clasificaci\u00F3n actual del ticket");
		label_23.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_23.setBounds(346, 225, 261, 21);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("Legajo        de 23");
		label_24.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		label_24.setBounds(559, 259, 195, 30);
		panel.add(label_24);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(626, 265, 33, 22);
		panel.add(textField);
		
		JLabel label_25 = new JLabel("Datos del usuario:");
		label_25.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_25.setBounds(64, 294, 261, 37);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("N\u00FAmero de legajo:");
		label_26.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_26.setBounds(74, 334, 141, 21);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("Apellido y Nombre:");
		label_27.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_27.setBounds(74, 368, 141, 21);
		panel.add(label_27);
		
		JLabel label_28 = new JLabel("T\u00E9lefono interno:");
		label_28.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_28.setBounds(478, 334, 129, 21);
		panel.add(label_28);
		
		JLabel label_29 = new JLabel("Tel\u00E9fono directo:");
		label_29.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_29.setBounds(478, 368, 129, 21);
		panel.add(label_29);
		
		JLabel label_30 = new JLabel("Ubicaci\u00F3n:");
		label_30.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_30.setBounds(792, 334, 149, 21);
		panel.add(label_30);
		
		JLabel label_31 = new JLabel("Descripci\u00F3n de cargo:");
		label_31.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_31.setBounds(792, 368, 149, 21);
		panel.add(label_31);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(215, 336, 229, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(215, 368, 229, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(606, 336, 149, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(606, 370, 149, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setBounds(953, 336, 312, 20);
		panel.add(textField_5);
		
		JLabel label_32 = new JLabel("Tickets asociados:");
		label_32.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label_32.setBounds(64, 443, 261, 37);
		panel.add(label_32);
		
		
		
		JButton button = new JButton("Cerrar");
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button.setBounds(1000, 665, 133, 28);
		panel.add(button);
		
		JButton button_1 = new JButton("Imprimir");
		button_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button_1.setBounds(1187, 665, 133, 28);
		panel.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 482, 1139, 144);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Fecha de apertura", "Estado", "Fecha ultimo cambio de estado","Clasificacion actual","Ultimo grupo de resolucion","Ultima observacion"
			}
		));
		scrollPane.setViewportView(table);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setBounds(953, 369, 312, 65);
		panel.add(textArea);
		
		JButton button_2 = new JButton("<");
		button_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_2.setBounds(756, 264, 44, 25);
		panel.add(button_2);
		
		JButton button_3 = new JButton(">");
		button_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_3.setBounds(802, 264, 42, 25);
		panel.add(button_3);
		
	}
}