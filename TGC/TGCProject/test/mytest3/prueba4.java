package mytest3;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

import org.idtics.clases.modelo.Cliente;
// import org.idtics.generics.MyComparator;
// import org.idtics.hilos.ejemplos.threads.ClaseThread;
// import org.idtics.hilos.ejemplos.runnable.ImprimirFrases;
// import org.idtics.hilos.ejemplos.runnable.ImprimirLista;

public class prueba4 {
    public static void main(String[] args) throws InterruptedException {
        // final long startTime = System.currentTimeMillis();
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("María", "Vilca", "Fr0001", 1023.6f));
        clientes.add(new Cliente("luisa", "Roque", "Lc0001", 239.62f));
        clientes.add(new Cliente("José", "Aponte", "Ab0001", 345.23f));
        clientes.add(new Cliente("Leandro", "Quispe", "Ab0002", 123.35f));
        clientes.add(new Cliente("Camila", "Saldaña", "Ab0003", 12333.45f));
        clientes.add(new Cliente("Luz", "Jiménez", "Ot0001", 4123.64f));
        clientes.add(new Cliente("Juanita", "Bonita", "Ab0004", 7123.76f));
        clientes.add(new Cliente("Nicole", "Manzanares", "Fr0001", 5123.96f));
        Cliente.mClientes = clientes;
        // Thread asc = new Thread("Asc");
        // asc.start();
        // Thread des = new Thread("Des");
        // des.start();
        // new Thread(new ImprimirLista(mClientes, true)).start();
        System.out.println("Tiempo de ejecución-------------------------------------------------------------");
    }

    // @Override
    // public void run() {
    // String tarea = getName();
    // List<Cliente> clis = new ArrayList<>();
    // clis = Cliente.mClientes;

    // switch (tarea) {
    // case "Asc":
    // Collections.sort(clis, new MyComparator<Cliente>(null, null, true));
    // Cliente.imprimirClientes(clis);
    // // long tardo = System.currentTimeMillis() - startTime;
    // break;
    // case "Des":
    // Collections.sort(clis, new MyComparator<Cliente>(null, null, true));
    // Cliente.imprimirClientes(clis);
    // break;
    // default:
    // break;
    // }

    // }
    // public synchronized static void imprimirLista(List<Cliente> clis, Boolean b)
    // {
    // // Collections.sort(clis, new MyComparator<Cliente>(null, null, true));
    // // Cliente.imprimirClientes(clis);

    // // switch (tarea) {
    // // case "Asc":
    // // Collections.sort(clis, new MyComparator<Cliente>(null, null, true));
    // // Cliente.imprimirClientes(clis);
    // // // long tardo = System.currentTimeMillis() - startTime;
    // // break;
    // // case "Des":
    // // Collections.sort(clis, new MyComparator<Cliente>(null, null, true));
    // // Cliente.imprimirClientes(clis);
    // // break;
    // // default:
    // // break;
    // // }
    // }
}