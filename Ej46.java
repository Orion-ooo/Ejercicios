import java.util.Scanner;
public class Ej46 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas maritimas:");
        double disMillas = entrada.nextDouble();

        double metros = disMillas * 1852;
        System.out.println("La distancia en metros que hay en " + disMillas + " millas maritimas son " + metros + " m");
        entrada.close();
    }
}
