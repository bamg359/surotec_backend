package fundamentals.estructurasdecontrol;

import java.util.Scanner;

public class CicloWhile {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 para iniciar caja, cualquier otro número para salir:");
        int iniciarCaja = sc.nextInt();

        while(iniciarCaja == 1){

            System.out.println("Ingrese la cantidad de productos que desea comprar:");
            int compraCantidad = sc.nextInt();

            if (compraCantidad == 1) {
                System.out.println("Cliente no recibe descuento");
            } else if(compraCantidad == 2){
                System.out.println("descuento del 10%");
            }else if(compraCantidad == 3){
                System.out.println("descuento del 20%");
            } else if(compraCantidad >= 4 && compraCantidad <= 10){
                System.out.println("descuento del 30%");
            } else {

                System.out.println("Cliente puede comprar hasta 10 productos, no se puede aplicar descuento");
            }

            System.out.println("Desea continuar? Ingrese 1 para continuar, cualquier otro número para salir:");
            iniciarCaja = sc.nextInt();


        }








    }



}
