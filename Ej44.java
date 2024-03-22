public class Ej44 {
    public static void main(String[] abc){
        double pi = Math.PI;
        for(int i = 2; i <= 10; i++){
            double potencia = potencia(pi, i);
            double raizCuadrada = Math.sqrt(potencia);
            
            System.out.println("La potencia de PI elevado a la " + i + "-ésima potencia es: " + potencia);
            System.out.println("La raíz cuadrada de dicha potencia es: " + raizCuadrada);
        }
    }
    public static double potencia(double base, int exponente){
        return Math.pow(base, exponente);
    }
}
