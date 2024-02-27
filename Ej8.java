import java.util.Scanner;
public class Ej8 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        double dividendo = entrada.nextDouble();

        System.out.println("Ingrese el divisor: ");
        double divisor = entrada.nextDouble();

        double resto = dividendo % divisor;
        System.out.println("El resto de la división es: " + resto);
    }
    
}
