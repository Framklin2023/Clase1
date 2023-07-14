package org.idtics.myinterfaces.codigos;

import java.util.List;

import org.idtics.myinterfaces.modelo.Externo;

public interface Paginar {
    List<Externo> listar(int desde, int hasta);
}
