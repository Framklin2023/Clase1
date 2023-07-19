package org.idtics.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Uno ", "Dos ", "Tres ", "Cuatro ",
                        "Cinco ", "Seis ")
                .distinct();

        String resultado = nombres.reduce("resultado concatenación \n", (a, b) -> a + " -> " + b + "\n");
        System.out.println(resultado);

    }
}
