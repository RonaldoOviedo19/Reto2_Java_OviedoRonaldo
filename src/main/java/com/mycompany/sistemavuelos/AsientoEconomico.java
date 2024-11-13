package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public class AsientoEconomico extends Asiento {
    public AsientoEconomico() {
        super("Económico");
    }

    @Override
    public double calcularPrecio() {
        return 120000; // Precio adicional por asiento económico
    }
}

