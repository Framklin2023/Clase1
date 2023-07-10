public class Ventas {
    private Integer id;
    private String codFactura;
    private float monto;
    private static Integer cuantos = 0;

    public Ventas() {
    }

    public Ventas(String codFactura, float monto) {
        incCuantos();
        this.id = cuantos;
        this.codFactura = codFactura;
        this.monto = monto;
    }

    private static void incCuantos() {
        cuantos++;
    }

    public Integer getId() {
        return id;
    }

    public Ventas(Integer id, String codFactura, float monto) {
        this.id = id;
        this.codFactura = codFactura;
        this.monto = monto;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Ventas id=" + id + ", codFactura=" + codFactura + ", monto=" + monto;
    }

    public static Integer getCuantos() {
        return cuantos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((codFactura == null) ? 0 : codFactura.hashCode());
        result = prime * result + Float.floatToIntBits(monto);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         * if (this == obj)
         * return true;
         */
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ventas other = (Ventas) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (codFactura == null) {
            if (other.codFactura != null)
                return false;
        } else if (!codFactura.equals(other.codFactura))
            return false;
        if (Float.floatToIntBits(monto) != Float.floatToIntBits(other.monto))
            return false;
        return true;
    }

}
