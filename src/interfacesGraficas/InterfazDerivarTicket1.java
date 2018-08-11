package interfacesGraficas;

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
import javax.swing.JRadioButton;

public class InterfazDerivarTicket1 extends JFrame {

	private JPanel contentPane;

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


	public InterfazDerivarTicket1() {
		
		//LA LISTA DE GRUPO RESOLUCION DEPENDE DE LA CLASIFICACION DEL PROBLEMA
		
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
		
		JLabel lblSeleccione = new JLabel("Seleccione grupo de resolucion:");
		lblSeleccione.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblSeleccione.setBounds(364, 130, 262, 31);
		contentPane.add(lblSeleccione);
		
		
		
		JRadioButton radioButtonMesaAyuda = new JRadioButton("Mesa de ayuda");
		radioButtonMesaAyuda.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonMesaAyuda.setBackground(new Color(230, 230, 250));
		radioButtonMesaAyuda.setBounds(658, 169, 222, 23);
		contentPane.add(radioButtonMesaAyuda);
		
		JRadioButton radioButtonUnidadesSoporte = new JRadioButton("Unidades de soporte");
		radioButtonUnidadesSoporte.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonUnidadesSoporte.setBackground(new Color(230, 230, 250));
		radioButtonUnidadesSoporte.setBounds(658, 212, 222, 23);
		contentPane.add(radioButtonUnidadesSoporte);
		
		JRadioButton radioButtonServicioTecnico = new JRadioButton("Servicio tecnico");
		radioButtonServicioTecnico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonServicioTecnico.setBackground(new Color(230, 230, 250));
		radioButtonServicioTecnico.setBounds(658, 253, 222, 23);
		contentPane.add(radioButtonServicioTecnico);
		
		JRadioButton radioButtonAdministradorDeBD = new JRadioButton("Administrador de Base de Datos");
		radioButtonAdministradorDeBD.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorDeBD.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorDeBD.setBounds(658, 293, 262, 23);
		contentPane.add(radioButtonAdministradorDeBD);
		
		JRadioButton radioButtonAdministradorSuseLinux = new JRadioButton("Administrador SUSE Linux");
		radioButtonAdministradorSuseLinux.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorSuseLinux.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorSuseLinux.setBounds(658, 333, 222, 23);
		contentPane.add(radioButtonAdministradorSuseLinux);
		
		JRadioButton radioButtonAdministradorProxy = new JRadioButton("Administrador Proxy y correo electronico");
		radioButtonAdministradorProxy.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorProxy.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorProxy.setBounds(658, 374, 317, 23);
		contentPane.add(radioButtonAdministradorProxy);
		
		JRadioButton radioButtonAdministradorDebian = new JRadioButton("Administrador DEBIAN");
		radioButtonAdministradorDebian.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonAdministradorDebian.setBackground(new Color(230, 230, 250));
		radioButtonAdministradorDebian.setBounds(658, 416, 222, 23);
		contentPane.add(radioButtonAdministradorDebian);
		
		JRadioButton radioButtonRedesLan = new JRadioButton("Redes LAN");
		radioButtonRedesLan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonRedesLan.setBackground(new Color(230, 230, 250));
		radioButtonRedesLan.setBounds(658, 457, 222, 23);
		contentPane.add(radioButtonRedesLan);
		
		JRadioButton radioButtonComunicaciones = new JRadioButton("Comunicaciones");
		radioButtonComunicaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonComunicaciones.setBackground(new Color(230, 230, 250));
		radioButtonComunicaciones.setBounds(658, 499, 222, 23);
		contentPane.add(radioButtonComunicaciones);
		
		JRadioButton radioButtonDesarrolloSistemaComercial = new JRadioButton("Desarrollo Sistema Comercial");
		radioButtonDesarrolloSistemaComercial.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaComercial.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaComercial.setBounds(658, 541, 242, 23);
		contentPane.add(radioButtonDesarrolloSistemaComercial);
		
		JRadioButton radioButtonDesarrolloSistemaRRHH = new JRadioButton("Desarrollo Sistema RRHH");
		radioButtonDesarrolloSistemaRRHH.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaRRHH.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaRRHH.setBounds(658, 584, 222, 23);
		contentPane.add(radioButtonDesarrolloSistemaRRHH);
		
		JRadioButton radioButtonDesarrolloSistemaReclamos = new JRadioButton("Desarrollo Sistema de Reclamos");
		radioButtonDesarrolloSistemaReclamos.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		radioButtonDesarrolloSistemaReclamos.setBackground(new Color(230, 230, 250));
		radioButtonDesarrolloSistemaReclamos.setBounds(658, 626, 242, 23);
		contentPane.add(radioButtonDesarrolloSistemaReclamos);
		
		
		
		JButton btnDerivar = new JButton("Derivar");
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnDerivar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnAtras.setBounds(1207, 655, 133, 37);
		contentPane.add(btnAtras);
		
		
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazRegistrarTicket2 volver = new InterfazRegistrarTicket2();
				volver.setVisible(true);
				InterfazDerivarTicket1.this.dispose();
			}
		});
	}
}
