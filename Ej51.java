import java.util.Scanner;
public class Ej51 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
        double hipotenusa, lado1, lado2, perimetro = 0;
        String sms;

        System.out.println("Ingrese la base de su triangulo:");
        double base = entrada.nextDouble();

        System.out.println("Ingrese la altura de su triangulo:");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El area de su rectangulo es: " + area);
        System.out.println("El perimetro de su triangulo es: " + perimetro);

        if (rectangular(base, altura)) {
            hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
            perimetro = base + altura + hipotenusa;
            sms = "Es rectangulo";
        } else {
            lado1 = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2) - 2 * base * altura * Math.cos(Math.toRadians(60)));
            lado2 = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2) - 2 * base * altura * Math.cos(Math.toRadians(120)));
            perimetro = base + altura + lado1 + lado2;
            sms = "no es rectangulo";
        }
        entrada.close();
    }
    public static boolean rectangular(double base, double altura){
        return Math.abs(Math.cos(Math.toRadians(90))) < 0.001;
    }
}
