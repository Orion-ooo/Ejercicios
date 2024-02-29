import java.util.Scanner;
public class Ej20 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        double num1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        double num2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        double num3 = entrada.nextDouble();

        System.out.println("Ingrese la cuarta nota: ");
        double num4 = entrada.nextDouble();

        System.out.println("Ingresa la quinta nota: ");
        double num5 = entrada.nextDouble();

        double suma = num1 + num2 + num3 + num4 + num5;
        double promedio = suma / 5;
        double doble1 = num1 * 2;
        double doble2 = num2 * 2;
        double doble3 = num3 * 2;
        double doble4 = num4 * 2;
        double doble5 = num5 * 2;

        System.out.println("La suma de todas las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("El doble de las notas son: 1( " + doble1 + " ), 2( " + doble2 + " ), 3( " + doble3 + " ), 4( " + doble4 + " ) y 5( " + doble5 + " )");
    }
}
