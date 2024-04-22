import java.util.Scanner;

public class Ej161 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Digite la primera variable:");
        int variable1 = entrada.nextInt();
            
        System.out.println("Digite la segunda variable:");
        int variable2 = entrada.nextInt();
            
        System.out.println("Valores originales");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
            
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;
            
        System.out.println("Valores intercambiados:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
        entrada.close();
    }
}
