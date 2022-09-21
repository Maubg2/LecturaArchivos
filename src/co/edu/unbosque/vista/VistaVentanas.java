package co.edu.unbosque.vista;

import javax.swing.JOptionPane;

public class VistaVentanas {
	
	public void MostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Mensaje de informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String leerString(String mensaje) {
		String dato = null;
		try {
			dato = JOptionPane.showInputDialog(mensaje);
			dato = dato.toLowerCase();
		}
		catch(NullPointerException e){
			return dato;
		}
		return dato;
	}
	
	public int leerInt(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}

}
