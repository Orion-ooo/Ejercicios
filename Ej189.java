import java.util.Scanner;
public class Ej189{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese coordenada x de arranque: ");
        int xInicial = entrada.nextInt();

        System.out.print("Ingrese coordenada y de arranque: ");
        int yInicial = entrada.nextInt();

        System.out.print("Ingrese coordenada x de destino: ");
        int xDestino = entrada.nextInt();

        System.out.print("Ingrese coordenada y de destino: ");
        int yDestino = entrada.nextInt();

        boolean movimientoValido = isValidHorseMove(xInicial, yInicial, xDestino, yDestino);

        if (movimientoValido) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }
        entrada.close();
    }
    private static boolean isValidHorseMove(int xInicial, int yInicial, int xDestino, int yDestino) {
        if (xInicial < 0 || xInicial > 7 || yInicial < 0 || yInicial > 7 ||
                xDestino < 0 || xDestino > 7 || yDestino < 0 || yDestino > 7) {
            return false;
        }
        int dx = Math.abs(xDestino - xInicial);
        int dy = Math.abs(yDestino - yInicial);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
