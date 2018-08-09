package interfacesGraficas;

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
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;


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


	public InterfazConsultarTicket() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\Dise�o de Sistemas\\cool-flame-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 280, 1059, 314);
		contentPane.add(scrollPane);
		
		
		JLabel lblConsultarTickets = new JLabel("Consultar ticket");
		lblConsultarTickets.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConsultarTickets.setBounds(514, 20, 319, 46);
		contentPane.add(lblConsultarTickets);
		
		JLabel lblCriterios = new JLabel("Criterios de busqueda:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(36, 97, 261, 26);
		contentPane.add(lblCriterios);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicket.setBounds(46, 128, 134, 21);
		contentPane.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajo.setBounds(46, 153, 135, 21);
		contentPane.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificacion actual del ticket:  ");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActual.setBounds(402, 128, 209, 21);
		contentPane.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActual.setBounds(402, 153, 167, 21);
		contentPane.add(lblEstadoActual);
		
		JLabel lblUltimoGrupo = new JLabel("-Utimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupo.setBounds(870, 128, 261, 21);
		contentPane.add(lblUltimoGrupo);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha ultimo cambio de estado: ");
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambio.setBounds(870, 153, 222, 21);
		contentPane.add(lblFechaUltimoCambio);
		
		JLabel label_13 = new JLabel("/");
		label_13.setBounds(1189, 158, 13, 15);
		contentPane.add(label_13);
		
		JLabel label_17 = new JLabel("/");
		label_17.setBounds(244, 183, 8, 15);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("/");
		label_18.setBounds(306, 183, 13, 14);
		contentPane.add(label_18);
		
		JLabel label_14 = new JLabel("/");
		label_14.setBounds(1252, 158, 13, 14);
		contentPane.add(label_14);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaApertura.setBounds(46, 178, 119, 21);
		contentPane.add(lblFechaApertura);
		
		
		
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
			new String[] {"Ticket", "Legajo", "Fecha apertura", "Hora apertura", "Operador", "Clasificacion actual", "Estado actual", "Ultimo cambio estado"}
		));
		
		scrollPane.setViewportView(table_1);
		
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroTicket.setColumns(10);
		txtNumeroTicket.setBounds(190, 131, 185, 20);
		contentPane.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBounds(190, 156, 185, 20);
		contentPane.add(txtNumeroLegajo);
		
		
		JComboBox comboBoxClasificacionActual = new JComboBox();
		comboBoxClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacionActual.setEditable(true);
		comboBoxClasificacionActual.setBounds(611, 129, 230, 20);
		contentPane.add(comboBoxClasificacionActual);
		
		JComboBox comboBoxEstadoActual = new JComboBox();
		comboBoxEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxEstadoActual.setEditable(true);
		comboBoxEstadoActual.setBounds(611, 156, 230, 20);
		contentPane.add(comboBoxEstadoActual);
		
		JComboBox comboBoxUltimoGrupo = new JComboBox();
		comboBoxUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxUltimoGrupo.setEditable(true);
		comboBoxUltimoGrupo.setBounds(1135, 129, 185, 20);
		contentPane.add(comboBoxUltimoGrupo);
		
		JComboBox comboBoxDiaCambio = new JComboBox();
		comboBoxDiaCambio.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDiaCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxDiaCambio.setEditable(true);
		comboBoxDiaCambio.setBounds(1135, 155, 52, 22);
		contentPane.add(comboBoxDiaCambio);
		
		JComboBox comboBoxMesCambio = new JComboBox();
		comboBoxMesCambio.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMesCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxMesCambio.setEditable(true);
		comboBoxMesCambio.setBounds(1197, 155, 52, 22);
		contentPane.add(comboBoxMesCambio);
		
		JComboBox comboBoxAnioCambio = new JComboBox();
		comboBoxAnioCambio.setModel(new DefaultComboBoxModel(new String[] {"AAAA"}));
		comboBoxAnioCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxAnioCambio.setEditable(true);
		comboBoxAnioCambio.setBounds(1258, 155, 62, 22);
		contentPane.add(comboBoxAnioCambio);
		
		JComboBox comboBoxDiaApertura = new JComboBox();
		comboBoxDiaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxDiaApertura.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDiaApertura.setEditable(true);
		comboBoxDiaApertura.setBounds(190, 179, 52, 22);
		contentPane.add(comboBoxDiaApertura);
		
		JComboBox comboBoxMesApertura = new JComboBox();
		comboBoxMesApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxMesApertura.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMesApertura.setEditable(true);
		comboBoxMesApertura.setBounds(252, 179, 52, 22);
		contentPane.add(comboBoxMesApertura);
		
		JComboBox comboBoxAnioApertura = new JComboBox();
		comboBoxAnioApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxAnioApertura.setModel(new DefaultComboBoxModel(new String[] {"AAAA"}));
		comboBoxAnioApertura.setEditable(true);
		comboBoxAnioApertura.setBounds(313, 179, 62, 22);
		contentPane.add(comboBoxAnioApertura);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(455, 650, 133, 37);
		contentPane.add(btnImprimir);
		
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrarTicket.setBounds(833, 650, 133, 37);
		contentPane.add(btnCerrarTicket);
		
		JButton btnVetTicket = new JButton("Ver ticket");
		btnVetTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVetTicket.setBounds(646, 650, 133, 37);
		contentPane.add(btnVetTicket);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1119, 218, 133, 37);
		contentPane.add(btnBuscar);
		
		
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazCerrarTicket cerrarticket=new InterfazCerrarTicket();
				cerrarticket.setVisible(true);
				InterfazConsultarTicket.this.dispose();
			}
		});
		
		
		btnVetTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazVisualizacionTicket verticket=new InterfazVisualizacionTicket();
				verticket.setVisible(true);
				InterfazConsultarTicket.this.dispose();
			}
		});
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen tickets que cumplan con los criterios ingresados.");
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});		
	}
}