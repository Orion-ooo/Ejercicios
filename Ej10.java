import java.util.Scanner;
public class Ej10 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Ingrsese la altura del triangulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("EL area del triangulo es: " + area);
    }
}
