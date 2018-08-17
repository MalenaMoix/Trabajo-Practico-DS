package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

public class InterfazBorrarClasificacionTicket extends JPanel {

	private JFrame ventana;
	private JTextField textFieldEstado;
	private JTextField textFieldNombre;
	private JTextField textFieldCodigoNumerico;

	public InterfazBorrarClasificacionTicket(JFrame frame) {
		
		//ACTOR : GRUPO DE RESOLUCION
		//VALIDAR QUE LA CLASIFICACION NUNCA FUE USADA
		
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
		scrollPane.setBounds(665, 450, 369, 114);
		this.add(scrollPane);
		
		
		JTextArea textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		textAreaDescripcion.setBackground(new Color(220, 220, 220));
		textAreaDescripcion.setEditable(false);
		
		
		
		JLabel lblBorrarClasificacionTicket = new JLabel("Borrar clasificacion de ticket");
		lblBorrarClasificacionTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
		lblBorrarClasificacionTicket.setBounds(396, 20, 558, 54);
		this.add(lblBorrarClasificacionTicket);
		
		JLabel lblClasificacionABorrar = new JLabel("Clasificacion a borrar:");
		lblClasificacionABorrar.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblClasificacionABorrar.setBounds(295, 163, 233, 25);
		this.add(lblClasificacionABorrar);
		
		JLabel lblCodigoNumerico = new JLabel("Codigo numerico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(450, 254, 203, 25);
		this.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(450, 319, 203, 25);
		this.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(450, 375, 203, 31);
		this.add(lblEstado);
		
		
		JLabel lblDescripcionCompleta = new JLabel("Descripcion completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(450, 446, 203, 25);
		this.add(lblDescripcionCompleta);
		
		
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldEstado.setBackground(new Color(220, 220, 220));
		textFieldEstado.setEditable(false);
		textFieldEstado.setBounds(665, 380, 369, 24);
		textFieldEstado.setColumns(10);
		this.add(textFieldEstado);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldNombre.setBackground(new Color(220, 220, 220));
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(665, 321, 369, 24);
		this.add(textFieldNombre);
		
		textFieldCodigoNumerico = new JTextField();
		textFieldCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textFieldCodigoNumerico.setEditable(false);
		textFieldCodigoNumerico.setColumns(10);
		textFieldCodigoNumerico.setBackground(new Color(220, 220, 220));
		textFieldCodigoNumerico.setBounds(665, 256, 369, 24);
		this.add(textFieldCodigoNumerico);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnConfirmar.setBounds(1020, 650, 133, 37);
		this.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btnCancelar.setBounds(1207, 650, 133, 37);
		this.add(btnCancelar);
		
		
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "No es posible eliminar esta clasificacion de ticket ya que fue utilizada anteriormente.");
				
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Desea borrar esta clasificacion de ticket?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION){
				  //PASA ALGO
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