package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PIzquierda extends JPanel{
	
	private JTextField entradaTexto;
	private JButton agregar;
	private JButton buscar;
	private JButton salir;
	private JLabel entradaLabel;
	
	public PIzquierda() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		setBackground(Color.decode("#3D8361"));
		
		entradaLabel = new JLabel("Archivo (ruta)");
		entradaLabel.setBounds(30, 23, 240, 28);
		entradaLabel.setForeground(Color.WHITE);
		entradaLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(entradaLabel);
		
		entradaTexto = new JTextField();
		entradaTexto.setBounds(140, 24, 240, 24);
		add(entradaTexto);
		
		agregar = new JButton("Agregar");
		agregar.setBounds(60, 100, 290, 24);
		agregar.setActionCommand("agregar");
		add(agregar);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(60, 130, 290, 24);
		buscar.setActionCommand("buscar");
		add(buscar);
		
		salir = new JButton("Salir");
		salir.setBounds(20, 220, 80, 24);
		salir.setActionCommand("salir");
		add(salir);
		
	}

	public JTextField getEntradaTexto() {
		return entradaTexto;
	}

	public void setEntradaTexto(JTextField entradaTexto) {
		this.entradaTexto = entradaTexto;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

}
