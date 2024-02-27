import java.util.Scanner;
public class Ej2 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su texto: ");
        String texto = entrada.nextLine();
        System.out.println("El texto ingresado fue: " + texto);
        entrada.close();
    }
}
