import java.util.Scanner;
public class Ej48 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        float num1 = entrada.nextFloat();

        System.out.println("Ingrese el segundo número: ");
        float num2 = entrada.nextFloat();

        float suma = num1 + num2;
        System.out.println("Su suma: " + suma);

        float resta = num1 - num2;
        System.out.println("Su resta: " + resta);

        float multiplicacion = num1 * num2;
        System.out.println("Su multiplicación: " + multiplicacion);

        float division = num1 / num2;
        System.out.println("Su división: " + division);

        float resto = num1 % num2;
        System.out.println("El resto de su división: " + resto);

        entrada.close();
    }
}
