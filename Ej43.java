import java.util.Scanner;
public class Ej43 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        
        if(num1 > num2){
            System.out.println("El numero mayor es: " + num1);
        }else{
            System.out.println("El numero mayor es: " + num2);
        }
        entrada.close();
    }
}
