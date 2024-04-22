import java.util.Scanner;
public class Ej193{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar número decimal
        System.out.print("Ingrese un número decimal (entre 1 y 255): ");
        int numeroDecimal = entrada.nextInt();

        // Validar rango del número
        if (numeroDecimal < 1 || numeroDecimal > 255) {
            System.out.println("Error: El número debe estar entre 1 y 255.");
            return;
        }
        String binario = Integer.toBinaryString(numeroDecimal);

        while (binario.length() < 8) {
            binario = "0" + binario;
        }
        System.out.println("El número " + numeroDecimal + " en binario es: " + binario);
        entrada.close();
    }
}

