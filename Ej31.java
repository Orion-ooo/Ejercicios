import java.util.Scanner;
public class Ej31 {
    public static void main(String [] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo (milimetros): ");
        var base = entrada.nextFloat();

        System.out.println("Ingrese la altura del triangulo (milimetros): ");
        var altura = entrada.nextFloat();

        double areaMm = (base * altura) / 2;
        double areaCm = areaMm / 100;
        double areaMetros = areaMm / 1000000;

        System.out.println("El área del triangulo en milimetros al cuadrado es de: " + areaMm + " mm^2");
        System.out.println("en centimetros al cuadrado es de: " + areaCm + " Cm^2");
        System.out.println("y en metros al cuadrado es de: " +  areaMetros + " m^2");
        entrada.close();
    }
}
