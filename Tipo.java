import java.util.Scanner;

public class Tipo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1;
        short s1;
        byte b1;
        long l1;
        char c1;
        boolean bo1;
        float f1;
        double d1;

        System.out.println("\n-----------------------------------------Enteros-");
        System.out.println("\nEscribe un número entero tipo int: ");
        i1 = sc.nextInt();
        System.out.println("Introdujo: " + i1);

        System.out.println("\nEscribe un número entero tipo short: ");
        s1 = sc.nextShort();
        System.out.println("Introdujo: " + s1);

        System.out.println("\nEscribe un número entero tipo byte: ");
        b1 = sc.nextByte();
        System.out.println("Introdujo: " + b1);

        System.out.println("\nEscribe un número entero long: ");
        l1 = sc.nextLong();
        System.out.println("Introdujo: " + l1);

        System.out.println("\n-----------------------------------------Char-");
        System.out.println("\nEscribe un char: ");
        c1 = sc.next().charAt(0);
        System.out.println("Introdujo: " + c1);

        System.out.println("\nEscribe un char: ");
        c1 = sc.next().charAt(0);
        System.out.println("Introdujo: " + c1);

        System.out.println("\n-----------------------------------------Boolean-");
        System.out.println("\nEscribe un true o false: ");
        bo1 = sc.nextBoolean();
        System.out.println("Introdujo: " + bo1);

        System.out.println("\n-----------------------------------------Float y Double-");
        System.out.println("\nEscribe un número float: ");
        f1 = sc.nextFloat();
        System.out.println("Introdujo: " + f1);

        System.out.println("\nEscribe un número double: ");
        d1 = sc.nextDouble();
        System.out.println("Introdujo: " + d1);

        System.out.println("\nFin del programa!");
    }
}