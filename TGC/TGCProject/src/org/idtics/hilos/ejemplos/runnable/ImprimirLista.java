package org.idtics.hilos.ejemplos.runnable;

import java.util.Collections;
import java.util.List;

import org.idtics.clases.modelo.Cliente;
import org.idtics.generics.MyComparator;

public class ImprimirLista implements Runnable {

    private List<Cliente> l1 = null;
    private Boolean ord = null;

    public ImprimirLista(List<Cliente> l1, Boolean ord) {
        this.l1 = l1;
        this.ord = ord;
    }

    @Override
    public void run() {
        imprimirLista(this.l1, this.ord);
    }

    public synchronized void imprimirLista(List<Cliente> l1, Boolean ord) {
        Collections.sort(l1, new MyComparator<Cliente>(null, null, true));
        Cliente.imprimirClientes(l1);
    }

}
