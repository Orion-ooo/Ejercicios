import java.util.Scanner;
public class Ej42 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuantos kilovoltios necesita para su sistema de ilumunación: ");
        double kilovoltios = entrada.nextDouble();
        
        double kilovoltiosAvoltios = kilovoltios * 1000;
        double numNaranjas = kilovoltiosAvoltios / 0.05;
        double gramosNaranjas = numNaranjas * 6;
        double tonNaranjas = gramosNaranjas / 1000000;

        System.out.println("Para cubrir la necesidad de " + kilovoltios + " kilovoltios, son necesarias " + numNaranjas + " naranjas.");
        System.out.println("Es decir, " + tonNaranjas + " Toneladas de naranjas");
        entrada.close();
    }
}
