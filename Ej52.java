import java.util.Scanner;
public class Ej52 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        int multiplicacion;

        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();
        System.out.println("Tabla del " + num);

        for(int i = 0; i <= 10; i++){
            multiplicacion = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacion);
        }
        entrada.close();
    }
}
