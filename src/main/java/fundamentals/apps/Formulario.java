package fundamentals.apps;

public class Formulario {


    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 30;
        String email = "juan@mail.com";
        double salario     = 2500.50;
        boolean esEmpleado = true;


        String[] formulario = {nombre,email, String.valueOf(edad), String.valueOf(salario), String.valueOf(esEmpleado)};

        for (String campo : formulario) {
            System.out.println("Campo del formulario: " + campo);
        }


        double salarioEnArray= Double.parseDouble(formulario[3]);
        System.out.println("Salario del formulario: " + salarioEnArray);



    }








}
