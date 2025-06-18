package EjemplosMundoReal_POO;

/**
 * Clase que representa a un pasajero que desea viajar en un vehículo.
 * Cada pasajero tiene un nombre y un destino.
 */
public class Pasajero {
    private String nombre;
    private String destino;

    // Constructor que inicializa el nombre y el destino del pasajero
    public Pasajero(String nombre, String destino) {
        this.nombre = nombre;
        this.destino = destino;
    }

    // Método para obtener el nombre del pasajero
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el destino del pasajero
    public String getDestino() {
        return destino;
    }

    // Método que muestra la información del pasajero
    public void mostrarInformacion() {
        System.out.println("👤 Pasajero: " + nombre + " | Destino: " + destino);
    }
}