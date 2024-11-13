package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public abstract class Vuelo {
    protected String codigoVuelo;
    protected String origen;
    protected String destino;
    protected double duracion;

    public Vuelo(String codigoVuelo, String origen, String destino, double duracion) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public String mostrarDetalles() {
        return String.format("Vuelo %s: %s -> %s, Duración: %.2f horas", 
                             codigoVuelo, origen, destino, duracion);
    }

    public abstract double calcularPrecioBase();
}

