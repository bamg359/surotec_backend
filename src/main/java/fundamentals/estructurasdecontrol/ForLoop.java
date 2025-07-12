package fundamentals.estructurasdecontrol;

public class ForLoop {


    public static void main(String[] args) {

        String[]  cargos = new String[5];

        cargos[0] = "Gerente";
        cargos[1] = "Supervisor";
        cargos[2] = "Vendedor";
        cargos[3] = "Auxiliar";
        cargos[4] = "Mensajero";

        // recorrer el array con un for


        for (int i = 0; i < cargos.length; i++){

            System.out.println("Cargo"+ (i+1)+ ": "+ cargos[i]); // Imprime cada cargo del array

        }



    }
}
