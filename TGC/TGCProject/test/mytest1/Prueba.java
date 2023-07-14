package mytest1;

import java.util.List;

import org.idtics.clases.interfaces.*;
import org.idtics.clases.modelo.Externo;

public class Prueba {
    public static void main(String[] args) {

        OrdenarpgsCrud listord = new ExternosList();
        listord.crear(new Externo("Camila", "Saldaña"));
        listord.crear(new Externo("Mario", "Vargas"));
        listord.crear(new Externo("David", "Martínez"));
        listord.crear(new Externo("Pamela", "Franco"));
        listord.crear(new Externo("Vianny", "Rojas"));
        listord.crear(new Externo("Giselle", "Dávila"));
        listord.crear(new Externo("Daniel", "Otárolaz"));
        listord.crear(new Externo("Luis", "Quispe"));

        List<Externo> externos = listord.listar();
        externos.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Externo> paginable = listord.listar(1, 8);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Externo> externosOrdenAsc = listord.listar("apellido", Direccion.ASC);
        for (Externo c : externosOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Externo beaActualizar = new Externo("Bea", "Mena");
        beaActualizar.setId(2);
        listord.editar(beaActualizar);
        Externo bea = listord.porId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        listord.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        listord.eliminar(2);
        listord.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + listord.total());
    }
}
