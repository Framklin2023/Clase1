
public class Nuevo {

    public static void main(String[] args) {
        Mujer m1 = new Mujer("Peña", "Aurora");
        Mujer m2 = new Mujer("Ortiz", "Petra");
        Mujer m3 = new Mujer("Cruz", "Penelope");
        m1.imprimir(m1.getApellidos(), m1.getNombres());
        m2.imprimir(m2.getApellidos(), m2.getNombres());
        m3.imprimir(m3.getApellidos(), m3.getNombres());
    }
}
