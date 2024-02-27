import java.util.Scanner;
public class Ej5 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la Diagonal mayor: ");
        float d1 = entrada.nextFloat();
        System.out.println("Ingrese el valor de la Diagonal menor: ");
        float d2 = entrada.nextFloat();

        float area = (d1 * d2) / 2;
        System.out.println("El area del Rombo es: " + area);
        entrada.close();
    }
}
