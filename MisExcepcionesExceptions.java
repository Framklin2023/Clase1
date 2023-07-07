public class MisExcepcionesExceptions extends Exception {
    final static String DIV_CERO = "No puede ser cero el denominador";

    public MisExcepcionesExceptions(String msg) {
        super(msg);
    }

    public static float divP(int n1, int n2) throws Exc {

        if (n2 == 0) {
            throw new Exc(DIV_CERO);
        } else {
            return n1 / n2;
        }

    }
}
