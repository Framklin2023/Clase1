package org.idtics.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Uno One", "Dos Two", "Tres Three", "Cuatro Four",
                        "Cinco Five", "Seis Six")
                .distinct();

        String resultado = nombres.reduce("resultado concatenación \n", (a, b) -> a + " -> " + b + "\n");
        System.out.println(resultado);

    }
}
