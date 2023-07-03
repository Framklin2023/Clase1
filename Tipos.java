import java.util.Scanner;

public class Tipos {
    /*
     * Esto es u programa que obtiene el promedio de un número no definido a priori
     * de velores enteros
     * 
     */

    public static void main(String[] args) {
        // Declaro el entero i1
        int entero;
        int cantidad;
        float promedio;
        Scanner sc = new Scanner(System.in);
        cantidad = 0;
        promedio = 0;
        while (true) {
            System.out.print("\nEscriba un número entero no negativo: ");
            entero = sc.nextInt();
            if (entero < 0) {
                promedio = promedio / cantidad;
                System.out.printf("\nEl de los %d enteros introducidos es %4.2f", cantidad, promedio);
                break;
            } else {
                cantidad++;
                promedio = promedio + entero;
            }
        }

    }

}
