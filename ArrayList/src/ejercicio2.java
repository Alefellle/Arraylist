import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ejercicio2 {

    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Double> lista = new ArrayList<>();
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        menu();
    }
    
    public static void menu() throws NumberFormatException, IOException {
        int eleccion = 0;
        
        do {
            System.out.print("\n---Acciones---\n" +
                    "[1] Agregar elemento\n" +
                    "[2] Buscar elemento\n" +
                    "[3] Modificar elemento\n" +
                    "[4] Eliminar elemento\n" +
                    "[5] Insertar elementos\n" +
                    "[6] Mostrar elementos\n" +
                    "[7] Orden ascendente\n" +
                    "[8] Orden descendente\n" +
                    "[9] Salir\n" +
                    "Introduzca acción (1-9): " + "\n" 
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
                    System.out.println("Dime el numero que quieres agregar");
                    Agregarnumero(); // esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break; 
                    
                case 2:
                    System.out.println("Dime el numero que quieres buscar ");
                    Buscarnumero();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    break;
                    
                case 3:
                    System.out.println("Dime le numero que quieres modificar");
                    ModificarNumero();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break;
                    
                case 4:
                    System.out.println("Dime el numero que quieres eliminar");
                    EliminarNumero();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break; 
                    
                case 5:
                    System.out.println("Dime el elemento que queires modificar"); 
                    ModificarElementos();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break; 
                    
                case 6:
                    System.out.println("Esta opcion es para mostrar toda la lista");
                    mostrarElementos();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    break;
                    
                case 7:
                    System.out.println("Esta opcion ordena ascendentemente la lista");
                    OrdenarAscendente();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break; 
                    
                case 8:
                    System.out.println("Esta opcion ordena cendentemente la lista");
                    OrdenarDescendente();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
                    
                    break;
                    
                case 9:
                    System.out.println("Saliendo del programa..."); // este es el ultimo i es para salir del programa 
                    break; 
                    
                default:
                    System.out.println("Opción no válida. Debes elegir entre 1 y 9." + "\n");
                    break;
            }
        } while (eleccion != 9);
    }
    



    public static void Agregarnumero() {
        try {
            double num = Double.parseDouble(entrada.readLine());// aqui te pide un numero que puede ser con decimal 
            lista.add(num);// esto añade a la lista el numero 
            System.out.println("Numero añadido correctamente");
        } catch (Exception e) {
            System.out.println("Debes poner un numero del 1 al 9");
        }
    }
    
    public static void Buscarnumero() {
        try {
            double numBuscar = Double.parseDouble(entrada.readLine());//esta guarda el numero que quieres buscar
            
            if (lista.contains(numBuscar)) {//aqui empieza que si el numero que queremos buscar esta dentro de la lista haga lo siguiente
                int posicion = lista.indexOf(numBuscar);// que la posicion  te la da con el indexOf i entre parentesis en numbuscar 
                System.out.println("El numero " + numBuscar + " se encuantra en la posicion:" + posicion);//esto enseña por pantalla el numero + el numero que quieres buscar mas la posicion
            } else {//sino 
                System.out.println("El numero no se encuentra en la lista");
            }
        } catch (Exception e) {
            System.out.println("Debes poner un numero del 1 al 9");
        }
    }
    
    public static void ModificarNumero() {
        try {  //esto esmpieza el modificar
            
            double numModificar = Double.parseDouble(entrada.readLine()); // aqui guarda el numero para saber que numero quiere modificar
            
            if (lista.contains(numModificar)) {// aqui dice que si el numero esta en la lista 
                int posicion = lista.indexOf(numModificar);//dice que cree una variable de posicion lara saber donde esta 
                System.out.println("Dime el nuevo numero  que quieres ponerlo");//aqui una vez ya sabes la posicion i que el numero esta en la lista 
                int numeroNuevo = pedirnumero();
                lista.set(posicion,(double) numeroNuevo);//aqui dice que en la lista ponga en la posicion que le has dicho , que añada el numero nuevo 
                System.out.println("Numero modificado correctamente");
            } else {
                System.out.println("El numero no esta en la lista");// que sino esta el numero esta este numero 
            }
        } catch (Exception e) {
            System.out.println("Debes poner un numero del 1 al 9");// aqui esque no a metido un numero del 1 al 10 
        }
    }
    
    public static void EliminarNumero() {
        try {
            double numEliminar = Double.parseDouble(entrada.readLine()); // aqui guarda el numero que quieres eliminar
            
            if (lista.contains(numEliminar)) {// que si el numero esta en la lista haga el siguiente paso
                int posicion = lista.indexOf(numEliminar);// que la posicion de numero eleminiar 
                lista.remove(posicion);
                System.out.println("Numero eliminado correctamente");
            } else {
                System.out.println("El numero no esta en la lista");// que sino esta el numero esta este numero
            }
        } catch (Exception e) {
            System.out.println("Debes poner un numero del 1 al 9");// aqui esque no a metido un numero del 1 al 10
        }
    }
    
    private static void ModificarElementos() {
        /* Solicitará al usuario el elemento a insertar y la posición en la que se insertará. Se
        debe comprobar si la posición es correcta, o dará un error*/
        try {
            System.out.println("Dime el numero que quieres añadir");
            double numañadir = Double.parseDouble(entrada.readLine());
            
            System.out.println("Dime la posicion que quieres modificar ");
            // Convertimos la posición a int porque las listas no aceptan posiciones con decimales
            int posicion = Integer.parseInt(entrada.readLine());
            
            // Comprobamos si la posición es correcta (entre 0 y el tamaño actual de la lista)
            if (posicion >= 0 && posicion <= lista.size()) {
                lista.add(posicion, numañadir); // aqui es para añadir en la lista la posicion que quieres el numero que has pedido antes
                System.out.println("Numero añadido correctamente en la posicion " + posicion);
            } else {
                System.out.println("Error: El numero o posicion que has puesto no existe");
            }
            
        } catch (Exception e) {
            System.out.println("Debes poner un numero del 1 al 9");// aqui esque no a metido un numero del 1 al 10
        }
    }
    
    private static void mostrarElementos() {
        // aqui empiezas al reves poruqe es mas facil 
        if (lista.isEmpty()) { //aqui dices si la lista esta vacia que enseñe lo que esta en la siguiente linea 
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista es: " + lista);
        }
    }
    
    private static void OrdenarAscendente() {
        // aqui empiezas al reves poruqe es mas facil
        if (lista.isEmpty()) {//aqui dices si la lista esta vacia que enseñe lo que esta en la siguiente linea
            System.out.println("La lista esta vacia");
        } else {
            ArrayList<Double> listaOrdenadaAS = (ArrayList<Double>) lista.clone();
            Collections.sort(listaOrdenadaAS); 
            System.out.println("La lista ordenada ascendentemente es: " + listaOrdenadaAS);
        }
    }
    
    private static void OrdenarDescendente() {
        // aqui empiezas al reves poruqe es mas facil
        if (lista.isEmpty()) {//aqui dices si la lista esta vacia que enseñe lo que esta en la siguiente linea
            System.out.println("La lista esta vacia");
        } else {
            ArrayList<Double> listaOrdenadaDES = (ArrayList<Double>) lista.clone();//creo una array para quecopie i no modifique 
            Comparator<Double> comparador = Collections.reverseOrder();
            Collections.sort(listaOrdenadaDES,comparador);
            System.out.println("La lista ordenada descendentemente es: " + listaOrdenadaDES);
        }
    }
}