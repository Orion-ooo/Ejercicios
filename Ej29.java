import java.util.Scanner;
public class Ej29 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número a calcular: ");
        float numero = entrada.nextFloat();

        float cubo = (float) Math.pow(numero,3);

        System.out.println("El cubo de " + numero + " es " + cubo);
        entrada.close();
    }
}
