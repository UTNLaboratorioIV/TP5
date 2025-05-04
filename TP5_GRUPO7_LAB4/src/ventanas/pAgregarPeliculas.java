package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import peliculas.Categoria;
import peliculas.Pelicula;

import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtId;
	private JTextField txtNombre;
	private JButton btnAceptar;
	private JComboBox <Categoria>cboGenero;

	public pAgregarPeliculas() {
		dibujarControles();
		
		// GENERAMOS AL INICIAR EL PANEL EL ID 
		Pelicula pTemporal = new Pelicula("", new Categoria(0, ""));
		txtId.setText(String.valueOf(pTemporal.getId()));
	}
	
	public void dibujarControles() {
		
		Font fuenteComun = new Font("Verdana", Font.PLAIN, 11);
		
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(fuenteComun);
		lblId.setBounds(85, 60, 50, 20);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(fuenteComun);
		lblNombre.setBounds(85, 95, 50, 20);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(fuenteComun);
		lblGenero.setBounds(85, 130, 50, 20);
		add(lblGenero);
		
		txtId = new JTextField();
		txtId.setFont(fuenteComun);
		txtId.setEditable(false); // NO PUEDE MODIFICAR EL USUARIO
		txtId.setBounds(155, 60, 40, 20);
		add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(fuenteComun);
		txtNombre.setBounds(155, 95, 140, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setFont(fuenteComun);
		btnAceptar.setBounds(85, 165, 89, 25);
		add(btnAceptar);
		
		cboGenero = new JComboBox<Categoria>();
		cboGenero.setBounds(155, 130, 140, 22);
		cboGenero.addItem(new Categoria (0, "Seleccione Genero: "));
		cboGenero.addItem(new Categoria (1, "- Terror "));
		cboGenero.addItem(new Categoria (2, "- Acción"));
		cboGenero.addItem(new Categoria (3, "- Suspenso"));
		cboGenero.addItem(new Categoria (4, "- Romantica"));
		add(cboGenero);

	}
}
