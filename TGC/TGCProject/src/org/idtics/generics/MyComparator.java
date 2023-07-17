package org.idtics.generics;

import java.util.Comparator;

import org.idtics.clases.modelo.Externo;

public class MyComparator<T> implements Comparator<T> {
    private Boolean b;

    public MyComparator(T o1, T o2, Boolean b) {
        super();
        this.b = b;
    }

    @Override
    public int compare(T o1, T o2) {
        Boolean b = this.getB();
        String s1 = null;
        String s2 = null;
        int ret = 0;

        if (o1 instanceof Externo) {
            s1 = ((Externo) o1).getApellido() + ((Externo) o1).getNombre();
        }
        if (o2 instanceof Externo) {
            s2 = ((Externo) o2).getApellido() + ((Externo) o2).getNombre();
        }
        if (s1 != null && s2 != null) {
            ret = (b) ? s1.compareTo(s2) : s2.compareTo(s1);
        } else {
            if (s1 != null)
                ret = (b) ? -1 : 1;
            if (s2 != null)
                ret = (b) ? 1 : -1;

        }
        return ret;
    }

    public Boolean getB() {
        return b;
    }
}
// if (s1 != null && s2 != null) {
// ret = (b) ? s1.compareTo(s2) : s2.compareTo(s1);
// } else {
// if (s1 != null)
// ret = (b) ? -1 : 1;
// if (s2 != null)
// ret = (b) ? 1 : -1;

// }