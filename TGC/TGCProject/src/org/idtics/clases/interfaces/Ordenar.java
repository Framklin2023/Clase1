package org.idtics.clases.interfaces;

import java.util.List;

import org.idtics.clases.modelo.Externo;

public interface Ordenar {
    List<Externo> listar(String campo, Direccion dir);
}
