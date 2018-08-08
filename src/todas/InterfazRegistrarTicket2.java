package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class InterfazRegistrarTicket2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRegistrarTicket2 frame = new InterfazRegistrarTicket2();
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
	public InterfazRegistrarTicket2() {
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
		
		JButton btnDerivarTicket = new JButton("Derivar ticket");
		btnDerivarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnDerivarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazDerivarTicket1 derivoticket = new InterfazDerivarTicket1();
				derivoticket.setVisible(true);
				InterfazRegistrarTicket2.this.dispose();
				
			}
		});
		btnDerivarTicket.setBounds(1207, 655, 133, 37);
		contentPane.add(btnDerivarTicket);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazCerrarTicket cierroticket = new InterfazCerrarTicket();
				cierroticket.setVisible(true);
				InterfazRegistrarTicket2.this.dispose();
			}
		});
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		btnCerrarTicket.setBounds(1020, 655, 133, 37);
		contentPane.add(btnCerrarTicket);
		
		JLabel lblRegistrarTicket = new JLabel("Registrar ticket");
		lblRegistrarTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarTicket.setBounds(532, 20, 298, 54);
		contentPane.add(lblRegistrarTicket);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(301, 90, 760, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(503, 253, 520, 320);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblObservaciones.setBounds(319, 251, 133, 27);
		contentPane.add(lblObservaciones);
		
		JLabel lblNumeroDeTicket = new JLabel("Numero de ticket:");
		lblNumeroDeTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNumeroDeTicket.setBounds(319, 152, 175, 27);
		contentPane.add(lblNumeroDeTicket);
		
		JLabel lblNumeroDeLegajo = new JLabel("Numero de Legajo:");
		lblNumeroDeLegajo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNumeroDeLegajo.setBounds(319, 192, 176, 27);
		contentPane.add(lblNumeroDeLegajo);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(503, 158, 520, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(503, 198, 520, 22);
		contentPane.add(textField_1);
		textField_1.setEditable(false);
	}
}
