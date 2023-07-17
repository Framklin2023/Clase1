package mytest3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.idtics.clases.modelo.Cliente;
import org.idtics.generics.MyComparator;

public class prueba3 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("María", "Vilca", "Fr0001", 1023.6f));
        clientes.add(new Cliente("luisa", "Roque", "Lc0001", 239.62f));
        clientes.add(new Cliente("José", "Aponte", "Ab0001", 345.23f));
        clientes.add(new Cliente("Leandro", "Quispe", "Ab0002", 123.35f));
        clientes.add(new Cliente("Camila", "Saldaña", "Ab0003", 12333.45f));
        clientes.add(new Cliente("Luz", "Jiménez", "Ot0001", 4123.64f));
        clientes.add(new Cliente("Juanita", "Bonita", "Ab0004", 7123.76f));
        clientes.add(new Cliente("Nicole", "Manzanares", "Fr0002", 5123.96f));
        Cliente.imprimirClientes(clientes);
        Collections.sort(clientes);
        Cliente.imprimirClientes(clientes);
        Collections.sort(clientes, new MyComparator<Cliente>(null, null, true));
        Cliente.imprimirClientes(clientes);
        long tardo = System.currentTimeMillis() - startTime;
        System.out.println("Tiempo de ejecución-------------------------------------------------------------");
        System.out.println(tardo);
    }
}
