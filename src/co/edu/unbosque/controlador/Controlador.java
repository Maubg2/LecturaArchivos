package co.edu.unbosque.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.modelo.EjercicioArchivo;
import co.edu.unbosque.vista.VistaPrincipal;

public class Controlador implements ActionListener{
	
	private VistaPrincipal VP;
	private EjercicioArchivo EA;
	private boolean checked;
	
	public Controlador() {
		
		VP = new VistaPrincipal();
		asignarOyentes();
		EA = new EjercicioArchivo();
		VP.getDerecha().setCampoTexto(EA.readFile()); //Setear el texto del TextArea con la lectura del archivo
		checked = EA.checkLoaded();
		System.out.println(checked); //Debug
		if(checked) {
			VP.getDatos().getArchivo().setText("Cargado");
		}
		
	}
	
	public void asignarOyentes() {
		VP.getIzquierda().getAgregar().addActionListener(this);
		VP.getIzquierda().getBuscar().addActionListener(this);
		VP.getIzquierda().getSalir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); //Comandos en minúscula
		if(command.equals("agregar")) {
			String src = VP.getIzquierda().getEntradaTexto().getText();
			if(src == "") {
				//Mostrar en VP mensaje diciendo que debe ingresar una ruta
			}
			else {
				EA.loadFile(src);
				checked = EA.checkLoaded();
				if(checked == false) {
					System.out.println("Archivo no cargado"); //Debug
				}
				else {
					VP.getDerecha().setCampoTexto(EA.readFile());
					//Mostrar en VP "Archivo cargado con éxito"
				}
			}
		}
		else if(command.equals("buscar")) {
			
		}
		else if(command.equals("salir")) {
			//Agregar ventana emergente de despedida
			System.exit(0);
		}
	}

}
