package org.idtics.hilos.ejemplos;

// import org.idtics.hilos.ejemplos.runnable.ClaseTarea;

public class EjemploInterfaceRunnable2 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmente : " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje, "Definir necesidades");
        Thread v2 = new Thread(viaje, "Diseñar solución");
        Thread v3 = new Thread(viaje, "Implementar solución");
        Thread v4 = new Thread(viaje, "Hacer pruebas");
        Thread v5 = new Thread(viaje, "Tareas posteriores");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        v5.join();
        // Thread.sleep(10000);
        System.out.println("Aquí seguiría funcionando el método main: " + main.getName());

    }
}
