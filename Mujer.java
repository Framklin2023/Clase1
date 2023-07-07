public class Mujer extends Person implements Imprimir {
    static private int cuantas = 0;
    private final String sra = "Señora";
    private int id;

    public Mujer(String apellidos, String nombre) {
        super(apellidos, nombre);
        cuantas++;
        this.id = cuantas;
    }

    public void imprimir(String apellidos, String nombre) {
        System.out.println("\n" + sra + " N° " + id + " es : " + this.getApellidos() + " " + this.getNombres());

    }
}