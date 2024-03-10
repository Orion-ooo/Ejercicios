import java.util.Scanner;
public class Ej45 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        float num = entrada.nextFloat();

        if(num < 0){
            System.out.println(-1);
        }else if(num > 0){
            System.out.println(1);
        }else if (num == 0){
            System.out.println(0);
        }
        entrada.close();
    }
}
