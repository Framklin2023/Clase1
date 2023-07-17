package org.idtics.hilos.ejemplos;

import java.util.ArrayList;
import java.util.List;

import org.idtics.clases.modelo.Cliente;
import org.idtics.hilos.ejemplos.runnable.ImprimirLista;

public class ProbandoHilos {
    public static void main(String[] s) {
        long startTime = System.currentTimeMillis();
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("María", "Vilca", "Fr0001", 1023.6f));
        clientes.add(new Cliente("Pedro", "Manzanares", "Lc0001", 239.62f));
        clientes.add(new Cliente("José", "Aponte", "Ab0001", 345.23f));
        clientes.add(new Cliente("Leandro", "Quispe", "Ab0002", 123.35f));
        clientes.add(new Cliente("Camila", "Saldaña", "Ab0003", 12333.45f));
        clientes.add(new Cliente("Luz", "Jiménez", "Ot0001", 4123.64f));
        clientes.add(new Cliente("Juanita", "Bonita", "Ab0004", 7123.76f));
        clientes.add(new Cliente("Luisa", "Manzanares", "Fr0002", 5123.96f));
        // Cliente.mClientes = clientes;

        List<Cliente> clientes1 = new ArrayList<>();
        clientes1.add(new Cliente("María1", "Vilca", "Fr0001", 1023.6f));
        clientes1.add(new Cliente("Pedro1", "Manzanares", "Lc0001", 239.62f));
        clientes1.add(new Cliente("José1", "Aponte", "Ab0001", 345.23f));
        clientes1.add(new Cliente("Leandro1", "Quispe", "Ab0002", 123.35f));
        clientes1.add(new Cliente("Camila1", "Saldaña", "Ab0003", 12333.45f));
        clientes1.add(new Cliente("Luz1", "Jiménez", "Ot0001", 4123.64f));
        clientes1.add(new Cliente("Juanita1", "Bonita", "Ab0004", 7123.76f));
        clientes1.add(new Cliente("Luisa1", "Manzanares", "Fr0002", 5123.96f));
        new Thread(new ImprimirLista(clientes, true)).start();
        new Thread(new ImprimirLista(clientes1, false)).start();
        long tardo = System.currentTimeMillis() - startTime;
        System.out.println("Tiempo de ejecución-------------------------------------------------------------");
        System.out.println(tardo);
    }

}
