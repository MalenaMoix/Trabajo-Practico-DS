package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Toolkit;
import javax.swing.JSeparator;

public class InterfazCerrarTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTicket;
	private JTextField textFieldLegajo;
	private JTextField textFieldNuevoEstado;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCerrarTicket frame = new InterfazCerrarTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazCerrarTicket() {
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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		TextArea textAreaObservaciones = new TextArea();
		textAreaObservaciones.setBounds(701, 420, 345, 160);
		contentPane.add(textAreaObservaciones);
		
		
		JLabel lblCerrarTicket = new JLabel("Cerrar ticket\r\n");
		lblCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblCerrarTicket.setToolTipText("");
		lblCerrarTicket.setBounds(547, 20, 255, 47);
		contentPane.add(lblCerrarTicket);
		
		JLabel lblTicket = new JLabel("Ticket: ");
		lblTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblTicket.setBounds(498, 180, 148, 26);
		contentPane.add(lblTicket);
		
		JLabel lblLegajo = new JLabel("Legajo: ");
		lblLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblLegajo.setBounds(498, 260, 148, 30);
		contentPane.add(lblLegajo);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado: ");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNuevoEstado.setBounds(498, 340, 148, 29);
		contentPane.add(lblNuevoEstado);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblObservaciones.setBounds(498, 420, 148, 26);
		contentPane.add(lblObservaciones);
		
		JLabel errorObsVacio = new JLabel("* Este campo no puede ser estar vacio.");
		errorObsVacio.setBounds(1083, 423, 241, 26);
		errorObsVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorObsVacio.setForeground(Color.RED);
		contentPane.add(errorObsVacio);
		errorObsVacio.setVisible(false);
		
		
		textFieldTicket = new JTextField();
		textFieldTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldTicket.setBounds(701, 184, 200, 24);
		contentPane.add(textFieldTicket);
		textFieldTicket.setColumns(10);
		
		textFieldLegajo = new JTextField();
		textFieldLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldLegajo.setBounds(701, 266, 200, 24);
		contentPane.add(textFieldLegajo);
		textFieldLegajo.setColumns(10);
		
		textFieldNuevoEstado = new JTextField();
		textFieldNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNuevoEstado.setBounds(701, 345, 200, 24);
		contentPane.add(textFieldNuevoEstado);
		textFieldNuevoEstado.setColumns(10);
		
		
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrarTicket.setBounds(1020, 650, 133, 37);
		contentPane.add(btnCerrarTicket);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
		
		
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textAreaObservaciones.getText().isEmpty()) {
					errorObsVacio.setVisible(true);
				}
				
				int dialogButton = JOptionPane.YES_NO_OPTION;
			    JOptionPane.showConfirmDialog (null, "Desea cerrar el ticket?","Warning",dialogButton);
			    if (dialogButton == JOptionPane.YES_OPTION) {
			    	//Pasa algo
			    }
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
