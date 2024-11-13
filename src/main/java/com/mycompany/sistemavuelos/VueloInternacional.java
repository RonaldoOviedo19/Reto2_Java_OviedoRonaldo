package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public class VueloInternacional extends Vuelo {
    public VueloInternacional(String codigoVuelo, String origen, String destino, double duracion) {
        super(codigoVuelo, origen, destino, duracion);
    }

    @Override
    public double calcularPrecioBase() {
        return 500000; // Precio base para vuelos internacionales
    }
}

