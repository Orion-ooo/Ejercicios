import java.util.Scanner;
public class Ej30 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de kilometros: ");
        double kilometros = entrada.nextDouble();

        double metros = kilometros * 1000;
        System.out.println("En " + kilometros + " Km, hay " + metros + " metros");
        entrada.close();
    }
}
