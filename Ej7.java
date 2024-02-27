import java.util.Scanner;
public class Ej7 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();

        if(num > 0){
            System.out.println("El número es positivo");
        }else{
            if(num < 0){
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es cero");
            }
        }
    }
    
}
