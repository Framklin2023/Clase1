package org.idtics.hilos.ejemplos.threads;

public class ClaseThread extends Thread {
    public ClaseThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Inicia el hilo: " + getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        }
        System.out.println("finaliza el hilo");
    }
}
