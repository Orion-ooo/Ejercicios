import java.util.Scanner;
public class Ej6 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        double n1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
        double n2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer valor: ");
        double n3 = entrada.nextDouble();

        double mediaA = (n1 + n2 + n3) / 3;
        System.out.println("La media aritmetica o promedio para los valores ingresados es: " + mediaA);
    }
}
