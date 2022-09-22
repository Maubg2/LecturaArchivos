package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PDatos extends JPanel{
	
	private JLabel contador;
	private JLabel archivo;
	
	private JLabel TContador;
	private JLabel TArchivo;
	
	public PDatos() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		setBackground(Color.decode("#D6CDA4"));
		
		TContador = new JLabel("Palabras encontradas");
		TContador.setBounds(20, 40, 180, 20);
		TContador.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(TContador);
		
		contador = new JLabel("0");
		contador.setBounds(90, 50, 70, 70);
		contador.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(contador);
		
		TArchivo = new JLabel("Archivo");
		TArchivo.setBounds(260, 34, 120, 34);
		TArchivo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(TArchivo);
		
		archivo = new JLabel("No cargado");
		archivo.setBounds(250, 50, 180, 70);
		archivo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(archivo);
		
	}

	public JLabel getContador() {
		return contador;
	}

	public void setContador(JLabel contador) {
		this.contador = contador;
	}

	public JLabel getArchivo() {
		return archivo;
	}

	public void setArchivo(JLabel archivo) {
		this.archivo = archivo;
	}

}
