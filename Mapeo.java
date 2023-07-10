import java.util.*;

public class Mapeo {

    public static void main(String[] args) {

        Ventas v1 = new Ventas("Aba123", 12.8f);
        Ventas v2 = new Ventas("Lica122", 42.8f);
        Ventas v3 = new Ventas("Fut076", 21f);
        Ventas v4 = new Ventas("Aba123", 12.8f);
        List<Ventas> vts = new ArrayList<>();
        vts.add(v1);
        vts.add(v2);
        vts.add(v3);
        vts.add(v4);

        Map<Integer, Ventas> map1 = new HashMap<>();
        map1.put(2, v4);
        map1.put(4, v2);
        map1.put(3, v1);
        map1.put(1, v3);

        map1.forEach((k, v) -> System.out.println(" k: " + k + "  v: " + v));
        System.out.println("-----------------------------------------------");

        for (Integer k : map1.keySet()) {
            System.out.println(k + ":" + map1.get(k));
        }

        Iterator<Integer> it = map1.keySet().iterator();
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println(" no.: " + key + "     objeto: " + map1.get(key));
        }
        /*
         * System.out.println("v1-> " + v1.hashCode() + "  v2-> " + v4.hashCode());
         * vts.forEach(o -> System.out.println(o.getMonto()));
         * System.out.println("-----------------------------------------------");
         * vts.forEach(o -> System.out.println(o.getId()));
         * 
         * List<Float> montos = Arrays.asList(v1.getMonto(), v2.getMonto(),
         * v3.getMonto(), v4.getMonto());
         * Float total = 0f;
         * for (Float m : montos) {
         * total = total + m;
         * }
         * System.out.println(total);
         * /*
         * System.out.println(" v1 -> " + v1.hashCode());
         * System.out.println(Ventas.getCuantos());
         * 
         * System.out.println(" v4 -> " + v4.hashCode());
         * System.out.println(v1 == v4);
         * System.out.println(v1.equals(v4));
         * 
         * System.out.println(Ventas.getCuantos());
         */
        /*
         * Persona p = new Persona("123", "Pedro", 30);
         * Persona p2 = new Persona("456", "María", 40);
         * Persona p3 = new Persona("231", "Carmen", 50);
         * // System.out.println(p2.equals(new Persona("456", "María", 40)));
         * 
         * List<String> nombres = Arrays.asList(p.getNombre(), p2.getNombre(),
         * p3.getNombre());
         * 
         * List<String> minus = new ArrayList<>();
         * for (String n : nombres) {
         * minus.add(n.toLowerCase());
         * }
         * minus.forEach(n -> System.out.println(n));
         * Map<Integer, Persona> mp = new HashMap<Integer, Persona>();
         * mp.put(1, p);
         * mp.put(12, p2);
         * mp.put(8, p3);
         * System.out.println(
         * "----------------------------------------------------------------");
         * mp.forEach((k, v) -> System.out.println(v.toString()));
         * System.out.println(
         * "----------------------------------------------------------------");
         * for (Integer k : mp.keySet()) {
         * System.out.println(k + ":" + mp.get(k));
         * }
         * System.out.println(
         * "----------------------------------------------------------------");
         * Iterator<Integer> it = mp.keySet().iterator();
         * while (it.hasNext()) {
         * int key = (int) it.next();
         * System.out.println(" no.: " + key + "     objeto: " + mp.get(key));
         * }
         * 
         * }
         */

    }
}
