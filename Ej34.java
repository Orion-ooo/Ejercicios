import java.util.Scanner;
public class Ej34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double descuento = 0;
        double total;
        System.out.println("Ingrese el monto de su compra en pesos:");
        double monto = entrada.nextDouble();

        if (monto > 1000){
            descuento = monto * 0.10;
            System.out.println("Se le aplicará un descuento del 10% a su compra");
        }else if (monto > 500 && monto <= 1000){
            descuento = monto * 0.20;
            System.out.println("Se le aplicará un descuento del 20% a su compra");
        }
        if (monto <= 500){
            System.out.println("No se le aplicará ningun descuento");
        }
        total = monto - descuento;

        System.out.println("El dinero descontado es " + descuento + "$");
        System.out.println("Siendo así, debe pagar: " + total + "$");
        
        entrada.close();
    }
}
