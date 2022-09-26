package co.edu.unbosque.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class KMP {
		
		  /**
	     * algoritmo de búsqueda kmp
	*
	     * @param basicString cadena de origen
	     * @param searchString la cadena a buscar
	     * @return devuelve la primera posición coincidente, devuelve -1 si no se encuentra
	*/
	public static ArrayList<Integer> kmpSearch(String basicString, String searchString) {
	  // Obtener parte del valor coincidente de la cadena a buscar
	  //System.out.println(basicString); //Debug
	  String[] split = basicString.split("\n");
	  int[] next = kmpNext(searchString);
	  ArrayList<Integer> returnableData = new ArrayList<>();
	  //System.out.println(next[3]);
	  // Salida de tabla de coincidencia parcial
	  System.out.println(Arrays.toString(next));
	  
	  for(String x : split) { //Por si el texto a buscar está separado por líneas
		  for(int i = 0,j = 0;i<basicString.length();i++){
		      // Necesito manejar basicString.charAt (i)! = SearchString.charAt (j)
		      // Para ajustar el tamaño de j
		      while (j > 0 && basicString.charAt(i) != searchString.charAt(j)){
		          j = next[j - 1];
		      }
		      if(basicString.charAt(i) == searchString.charAt(j)){
		      	j++;
		      }
		      if(j == searchString.length()){
		    	  i = i - j + 1;
		    	  j = 0;
		          returnableData.add(i - j + 1);
		          //El index de la palabra encontrada esta dado por: i - j + 1
		      }
		  }
	  }
	  
	  /*
	  for(int i = 0,j = 0;i<basicString.length();i++){
	      // Necesito manejar basicString.charAt (i)! = SearchString.charAt (j)
	      // Para ajustar el tamaño de j
	      while (j > 0 && basicString.charAt(i) != searchString.charAt(j)){
	          j = next[j - 1];
	      }
	      if(basicString.charAt(i) == searchString.charAt(j)){
	      	j++;
	      }
	      if(j == searchString.length()){
	          return i - j + 1;
	      }
	  }
	  */
	
	  return returnableData; //Retorna el array con los index que coincidieron, si está vacío, es porque no coincidió ninguno
	  //return -1; //Si no encontró nada, retorna esto
	}
	
	/**
	* Ver patrones en el patrón a buscar, es decir, si busco "abcxabc", el patrón "abc" se repite 1 vez
	* entonces next[] quedaría [0,0,0,0,1,2,3], si vuelve a encontrar una letra, le suma uno más,
	* es decir, si fuera el patrón "abcx" en "abcxabcx", entonces next[] queda [0,0,0,0,1,2,3,4] 
	* Esto sirve para no repetir letras al buscar en el texto principal
	* @param searchString
	* @return
	*/
	public static int[] kmpNext(String searchString) {
	  // La matriz guarda algunos valores coincidentes
	  int[] next = new int[searchString.length()];
	  // Si la longitud de la cadena es 1, el valor de coincidencia parcial es 0
	  next[0] = 0;
	  // i => carácter, j => valor de coincidencia parcial
	  for (int i = 1, j = 0; i < searchString.length(); i++) {
	      // Cuando searchString.charAt (i)! = SearchString.charAt (j), es necesario obtener un nuevo j del siguiente [j-1]
	      // Sepa que searchString.charAt (i) == searchString.charAt (j) se encuentra para salir
	
	      while(j > 0 && searchString.charAt(i) != searchString.charAt(j)){
	          j = next[j - 1];
	      }

	      // Valor de coincidencia parcial +1
	      if(searchString.charAt(i) == searchString.charAt(j)){
	          j++;
	      }
	      next[i] = j;
	  }
	  return next;
	}
		
}
