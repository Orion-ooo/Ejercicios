import java.util.Scanner;
public class Ej22 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número real: ");
        double real = entrada.nextDouble();

        int parteEntera = (int) real;
        double parteDecimal = real - parteEntera;

        System.out.println("La parte entera del número real es: " + parteEntera);
        System.out.println("La parte Decimal del número real es: " + parteDecimal);
        entrada.close();
    }
}
