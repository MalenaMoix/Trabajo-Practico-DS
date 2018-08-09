package interfacesGraficas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class InterfazModificarComentarios extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarComentarios frame = new InterfazModificarComentarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazModificarComentarios() {
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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(460, 202, 600, 280);
		contentPane.add(scrollPane);
		
		JTextArea textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setBackground(new Color(220, 220, 220));
		textAreaObservaciones.setEditable(true);
		scrollPane.setViewportView(textAreaObservaciones);
		
		
		
		JLabel lblModificarComentarios = new JLabel("Modificar comentarios");
		lblModificarComentarios.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblModificarComentarios.setBounds(455, 20, 438, 45);
		contentPane.add(lblModificarComentarios);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		lblObservaciones.setBounds(286, 202, 143, 25);
		contentPane.add(lblObservaciones);
		
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnAceptar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}