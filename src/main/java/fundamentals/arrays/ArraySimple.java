package fundamentals.arrays;

import java.util.Scanner;

public class ArraySimple {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] ages = new int[6]; // Declaración de un array de enteros con 5 elementos, es estatico y de tamaño fijo

        //Asignacion por indice 0,1,2,3,4
        //
        ages[0] = 18; // Asignación de valores a los elementos del array
        ages[1] = 26;
        ages[2] = 19;
        ages[3] = 25;
        ages[4] = 27;

        //Imprimir el array
        System.out.println("edad: " + ages[3]);

        System.out.println("Ingrese la edad del sexto elemento:");
        ages[5] = sc.nextInt();
        System.out.println("edad: " + ages[5]);

        // podemos medir el tamaño del array con la propiedad length

        System.out.println("Tamaño del array: " + ages.length);




    }




}
