package fundamentals.estructurasdecontrol;

public class Acumulador {


    public static void main(String[] args) {


        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            suma += contador; // Acumula el valor de contador en suma
            System.out.println("Contador: " + contador + ", Suma acumulada: " + suma);
            contador++; // Incrementa el contador en 1
        }

        System.out.println("Suma total: " + suma); // Muestra la suma total al final




    }



}
