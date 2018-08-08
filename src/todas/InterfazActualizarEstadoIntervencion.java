package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class InterfazActualizarEstadoIntervencion extends JFrame {

	private JPanel contentPane;
	private JTextField txtEstadoActual;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazActualizarEstadoIntervencion frame = new InterfazActualizarEstadoIntervencion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InterfazActualizarEstadoIntervencion() {

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
		
		JLabel lblActualizarEstadoIntervencion = new JLabel("Actualizar estado intervenci\u00F3n");
		lblActualizarEstadoIntervencion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblActualizarEstadoIntervencion.setBounds(377, 20, 593, 43);
		contentPane.add(lblActualizarEstadoIntervencion);
		
		JLabel lblEstadoActual = new JLabel("Estado actual:");
		lblEstadoActual.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstadoActual.setBounds(446, 165, 208, 21);
		contentPane.add(lblEstadoActual);
		
		JLabel lblDescripcionDelProblema = new JLabel("Descripci\u00F3n del problema:");
		lblDescripcionDelProblema.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionDelProblema.setBounds(446, 244, 208, 21);
		contentPane.add(lblDescripcionDelProblema);
		
		JLabel lblNuevoEstado = new JLabel("Nuevo estado:");
		lblNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNuevoEstado.setBounds(446, 348, 208, 21);
		contentPane.add(lblNuevoEstado);
		
		JLabel lblClasificacionDelTicket = new JLabel("Clasificaci\u00F3n del ticket:");
		lblClasificacionDelTicket.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblClasificacionDelTicket.setBounds(446, 424, 208, 21);
		contentPane.add(lblClasificacionDelTicket);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblObservaciones.setBounds(446, 500, 208, 21);
		contentPane.add(lblObservaciones);
		
		txtEstadoActual = new JTextField();
		txtEstadoActual.setBounds(666, 166, 266, 25);
		contentPane.add(txtEstadoActual);
		txtEstadoActual.setColumns(10);
		
		JComboBox comboBoxNuevoEstado = new JComboBox();
		comboBoxNuevoEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxNuevoEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Abierto derivado", "Abierto sin derivar", "Cerrado", "Solucionado a la espera OK"}));
		comboBoxNuevoEstado.setBounds(666, 347, 266, 25);
		contentPane.add(comboBoxNuevoEstado);
		
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxClasificacion.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Configuracion de Sistema Operativo", "Mal funcionamiento de Hardware", "Modificacion en los perfiles de usuarios", "Problemas con el correo electronico", "Problemas de acceso a la red local o remota", "Problemas en el funcionamiento del Sistema Operativo", "Problemas en la autenticacion", "Problemas en los sistemas de la empresa", "Solicitud de cambio de contrase\u00F1as", "Solicitud de instalacion de aplicaciones", "Solicitud de nuevos puestos de trabajo", "Solicitud de usuarios de red", "Solicitud de usuarios de Sistemas informaticos", "Solicitud soporte en el uso de alguna aplicacion o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(666, 423, 266, 25);
		contentPane.add(comboBoxClasificacion);
		
		JLabel errorGrupo = new JLabel("* Este campo no puede estar vac\u00EDo.");
		errorGrupo.setBackground(new Color(240, 240, 240));
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(970, 346, 400, 20);
		errorGrupo.setVisible(false);
		contentPane.add(errorGrupo);
		
		JLabel errorObs = new JLabel("* Este campo no puede estar vacio.");
		errorObs.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		errorObs.setForeground(Color.RED);
		errorObs.setBounds(970, 500, 400, 20);
		contentPane.add(errorObs);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxNuevoEstado.getSelectedIndex() == 0){
					errorGrupo.setVisible(true);
				}
				
				//if (txtObservaciones.getText().isEmpty()) {
					//errorObs.setVisible(true);
				//}
			}
		});
		
		btnActualizar.setBounds(1020, 655, 133, 37);
		contentPane.add(btnActualizar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(274, 90, 800, 2);
		contentPane.add(separator);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnSalir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnSalir.setBounds(1207, 655, 133, 37);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(666, 246, 266, 80);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(true);
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(666, 502, 266, 80);
		contentPane.add(scrollPane2);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBackground(new Color(220, 220, 220));
		textArea2.setEditable(true);
		scrollPane2.setViewportView(textArea2);
	}
}
