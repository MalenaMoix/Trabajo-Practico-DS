package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class InterfazBuscarClasificacionTicket extends JPanel {

	private JFrame ventana;
	private JTextField textFieldNombre;
	private JTextField textFieldCodigo;

	public InterfazBuscarClasificacionTicket(JFrame frame) {
		
		this.ventana=frame;
		ventana.setContentPane(this);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setPreferredSize(new Dimension(1366, 768));
		this.setBackground(new Color(230, 230, 250));
		this.setLayout(null);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(295, 80, 760, 2);
		this.add(separator);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(696, 321, 296, 114);
		this.add(scrollPane);
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		
		
		JLabel lblBuscarClasificacion = new JLabel("Buscar clasificacion de tickets");
		lblBuscarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblBuscarClasificacion.setBounds(385, 27, 579, 38);
		this.add(lblBuscarClasificacion);
		
		
		JLabel lblParteNombre = new JLabel("Parte nombre:");
		lblParteNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblParteNombre.setBounds(392, 156, 142, 31);
		this.add(lblParteNombre);
		
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(392, 235, 142, 31);
		this.add(lblCodigoNumerico);
		
		JLabel lblDescripcion = new JLabel("Parte de la descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(392, 321, 242, 31);
		this.add(lblDescripcion);
		
		JLabel lblGruposDeResolucion = new JLabel("Grupos de resolucion relacionados:");
		lblGruposDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposDeResolucion.setBounds(392, 476, 284, 31);
		this.add(lblGruposDeResolucion);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(392, 550, 263, 20);
		this.add(lblEstado);
		
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBounds(696, 161, 296, 24);
		textFieldNombre.setColumns(10);
		this.add(textFieldNombre);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigo.setBounds(696, 240, 296, 24);
		textFieldCodigo.setColumns(10);
		this.add(textFieldCodigo);
		
		
		JComboBox comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electronico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio tecnico", "Unidades de soporte"}));
		comboBoxGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxGrupo.setBounds(696, 481, 296, 25);
		this.add(comboBoxGrupo);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion...", "Abierto derivado", "Abierto sin derivar", "Cerrado", "Solucionado en la espera de OK", "TODOS"}));
		comboBoxEstado.setBounds(696, 550, 296, 25);
		this.add(comboBoxEstado);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnBuscar.setBounds(1020, 650, 133, 37);
		this.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No existen clasificaciones de tickets que cumplan con los criterios ingresados.");
				
				ventana.setContentPane(new InterfazBuscarClasificacionTicketPaginacion(ventana));
				ventana.pack();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//VUELVE
			}
		});
	}
}