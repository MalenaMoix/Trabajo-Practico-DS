package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class InterfazDerivarTicket1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDerivarTicket1 frame = new InterfazDerivarTicket1();
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
	public InterfazDerivarTicket1() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1366, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(230, 230, 250));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(301, 90, 760, 2);
		contentPane.add(separator);
		
		JLabel lblDerivarTicket = new JLabel("Derivar ticket");
		lblDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblDerivarTicket.setBounds(550, 20, 262, 54);
		contentPane.add(lblDerivarTicket);
		
		JButton btnNewButton = new JButton("Derivar");
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(1020, 655, 133, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazRegistrarTicket2 volver = new InterfazRegistrarTicket2();
				volver.setVisible(true);
				InterfazDerivarTicket1.this.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnNewButton_1.setBounds(1207, 655, 133, 37);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mesa de ayuda");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton.setBounds(658, 169, 222, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Unidades de soporte");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton_1.setBounds(658, 212, 222, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnServicioTecnico = new JRadioButton("Servicio tecnico");
		rdbtnServicioTecnico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnServicioTecnico.setBackground(new Color(230, 230, 250));
		rdbtnServicioTecnico.setBounds(658, 253, 222, 23);
		contentPane.add(rdbtnServicioTecnico);
		
		JRadioButton rdbtnAdministradorDeBase = new JRadioButton("Administrador de Base de Datos");
		rdbtnAdministradorDeBase.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnAdministradorDeBase.setBackground(new Color(230, 230, 250));
		rdbtnAdministradorDeBase.setBounds(658, 293, 262, 23);
		contentPane.add(rdbtnAdministradorDeBase);
		
		JRadioButton rdbtnAdministradorSuseLinux = new JRadioButton("Administrador SUSE Linux");
		rdbtnAdministradorSuseLinux.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnAdministradorSuseLinux.setBackground(new Color(230, 230, 250));
		rdbtnAdministradorSuseLinux.setBounds(658, 333, 222, 23);
		contentPane.add(rdbtnAdministradorSuseLinux);
		
		JRadioButton rdbtnAdministradorProxyY = new JRadioButton("Administrador Proxy y correo electr\u00F3nico");
		rdbtnAdministradorProxyY.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnAdministradorProxyY.setBackground(new Color(230, 230, 250));
		rdbtnAdministradorProxyY.setBounds(658, 374, 317, 23);
		contentPane.add(rdbtnAdministradorProxyY);
		
		JRadioButton rdbtnAdministradorDebian = new JRadioButton("Administrador DEBIAN");
		rdbtnAdministradorDebian.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnAdministradorDebian.setBackground(new Color(230, 230, 250));
		rdbtnAdministradorDebian.setBounds(658, 416, 222, 23);
		contentPane.add(rdbtnAdministradorDebian);
		
		JRadioButton rdbtnRedesLan = new JRadioButton("Redes LAN");
		rdbtnRedesLan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnRedesLan.setBackground(new Color(230, 230, 250));
		rdbtnRedesLan.setBounds(658, 457, 222, 23);
		contentPane.add(rdbtnRedesLan);
		
		JRadioButton rdbtnComunicaciones = new JRadioButton("Comunicaciones");
		rdbtnComunicaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnComunicaciones.setBackground(new Color(230, 230, 250));
		rdbtnComunicaciones.setBounds(658, 499, 222, 23);
		contentPane.add(rdbtnComunicaciones);
		
		JRadioButton rdbtnDesarrolloSistemaComercial = new JRadioButton("Desarrollo Sistema Comercial");
		rdbtnDesarrolloSistemaComercial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnDesarrolloSistemaComercial.setBackground(new Color(230, 230, 250));
		rdbtnDesarrolloSistemaComercial.setBounds(658, 541, 242, 23);
		contentPane.add(rdbtnDesarrolloSistemaComercial);
		
		JRadioButton rdbtnDesarrolloSistemaRrhh = new JRadioButton("Desarrollo Sistema RRHH");
		rdbtnDesarrolloSistemaRrhh.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnDesarrolloSistemaRrhh.setBackground(new Color(230, 230, 250));
		rdbtnDesarrolloSistemaRrhh.setBounds(658, 584, 222, 23);
		contentPane.add(rdbtnDesarrolloSistemaRrhh);
		
		JRadioButton rdbtnDesarrolloSistemaDe = new JRadioButton("Desarrollo Sistema de Reclamos");
		rdbtnDesarrolloSistemaDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		rdbtnDesarrolloSistemaDe.setBackground(new Color(230, 230, 250));
		rdbtnDesarrolloSistemaDe.setBounds(658, 626, 242, 23);
		contentPane.add(rdbtnDesarrolloSistemaDe);
		
		JLabel lblSelecioneGupoDe = new JLabel("Seleccione grupo de resoluci\u00F3n:");
		lblSelecioneGupoDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblSelecioneGupoDe.setBounds(364, 130, 262, 31);
		contentPane.add(lblSelecioneGupoDe);
		
		
	}
}
