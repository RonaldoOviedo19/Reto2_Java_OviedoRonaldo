package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public abstract class Asiento {
    protected String tipoAsiento;

    public Asiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String mostrarDetalles() {
        return "Asiento " + tipoAsiento;
    }

    public abstract double calcularPrecio();
}

