package fundamentals.estructurasdecontrol;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese la cantidad de productos que desea comprar:");
        //int compraCantidad = sc.nextInt();

        System.out.println("Seleccione una opción:");
        int opc = sc.nextInt();

        switch (opc){

            case 1:
                System.out.println(" Cantidad comprada 1: Cliente no recibe descuento");
                break;
            case 2:
                System.out.println(" Cantidad comprada 2: descuento del 10%");
                break;
            case 3:
                System.out.println(" Cantidad comprada 3: descuento del 20%");
                break;
            case 4:
                System.out.println(" Cantidad comprada entre 4 y 10 : descuento del 30%");
                break;
            default:
                System.out.println(" Cantidad comprada mayor a 10: Cliente puede comprar hasta 10 productos, no se puede aplicar descuento");
                break;

        }

    }

}
