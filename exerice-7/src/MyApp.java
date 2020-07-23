import java.util.Scanner;

public class MyApp {

    //La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
    //boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
    //kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
    //para tal fin.

    public static void main(String[] args) {

        int km;
        double costo, total;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("ingrese el costo por KM: ");
        costo = keyboard.nextDouble();


        System.out.print("Ingrese la cantidad de Km recorridos: ");
        km = keyboard.nextInt();

        total = km * costo;


        System.out.println("El precio total es de: $" + total);



    }


}
