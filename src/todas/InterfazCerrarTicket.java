package todas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		
		
		JLabel lblNewLabel0 = new JLabel("Cerrar ticket\r\n");
		lblNewLabel0.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel0.setToolTipText("");
		lblNewLabel0.setBounds(547, 20, 255, 47);
		contentPane.add(lblNewLabel0);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket: ");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(498, 180, 148, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Legajo: ");
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(498, 260, 148, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nuevo estado: ");
		lblNewLabel_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(498, 340, 148, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblObservaciones = new JLabel("Observaciones: ");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblObservaciones.setBounds(498, 420, 148, 26);
		contentPane.add(lblObservaciones);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBounds(701, 184, 200, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBounds(701, 266, 200, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setBounds(701, 345, 200, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("* Este campo no puede ser estar vacio.");
		lblNewLabel_5.setBounds(1083, 423, 241, 26);
		lblNewLabel_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.RED);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(701, 420, 345, 160);
		contentPane.add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(275, 90, 800, 2);
		contentPane.add(separator);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		button.setBounds(1207, 650, 133, 37);
		contentPane.add(button);
		
		JButton btnCerrarTicket = new JButton("Cerrar ticket");
		btnCerrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textArea.getText().isEmpty()) lblNewLabel_5.setVisible(true);
				
				JOptionPane.showOptionDialog(null, "¿Desea cerrar el ticket?", "Cerrar ticket", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, (Icon) Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\Diseño de Sistemas\\cool-flame-icon.png"), new Object[] {"Sí","No"}, "Sí");
				
			}
		});
		btnCerrarTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCerrarTicket.setBounds(1020, 650, 133, 37);
		contentPane.add(btnCerrarTicket);
		
		
		
		
		
	}
}
