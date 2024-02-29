import java.util.Scanner;
public class Ej19 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del trabajador: ");
        int sueldoBasico = entrada.nextInt();

        System.out.println("Ingrese el valor de las horas extras: ");
        int horasExtras = entrada.nextInt();

        System.out.println("Ingrese la cantidad de horas extras del trabajador");
        int cantHorasExtras = entrada.nextInt();

        int montoxHrasExtras =horasExtras * cantHorasExtras;

        int sueldoTotal = sueldoBasico + montoxHrasExtras;

        int desc = (sueldoTotal * 20) / 100;

        System.out.println("El suledo básico del trabajador es: $" + sueldoBasico);
        System.out.println("El descuento aplicado fue del 20%, su descuento fue: " + desc);
        System.out.println("El monto total ganado por el trabajador fue: " + sueldoTotal);
        entrada.close();
    }
}
