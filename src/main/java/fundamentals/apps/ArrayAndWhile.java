package fundamentals.apps;

import java.util.Scanner;

public class ArrayAndWhile {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Queremos agregar elementos a un array de tamaño 6 usando un bucle while y escanner para leer los datos del usuario.
        // Queremos imprimir el array al final recorriendo el array con un bucle while.


        int[] ages = new int[6]; // Declaración de un array de enteros con 6 elementos, es estático y de tamaño fijo
        int index = 0; // Inicializamos un índice para recorrer el array


        while (index < ages.length){

            System.out.println("Ingrese la edad del elemento " + (index + 1) + ":");

            ages[index] = sc.nextInt(); // Asignación de valores a los elementos del array

            index++;

        }

        // Vamos a imprimir el array recorriéndolo con un bucle while

        index = 0; // Reiniciamos el índice para recorrer el array

        while (index < ages.length) {
            System.out.println("Edad del elemento " + (index + 1) + ": " + ages[index]);
            index++;
        }




        //Creen un programa que agregue nombres a un array de tamaño 5 usando un bucle while y escáner para leer los datos del usuario.











    }
}
