import java.util.Scanner;
public class Ej32 {
    public static void main(String [] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo (metros): ");
        var base = entrada.nextFloat();

        System.out.println("Ingrese la altura del rectangulo (metros): ");
        var altura = entrada.nextFloat();

        double areaMetros = base * altura;
        double areaCm = areaMetros * 100 * 100;
        double areaMm = areaMetros * 1000 * 1000;

        System.out.println("El área del Rectangulo en metros al cuadrado es de: " + areaMetros + " m^2");
        System.out.println("en centimetros al cuadrado es de: " + areaCm + " Cm^2");
        System.out.println("y en milimetros al cuadrado es de: " +  areaMm + " mm^2");
        entrada.close();
    }
}
