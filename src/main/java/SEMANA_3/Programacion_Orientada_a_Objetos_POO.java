
package SEMANA_3;

import java.util.ArrayList;         // Para manejar listas 
import java.util.InputMismatchException; // Para manejar errores de entrada
import java.util.Scanner;           // Para leer la entrada del usuario

public class Programacion_Orientada_a_Objetos_POO { // Nombre de la clase principal
    
    private ArrayList<Double> temperaturasObservadas;
    private String ubicacion; // Atributo unico para la ubicacion del pronostico

    /**
     * Constructor de la clase Programacion_Orientada_a_Objetos_POO.
     * Se llama automaticamente cuando creas un nuevo objeto de esta clase.
     * Inicializa la lista de temperaturas y la ubicacion.
     
     */
    public Programacion_Orientada_a_Objetos_POO(String ubicacion) {
        this.temperaturasObservadas = new ArrayList<>();
        this.ubicacion = ubicacion;
    }

    /**
     * Permite al usuario ingresar las temperaturas diarias para la ubicacion del pronostico.
     * Las temperaturas se guardan internamente en el atributo 'temperaturasObservadas' de este objeto.
     */
    public void registrarTemperaturas() {
        Scanner escaner = new Scanner(System.in);
        String[] apodosDias = {"El inicio de semana", "El segundo dia", "Mitad de semana", "Jueves casi finde", "Viernes de ambiente", "Sabado de relax", "Domingo familiar"};

        System.out.println("\n--- Preparando el pronostico para " + this.ubicacion + " ---");
        System.out.println("Por favor, ingresa las temperaturas para cada momento de la semana:");

        for (String apodo : apodosDias) {
            while (true) {
                try {
                    System.out.print(apodo + " (oC): ");
                    temperaturasObservadas.add(escaner.nextDouble()); // Agrega al ArrayList del objeto
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("¡Oh, no! Ingresa un numero, por favor. Es crucial para el pronostico.");
                    escaner.next(); // Limpia el buffer
                }
            }
        }
        // No cerramos el escaner aqui.
    }

    /**
     * Calcula el promedio de las temperaturas que han sido registradas en este objeto.
     *
     * @return El promedio de las temperaturas registradas. Retorna 0.0 si no hay datos.
     */
    public double calcularPromedio() {
        if (temperaturasObservadas.isEmpty()) {
            System.out.println("No hay temperaturas registradas para calcular el promedio en " + this.ubicacion + ".");
            return 0.0;
        }

        double suma = 0;
        for (double temp : temperaturasObservadas) {
            suma += temp;
        }
        return suma / temperaturasObservadas.size();
    }

    /**
     * Metodo principal (punto de entrada) del programa.
     * Aqui se crea una instancia (un objeto) de la clase
     * Programacion_Orientada_a_Objetos_POO y se utilizan sus metodos.
     */
    public static void main(String[] args) {
        System.out.println("--- Inicio del Sistema de Pronostico Climatico (Programacion Orientada a Objetos) ---");

        // 1. Crear una instancia (un objeto) de nuestra clase de pronostico para "Guayaquil"
        // Observa como creamos un objeto y luego interactuamos con el.
        Programacion_Orientada_a_Objetos_POO miPronosticoCantonSantaLucia = new Programacion_Orientada_a_Objetos_POO("CantonSantaLucia");

        // 2. Registrar las temperaturas usando el metodo del objeto creado
        miPronosticoCantonSantaLucia.registrarTemperaturas();

        // 3. Calcular el promedio de temperatura usando el metodo del objeto
        double promedioFinalPOO = miPronosticoCantonSantaLucia.calcularPromedio();

        // 4. Mostrar el resultado final
        System.out.printf("\n¡Perfecto! El promedio de temperatura en %s para esta semana es: %.2f oC\n",
                miPronosticoCantonSantaLucia.ubicacion, promedioFinalPOO);
        System.out.println("--- Fin del Sistema de Pronostico ---");

        // Ejemplo de otro pronostico para demostrar que los objetos son independientes:
        System.out.println("\n--- Otro pronostico de ejemplo (POO) ---");
        Programacion_Orientada_a_Objetos_POO pronosticoCiudadCuenca = new Programacion_Orientada_a_Objetos_POO("CiudadCuenca");
        pronosticoCiudadCuenca.registrarTemperaturas();
        double promedioCuenca = pronosticoCiudadCuenca.calcularPromedio();
        System.out.printf("\nEl promedio de temperatura en %s es: %.2f oC\n",
                    pronosticoCiudadCuenca.ubicacion, promedioCuenca);
    }
}