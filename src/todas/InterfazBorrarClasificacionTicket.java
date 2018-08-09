package todas;

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
	private JTextField textFieldEstado;
	private JTextField textFieldNombre;
	private JTextField textFieldCodigoNumerico;

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
		
		JLabel lblBorrarClasificacionTicket = new JLabel("Borrar clasificaci\u00F3n de ticket");
		lblBorrarClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblBorrarClasificacionTicket.setBounds(396, 20, 558, 54);
		contentPane.add(lblBorrarClasificacionTicket);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		contentPane.add(separator);
		
		JLabel lblClasificacionABorrar = new JLabel("Clasificaci\u00F3n a borrar:");
		lblClasificacionABorrar.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblClasificacionABorrar.setBounds(295, 163, 233, 25);
		contentPane.add(lblClasificacionABorrar);
		
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
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setEditable(false);
		textFieldEstado.setBounds(665, 380, 369, 24);
		contentPane.add(textFieldEstado);
		textFieldEstado.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(665, 321, 369, 24);
		contentPane.add(textFieldNombre);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(665, 450, 369, 114);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		
		textFieldCodigoNumerico = new JTextField();
		textFieldCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigoNumerico.setEditable(false);
		textFieldCodigoNumerico.setColumns(10);
		textFieldCodigoNumerico.setBackground(new Color(220, 220, 220));
		textFieldCodigoNumerico.setBounds(665, 256, 369, 24);
		contentPane.add(textFieldCodigoNumerico);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripci\u00F3n completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(450, 446, 203, 25);
		contentPane.add(lblDescripcionCompleta);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No es posible eliminar esta clasificaci�n de ticket ya que fue utilizada anteriormente.");
				JOptionPane.showMessageDialog(null, "Desea borrar esta clasificaci�n de ticket?");
			}
		});
		
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1020, 650, 133, 37);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		contentPane.add(btnCancelar);
	}
}