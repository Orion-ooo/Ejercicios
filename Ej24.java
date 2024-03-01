import java.util.Scanner;
public class Ej24 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de pulgadas: ");
        double cantPulgadas = entrada.nextDouble();

        double centimetros = cantPulgadas * 2.54;

        System.out.println("En " + cantPulgadas + " Pulgada/s hay " + centimetros + " Centimetros");

    }
    
}
