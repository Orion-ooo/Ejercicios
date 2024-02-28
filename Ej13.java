import java.util.Scanner;
public class Ej13 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera cifra: ");
        int cifra1 = entrada.nextInt();

        System.out.println("Ingrese la segunda cifra: ");
        int cifra2 = entrada.nextInt();

        System.out.println("Ingrese la tercera cifra: ");
        int cifra3 = entrada.nextInt();

        int resultCifra1 = cifra1 % 100;
        int resultCifra2 = cifra2 % 100;
        int resultCifra3 = cifra3 % 100;

        System.out.println("Los ultimos digitos de la primera cifra son: " + resultCifra1);
        System.out.println("Los ultimos digitos de la segunda cifra son: " + resultCifra2);
        System.out.println("Los ultimos digitos de la tercera cifra son: " + resultCifra3);

    }
}
