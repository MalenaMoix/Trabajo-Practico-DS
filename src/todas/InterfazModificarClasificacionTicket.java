package todas;

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
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtEstado;
	private JTextField txtGrupoResolucion;


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
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(615, 307, 292, 86);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(true);
		scrollPane.setViewportView(textAreaDescripcion);
		
		
		
		JLabel lblModificarClasificacion = new JLabel("Modificar clasificacion de ticket");
		lblModificarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblModificarClasificacion.setBounds(361, 20, 625, 42);
		contentPane.add(lblModificarClasificacion);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigo.setBounds(430, 173, 173, 25);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(430, 240, 173, 25);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(430, 307, 173, 25);
		contentPane.add(lblDescripcion);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(430, 436, 173, 25);
		contentPane.add(lblEstado);
		
		JLabel lblGruposResolucion = new JLabel("Grupos de resolucion:");
		lblGruposResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposResolucion.setBounds(430, 499, 173, 25);
		contentPane.add(lblGruposResolucion);
		
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
		
		JLabel errorDescripcionVacio = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcionVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorDescripcionVacio.setForeground(Color.RED);
		errorDescripcionVacio.setBounds(940, 307, 400, 20);
		errorDescripcionVacio.setVisible(false);
		contentPane.add(errorDescripcionVacio);
		
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
		
		

		txtCodigo = new JTextField();
		txtCodigo.setBackground(new Color(220, 220, 220));
		txtCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtCodigo.setBounds(615, 174, 292, 24);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNombre.setBounds(615, 241, 292, 24);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtEstado.setBounds(615, 437, 292, 24);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		txtGrupoResolucion = new JTextField();
		txtGrupoResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtGrupoResolucion.setBounds(615, 500, 292, 24);
		contentPane.add(txtGrupoResolucion);
		txtGrupoResolucion.setColumns(10);
		
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnGuardar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 655, 133, 37);
		contentPane.add(btnCancelar);
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Desea guardar los cambios realizados?");
			}
		});

		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}