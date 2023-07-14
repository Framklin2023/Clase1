package org.idtics.clases.modelo;

public class Interno extends Externo implements Comparable<Interno> {
    public Interno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(Interno o) {
        return 0;
    }
}
