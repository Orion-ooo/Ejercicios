import java.util.Scanner;
public class Ej39 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su año de nacimiento: ");
        int año = entrada.nextInt();

        int edad = 2024 - año;
        double diasVida = edad * 365.25;
        double diasSueño = (diasVida * 34.0) / 100;

        System.out.println(nombre + ", usted a dormido " + diasSueño + " dias, durante toda su vida");
        entrada.close();
    }
}
