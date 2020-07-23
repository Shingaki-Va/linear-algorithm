import java.util.Scanner;

public class MyApp {
    //12. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
    //determinar cuánto pagará finalmente una persona por un artículo equis, considerando
    //que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
    //descuento y el precio final).


    public static void main(String[] args) {

        double precio, desc, fin;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("ingrese el precio de artículo: ");
        precio = keyboard.nextDouble();

        desc = precio - (precio*0.20);
        fin = desc * 1.15;



        System.out.print("El precio con el 20% de descuentos es: "+desc+" y el precio final + iva es: $"+fin);







    }





}
