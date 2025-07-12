package fundamentals.apps;

import java.util.Scanner;

public class AppNomina {

    static Scanner sc = new Scanner(System.in);

    static String[] empleado = new String[6];

    static String nombre;
    static String cargo;
    static double salario;
    static double descuentoEps;
    static double descuentoPension;
    static double salarioNeto;
    static final double  auxilioTransporte = 200000;
    static final double salarioMinimo = 1423000;


    public static void main(String[] args) {

        ingresarDatosEmpleeado();
        mostrarDatosEmpleado();



    }


    public static double calcularPagoEps(double salario){

        double eps= salario * 0.04;
        return eps;

    }

    public static double calcularPagoPension(double salario){

        double pension = salario * 0.04;
        return pension;

    }

    public static double calcularSalarioNeto(double salario){


        descuentoEps = calcularPagoEps(salario);
        empleado[3] = String.valueOf(descuentoEps); // Asignar descuento EPS al cuarto elemento del array
        descuentoPension = calcularPagoPension(salario);
        empleado[4] = String.valueOf(descuentoPension); // Asignar descuento pensión al quinto elemento del array

        if (salario < (salarioMinimo * 2)){
            salarioNeto = salario - descuentoEps - descuentoPension + auxilioTransporte;
        }else{
            salarioNeto = salario - descuentoEps - descuentoPension;
        }

        return salarioNeto;

    }



    public static void ingresarDatosEmpleeado(){

        System.out.println("Ingrese el nombre del empleado:");
        nombre = sc.nextLine();
        empleado[0] = nombre; // Asignar el nombre al primer elemento del array
        System.out.println("Ingrese el cargo del empleado:");
        cargo = sc.nextLine();
        empleado[1] = cargo; // Asignar el cargo al segundo elemento del array
        System.out.println("Ingrese el salario del empleado:");
        salario = sc.nextDouble();
        empleado[2] = String.valueOf(salario); // Asignar el salario al tercer elemento del array
        sc.nextLine(); // Limpiar el buffer del scanner
        salarioNeto = calcularSalarioNeto(salario);
        empleado[5] = String.valueOf(salarioNeto); // Asignar el salario neto al sexto elemento del array

    }

    public static void mostrarDatosEmpleado(){

        System.out.println("Datos del empleado:");

        for(String dato : empleado) {
            System.out.println(dato);
        }

    }






}
