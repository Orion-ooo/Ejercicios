import java.util.Scanner;
public class Ej37 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        double tarifa = 15.00;

        System.out.println("Ingrese solo las horas en los que hizo uso del parqueadero: ");
        int horas = entrada.nextInt();
        System.out.println("Ingrese los minutos en los que hizo uso del parqueadero: ");
        int minutos = entrada.nextInt();

        if(minutos > 10){
            horas = horas + 1;
        }

        var cobro = tarifa * horas;
        System.out.println("Debe cancelar " + cobro + "$ por el uso del parqueadero");
        entrada.close();
    }
}
