import java.util.Scanner;
public class Ej64 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de x: ");
        int resultado = 1;
        int x = entrada.nextInt();

        System.out.println("Ingrese el valor de y: ");
        int y = entrada.nextInt();

        if (y == 0){
            resultado = 1;
        }else{
            for (int i = 0; i < y; i++){
                resultado *= x;
            }
        }
        System.out.println("El resultado de " + x + " elevado a " + y + " ( " + x + "^" + y + " ) es: " + resultado);

        entrada.close();
    }
}
