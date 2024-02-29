import java.util.Scanner;
public class Ej17 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double n1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double n2 = entrada.nextDouble();

        if(n1 > n2){
            System.out.println("El número mayor es: " + n1);
        }else{
            System.out.println("El número mayor es: " + n2);
            }
        entrada.close();
    }
}
