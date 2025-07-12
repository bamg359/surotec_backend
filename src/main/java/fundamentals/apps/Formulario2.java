package fundamentals.apps;

public class Formulario2 {


    public static void main(String[] args) {
        String nombre = "Juan";
        String edad = "30";
        String email = "juan@mail.com";
        double salario     = 2500.50;
        boolean esEmpleado = true;


        Object[] datos = {nombre, edad, email, salario, esEmpleado};

        for(Object dato : datos) {
            System.out.println("Dato: " + dato);
        }

        double salarioN = (double) datos[3];
        double bonus = 500.00;
        System.out.println("Salario + bono:"+ (bonus + salarioN));

        int edadN = Integer.parseInt(edad);


    }



}
