package fundamentals.estructurasdecontrol;

public class CicloDoWhile {


    public static void main(String[] args) {

        int cuentaBebidas = 0;

        do{

            System.out.println("Se sirve el vino" + (cuentaBebidas + 1) + " vez");


            cuentaBebidas++;




        }while(cuentaBebidas < 5); // Se repite mientras la cuenta de bebidas sea menor que 5

    }






}
