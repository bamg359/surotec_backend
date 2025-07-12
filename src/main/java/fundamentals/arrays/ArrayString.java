package fundamentals.arrays;

import java.util.Scanner;

public class ArrayString {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[]  cargos = new String[5];

        for(int i = 0; i < cargos.length; i++){
            System.out.println("Ingrese el cargo " + (i + 1) + ":");
            cargos[i] = sc.nextLine(); // Asignación de valores a los elementos del array
        }

        for(int i = 0; i < cargos.length; i++){
            System.out.println("Cargo " + (i + 1) + ": " + cargos[i]); // Imprime cada cargo del array
        }




    }

}
