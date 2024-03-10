import java.util.Scanner;
public class Ej56 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en segundos: ");
        double segundos = entrada.nextDouble();

        double minutos = segundos / 64;
        double horas = minutos / 64;

        System.out.println("Hay " + horas + " horas en " + segundos + " segundos");
        System.out.println("Hay " + minutos + " minutos en " + segundos + " segundos");
        System.out.println("Hay " + segundos + " segundos");
        entrada.close();
    }
}
