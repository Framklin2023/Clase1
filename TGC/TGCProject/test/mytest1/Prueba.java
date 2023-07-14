package mytest1;

import java.util.List;

import org.idtics.myinterfaces.codigos.*;
import org.idtics.myinterfaces.modelo.Externo;

public class Prueba {
    public static void main(String[] args) {

        OrdenarpgsCrud repo = new ExternosList();
        repo.crear(new Externo("Camila", "Saldaña"));
        repo.crear(new Externo("Mario", "Vargas"));
        repo.crear(new Externo("David", "Martínez"));
        repo.crear(new Externo("Pamela", "Franco"));

        List<Externo> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Externo> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Externo> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        for (Externo c : clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Externo beaActualizar = new Externo("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Externo bea = repo.porId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + repo.total());
    }
}
