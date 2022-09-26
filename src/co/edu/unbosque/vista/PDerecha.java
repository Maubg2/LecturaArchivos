package co.edu.unbosque.vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PDerecha extends JPanel{
	
	private JTextArea campoTexto;
	private JScrollPane campoScroll; //El Scroll del TextArea
	
	public PDerecha() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		setBackground(Color.decode("#1C6758"));
		
		campoTexto = new JTextArea();
		campoTexto.setBounds(14, 70, 360, 380);
		campoTexto.setLineWrap(true);
		campoTexto.setEditable(false);
		
		campoScroll = new JScrollPane(campoTexto);
		campoScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); //Mostrar el Scroll cuando se necesite (vertical)
		campoScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Mostrar el Scroll cuando se necesite (horizontal)
		campoScroll.setBounds(14, 70, 360, 380);
		add(campoScroll); //Añadimos el Scroll porque dentro está el TextArea
		
	}

	public String getCampoTexto() {
		return campoTexto.getText();
	}

	public void setCampoTexto(String campoTexto) {
		this.campoTexto.setText(campoTexto);
	}

}
