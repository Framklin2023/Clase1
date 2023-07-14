package org.idtics.hilos.ejemplos;

import org.idtics.hilos.ejemplos.threads.ClaseThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread uno = new ClaseThread("Uno");
        uno.start();
        // Thread.sleep(2);
        Thread dos = new ClaseThread("Dos");
        dos.start();

        ClaseThread tres = new ClaseThread("Tres");
        tres.start();

        ClaseThread cuatro = new ClaseThread("Cuatro");
        cuatro.start();
        System.out.println("Aquí seguiría funcionando el método main: ");
    }
}
