import java.util.Scanner;
public class Ej26 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud de su primer cateto:");
        double cateto1 = entrada.nextDouble();

        System.out.println("Ingrese la longitud de su segundo cateto:");
        double cateto2 = entrada.nextDouble();

        double hip = cateto1 + cateto2;

        System.out.println("EL cuadrado de la hipotenusa es: " + hip);
        entrada.close();
    }
}