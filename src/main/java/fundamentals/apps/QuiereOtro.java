package fundamentals.apps;

import java.util.Scanner;

public class QuiereOtro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";

        do{
            System.out.println("Sirviendo una copa de vino...");
            System.out.println("Desea otra copa de vino? (s/n)");
            respuesta = sc.nextLine();



        }while(respuesta.equals("s") || respuesta.equals("S"));



    }


}
