import java.util.Scanner;

public class MyApp {

//3. Una empresa que contrata personal requiere determinar la edad de las personas que
//solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
//que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo
//para solucionar este problema.

    public static void main(String[] args) {

        int anioAct, nacimiento, edad;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("ingrese el año actual: ");
        anioAct = keyboard.nextInt();

        System.out.print("ingrese Año de nacicimiento del empleade: ");
        nacimiento = keyboard.nextInt();

        edad = anioAct - nacimiento;

        System.out.println("la edad del empleade es: " + edad + " años");


    }


}
