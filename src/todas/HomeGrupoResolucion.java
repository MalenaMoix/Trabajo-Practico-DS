package todas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class HomeGrupoResolucion extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGrupoResolucion frame = new HomeGrupoResolucion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public HomeGrupoResolucion() {
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
		
		JLabel lblHomeGrupoDe = new JLabel("Home: Grupo de Resoluci\u00F3n");
		lblHomeGrupoDe.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblHomeGrupoDe.setBounds(401, 20, 546, 54);
		contentPane.add(lblHomeGrupoDe);
		
		JButton btnConsultarIntervenciones = new JButton("Consultar intervenciones");
		btnConsultarIntervenciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazConsultarIntervenciones consulta = new InterfazConsultarIntervenciones();
				consulta.setVisible(true);
				HomeGrupoResolucion.this.dispose();
			}
		});
		
		btnConsultarIntervenciones.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnConsultarIntervenciones.setBounds(462, 183, 424, 45);
		contentPane.add(btnConsultarIntervenciones);
		
		JButton btnRegistracionClasificacionDe = new JButton("Registrar clasificaci\u00F3n de ticket");
		btnRegistracionClasificacionDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazRegistrarClasificacionTicket1 comentario = new InterfazRegistrarClasificacionTicket1();
				comentario.setVisible(true);
				HomeGrupoResolucion.this.dispose();
			}
		});
		
		btnRegistracionClasificacionDe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnRegistracionClasificacionDe.setBounds(462, 304, 424, 45);
		contentPane.add(btnRegistracionClasificacionDe);
		
		JButton btnBuscarClasificacion = new JButton("Buscar clasificaci\u00F3n");
		btnBuscarClasificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazBuscarClasificacionTicket comentario = new InterfazBuscarClasificacionTicket();
				comentario.setVisible(true);
				HomeGrupoResolucion.this.dispose();
			}
		});
		
		btnBuscarClasificacion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnBuscarClasificacion.setBounds(462, 436, 424, 45);
		contentPane.add(btnBuscarClasificacion);
		
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
	}
}