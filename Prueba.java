import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int n1 = sc.nextInt();
        System.out.print("\nPrimer número: ");
        int n2 = sc.nextInt();
        float res = 0;
        try {
            res = MisExcepcionesExceptions.divP(n1, n2);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Funciona y da el valor :" + res);

    }
}
