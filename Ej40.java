import java.util.Scanner;
public class Ej40{
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los kilos de oro a convertir: ");
        double kilosOro = entrada.nextDouble();

        System.out.println("Ingrese el precio del oro en pesos por onzas: ");
        double precioPorOnza = entrada.nextDouble();

        double gramosOro = kilosOro * 1000;
        double onzasOro = gramosOro / 28.3495;
        double montoPesos = onzasOro * precioPorOnza;

        System.out.println("El monto en pesos $" + montoPesos);
        entrada.close();
    }
}