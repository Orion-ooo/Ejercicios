import java.util.Scanner;
public class Ej3 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        float base = entrada.nextFloat();

        System.out.println("Ingrese la altura del triangulo: ");
        float altura = entrada.nextFloat();

        System.out.println("-----Formulación-----");
        System.out.println("Base ( " + base + " ) * Altura ( " + altura + " ) / 2 = ");

        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);

        entrada.close();
    }
}
