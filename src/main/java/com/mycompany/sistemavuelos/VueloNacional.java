package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public class VueloNacional extends Vuelo {
    public VueloNacional(String codigoVuelo, String origen, String destino, double duracion) {
        super(codigoVuelo, origen, destino, duracion);
    }

    @Override
    public double calcularPrecioBase() {
        return 100000; 
    }
}

