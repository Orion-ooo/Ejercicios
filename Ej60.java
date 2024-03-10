import java.util.ArrayList;
import java.util.Scanner;
public class Ej60 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca un número: ");
        int numero;
        while ((numero = entrada.nextInt()) != 0) {
            numeros.add(numero);
            System.out.println("Introduzca otro número (0 para terminar): ");
        }
        System.out.println("Estos son los números que usted ingresó: ");
        for (int num : numeros) {
            if (num > 0) {
                System.out.println(num);
            }
        }
        entrada.close();
    }
}
