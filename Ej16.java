import java.util.Scanner;
public class Ej16 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        double nota = entrada.nextDouble();

        if(nota >= 3.0){
            System.out.println("Examen ganado!!!");
        }else{
            System.out.println("Examen perdido...");
        }
        entrada.close();
    }
}
