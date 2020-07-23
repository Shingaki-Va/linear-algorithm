import java.util.Scanner;

public class MyApp {

    //13. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
    //determinar cuánto dinero ahorra una persona en un año si considera que cada semana
    //ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
    //sueldo).

    public static void main(String[] args) {

        double sueldo, ahorro;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el monto que cobra ud por mes $");
        sueldo = keyboard.nextDouble();

        ahorro = sueldo * 0.6 * 12;

        System.out.println("Ud Ahorra $"+ahorro+" anual");








    }






}
