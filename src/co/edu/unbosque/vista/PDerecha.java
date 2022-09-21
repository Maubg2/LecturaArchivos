package co.edu.unbosque.vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PDerecha extends JPanel{
	
	private JTextArea campoTexto;
	
	public PDerecha() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		setBackground(Color.decode("#1C6758"));
		
		campoTexto = new JTextArea();
		campoTexto.setBounds(14, 70, 360, 380);
		add(campoTexto);
		
	}

	public JTextArea getCampoTexto() {
		return campoTexto;
	}

	public void setCampoTexto(JTextArea campoTexto) {
		this.campoTexto = campoTexto;
	}

}
