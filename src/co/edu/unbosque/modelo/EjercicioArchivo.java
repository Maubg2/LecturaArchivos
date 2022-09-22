package co.edu.unbosque.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioArchivo {
	
	private File f;
	private String src;
	private boolean loaded;
	
	public EjercicioArchivo() {
		f = new File("data/datos.txt"); //Ingresar archivo por defecto
		loaded = true;
	}
	public EjercicioArchivo(String src) {
		this.src = src;
		loadFile(src);
	}
	
	public void loadFile(String src) {
		try {
			f = new File(src);
			loaded = true;
			System.out.println("Cargado"); //Debug
		}catch(NullPointerException e) { //Si no ingresa ninguna ruta
			loaded = false;
		}
	}
	
	public boolean checkLoaded() {
		return (loaded) ? true: false;
	}
	
	public String readFile() {
		FileInputStream FIS;
		InputStreamReader ISR; //Elementos requeridos para leer
		BufferedReader line;
		
		try {
			FIS = new FileInputStream(f);
			ISR = new InputStreamReader(FIS); //Instanciación
			line = new BufferedReader(ISR);
			
			if(f.exists()) { //Si el archivo existe
				String fileLine = line.readLine(); //Leer la primera línea
				String returnableString = fileLine; //Agregarla al String que se va para el TextArea
				while(fileLine != null) { //Si la línea no estaba vacía, seguir leyendo la próxima
					fileLine = line.readLine(); //Leer la próxima línea
					if(fileLine != null) { //Si la línea leída no estaba vacía
						returnableString = returnableString + "\n" + fileLine; //Agregarla al string que se va para TextArea
					}
				}
				line.close(); //Terminar de leer
				return returnableString; //retornar lo leído
			}else {
				System.out.println("Error leyendo el archivo, no existe");
				return "Error";
			}
		}catch(IOException e) {
			System.out.println("Picó el try-catch leyendo el archivo");
			loaded = false;
			return "Error";
		}
	}

}
