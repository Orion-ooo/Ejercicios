import java.util.Scanner;
public class Ej36 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        double tarifa = 15.00;

        System.out.println("Ingrese el numero de horas en los que hizo uso del parqueadero: ");
        int horas = entrada.nextInt();

        var cobro = tarifa * horas;
        System.out.println("Debe cancelar " + cobro + "$ por el uso del parqueadero");
        entrada.close();
    }
}
