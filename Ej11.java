import java.util.Scanner;
public class Ej11 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Ingrsese la altura del rectangulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;

        System.out.println("EL area del rectangulo es: " + area);
        entrada.close();
    }
}
