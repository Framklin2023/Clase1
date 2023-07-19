package org.idtics.generics;

import java.util.*;
// import java.util.Collection;
// import java.util.Collections;
import java.util.IntSummaryStatistics;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.idtics.clases.modelo.Externo;
// import org.idtics.clases.modelo.Interno;

public class EjemploGens {
    public static void main(String[] args) {
        // System.out.println("-------------------------------------------------------------");
        // Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // List<Integer> numeroList = fromArrayToList(numeros);
        // // List<Integer> numeroList = fromArrayToListIntegers(numeros);
        // numeroList.forEach(e -> System.out.println(e));
        // System.out.println("-------------------------------------------------------------");
        // String[] stringsArreglo = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
        // "Siete", "Ocho", "Nueve", "Diez" };
        // List<String> stringsList = fromArrayToList(stringsArreglo);
        // // stringsLista.forEach(e -> System.out.println(e));
        // stringsList.forEach(System.out::println);
        // System.out.println("-------------------------------------------------------------");
        // Float[] floatsArreglo = { 3.9f, 11.8f, 12.7f, 13.6f, 14.5f };
        // List<Float> floatsList = fromArrayToList(floatsArreglo);
        // // floatsList.forEach(System.out::println);
        // System.out.println("-------------------------------------------------------------");
        Externo[] externosArreglo = {
                new Externo("Luca", "Modric"),
                new Externo("Lebrón", "Messi"),
                new Externo("María", "Bonita"),
                new Externo("Ivanna", "Iturbe") };
        // List<Externo> extr = fromArrayToList(externosArreglo);
        // // List<String> names = new ArrayList<>();

        // extr.stream().forEach(e -> System.out.println(e));
        List<Externo> externosList = fromArrayToList(externosArreglo);
        externosList.forEach(System.out::println);
        // // List<Externo> externosList = fromArrayToListaPrint(externosArreglo,
        // floatsArreglo);
        // externosList.forEach(System.out::println);
        System.out.println("Con Stream-------------------------------------------------------------");
        // externosList.stream().forEach(System.out::println);
        // System.out.println("Creando
        // Stream-------------------------------------------------------------");
        Stream<Externo> externos = Stream.of(new Externo("Luca", "Modric"),
                new Externo("Lebrón", "Messi"),
                new Externo("María", "Bonita"),
                new Externo("Ivanna", "Iturbe"))
                .distinct();
        externos.forEach(System.out::println);
        System.out.println("Creando Stream2-------------------------------------------------------------");

        // Stream<Externo> extrs = Stream
        // .of("Uno One", "Dos Two", "Tres Three", "Cuatro Four",
        // "Cinco Five", "Seis Six")
        // .map(nombre -> new Externo(nombre.split(" ")[0], nombre.split(" ")[1]))
        // .distinct();

        // extrs.forEach(System.out::println);
        // System.out.println("Uso de Stream
        // 3-------------------------------------------------------------");

        // IntStream largoNombres = Stream
        // .of("Uno One", "Dos Two", "Tres Three", "Cuatro Four",
        // "Cinco Five", "Seis Six")
        // .map(nombre -> new Externo(nombre.split(" ")[0], nombre.split(" ")[1]))
        // .distinct()
        // .mapToInt(u -> u.toString().length())
        // .peek(System.out::println);

        // // largoNombres.forEach(System.out::println);
        // IntSummaryStatistics stats = largoNombres.summaryStatistics();
        // System.out.println("total: " + stats.getSum());
        // System.out.println("max: " + stats.getMax());
        // System.out.println("Min = " + stats.getMin());
        // System.out.println("promedio :" + stats.getAverage());

        // System.out.println("Uso de filtros con Stream
        // -------------------------------------------------------------");
        // Stream<Externo> filtrado = Stream.of(new Externo("Luca", "Modric"),
        // new Externo("Lebrón", "Messi"),
        // new Externo("María", "Bonita"),
        // new Externo("Ivanna", "Iturbe"))
        // .filter(u -> u.getApellido().equals("Messi"))
        // .peek(System.out::println);
        // List<Externo> lista = filtrado.collect(Collectors.toList());
        // System.out.println("Convirtiendo a lista
        // -------------------------------------------------------------");

        // lista.forEach(System.out::println);
        // System.out.println("-------------------------------------------------------------");
        // Collections.sort(externosList, new MyComparator<Externo>(null, null, false));
        // externosList.forEach(System.out::println);
        // System.out.println("-------------------------------------------------------------");

        // List<Externo> externos = new ArrayList<>();c
        // externos.add(new Externo("Lebrón", "Messi"));

        // // Externo LisExts = externos.iterator().next();

        // Externo[] externosArreglo = { new Externo("Luca", "Modric"),
        // new Externo("Lebrón", "Messi") };

        // System.out.println("-------------------------------------------------------------");
        // List<Externo> externosLista = fromArrayToList(externosArreglo);
        // List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        // List<Float> floatsLista = fromArrayToList(floatsArreglo);

        // externosLista.forEach(e -> System.out.println(e));
        // System.out.println("-------------------------------------------------------------");
        // enterosLista.forEach(e -> System.out.println(e));
        // System.out.println("-------------------------------------------------------------");
        // floatsLista.forEach(e -> System.out.println(e));
        // System.out.println("-------------------------------------------------------------");

        // List<String> nombres = fromArrayToList(new String[] { "One", "Two",
        // "Three", "Four", "Five" }, enterosArreglo);
        // nombres.forEach(System.out::println);

        // List<Interno> externosPremiumList = fromArrayToList(
        // new Interno[] { new Interno("Paco", "Fernández") });

        // imprimirexternos(externos);
        // imprimirexternos(externosLista);
        // imprimirexternos(externosPremiumList);

        // System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        // System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6,
        // 7.78));
        // System.out.println("Máximo de zanahoria, arándanos, manzana es: "
        // + maximo("zanahoria", "arándano", "manzana"));

    }

    // ----------------
    // public static List<String> fromArrayToListString(String[] c) {
    // return Arrays.asList(c);
    // }

    // public static List<Integer> fromArrayToListIntegers(Integer[] c) {
    // return Arrays.asList(c);
    // }

    public static <G> List<G> fromArrayToList(G[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Externo & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
    // for (G elemento : x) {
    // System.out.println(elemento);
    // }
    // return Arrays.asList(c);
    // }

    public static <T, G> List<T> fromArrayToListaPrint(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        System.out.println("fALP-------------------------------------------------------------");
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
