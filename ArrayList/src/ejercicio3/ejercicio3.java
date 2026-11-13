	package ejercicio3;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
	
	

	
	
	
	
	
	public class ejercicio3   {
	
		static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	    static ArrayList<Alumno> lista = new ArrayList<>();
	    
	
		public static void main(String[] args) throws IOException {
	
			
		    
		    
		    int eleccion = 0;
		    
				
		    do {
	            System.out.print("\n---Acciones---\n" +
	                    "[1] Agregar Alumno\n" +
	                    "[2] Ordenar alfabeticamente\n" +
	                    "[3] Ordenar  por nota\n" +
	                    "[4] Salir\n" +
	                    "Introduzca acción (1-4): " + "\n" 
	            ); // esto para que cree toda las opciones para elegir
	            
	            try {
	                eleccion = Integer.parseInt(entrada.readLine()); //esto para guardar el numero que te den en la eleccion  
	            } catch (Exception e) {
	                System.out.println("Por favor, introduzca un número entero válido.");
	                eleccion = 0;
	                continue; // Vuelve al inicio del bucle
	            }
	            
	            switch (eleccion) {
	                case 1:
	                    AgregarAlumno(); // esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    break; 
	                    
	                    
	                case 2:
	                    OrdenarAlfabeticamente();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    break;
	                    
	                case 3:
	                    OrdenarporNota();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    break; 
	                case 4:
	                    System.out.println("Saliendo del programa..."); // este es el ultimo i es para salir del programa 
	                    break; 
	            
	                    
	                default:
	                    System.out.println("Opción no válida. Debes elegir entre 1 y 9." + "\n");
	                    break;
	            }
	        } while (eleccion != 4);
		    
		    
		    
			
		}
	
		private static void AgregarAlumno() throws IOException {
			String nombre;
		    Double nota;
			
			
			System.out.println("Dime el nombre del alumno");
			nombre = entrada.readLine();
			System.out.println("Dime la nota del alumno");
			nota=Double.parseDouble(entrada.readLine());
			
			lista.add(new Alumno(nombre,nota));
			System.out.println("El alumno se guardo correctamente");
			
			
		}
	
		private static void OrdenarAlfabeticamente()throws IOException {
			if (lista.isEmpty()) {
				System.out.println("La lista esta vacia "); 
			}else {
				Collections.sort(lista, Comparator.comparing(Alumno:: getNombre, String.CASE_INSENSITIVE_ORDER));  
				// primero cojemos el collections.sort para comparar la lista que le demos 
				// el comparator.comparing crea la comparacion que nosotros quieras 
				// el string.case_intensitive_order te compara las mayusculas en el metodo ASCII i excluyendo las mayusculas que tengan mas peso 
				// esta funcion sirve para comparar la lista que hemos creado pero co
				
				for (Alumno alumno : lista) {
					System.out.println("Alumno: " + alumno.getNombre() + " | " + "Nota: " + alumno.getNota());
					
				}
				
			}
				
			
			
		}
	
		private static void OrdenarporNota()throws IOException {
			
			if (lista.isEmpty()) {
				System.out.println("La lista esta vacia ");
			}else {
				Collections.sort(lista, Comparator.comparingDouble(Alumno:: getNota));
				for (Alumno alumno : lista) {
					System.out.println("Alumno: " + alumno.getNombre() + " | " + "Nota: " + alumno.getNota());
					
				}
			}
			
			
		}
	
		
	
	}
