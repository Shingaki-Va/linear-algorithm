import java.util.Scanner;

public class MyApp1 {
//1. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener
//el área de un triángulo.


    public static void main(String[] args) {

        double base, altura, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ingrese la base del triangulo: ");
        base = keyboard.nextDouble();

        System.out.print("ingrese la altura del triangulo: ");
        altura = keyboard.nextDouble();

        area = (base * altura)/2;

        System.out.print("el area del triangulo es de: "+area);








    }


}
