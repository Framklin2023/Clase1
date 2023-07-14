package mytest2;

import org.idtics.clases.modelo.Externo;
import org.idtics.clases.modelo.Interno;

public class ProbarModelos {
    public static void main(String[] args) {
        Interno i1 = new Interno("Christiano", "Ronaldo");
        Externo e1 = new Externo("Lionel", "Messi");
        System.out.println(i1.toString());
        System.out.println(e1.toString());

    }

}
