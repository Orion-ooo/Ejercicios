import java.util.Scanner;
public class Ej14 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cifra: ");
        String num = entrada.nextLine();
        
        int suma = 0;
        for(int i = 0; i < num.length(); i++){
            suma += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("La suma de todos sus digitos es: " + suma);
        entrada.close();
    }
}
