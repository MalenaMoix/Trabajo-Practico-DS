package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JSeparator;

public class HomeMesaAyuda extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeMesaAyuda frame = new HomeMesaAyuda();
					frame.setVisible(true);
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public HomeMesaAyuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setBackground(Color.LIGHT_GRAY);
		setTitle("La llamita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1366, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(230, 230, 250));//ESTE ES EL COLOR
		
		JButton btnRegistrarTicket = new JButton("Registrar ticket");
		btnRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnRegistrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazRegistrarTicket1 registro1=new InterfazRegistrarTicket1();
				registro1.setVisible(true);
				HomeMesaAyuda.this.dispose();
			}
		});
		
		btnRegistrarTicket.setBounds(491, 260, 380, 45);
		contentPane.add(btnRegistrarTicket);
		
		JButton btnConsultarTicket = new JButton("Consultar ticket");
		btnConsultarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnConsultarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazConsultarTicket derivar = new InterfazConsultarTicket();
				derivar.setVisible(true);
				HomeMesaAyuda.this.dispose();
			}
		});
		
		btnConsultarTicket.setBounds(491, 345, 380, 45);
		contentPane.add(btnConsultarTicket);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 30));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnSalir.setBounds(491, 428, 380, 45);
		contentPane.add(btnSalir);
		
		JLabel lblLaLlamita = new JLabel("Home: Mesa de Ayuda");
		lblLaLlamita.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblLaLlamita.setBounds(462, 20, 437, 62);
		contentPane.add(lblLaLlamita);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 90, 760, 2);
		contentPane.add(separator);
		
	}
}