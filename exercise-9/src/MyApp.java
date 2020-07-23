import java.util.Scanner;

public class MyApp {

    //9. Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
    //el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y
    //pseudocódigo que representen el algoritmo para tal fin.


    public static void main(String[] args) {

        float costo, total;
        int min;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo por minuto: $");
        costo = keyboard.nextFloat();

        System.out.print("Ingrese la candida de minutos que duró la llamada: ");
        min = keyboard.nextInt();

        total = min * costo;


        System.out.println("El costo de llamada es de: $" + total);










    }






}
