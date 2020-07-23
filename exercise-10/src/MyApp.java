import java.util.Scanner;

public class MyApp {

    //10. La CONAGUA requiere determinar el pago que debe realizar una persona por el total de
    //metros cúbicos que consume de agua. Realice un diagrama de flujo y pseudocódigo que
    //representen el algoritmo que permita determinar ese pago.

    public static void main(String[] args) {

        float total, costo, cant;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese costo por metro cúbico de Agua: $");
        costo = keyboard.nextFloat();

        System.out.println("Ingrese la cantidad de metros cubicos consumido: ");
        cant = keyboard.nextFloat();

        total = cant * costo;

        System.out.println("Deberá abonar: $"+total);













    }

}
