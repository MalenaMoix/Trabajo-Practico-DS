package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazBorrarClasificacionTicket extends JFrame {

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
					InterfazBorrarClasificacionTicket frame = new InterfazBorrarClasificacionTicket();
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
	public InterfazBorrarClasificacionTicket() {
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
		
		JLabel lblNewLabel = new JLabel("Borrar clasificaci\u00F3n de ticket");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblNewLabel.setBounds(396, 20, 558, 54);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		JLabel lblDatosDeLa = new JLabel("Clasificaci\u00F3n a borrar:");
		lblDatosDeLa.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblDatosDeLa.setBounds(295, 163, 233, 25);
		contentPane.add(lblDatosDeLa);
		
		JLabel lblCodigoNumerico = new JLabel("C\u00F3digo num\u00E9rico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(450, 254, 203, 25);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(450, 319, 203, 25);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(450, 375, 203, 31);
		contentPane.add(lblEstado);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBackground(new Color(220, 220, 220));
		textField.setEditable(false);
		textField.setBounds(665, 380, 369, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(665, 321, 369, 24);
		contentPane.add(textField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(665, 450, 369, 114);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(665, 256, 369, 24);
		contentPane.add(textField_2);
		
		JLabel lblDescripcinCompleta = new JLabel("Descripci\u00F3n completa:");
		lblDescripcinCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcinCompleta.setBounds(450, 446, 203, 25);
		contentPane.add(lblDescripcinCompleta);
		
		JButton btnDerivar = new JButton("Confirmar");
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No es posible eliminar esta clasificaci�n de ticket ya que fue utilizada anteriormente.");
				JOptionPane.showMessageDialog(null, "Desea borrar esta clasificaci�n de ticket?");
			}
		});
		btnDerivar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnDerivar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnDerivar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnNewButton.setBounds(1207, 650, 133, 37);
		contentPane.add(btnNewButton);
		
		
	}
}
