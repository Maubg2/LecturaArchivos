package co.edu.unbosque.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.modelo.EjercicioArchivo;
import co.edu.unbosque.modelo.KMP;
import co.edu.unbosque.vista.VistaPrincipal;
import co.edu.unbosque.vista.VistaVentanas;

public class Controlador implements ActionListener{
	
	private VistaPrincipal VP;
	private EjercicioArchivo EA;
	private VistaVentanas VV;
	private boolean checked;
	
	public Controlador() {
		
		VP = new VistaPrincipal();
		asignarOyentes();
		EA = new EjercicioArchivo();
		VV = new VistaVentanas();
		VP.getDerecha().setCampoTexto(EA.readFile()); //Setear el texto del TextArea con la lectura del archivo
		checked = EA.checkLoaded();
		//System.out.println(checked); //Debug
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
			
			if(src.equals("")) {
				//System.out.println("Hola" + src); //Debug
				VV.MostrarInformacion("Debe agregar una ruta");
				//Mostrar en VP mensaje diciendo que debe ingresar una ruta
			}
			else {
				EA.loadFile(src);
				checked = EA.checkLoaded();
				System.out.println(checked); //Debug
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
			String res = VV.leerString("Ingrese la palabra que quiere buscar");
			ArrayList<Integer> index = KMP.kmpSearch(VP.getDerecha().getCampoTexto(), res);
			if(index.size() == 0) {
				VV.MostrarInformacion("No hay coincidencias");
				VP.getDatos().setContador("0");
			}
			else {
				//La cantidad de indices que haya en el array, será la cantidad que debe 
				//Aumentar las palabras encontradas
				VP.getDatos().setContador(index.size() + "");
			}
			System.out.println("Index: " + index);
		}
		else if(command.equals("salir")) {
			VV.MostrarInformacion("Gracias por usar nuestro software");
			//Agregar ventana emergente de despedida
			System.exit(0);
		}
	}

}
