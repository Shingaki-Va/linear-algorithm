import java.util.Scanner;

public class MyApp {

    //2. Una empresa importadora desea determinar cuántos dólares puede adquirir con equis
    //cantidad de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que
    //representen el algoritmo para tal fin.

    public static void main(String[] args) {

        double dolar, pesos, cotiza;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese la cotizacion de Dolar: ");
        cotiza = keyboard.nextDouble();
        System.out.println("1 dolar = " + cotiza + " pesos mexicanos");

        System.out.print("Ingrese la cantidad de Pesos que tiene: ");
        pesos = keyboard.nextDouble();

        dolar = pesos/cotiza;

        System.out.println("puede comprar " + dolar + " dolares" );




    }
}
