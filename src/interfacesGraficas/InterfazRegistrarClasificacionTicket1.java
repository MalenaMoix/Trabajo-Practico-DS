package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class InterfazRegistrarClasificacionTicket1 extends JPanel {

	private JFrame ventana;
	private JTextField txtNombre;
	private JLabel lblDescripcion;
	private JLabel lblGruposResolucion;

	public InterfazRegistrarClasificacionTicket1(JFrame frame) {
		
		//ACTOR : GRUPO DE RESOLUCION
		
		//NOMBRE MAXIMO 30 CARACTERES
		
		//PUEDE ELEGIR MAS DE UN GRUPO
		//LISTA DE GRUPOS DE RESOLUCION
		
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
		scrollPane.setBounds(612, 174, 327, 139);
		this.add(scrollPane);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(612, 212, 327, 139);
		scrollPane.setViewportView(textAreaDescripcion);
		//this.add(textAreaDescripcion);
		
		
		
		JLabel lblRegistrarClasificacion = new JLabel("Registar clasificacion de ticket");
		lblRegistrarClasificacion.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblRegistrarClasificacion.setBounds(373, 20, 602, 54);
		this.add(lblRegistrarClasificacion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombre.setBounds(407, 129, 193, 31);
		this.add(lblNombre);
		
		JLabel errorGrupo = new JLabel("* Debe seleccionar al menos una opcion.");
		errorGrupo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorGrupo.setForeground(Color.RED);
		errorGrupo.setBounds(990, 335, 273, 20);
		errorGrupo.setVisible(false);
		this.add(errorGrupo);
		
		JLabel errorDescripcionVacio = new JLabel("* Este campo no puede estar vacio.");
		errorDescripcionVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorDescripcionVacio.setForeground(Color.RED);
		errorDescripcionVacio.setBounds(990, 175, 254, 20);
		errorDescripcionVacio.setVisible(false);
		this.add(errorDescripcionVacio);
		
		JLabel errorNombreVacio = new JLabel("* Este campo no puede estar vacio.");
		errorNombreVacio.setForeground(new Color(255, 0, 0));
		errorNombreVacio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorNombreVacio.setBounds(990, 136, 225, 20);
		errorNombreVacio.setVisible(false);
		this.add(errorNombreVacio);
		
		JLabel errorNombreExistente = new JLabel("* Este nombre ya existe en el sistema.");
		errorNombreExistente.setForeground(new Color(255, 0, 0));
		errorNombreExistente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		errorNombreExistente.setBounds(990, 132, 254, 28);
		errorNombreExistente.setVisible(false);
		this.add(errorNombreExistente);
		
		
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcion.setBounds(407, 173, 193, 31);
		this.add(lblDescripcion);
		
		lblGruposResolucion = new JLabel("Grupos de Resolucion:");
		lblGruposResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblGruposResolucion.setBounds(407, 325, 193, 37);
		this.add(lblGruposResolucion);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		txtNombre.setBounds(612, 134, 327, 24);
		txtNombre.setColumns(10);
		this.add(txtNombre);
		
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnRegistrar.setBounds(1020, 650, 133, 37);
		this.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		JList<Object> list = new JList();
		list.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		list.setModel(new AbstractListModel<Object>() {
			String[] values = new String[] {"Seleccione una opcion...", "Administrador DEBIAN", "Administrador de Base de Datos", "Administrador LAN", "Administrador Proxy y correo electronico", "Administrador SUSE Linux", "Comunicaciones", "Desarrollo Sistema Comercial", "Desarrollo Sistema de Reclamos", "Desarrollo Sistema RRHH", "Mesa de ayuda", "Servicio tecnico", "Unidades de soporte"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(612, 333, 327, 307);
		this.add(list);
		
		

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textAreaDescripcion.getText().isEmpty()) {
					errorDescripcionVacio.setVisible(true);
				}
				else if (txtNombre.getText().isEmpty()) {
					errorNombreVacio.setVisible(true);
				}
			}
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//VUELVE
			}
		});
	}
}