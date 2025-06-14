
package SEMANA_3;

import java.util.InputMismatchException; // Para manejar errores si el usuario no ingresa un número
import java.util.Scanner;                 // Para leer la entrada del usuario desde la consola

public class Programacion_Tradicional {

    /**
     * Permite al usuario ingresar las temperaturas para cada día de la semana.
     * Incluye una validación básica para asegurar que se ingresen valores numéricos.
     
     */
    public static double[] obtenerTemperaturasDiarias() {
        Scanner escaner = new Scanner(System.in);
        double[] temperaturasGuayaquil = new double[7]; // Array para 7 días
        String[] nombresDias = {"Lunes soleado", "Martes nublado", "Miercoles lluvioso", "Jueves ventoso", "Viernes calido", "Sabado playero", "Domingo tranquilo"};

        System.out.println("\n--- ¡Hola! Vamos a registrar la temperatura de la semana en la Ciudad de Guayaquil ---");
        System.out.println("Por favor, ingresa la temperatura promedio en grados Celsius para cada día:");

        for (int i = 0; i < 7; i++) {
            while (true) { // Bucle para pedir la entrada hasta que sea válida
                try {
                    System.out.print(nombresDias[i] + " (°C): ");
                    temperaturasGuayaquil[i] = escaner.nextDouble();
                    break; // Si la entrada es válida, salimos del bucle interno
                } catch (InputMismatchException e) {
                    System.out.println("¡Uy! Eso no es un número. Por favor, intenta de nuevo con un valor numérico.");
                    escaner.next(); // Limpiamos el buffer del scanner para evitar un bucle infinito
                }
            }
        }
        // No cerramos el scanner aquí, para que el sistema lo gestione.
        return temperaturasGuayaquil;
    }

    /**
     * Calcula el promedio aritmético de un conjunto de temperaturas.
     *
     * @param datosTemperatura Un arreglo de tipo double con las temperaturas a promediar.
     * @return El valor promedio de las temperaturas. Si el arreglo está vacío o es nulo, retorna 0.0.
     */
    public static double calcularPromedioSemanal(double[] datosTemperatura) {
        if (datosTemperatura == null || datosTemperatura.length == 0) {
            System.out.println("Advertencia: No hay datos de temperatura para calcular el promedio.");
            return 0.0;
        }

        double sumaTotal = 0;
        for (double temp : datosTemperatura) {
            sumaTotal += temp;
        }
        return sumaTotal / datosTemperatura.length;
    }

    /**
     * Método principal (punto de entrada) del programa.
     * Orquesta la recolección de datos y el cálculo del promedio semanal del clima.
     * Este es el método que NetBeans ejecutará al correr el programa.*/
    
    public static void main(String[] args) {
        System.out.println("--- Inicio del Reporte Climático Semanal (Programación Tradicional) ---");

        // 1. Recopilar las temperaturas diarias llamando al método estático
        double[] misTemperaturas = obtenerTemperaturasDiarias();

        // 2. Calcular el promedio con la función tradicional
        double promedioFinal = calcularPromedioSemanal(misTemperaturas);

        // 3. Mostrar el resultado final
        System.out.printf("\n¡Excelente! El promedio de temperatura para esta semana en la Ciudad de Guayaquil es: %.2f°C\n", promedioFinal);
        System.out.println("--- Fin del Reporte ---");
    }
}
