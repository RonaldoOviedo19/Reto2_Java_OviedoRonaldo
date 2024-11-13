package com.mycompany.sistemavuelos;

/**
 *
 * @author camper
 */

import java.util.Scanner;

public class SistemaVuelos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva = null;

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer de nueva línea

            if (opcion == 1) {
                reserva = realizarReserva(scanner);
            } else if (opcion == 2) {
                cancelarReserva(reserva);
            } else if (opcion == 3) {
                verEstadoReserva(reserva);
            } else if (opcion == 4) {
                System.out.println("Gracias por usar el sistema de reservas.");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de Reserva de Vuelos");
        System.out.println("1. Realizar reserva");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Ver estado de reserva");
        System.out.println("4. Salir");
    }

    public static Reserva realizarReserva(Scanner scanner) {
        System.out.println("\nSeleccione el tipo de vuelo:");
        System.out.println("1. Vuelo Nacional");
        System.out.println("2. Vuelo Internacional");
        int tipoVuelo = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer de nueva línea

        Vuelo vuelo = null;
        if (tipoVuelo == 1) {
            System.out.print("Ingrese el origen del vuelo nacional: ");
            String origen = scanner.nextLine();
            System.out.print("Ingrese el destino del vuelo nacional: ");
            String destino = scanner.nextLine();
            System.out.print("Ingrese la duración del vuelo en horas: ");
            double duracion = scanner.nextDouble();
            vuelo = new VueloNacional("VN123", origen, destino, duracion);
        } else if (tipoVuelo == 2) {
            System.out.print("Ingrese el origen del vuelo internacional: ");
            String origen = scanner.nextLine();
            System.out.print("Ingrese el destino del vuelo internacional: ");
            String destino = scanner.nextLine();
            System.out.print("Ingrese la duración del vuelo en horas: ");
            double duracion = scanner.nextDouble();
            vuelo = new VueloInternacional("VI456", origen, destino, duracion);
        }

        System.out.println("\nSeleccione el tipo de asiento:");
        System.out.println("1. Económico");
        System.out.println("2. Ejecutivo");
        int tipoAsiento = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer de nueva línea

        Asiento asiento = null;
        if (tipoAsiento == 1) {
            asiento = new AsientoEconomico();
        } else if (tipoAsiento == 2) {
            asiento = new AsientoEjecutivo();
        }

        Reserva reserva = new Reserva(vuelo, asiento);
        System.out.println("\nReserva realizada con éxito:");
        System.out.println(reserva.mostrarReserva());
        return reserva;
    }

    public static void cancelarReserva(Reserva reserva) {
        if (reserva != null) {
            reserva.cancelarReserva();
            System.out.println("\nReserva cancelada.");
        } else {
            System.out.println("No hay ninguna reserva para cancelar.");
        }
    }

    public static void verEstadoReserva(Reserva reserva) {
        if (reserva != null) {
            System.out.println("\nEstado de la reserva:");
            System.out.println(reserva.mostrarReserva());
        } else {
            System.out.println("No hay ninguna reserva.");
        }
    }
}
