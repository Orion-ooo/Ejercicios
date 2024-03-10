import java.util.Scanner;
public class Ej49 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba algo: ");
        String frase = entrada.nextLine();
        char primeraLetra = sacarPrimeraLetra(frase);
        System.out.println("La primera letra de su frase es: " + primeraLetra);

        entrada.close();
    }
    public static char sacarPrimeraLetra(String frase){
        if (frase == null || frase.isEmpty()) {
            return '\0';
        }
        return frase.charAt(0);
    }
}
