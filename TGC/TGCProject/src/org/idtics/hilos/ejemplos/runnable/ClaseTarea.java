package org.idtics.hilos.ejemplos.runnable;

public class ClaseTarea implements Runnable {
    private String nombre;

    public ClaseTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalmente termina el proyecto: " + nombre);

    }
}
