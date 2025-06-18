package EjemplosMundoReal_POO;

/**
 * Clase principal que ejecuta el sistema de transporte.
 * Se crean pasajeros y un vehículo, y se simula el abordaje.
 */
public class Main {
    public static void main(String[] args) {

        // Crear un vehículo con capacidad para 5 pasajeros
        Vehiculo bus1 = new Vehiculo("ABC-123", 5);

        // Crear pasajeros con nombre y destino
        Pasajero p1 = new Pasajero("Jeison Garcia", "Santa Lucia");
        Pasajero p2 = new Pasajero("Stalin Mendieta", "Guayaquil");
        Pasajero p3 = new Pasajero("Carlos Espinoza", "Quito");
        Pasajero p4 = new Pasajero("Lilian Quijije", "Babahoyo");
        Pasajero p5 = new Pasajero("Lissi Cornejo", "Cuenca");

        // Intentar agregar pasajeros al bus
        bus1.agregarPasajero(p1);
        bus1.agregarPasajero(p2);
        bus1.agregarPasajero(p3);
        bus1.agregarPasajero(p4);
        bus1.agregarPasajero(p5);

        // Mostrar lista de pasajeros a bordo
        bus1.mostrarPasajeros();
    }
}
