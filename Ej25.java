import java.util.Scanner;
public class Ej25 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados centigrados (C°):");
        double centigrados = entrada.nextDouble();

        double fahrenheit = ((centigrados * 9) / 5) + 32;

        System.out.println("La temperatura ingresada en grados Fahrenheit es: " + fahrenheit + " °F");
        entrada.close();
    }
}
