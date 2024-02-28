import java.util.Scanner;
public class Ej12 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        double n1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
        double n2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer valor: ");
        double n3 = entrada.nextDouble();

        double mediaA = (n1 + n2 + n3) / 3;
        double suma = n1 + n2 + n3;
        double dobleN1 = n1 * 2;
        double tripleN2 = n2 * 3;
        double cuadradoN3 = n3 * n3;

        System.out.println("El promedio para los valores ingresados es: " + mediaA);
        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("El doble del primer valor es: " + dobleN1);
        System.out.println("El triple del segundo valor es: " + tripleN2);
        System.out.println("El cuadrado del tercer valor es: " + cuadradoN3);
        entrada.close();
    }
}
