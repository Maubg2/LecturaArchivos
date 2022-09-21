package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PTitulo extends JPanel{
	
	private JLabel tituloP;
	
	public PTitulo() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		setBackground(Color.decode("#3D8361"));
		tituloP = new JLabel("Lector de archivos");
		tituloP.setForeground(Color.WHITE);
		tituloP.setFont(new Font("Times New Roman", Font.BOLD, 28));
		tituloP.setBounds(100, 8, 300, 50);
		add(tituloP);
		
	}

	public JLabel getTituloP() {
		return tituloP;
	}

	public void setTituloP(JLabel tituloP) {
		this.tituloP = tituloP;
	}

}
