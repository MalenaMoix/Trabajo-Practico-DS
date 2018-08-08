package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterfazConsultarTicket extends JFrame {
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazConsultarTicket frame = new InterfazConsultarTicket();
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
	public InterfazConsultarTicket() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\Diseño de Sistemas\\cool-flame-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 280, 1059, 314);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		table_1.setModel(new DefaultTableModel(
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
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Ticket", "Legajo", "Fecha apertura", "Hora apertura", "Operador", "Clasificaci\u00F3n actual", "Estado actual", "Ultimo cambio estado"
			}
		));
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Consultar ticket");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(514, 20, 319, 46);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazCerrarTicket cerrarticket=new InterfazCerrarTicket();
				cerrarticket.setVisible(true);
				InterfazConsultarTicket.this.dispose();
			}
		});
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrarTicket.setBounds(833, 650, 133, 37);
		contentPane.add(btnCerrarTicket);
		
		JButton btnVetTicket = new JButton("Ver ticket");
		btnVetTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizacionTicket verticket=new InterfazVisualizacionTicket();
				verticket.setVisible(true);
				InterfazConsultarTicket.this.dispose();
			}
		});
		btnVetTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVetTicket.setBounds(646, 650, 133, 37);
		contentPane.add(btnVetTicket);
		
		JLabel label = new JLabel("Criterios de b\u00FAsqueda:");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		label.setBounds(36, 97, 261, 26);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("N\u00FAmero de ticket: ");
		label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_1.setBounds(58, 128, 122, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(46, 134, 8, 8);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(190, 131, 185, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(190, 156, 185, 20);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("N\u00FAmero de legajo:");
		label_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_3.setBounds(58, 153, 133, 21);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(46, 159, 8, 8);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Clasificaci\u00F3n actual del ticket:  ");
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_5.setBounds(408, 128, 203, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(393, 134, 8, 8);
		contentPane.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox.setEditable(true);
		comboBox.setBounds(611, 129, 230, 20);
		contentPane.add(comboBox);
		
		JLabel label_7 = new JLabel("-");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(393, 159, 8, 8);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Estado actual del ticket: ");
		label_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_8.setBounds(408, 153, 161, 21);
		contentPane.add(label_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(611, 156, 230, 20);
		contentPane.add(comboBox_1);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(867, 134, 8, 8);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u00DAltimo grupo de resoluci\u00F3n asignado: ");
		label_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_10.setBounds(881, 128, 261, 21);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("-");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(867, 159, 8, 8);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Fecha \u00FAltimo cambio de estado: ");
		label_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_12.setBounds(881, 153, 222, 21);
		contentPane.add(label_12);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(1135, 129, 185, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(1135, 155, 52, 22);
		contentPane.add(comboBox_3);
		
		JLabel label_13 = new JLabel("/");
		label_13.setBounds(1189, 158, 13, 15);
		contentPane.add(label_13);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(1197, 155, 52, 22);
		contentPane.add(comboBox_4);
		
		JLabel label_14 = new JLabel("/");
		label_14.setBounds(1252, 158, 13, 14);
		contentPane.add(label_14);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"AAAA"}));
		comboBox_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(1258, 155, 62, 22);
		contentPane.add(comboBox_5);
		
		JLabel label_15 = new JLabel("-");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_15.setBounds(46, 184, 8, 8);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("Fecha Apertura: ");
		label_16.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label_16.setBounds(58, 178, 107, 21);
		contentPane.add(label_16);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_6.setEditable(true);
		comboBox_6.setBounds(190, 179, 52, 22);
		contentPane.add(comboBox_6);
		
		JLabel label_17 = new JLabel("/");
		label_17.setBounds(244, 183, 8, 15);
		contentPane.add(label_17);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_7.setEditable(true);
		comboBox_7.setBounds(252, 179, 52, 22);
		contentPane.add(comboBox_7);
		
		JLabel label_18 = new JLabel("/");
		label_18.setBounds(306, 183, 13, 14);
		contentPane.add(label_18);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"AAAA"}));
		comboBox_8.setEditable(true);
		comboBox_8.setBounds(313, 179, 62, 22);
		contentPane.add(comboBox_8);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(455, 650, 133, 37);
		contentPane.add(btnImprimir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1119, 218, 133, 37);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen tickets que cumplan con los criterios ingresados.");
			}
		});
		contentPane.add(btnBuscar);
		
		
		
	
		}
	}
