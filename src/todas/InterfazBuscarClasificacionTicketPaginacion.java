package todas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazBuscarClasificacionTicketPaginacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroPagina;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazBuscarClasificacionTicketPaginacion frame = new InterfazBuscarClasificacionTicketPaginacion();
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
	public InterfazBuscarClasificacionTicketPaginacion() {
		setTitle("La llamita");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Malena Moix\\Desktop\\cool-flame-icon.png"));
		setBounds(0, 0, 1366 , 768);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCriteriosDeBusqueda = new JLabel("Criterios de b\u00FAsqueda de clasificaci\u00F3n de tickets:");
		lblCriteriosDeBusqueda.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblCriteriosDeBusqueda.setBounds(80, 40, 516, 31);
		contentPane.add(lblCriteriosDeBusqueda);
		
		JLabel lblCodigoNumerico = new JLabel("C\u00F3digo num\u00E9rico:");
		lblCodigoNumerico.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblCodigoNumerico.setBounds(334, 289, 183, 25);
		contentPane.add(lblCodigoNumerico);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo:");
		lblNombreCompleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblNombreCompleto.setBounds(334, 340, 192, 25);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblEstado.setBounds(334, 529, 183, 31);
		contentPane.add(lblEstado);
		
		JLabel lblCodigoNumerico_1 = new JLabel("C\u00F3digo num\u00E9rico: ");
		lblCodigoNumerico_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCodigoNumerico_1.setBounds(169, 84, 183, 21);
		contentPane.add(lblCodigoNumerico_1);
		
		txtNumeroPagina = new JTextField();
		txtNumeroPagina.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		txtNumeroPagina.setText("1");
		txtNumeroPagina.setBounds(690, 229, 33, 22);
		contentPane.add(txtNumeroPagina);
		txtNumeroPagina.setColumns(10);
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(153, 90, 8, 8);
		contentPane.add(label);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificaci\u00F3n de ticket        de ");
		lblClasificacionDeTicket.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		lblClasificacionDeTicket.setBounds(489, 228, 285, 22);
		contentPane.add(lblClasificacionDeTicket);
		
		JLabel label_1 = new JLabel("-");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(153, 122, 8, 8);
		contentPane.add(label_1);
		
		JLabel lblParteDelNombre = new JLabel("Parte del nombre: ");
		lblParteDelNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblParteDelNombre.setBounds(169, 116, 183, 21);
		contentPane.add(lblParteDelNombre);
		
		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(153, 153, 8, 8);
		contentPane.add(label_2);
		
		JLabel lblGrupoDeResolucion = new JLabel("Grupo de resoluci\u00F3n: ");
		lblGrupoDeResolucion.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGrupoDeResolucion.setBounds(169, 150, 241, 21);
		contentPane.add(lblGrupoDeResolucion);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(153, 187, 8, 8);
		contentPane.add(label_3);
		
		JLabel lblEstado_1 = new JLabel("Estado:");
		lblEstado_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblEstado_1.setBounds(169, 181, 241, 21);
		contentPane.add(lblEstado_1);
		
		JLabel lblDescripcionCompleta = new JLabel("Descripci\u00F3n completa:");
		lblDescripcionCompleta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		lblDescripcionCompleta.setBounds(334, 390, 203, 25);
		contentPane.add(lblDescripcionCompleta);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setBackground(new Color(220, 220, 220));
		textField.setEditable(false);
		textField.setBounds(529, 291, 537, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(529, 342, 537, 24);
		contentPane.add(textField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(529, 392, 537, 114);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(529, 534, 537, 24);
		contentPane.add(textField_2);
		
		JButton btn1 = new JButton("Seleccionar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazClasificacionTicketSeleccionada comentario = new InterfazClasificacionTicketSeleccionada();
				comentario.setVisible(true);
				InterfazBuscarClasificacionTicketPaginacion.this.dispose();
			}
		});
		btn1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btn1.setBounds(833, 650, 133, 37);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Modificar");
		btn2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		btn2.setBounds(646, 650, 133, 37);
		contentPane.add(btn2);
		
		JButton btnDerivar = new JButton("Borrar");
		btnDerivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazBorrarClasificacionTicket vergrupo = new InterfazBorrarClasificacionTicket();
				vergrupo.setVisible(true);
				InterfazBuscarClasificacionTicketPaginacion.this.dispose();
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
		
		JButton button = new JButton("<");
		button.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button.setBounds(860, 226, 44, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">");
		button_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		button_1.setBounds(906, 226, 42, 25);
		contentPane.add(button_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(761, 229, 61, 22);
		contentPane.add(textField_3);
		
		
		
	}
}