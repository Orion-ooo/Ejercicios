import java.util.Scanner;
public class Ej26 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println(" ingrese el numero que corresponda a su género: ");
        System.out.println("------------------------------------------------");
        System.out.println("            1: Hombre");
        System.out.println("            2: Mujer");
        System.out.println("            3: Otro");
        System.out.println("------------------------------------------------");
        int genero = entrada.nextInt();

        switch (genero) {
            case 1:
                System.out.println("Bienvenido " + nombre);
                break;
            case 2:
                System.out.println("Bienvenida " + nombre);
                break;
            case 3:
                System.out.println("Hola indeciso :)");
                break;
            default:
                System.out.println("Opción incorrecta :(");
                break;
        }
        entrada.close();
    }
}
