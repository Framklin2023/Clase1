package org.idtics.clases.modelo;

import java.time.LocalDateTime;

import java.util.List;

public class Cliente extends Externo implements Comparable<Cliente> {
    private LocalDateTime fecha = null;
    private String codFactura = null;
    private Float monto = 0f;
    public static List<Cliente> mClientes = null;

    public Cliente(String nombre, String apellido, String codFactura, Float monto) {
        super(nombre, apellido);
        setFecha(LocalDateTime.now());
        setCodFactura(codFactura);
        setMonto(monto);
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getApellido().compareTo(o.getApellido());
    }

    @Override
    public String toString() {
        return "Cliente [fecha=" + fecha + ", codFactura=" + codFactura + ", monto=" + monto + " ]-- "
                + super.toString();
    }

    public static void imprimirClientes(List<Cliente> c) {
        System.out.println("------------------------------------------------------------------");
        c.forEach(System.out::println);
    }

    /**
     * @return LocalDateTime return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return String return the codFactura
     */
    public String getCodFactura() {
        return codFactura;
    }

    /**
     * @param codFactura the codFactura to set
     */
    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    /**
     * @return Float return the monto
     */
    public Float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Float monto) {
        this.monto = monto;
    }
}
