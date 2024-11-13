package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

public class Reserva {
    private Vuelo vuelo;
    private Asiento asiento;
    private String estado;

    public Reserva(Vuelo vuelo, Asiento asiento) {
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.estado = "Reservada";
    }

    public double calcularCostoTotal() {
        double precioVuelo = vuelo.calcularPrecioBase();
        double precioAsiento = asiento.calcularPrecio();
        return precioVuelo + precioAsiento;
    }

    public String mostrarReserva() {
        if (estado.equals("Reservada")) {
            return vuelo.mostrarDetalles() + "\n" + asiento.mostrarDetalles() +
                   "\nCosto total: $" + calcularCostoTotal();
        } else {
            return "Reserva cancelada";
        }
    }

    public void cancelarReserva() {
        estado = "Cancelada";
    }
}

