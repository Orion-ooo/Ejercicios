import java.util.Scanner;
public class Ej47 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuanto es el valor de la compra?");
        double valor = entrada.nextDouble();

        System.out.println("¿Cuanto pagó por la compra?");
        double pago = entrada.nextDouble();

        double descuento = valor - pago;
        double porcentaje = (descuento / valor) * 100;

        System.out.println("El descuento que se le aplico fue del " + porcentaje + "%, es decir, " + descuento);
        entrada.close();
    }
}
