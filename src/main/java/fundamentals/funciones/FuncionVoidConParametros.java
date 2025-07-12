package fundamentals.funciones;

public class FuncionVoidConParametros {

    static String tipoVino = "Tinto";
    static int cantidad = 3;

    public static void main(String[] args) {

        //String tipoVino = "Tinto";
        //int cantidad = 3;

        servirCopaDeVino(tipoVino, cantidad);

    }


    public static void servirCopaDeVino(String tipoVino, int cantidad) {
        System.out.println("Sirviendo " + cantidad + " copas de " + tipoVino + "...");
    }


}
