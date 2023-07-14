package org.idtics.clases.interfaces;

import java.util.ArrayList;
// import java.util.Comparator;
import java.util.List;

import org.idtics.clases.modelo.Externo;

public class ExternosList implements OrdenarpgsCrud {

    private List<Externo> dataSource;

    public ExternosList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Externo> listar() {
        return dataSource;
    }

    @Override
    public Externo porId(Integer id) {
        Externo resultado = null;
        for (Externo cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Externo cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Externo cliente) {
        Externo c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Externo> listar(String campo, Direccion dir) {
        List<Externo> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Externo> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Externo a, Externo b) {
        int resultado = 0;
        switch (campo) {
            case "id" ->
                resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
