import java.util.Scanner;
public class Ej15 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese su año de nacimiento: ");
        int año = entrada.nextInt();

        if (año <= 2005 && año > 1920){
            System.out.println("La persona es mayor de edad");
        }else{
            if(año >= 2005 && año < 2024){
                System.out.println("La persona es menor de edad");
            }else{
                System.out.println("La persona esta muerta... ");
            }
        }
    }
}
