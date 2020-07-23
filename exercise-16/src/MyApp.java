import java.util.Scanner;

public class MyApp {

    //16. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para encontrar
    //el área de un cuadrado.


    public static void main(String[] args) {

        double lado, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida del lado de cuadrado: ");
        lado = keyboard.nextDouble();

        area = lado * lado;

        System.out.print( "el área del cuadrado es de: "+area);









    }




}
