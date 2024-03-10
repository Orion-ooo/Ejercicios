import java.util.Scanner;
public class Ej59 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nummero del 1 al 10:");
        int numero = entrada.nextInt();

        System.out.println("Taba del " + numero);

        if(numero > 0 && numero <= 10){
            for(int i = 1; i <= 10; i++){
                int tabla = numero * i;
                System.out.println(numero + " x " + i + " = " + tabla);
            }
        }else{
            System.out.println("El numero que debe ingresar debe estar entre 1 y 10");
        }
        entrada.close();
    }
}
