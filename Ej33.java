import java.util.Scanner;

public class Ej33{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int empleadosMas700 = 0;
        double promedioSalario = 0;
        int totalMujeres = 0;
        int totalVarones = 0;
        int totalEmpleados = 0;

        System.out.println("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = entrada.nextInt();

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("Empleado " + i);
            System.out.println("Ingrese el sexo (M/F):");
            String sexo = entrada.next().toUpperCase();
            System.out.println("Ingrese el salario:");
            double salario = entrada.nextDouble();

            if (salario > 700) {
                empleadosMas700++;
            }
            promedioSalario += salario;
            if (sexo.equals("M")) {
                totalMujeres++;
            } else if (sexo.equals("F")) {
                totalVarones++;
            } else {
                System.out.println("Sexo no válido :( Ingrese M o F.");
            }
            totalEmpleados++;
        }
        promedioSalario /= totalEmpleados;
        double porcentajeMujeres = (double) totalMujeres / totalEmpleados * 100;
        double porcentajeVarones = (double) totalVarones / totalEmpleados * 100;
        System.out.println("\nEstadísticas de los empleados:");
        System.out.println("Cantidad de personas que ganan más de 700: " + empleadosMas700);
        System.out.println("Promedio de salarios: " + promedioSalario);
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de varones: " + porcentajeVarones + "%");
        entrada.close();
    }
}
