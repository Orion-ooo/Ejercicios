import java.util.ArrayList;
import java.util.Scanner;
public class Ej28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese varios números (separados por espacios): ");
        String linea = entrada.nextLine();

        for (String numero : linea.split(" ")) {
            numeros.add(Integer.parseInt(numero));
        }
        System.out.println("numeros invertidos: ");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i) + " ");
        }
        entrada.close();
    }
}
