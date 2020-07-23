import java.util.Scanner;
import java.util.logging.SocketHandler;

public class MyApp {

    //11. La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
    //persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW). Realice
    //un diagrama de flujo y pseudocódigo que representen el algoritmo que permita
    //determinar ese pago.


    public static void main(String[] args) {

        float kw, costo, total;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese costo de KW: $");
        costo = keyboard.nextFloat();

        System.out.print("ingrese cantida de KW consumidos: ");
        kw = keyboard.nextFloat();

        total = costo * kw;

        System.out.println("Deberá abonar: $"+total);








    }


}
