import java.util.Scanner;
public class Ej75{
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el año a consultar: ");
        int año = entrada.nextInt();

        if(bisiesto(año)){
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
        entrada.close();
    }

    public static boolean bisiesto(int año){
        if (año % 4 == 0){
            return true;
        }
        if (año % 100 == 0){
            return false;
        }
        if (año % 400 == 0 ){
            return true;
        }
            return false;
        
    }
}
