import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //defino variables
        int num1;
        int num2;
        int result;

        //habilito metodo para ingresar datos
        Scanner keyboard = new Scanner(System.in);

        //lee datos
        System.out.print("ingreses num 1: ");
        num1 = keyboard.nextInt();
        System.out.print("ingreses num 2: ");
        num2 = keyboard.nextInt();

        //almaceno datos en result
        result = num1 + num2;

        System.out.println("El resultado es: " + result);






    }
}
