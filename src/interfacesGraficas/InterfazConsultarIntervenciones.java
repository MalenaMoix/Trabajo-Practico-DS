package interfacesGraficas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazConsultarIntervenciones extends JPanel {

	private JFrame ventana;
	public static JTextField txtNumeroTicket;
	public static JTextField txtNumeroLegajo;
	public static JTextField txtFechaDesde;
	public static JTextField txtFechaHasta;

	public InterfazConsultarIntervenciones(JFrame frame) {
		
		//ACTOR : GRUPO DE RESOLUCION
		//PUEDE NO INGRESAR NINGUN CRITERIO
		//UN GRUPO DE RESOLUCION SOLO PUEDE MODIFICAR EL ESTADO DE UNA INTERVENCION ASIGNADA A EL
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		this.add(separator);
		
		
		JLabel lblConsultasRealizadas = new JLabel("Consultar intervenciones asignadas");
		lblConsultasRealizadas.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConsultasRealizadas.setBounds(328, 20, 692, 51);
		this.add(lblConsultasRealizadas);
		
		JLabel lblNumeroTicket = new JLabel("Numero ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroTicket.setBounds(426, 184, 195, 16);
		this.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("Numero legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroLegajo.setBounds(426, 273, 195, 25);
		this.add(lblNumeroLegajo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(426, 367, 195, 16);
		this.add(lblEstado);
		
		JLabel lblFechaDesde = new JLabel("Fecha desde:");
		lblFechaDesde.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaDesde.setBounds(426, 454, 195, 16);
		this.add(lblFechaDesde);
		
		JLabel lblFechaHasta = new JLabel("Fecha hasta:");
		lblFechaHasta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaHasta.setBounds(426, 535, 195, 16);
		this.add(lblFechaHasta);
		
		JLabel errorFechaDesde = new JLabel("* Fecha desde debe ser mayor a fecha hasta.");
		errorFechaDesde.setBackground(new Color(240, 240, 240));
		errorFechaDesde.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorFechaDesde.setForeground(Color.RED);
		errorFechaDesde.setBounds(950, 454, 400, 20);
		errorFechaDesde.setVisible(false);
		this.add(errorFechaDesde);
		
		JLabel errorFechaHasta = new JLabel("* Fecha hasta debe ser mayor a la fecha actual.");
		errorFechaHasta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorFechaHasta.setForeground(Color.RED);
		errorFechaHasta.setBounds(950, 535, 400, 20);
		errorFechaHasta.setVisible(false);
		this.add(errorFechaHasta);
		
		
		JComboBox<String> comboBoxEstado = new JComboBox<String>();
		comboBoxEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxEstado.setForeground(Color.BLACK);
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"Asignada", "En espera", "Terminada", "Todos"}));
		comboBoxEstado.setBounds(630, 363, 267, 27);
		this.add(comboBoxEstado);
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setBounds(630, 182, 270, 27);
		txtNumeroTicket.setColumns(10);
		this.add(txtNumeroTicket);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setBounds(630, 275, 267, 27);
		txtNumeroLegajo.setColumns(10);
		this.add(txtNumeroLegajo);
		
		txtFechaDesde = new JTextField();
		txtFechaDesde.setBounds(630, 452, 270, 27);
		txtFechaDesde.setColumns(10);
		this.add(txtFechaDesde);
		
		txtFechaHasta = new JTextField();
		txtFechaHasta.setBounds(630, 533, 270, 27);
		txtFechaHasta.setColumns(10);
		this.add(txtFechaHasta);
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1020, 650, 133, 37);
		this.add(btnBuscar);
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen intervenciones que cumplan con los criterios ingresados.");

				ventana.setContentPane(new InterfazConsultarIntervencionesPaginacion(ventana, txtNumeroLegajo.getText(), txtNumeroTicket.getText(), txtFechaDesde.getText(), txtFechaHasta.getText(), comboBoxEstado.getSelectedItem()));
				ventana.pack();
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setContentPane(new HomeGrupoResolucion(ventana));
				ventana.pack();
			}
		});
	}
}