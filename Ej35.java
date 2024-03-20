import java.util.Scanner;
public class Ej35 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        double horasExtras = 0;
        double pagoHorasExtras;
        double pagoTotal;
        double pago;

        System.out.println("Ingrese la tarifa de pago por horas: ");
        double tarifa = entrada.nextDouble();

        System.out.println("ingrese las horas de trabajo mensual: ");
        double horasTrabajo = entrada.nextDouble();

        if (horasTrabajo > 40){
            horasExtras = horasTrabajo - 40;
        }
        pagoHorasExtras = (horasExtras * 0.50) * tarifa;
        pago = tarifa * horasTrabajo;
        pagoTotal = pago + pagoHorasExtras;

        System.out.println("Tiene " + horasExtras + " hora/s extra/s de trabajo");
        System.out.println("tiene " + pagoHorasExtras + "$ por horas extras");
        System.out.println("El pago total será de: " + pagoTotal);

        entrada.close();
    }
}
