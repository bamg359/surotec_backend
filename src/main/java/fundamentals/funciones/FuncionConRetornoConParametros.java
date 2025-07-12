package fundamentals.funciones;

import java.util.Scanner;

public class FuncionConRetornoConParametros {

    static Scanner scanner = new Scanner(System.in);

    static double precio;
    static int cantidad;


    public static void main(String[] args) {

        pedirDatosCompra();

        double totalCompra = calcularTotalCompra(precio, cantidad);

        System.out.println("El total de la compra es: " + totalCompra);

    }


    public static void pedirDatosCompra() {
        System.out.println("Precio del producto:");
        precio = scanner.nextDouble();
        System.out.println("Cantidad de productos:");
        cantidad = scanner.nextInt();
    }

    public static double calcularTotalCompra(double precio, int cantidad){
        double total = precio * cantidad;
        return total;
    }



}
