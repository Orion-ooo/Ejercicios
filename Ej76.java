import java.util.Scanner;
public class Ej76 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cifra: ");
        int cifra = entrada.nextInt();
        int numCifras = tamaño(cifra);

        System.out.println("El número de cifras que hay en " + cifra + " son " + numCifras);

        entrada.close();
    }

    public static int tamaño(int cifra){
        int numCifras = 0;
        while (cifra > 0) {
            cifra /= 10;
        numCifras++;
        }
        return numCifras;
    }
}
