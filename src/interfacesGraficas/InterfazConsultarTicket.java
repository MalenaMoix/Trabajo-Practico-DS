package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterfazConsultarTicket extends JPanel {
	
	private JFrame ventana;
	private JTable table;
	private JTable table_1;
	private JTextField txtNumeroTicket;
	private JTextField txtNumeroLegajo;

	public InterfazConsultarTicket(JFrame frame) {
		
		//OPCIONES DE BUSQUEDA NO EXCLUYENTES
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(275, 90, 800, 2);
		this.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 280, 1059, 314);
		this.add(scrollPane);
		
		
		JLabel lblConsultarTickets = new JLabel("Consultar ticket");
		lblConsultarTickets.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConsultarTickets.setBounds(514, 20, 319, 46);
		this.add(lblConsultarTickets);
		
		JLabel lblCriterios = new JLabel("Criterios de busqueda:");
		lblCriterios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriterios.setBounds(36, 97, 261, 26);
		this.add(lblCriterios);
		
		JLabel lblNumeroTicket = new JLabel("-Numero de ticket: ");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroTicket.setBounds(46, 128, 134, 21);
		this.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("-Numero de legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblNumeroLegajo.setBounds(46, 153, 135, 21);
		this.add(lblNumeroLegajo);
		
		JLabel lblClasificacionActual = new JLabel("-Clasificacion actual del ticket:  ");
		lblClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblClasificacionActual.setBounds(402, 128, 209, 21);
		this.add(lblClasificacionActual);
		
		JLabel lblEstadoActual = new JLabel("-Estado actual del ticket: ");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstadoActual.setBounds(402, 153, 167, 21);
		this.add(lblEstadoActual);
		
		JLabel lblUltimoGrupo = new JLabel("-Utimo grupo de resolucion asignado: ");
		lblUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblUltimoGrupo.setBounds(870, 128, 261, 21);
		this.add(lblUltimoGrupo);
		
		JLabel lblFechaUltimoCambio = new JLabel("-Fecha ultimo cambio de estado: ");
		lblFechaUltimoCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaUltimoCambio.setBounds(870, 153, 222, 21);
		this.add(lblFechaUltimoCambio);
		
		JLabel label_13 = new JLabel("/");
		label_13.setBounds(1189, 158, 13, 15);
		this.add(label_13);
		
		JLabel label_17 = new JLabel("/");
		label_17.setBounds(244, 183, 8, 15);
		this.add(label_17);
		
		JLabel label_18 = new JLabel("/");
		label_18.setBounds(306, 183, 13, 14);
		this.add(label_18);
		
		JLabel label_14 = new JLabel("/");
		label_14.setBounds(1252, 158, 13, 14);
		this.add(label_14);
		
		JLabel lblFechaApertura = new JLabel("-Fecha Apertura: ");
		lblFechaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblFechaApertura.setBounds(46, 178, 119, 21);
		this.add(lblFechaApertura);
		
		
		
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
		this.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNumeroLegajo.setColumns(10);
		txtNumeroLegajo.setBounds(190, 156, 185, 20);
		this.add(txtNumeroLegajo);
		
		
		JComboBox comboBoxClasificacionActual = new JComboBox();
		comboBoxClasificacionActual.setModel(new DefaultComboBoxModel(new String[] {"Todas", "Configuracion de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificaci\u00F3n en los perfiles de usuarios", "Problemas con el correo electr\u00F3nico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticaci\u00F3n", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalaci\u00F3n de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacionActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxClasificacionActual.setEditable(true);
		comboBoxClasificacionActual.setBounds(611, 129, 230, 20);
		this.add(comboBoxClasificacionActual);
		
		JComboBox comboBoxEstadoActual = new JComboBox();
		comboBoxEstadoActual.setModel(new DefaultComboBoxModel(new String[] {"Abierto en Mesa de Ayuda", "Abierto derivado", "Abierto sin derivar", "Cerrado", "Solucionado en la espera de OK", "Todos"}));
		comboBoxEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxEstadoActual.setEditable(true);
		comboBoxEstadoActual.setBounds(611, 156, 230, 20);
		this.add(comboBoxEstadoActual);
		
		JComboBox comboBoxUltimoGrupo = new JComboBox();
		comboBoxUltimoGrupo.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electr\u00F3nico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio t\u00E9cnico", "Unidades de soporte"}));
		comboBoxUltimoGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxUltimoGrupo.setEditable(true);
		comboBoxUltimoGrupo.setBounds(1135, 129, 185, 20);
		this.add(comboBoxUltimoGrupo);
		
		JComboBox comboBoxDiaCambio = new JComboBox();
		comboBoxDiaCambio.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDiaCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxDiaCambio.setEditable(true);
		comboBoxDiaCambio.setBounds(1135, 155, 52, 22);
		this.add(comboBoxDiaCambio);
		
		JComboBox comboBoxMesCambio = new JComboBox();
		comboBoxMesCambio.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMesCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxMesCambio.setEditable(true);
		comboBoxMesCambio.setBounds(1197, 155, 52, 22);
		this.add(comboBoxMesCambio);
		
		JComboBox comboBoxAnioCambio = new JComboBox();
		comboBoxAnioCambio.setModel(new DefaultComboBoxModel(new String[] {"AAAA", "2018"}));
		comboBoxAnioCambio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxAnioCambio.setEditable(true);
		comboBoxAnioCambio.setBounds(1258, 155, 62, 22);
		this.add(comboBoxAnioCambio);
		
		JComboBox comboBoxDiaApertura = new JComboBox();
		comboBoxDiaApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxDiaApertura.setModel(new DefaultComboBoxModel(new String[] {"DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDiaApertura.setEditable(true);
		comboBoxDiaApertura.setBounds(190, 179, 52, 22);
		this.add(comboBoxDiaApertura);
		
		JComboBox comboBoxMesApertura = new JComboBox();
		comboBoxMesApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxMesApertura.setModel(new DefaultComboBoxModel(new String[] {"MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMesApertura.setEditable(true);
		comboBoxMesApertura.setBounds(252, 179, 52, 22);
		this.add(comboBoxMesApertura);
		
		JComboBox comboBoxAnioApertura = new JComboBox();
		comboBoxAnioApertura.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		comboBoxAnioApertura.setModel(new DefaultComboBoxModel(new String[] {"AAAA", "2018"}));
		comboBoxAnioApertura.setEditable(true);
		comboBoxAnioApertura.setBounds(313, 179, 62, 22);
		this.add(comboBoxAnioApertura);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnImprimir.setBounds(455, 650, 133, 37);
		this.add(btnImprimir);
		
		JButton btnDerivar = new JButton("Derivar ticket");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		this.add(btnDerivar);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrarTicket.setBounds(833, 650, 133, 37);
		this.add(btnCerrarTicket);
		
		JButton btnVetTicket = new JButton("Ver ticket");
		btnVetTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnVetTicket.setBounds(646, 650, 133, 37);
		this.add(btnVetTicket);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1119, 218, 133, 37);
		this.add(btnBuscar);
		
		
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazCerrarTicket(ventana));
				ventana.pack();
			}
		});
		
		
		btnVetTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setContentPane(new InterfazVisualizacionTicket(ventana));
				ventana.pack();
			}
		});
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen tickets que cumplan con los criterios ingresados.");
				JOptionPane.showMessageDialog(null, "Fecha de apertura invalida. Vuelva a ingresarla.");
				JOptionPane.showMessageDialog(null, "Fecha ultimo cambio de estado invalida. Vuelva a ingresarla.");
				
				//MOSTRAR RESULTADOS EN LA TABLA
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new HomeMesaAyuda(ventana));
				ventana.pack();
			}
		});		
	}
}