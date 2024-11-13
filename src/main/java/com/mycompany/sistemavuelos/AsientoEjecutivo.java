package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public class AsientoEjecutivo extends Asiento {
    public AsientoEjecutivo() {
        super("Ejecutivo");
    }

    @Override
    public double calcularPrecio() {
        return 250000; // Precio adicional por asiento ejecutivo
    }
}