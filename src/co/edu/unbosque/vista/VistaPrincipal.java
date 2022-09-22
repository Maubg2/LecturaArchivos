package co.edu.unbosque.vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VistaPrincipal extends JFrame{
	
	private PTitulo titulo;
	private PIzquierda izquierda;
	private PDerecha derecha;
	private PDatos datos;
	
	public VistaPrincipal() {
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		setTitle("Prueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionar();
		
		setSize(800, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		titulo = new PTitulo();
		titulo.setBounds(0, 0, 400, 60);
		getContentPane().add(titulo);
		
		izquierda = new PIzquierda();
		izquierda.setBounds(0, 200, 400, 300);
		getContentPane().add(izquierda);
		
		
		derecha = new PDerecha();
		derecha.setBounds(400, 0, 400, 500);
		getContentPane().add(derecha);
		
		
		datos = new PDatos();
		datos.setBounds(0, 60, 400, 140);
		getContentPane().add(datos);
		
	}

	public PIzquierda getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(PIzquierda izquierda) {
		this.izquierda = izquierda;
	}

	public PDerecha getDerecha() {
		return derecha;
	}

	public void setDerecha(PDerecha derecha) {
		this.derecha = derecha;
	}

	public PDatos getDatos() {
		return datos;
	}

	public void setDatos(PDatos datos) {
		this.datos = datos;
	}
	
}
