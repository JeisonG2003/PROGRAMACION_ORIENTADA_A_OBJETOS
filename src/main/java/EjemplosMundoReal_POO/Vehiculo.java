package EjemplosMundoReal_POO;

import java.util.ArrayList;

/**
 * Clase que representa un vehículo de transporte.
 * Tiene una placa, capacidad máxima y una lista de pasajeros a bordo.
 */
public class Vehiculo {
    private String placa;
    private int capacidad;
    private ArrayList<Pasajero> pasajeros;

    // Constructor que inicializa la placa y capacidad del vehículo
    public Vehiculo(String placa, int capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
        this.pasajeros = new ArrayList<>();
    }

    /**
     * Método para agregar un pasajero al vehículo.
     * Solo lo permite si hay espacio disponible.
     */
    public boolean agregarPasajero(Pasajero p) {
        if (pasajeros.size() < capacidad) {
            pasajeros.add(p);
            System.out.println(" Pasajero agregado al vehiculo con placa " + placa);
            return true;
        } else {
            System.out.println(" Vehiculo lleno. No se puede agregar al pasajero " + p.getNombre());
            return false;
        }
    }

    // Método para mostrar todos los pasajeros del vehículo
    public void mostrarPasajeros() {
        System.out.println("\n Vehiculo con placa: " + placa + " | Capacidad: " + capacidad);
        System.out.println("Pasajeros a bordo:");
        for (Pasajero p : pasajeros) {
            p.mostrarInformacion(); // Interacción entre objetos
        }
    }
}