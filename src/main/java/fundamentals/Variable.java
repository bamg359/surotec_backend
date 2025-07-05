package fundamentals;

public class Variable {



    public static void main(String[] args){

        // esto es un comentario de una sola línea

        /*
         * Esto es un comentario
         * de varias líneas
         */

        int numInt; // Declaración de una variable entera

        Integer numInteger; // Declaración de una variable entera usando la clase envolvente Integer

        numInteger = 5; // Asignación de un valor a la variable Integer

        numInt = 5; // Literal de un número entero

        numInt = 10; // Asignación de un valor a la variable entera

        int numInt2 = 20; // Declaración y asignación en una sola línea

        System.out.println("Valor" + numInt2);


        // Casting de tipos primitivos

        byte numByte = 127;// Declaración de un byte (rango: -128 a 127)
        short numShort = 32767; // Declaración de un short (rango: -32,768 a 32,767)
        int numInt3 = 2147483647; // Declaración de un int (rango: -2,147,483,648 a 2,147,483,647)
        long numLong = 9223372036854775807L; // Declaración de un long (rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)

        float numFloat = 3.14f; // Declaración de un float (precisión simple)
        double numDouble = 3.141592653589793; // Declaración de un double (precisión doble)

        char letra = 64; // Declaración de un char (carácter único)

        System.out.println(letra);

        boolean esVerdadero = true; // Declaración de un booleano (verdadero o falso)


        byte score = 100; // Declaración de una variable entera para puntaje

        short scoreShort = (short) score; // Declaración de una variable corta para puntaje

        //scoreShort = 460;

        System.out.println("Puntaje: " + scoreShort); // Imprimir el puntaje


        // Parsing de cadenas a tipos primitivos - tipos primitivos  a cadenas


        String salary = "2000000"; // Cadena que representa un número entero

        //double salaryDouble = Double.parseDouble(salary); // Convertir la cadena a un número de punto flotante

        double bonus = 50000.50; // Variable de tipo double

        Double totalSalary = Double.valueOf(salary) + bonus; // Sumar el salario y el bono

        System.out.println("Total Salary: " + totalSalary); // Imprimir el salario total

        // Conversión de tipos primitivos a cadenas

        String totalSalaryString = totalSalary + ""; // Convertir el salario total a una cadena
        String salaryString = String.valueOf(totalSalary); // Convertir el salario total a una cadena




    }

}
