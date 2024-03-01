import java.util.Scanner;
public class Ej21 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int valor2 = entrada.nextInt();

        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.println("El primer valor cambia a: " + valor1);
        System.out.println("El segundo valor cambia a: " + valor2);
    }
}
