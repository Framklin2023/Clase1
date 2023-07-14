package org.idtics.hilos.ejemplos;

import org.idtics.hilos.ejemplos.runnable.ClaseTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ClaseTarea("Definir necesidades")).start();
        new Thread(new ClaseTarea("Diseñar solución")).start();
        new Thread(new ClaseTarea("Implementar solución")).start();
        new Thread(new ClaseTarea("Hacer pruebas")).start();
        new Thread(new ClaseTarea("Tareas posteriores")).start();
    }
}
