package org.idtics.myinterfaces.codigos;

import java.util.List;

import org.idtics.myinterfaces.modelo.Externo;

public interface Ordenar {
    List<Externo> listar(String campo, Direccion dir);
}
