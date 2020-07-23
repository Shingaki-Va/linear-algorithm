import java.util.Scanner;

public class MyApp {

    //14. Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
    //sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los
    //gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros
    //gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de
    //flujo y pseudocódigo que representen el algoritmo que determine el monto del cheque.


    public static void main(String[] args) {

        int dias;
        double hotel, comida, otros, total;

        otros = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese la cantidad de dias: ");
        dias = keyboard.nextInt();
        otros = dias*100;

        System.out.print("Ingrese Gasto del Hotel: $");
        hotel = keyboard.nextDouble();

        System.out.print("Ingrese Gasto de Comida: $");
        comida = keyboard.nextDouble();

        total = comida+hotel+otros;

        System.out.println("El cheque total es de: $"+total);
        System.out.println("Gasto de Hotel: $"+hotel);
        System.out.println("Gasto de Comida: $"+comida);
        System.out.println("Bono de otros Gastos: $"+otros);







    }


}
