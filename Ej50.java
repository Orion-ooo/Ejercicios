import java.util.Scanner;
public class Ej50 {
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        float num1 = entrada.nextFloat();

        System.out.println("Ingrese un segundo número:");
        float num2 = entrada.nextFloat();

        System.out.println("Ingrese un último número:");
        float num3 = entrada.nextFloat();

        float suma = num1 + num2 + num3;
        float multiplicacion = num1 * num2 * num3;

        System.out.println("Suma: (" + num1 + ") + (" + num2 + ") + (" + num3 + ") = " + suma);
        System.out.println("Multiplicación: (" + num1 + ") * (" + num2 + ") * (" + num3 + ") = " + multiplicacion);
        entrada.close();
    }
}
