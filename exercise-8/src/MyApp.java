import java.util.Scanner;

public class MyApp {
    //8. Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
    //en bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de
    //flujo y pseudocódigo que representen el algoritmo para tal fin.

    public static void main(String[] args) {


        int vel, km, tiempo;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("ingrese la velocidad (k/h) constante del ciclista: ");
        vel = keyboard.nextInt();



        System.out.print("Ingrese la cantidad de km a recorrer: ");
        km = keyboard.nextInt();


        tiempo = km / vel;

        System.out.println("el ciclista tardará " +tiempo+"HS en recorrer "+km+" kilometros");









    }




}
