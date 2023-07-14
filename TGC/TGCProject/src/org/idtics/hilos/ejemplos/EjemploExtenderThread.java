package org.idtics.hilos.ejemplos;

import org.idtics.hilos.ejemplos.threads.ClaseThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new ClaseThread("Uno");
        hilo.start();
        // Thread.sleep(2);
        Thread hilo2 = new ClaseThread("Dos");
        hilo2.start();

        ClaseThread hilo3 = new ClaseThread("Tres");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
