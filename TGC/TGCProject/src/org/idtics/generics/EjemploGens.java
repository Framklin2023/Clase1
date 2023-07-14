package org.idtics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.idtics.clases.modelo.Externo;
import org.idtics.clases.modelo.Interno;

public class EjemploGens {
    public static void main(String[] args) {

        List<Externo> externos = new ArrayList<>();
        externos.add(new Externo("Lebrón", "Messi"));

        // Externo LisExts = externos.iterator().next();

        Externo[] externosArreglo = { new Externo("Luca", "Modric"),
                new Externo("Lebrón", "Messi") };
        Integer[] enterosArreglo = { 1, 2, 3 };

        List<Externo> externosLista = fromArrayToList(externosArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        externosLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[] { "Andrés", "Pepe",
                "Luci", "Bea", "John" }, enterosArreglo);
        nombres.forEach(System.out::println);

        List<Interno> externosPremiumList = fromArrayToList(
                new Interno[] { new Interno("Paco", "Fernández") });

        imprimirexternos(externos);
        imprimirexternos(externosLista);
        imprimirexternos(externosPremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: "
                + maximo("zanahoria", "arándano", "manzana"));

    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Externo & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirexternos(List<? extends Externo> externos) {
        externos.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}