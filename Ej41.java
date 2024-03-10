import java.util.Scanner;
public class Ej41 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        int mesesVida = edad * 12;
        double metrosPeloporVida = (mesesVida * 0.5) / 100;
        System.out.println("Si usted desde que nació no se hubiera cortado el pelo, el tamaño de este seria de " + metrosPeloporVida + " metros");
        entrada.close();
    }
}
