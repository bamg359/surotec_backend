package fundamentals.estructurasdecontrol;

public class ForEachLoop {


    public static void main(String[] args) {

        double[] precios = {10.99, 5.49, 3.99, 7.89, 12.50};

        System.out.println("Cantida de precios: " + precios.length);


        for (double precio : precios) {
            System.out.println("Precio: " + precio);
        }





    }




}
