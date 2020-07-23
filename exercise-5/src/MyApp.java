import java.util.Scanner;

public class MyApp {

    //5. Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
    //Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que
    //representen el algoritmo que le permita ir generando presupuestos para cada cliente.


    public static void main(String[] args) {

        double metro, precio, total;

        Scanner keyboar = new Scanner(System.in);

        System.out.print("ingrese la tarifa por metro cuadrado: ");
        precio = keyboar.nextDouble();

        System.out.print("ingrese la cantidad de metros cuadrados a pintar: ");
        metro = keyboar.nextDouble();

        total = metro * precio;

        System.out.println("El precio para pintar "+metro+" metros cuadrados es de: $"+total);










    }

}
