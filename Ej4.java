import java.util.Scanner;
public class Ej4 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio del circulo: ");
        double radio = entrada.nextFloat();
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: " + area);
        entrada.close();
    }
}
