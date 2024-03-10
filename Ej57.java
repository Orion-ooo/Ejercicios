import java.util.Scanner;
public class Ej57 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cifra: ");
        int cifra = entrada.nextInt();
        int suma = suma(cifra);
        System.out.println("La suma de los digitos de la cifra " + cifra + " es: " + suma);
        entrada.close();
    }
    public static int suma(int cifra) {
        int suma = 0;
        while (cifra > 0) {
        suma += cifra % 10;
        cifra /= 10;
        }
        return suma;
    }
}
