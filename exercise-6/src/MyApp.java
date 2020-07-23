import java.util.Scanner;

public class MyApp {

//Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el
//diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
//Recuerde que por Pitágoras se tiene que: C^2= B^2+ B^2 . C= sqrt(


    public static void main(String[] args) {

        double lado1, lado2, hipotenusa;




        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese Lado 1");
        lado1 = keyboard.nextDouble();


        System.out.print( "ingrese lado 2");
        lado2 = keyboard.nextDouble();


        hipotenusa = Math.sqrt(Math.pow(lado1,2)+(Math.pow(lado2,2)));

        System.out.print("La hipotenusa Mide: " + hipotenusa);







    }












}
