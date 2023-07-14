package org.idtics.clases.interfaces;

import java.util.List;

import org.idtics.clases.modelo.Externo;

public interface Paginar {
    List<Externo> listar(int desde, int hasta);
}
