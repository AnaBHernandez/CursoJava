import java.util.Scanner;

/**
 * Ejercicio5 - Lectura y muestra de datos del usuario
 * Este ejercicio demuestra cómo:
 * - Leer datos de diferentes tipos (String, int)
 * - Combinar texto y variables en la salida
 * - Interactuar con el usuario mediante Scanner
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos del usuario
        System.out.println("=== INFORMACIÓN PERSONAL ===");
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine(); // Leer línea completa (incluye espacios)
        
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt(); // Leer número entero

        // Mostrar información combinada
        System.out.println("\n=== DATOS INTRODUCIDOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        // Formato alternativo de salida
        System.out.println("\nResumen: " + nombre + " tiene " + edad + " años");
        
        scanner.close(); // Cerrar Scanner
    }
}