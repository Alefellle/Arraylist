import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.ls.LSOutput;


import java.io.BufferedReader;

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> lista =leervalores();
		mostrarResulatadoa(lista);
		
	}

	public static ArrayList<Integer> leervalores() throws Exception {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> listanmero = new ArrayList<>();
		
		System.out.println("Dime el valor que quieres introducir , con el -99 paras  de introducir");
		int numero = Integer.parseInt(entrada.readLine());
		
		
		while (numero != -99) {
			listanmero.add(numero);
			
			System.out.println("Dime el valor: ");
			numero = Integer.parseInt(entrada.readLine());
			
		}
		return listanmero;
	}
	
	public static int calcularSuma(ArrayList<Integer> listanumeros) {
	
		int suma = 0;
		Iterator<Integer> it = listanumeros.iterator(); //este comando es para recorrer todo el array list
		
		while (it.hasNext()) {
			Integer NumeroActual = (Integer) it.next();//esto saca el siguiente numero  
			suma = suma + NumeroActual;  //esto hace que sume i vaya acumulando los numero 
		}
		return suma;
		
	}
	
	public static double calcularmedia(ArrayList<Integer> listanumeros) {
		
		int suma = calcularSuma(listanumeros);
		double media = 0;
		
		media = (double) suma /listanumeros.size();
		
		
		return media;
		
		
	}
	
	
	
	public static void mostrarResulatadoa(ArrayList<Integer> listanumeros) {
		
		int contadorSuperiores = 0;
		int suma = calcularSuma(listanumeros);
		double media = calcularmedia(listanumeros);
		
		for (Integer numero : listanumeros) {
			if (numero > media) {
				contadorSuperiores++;
				
			}
			
		}
		
		
		System.out.println("--- RESULTADOS ---");
		System.out.println("El array list es: " +listanumeros);
		System.out.println("La suma de los valores es: " +suma);
		System.out.println("La media de los valores es: " +media);
		System.out.println("");
		System.out.println("Hay " + contadorSuperiores + " número(s) superior(es) a la media.");
		
	}
	
	
}

