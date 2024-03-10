import java.util.Scanner;
public class Ej77 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el capital del préstamo: ");
        double capital = entrada.nextDouble();

        System.out.println("Ingrese el interés anual: ");
        double interesAnual = entrada.nextDouble();

        System.out.println("Ingrese el número de años: ");
        int numAnios = entrada.nextInt();

        double tasaMensual = interesAnual / 1200;
        double pagoMensual = (tasaMensual * capital) / (1 - Math.pow(1 + tasaMensual, -numAnios * 12));

        System.out.println("El pago mensual de la hipoteca es: " + pagoMensual);
        entrada.close();
    }
}
