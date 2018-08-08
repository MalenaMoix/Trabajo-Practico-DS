package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class InterfazModificarClasificacionTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarClasificacionTicket frame = new InterfazModificarClasificacionTicket();
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
	public InterfazModificarClasificacionTicket() {
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
		
		JLabel lblModificarClasificacinDe = new JLabel("Modificar clasificaci\u00F3n de ticket");
		lblModificarClasificacinDe.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblModificarClasificacinDe.setBounds(361, 20, 625, 42);
		contentPane.add(lblModificarClasificacinDe);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		contentPane.add(separator);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCdigo.setBounds(430, 173, 173, 25);
		contentPane.add(lblCdigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(430, 240, 173, 25);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcin.setBounds(430, 307, 173, 25);
		contentPane.add(lblDescripcin);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(430, 436, 173, 25);
		contentPane.add(lblEstado);
		
		JLabel lblGruposDeResolucin = new JLabel("Grupos de resoluci\u00F3n:");
		lblGruposDeResolucin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucin.setBounds(430, 499, 173, 25);
		contentPane.add(lblGruposDeResolucin);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Desea guardar los cambios realizados?");
			}
		});
		btnGuardar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnGuardar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		textField = new JTextField();
		textField.setBackground(new Color(220, 220, 220));
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField.setBounds(615, 174, 292, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_1.setBounds(615, 241, 292, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_3.setBounds(615, 437, 292, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_4.setBounds(615, 500, 292, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel errorNombre = new JLabel("* Este campo no puede estar vacio.");
		errorNombre.setBackground(new Color(240, 240, 240));
		errorNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorNombre.setForeground(Color.RED);
		errorNombre.setBounds(940, 240, 400, 20);
		errorNombre.setVisible(false);
		contentPane.add(errorNombre);
		
		JLabel errorNombre2 = new JLabel("* Este nombre ya existe en el sistema.");
		errorNombre2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorNombre2.setForeground(Color.RED);
		errorNombre2.setBounds(940, 240, 400, 20);
		errorNombre2.setVisible(false);
		contentPane.add(errorNombre2);
		
		JLabel errorDescripcion = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorDescripcion.setForeground(Color.RED);
		errorDescripcion.setBounds(940, 307, 400, 20);
		errorDescripcion.setVisible(false);
		contentPane.add(errorDescripcion);
		
		JLabel errorGrupo = new JLabel("* No se puede eliminar este grupo de resolucion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(940, 499, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorGrupo2 = new JLabel("* Este campo no puede estar vacío.");
		errorGrupo2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorGrupo2.setForeground(Color.RED);
		errorGrupo2.setBounds(940, 499, 400, 20);
		errorGrupo2.setVisible(false);
		contentPane.add(errorGrupo2);
		
		JLabel errorClasificacion = new JLabel("* No se puede desactivar esta clasificacion.");
		errorClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorClasificacion.setForeground(Color.RED);
		errorClasificacion.setBounds(940, 436, 400, 20);
		errorClasificacion.setVisible(false);
		contentPane.add(errorClasificacion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(615, 307, 292, 86);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(true);
		scrollPane.setViewportView(textArea);
	}

}
