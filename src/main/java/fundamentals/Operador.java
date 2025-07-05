package fundamentals;

public class Operador {


    public static void main(String[] args) {

       // Operadores Aritmeticos
        int a = 10;
        int b = 5;

        int suma = a + b; // Suma
        int resta = a - b; // Resta
        int multiplicacion = a * b; // Multiplicación
        int division = a / b; // División
        int modulo = a % b; // Módulo

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de Comparación >,< , >=, <=, ==, != (returnan booleanos)
        boolean esIgual = (a == b); // Igualdad
        boolean esDiferente = (a != b); // Desigualdad
        boolean esMayor = (a > b); // Mayor
        boolean esMenor = (a < b); // Menor
        boolean esMayorOIgual = (a >= b); // Mayor o igual
        boolean esMenorOIgual = (a <= b); // Menor o igual

        //Operadores Lógicos and, or, not

        int key = 10;
        boolean biometrica = true;

        boolean abrirPuerta = (!(key ==3) && biometrica);

        System.out.println("¿Se puede abrir la puerta? " + abrirPuerta);


        boolean puedeAbrirPuerta = (key == 3) || biometrica;
        System.out.println("¿Puede abrir la puerta? " + puedeAbrirPuerta);

        // Operadores de Asignación = , +=, -=, *=, /=, %=

        double saldo = 1000.0;

        saldo = saldo + 500;

        saldo += 500;


    }




}
