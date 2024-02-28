import java.util.Scanner;
public class Ej9 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea calcular su iva: ");
        double cant = entrada.nextDouble();

        double iva = cant * 0.21;
        System.out.println("El iva de la cantidad ingresada es: " + iva);
        entrada.close();
    }
}
