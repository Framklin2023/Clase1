package mytest1;

import java.util.List;

import org.idtics.myinterfaces.codigos.*;
import org.idtics.myinterfaces.modelo.Externo;

public class Prueba {
    public static void main(String[] args) {

        OrdenarpgsCrud listord = new ExternosList();
        listord.crear(new Externo("Camila", "Saldaña"));
        listord.crear(new Externo("Mario", "Vargas"));
        listord.crear(new Externo("David", "Martínez"));
        listord.crear(new Externo("Pamela", "Franco"));

        List<Externo> clientes = listord.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Externo> paginable = listord.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Externo> clientesOrdenAsc = listord.listar("apellido", Direccion.ASC);
        for (Externo c : clientesOrdenAsc) {
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
