package todas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class InterfazConsultarIntervenciones extends JFrame {

	private JPanel contentPane;
	public static JTextField txtNumeroTicket;
	public static JTextField txtNumeroLegajo;
	public static JTextField txtFechaDesde;
	public static JTextField txtFechaHasta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazConsultarIntervenciones frame = new InterfazConsultarIntervenciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfazConsultarIntervenciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setTitle("La llamita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultasRealizadas = new JLabel("Consultar intervenciones asignadas");
		lblConsultasRealizadas.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblConsultasRealizadas.setBounds(328, 20, 692, 51);
		contentPane.add(lblConsultasRealizadas);
		
		JLabel lblNumeroTicket = new JLabel("N\u00FAmero ticket:");
		lblNumeroTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroTicket.setBounds(426, 184, 195, 16);
		contentPane.add(lblNumeroTicket);
		
		JLabel lblNumeroLegajo = new JLabel("N\u00FAmero legajo:");
		lblNumeroLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNumeroLegajo.setBounds(426, 273, 195, 25);
		contentPane.add(lblNumeroLegajo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(426, 367, 195, 16);
		contentPane.add(lblEstado);
		
		JLabel lblFechaDesde = new JLabel("Fecha desde:");
		lblFechaDesde.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaDesde.setBounds(426, 454, 195, 16);
		contentPane.add(lblFechaDesde);
		
		JLabel lblFechaHasta = new JLabel("Fecha hasta:");
		lblFechaHasta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblFechaHasta.setBounds(426, 535, 195, 16);
		contentPane.add(lblFechaHasta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Asignada", "Interrumpida", "Terminada", "Todos"}));
		comboBox.setBounds(630, 363, 267, 27);
		contentPane.add(comboBox);
		
		txtNumeroTicket = new JTextField();
		txtNumeroTicket.setBounds(630, 182, 270, 27);
		contentPane.add(txtNumeroTicket);
		txtNumeroTicket.setColumns(10);
		
		txtNumeroLegajo = new JTextField();
		txtNumeroLegajo.setBounds(630, 275, 267, 27);
		contentPane.add(txtNumeroLegajo);
		txtNumeroLegajo.setColumns(10);
		
		txtFechaDesde = new JTextField();
		txtFechaDesde.setBounds(630, 452, 270, 27);
		contentPane.add(txtFechaDesde);
		txtFechaDesde.setColumns(10);
		
		txtFechaHasta = new JTextField();
		txtFechaHasta.setBounds(630, 533, 270, 27);
		contentPane.add(txtFechaHasta);
		txtFechaHasta.setColumns(10);
		
		JLabel fecha1 = new JLabel("* Fecha desde debe ser mayor a fecha hasta.");
		fecha1.setBackground(new Color(240, 240, 240));
		fecha1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		fecha1.setForeground(Color.RED);
		fecha1.setBounds(950, 454, 400, 20);
		fecha1.setVisible(false);
		contentPane.add(fecha1);
		
		JLabel fecha2 = new JLabel("* Fecha hasta debe ser mayor a la fecha actual.");
		fecha2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		fecha2.setForeground(Color.RED);
		fecha2.setBounds(950, 535, 400, 20);
		fecha2.setVisible(false);
		contentPane.add(fecha2);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "No existen tickets que cumplan con los criterios ingresados.");
			
			InterfazConsultarIntervencionesPaginacion comentario = new InterfazConsultarIntervencionesPaginacion();
			comentario.setVisible(true);
			InterfazConsultarIntervenciones.this.dispose();
			
			}
		});
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnBuscar);
	}
}
