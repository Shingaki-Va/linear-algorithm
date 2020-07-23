import java.util.Scanner;

public class MyApp {

    //4. Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
    //utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
    //fracciones de hora se toman como completas y realice un diagrama de flujo y
    //pseudocódigo que representen el algoritmo que permita determinar el cobro.

    public static void main(String[] args) {

        double tarifa, total;
        int horas;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de horas: ");
        horas = keyboard.nextInt();

        total = tarifa * horas;

        System.out.println("Debe abonar: $"+total+" por su estadía");








    }
}
