import java.util.Scanner;
public class Ej53 {
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los lados de su cuadrado:");
        double lados = entrada.nextDouble();

        double area = lados * lados;

        System.out.println("El área de su cuadrado es: " + area);
        entrada.close();
    }
}
