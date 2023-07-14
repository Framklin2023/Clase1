package org.idtics.myinterfaces.codigos;

import java.util.List;

import org.idtics.myinterfaces.modelo.Externo;

public interface Crud {
    List<Externo> listar();

    Externo porId(Integer id);

    void crear(Externo cliente);

    void editar(Externo cliente);

    void eliminar(Integer id);
}
