import java.util.Scanner;
public class Ej63 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduzca un número: ");
        while ((numero = entrada.nextInt()) > 0) {
            if(numero >= 20 && numero <= 30){
                break;
            }
            suma += numero;
            System.out.println("Introduzca otro número (entre 20 y 30 para terminar): ");
        }
        System.out.println("La suma de los valores ingresados es: " + suma);
        entrada.close();
    }
}
