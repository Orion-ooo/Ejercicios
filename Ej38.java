import java.util.Scanner;
public class Ej38 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        double gramosConsumidos = edad * 8000;
        double cantManzanas = gramosConsumidos / 4;

        System.out.println("Usted a comsumido " + gramosConsumidos + " gramos de manzana en su vida");
        System.out.println("Es decir, " + cantManzanas + " manzanas");

        entrada.close();
    }
}
