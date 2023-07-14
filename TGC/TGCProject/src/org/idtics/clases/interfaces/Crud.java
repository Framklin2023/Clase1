package org.idtics.clases.interfaces;

import java.util.List;

import org.idtics.clases.modelo.Externo;

public interface Crud {
    List<Externo> listar();

    Externo porId(Integer id);

    void crear(Externo cliente);

    void editar(Externo cliente);

    void eliminar(Integer id);
}
