import java.util.Scanner;

/**
 * Ejercicio6 - Suma de dos números
 * Este ejercicio demuestra:
 * - Uso del tipo de dato double para números decimales
 * - Operación aritmética básica (suma)
 * - Almacenamiento del resultado en una variable
 * - Entrada y salida de datos numéricos
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        double num1, num2, resultado; // Declaración de variables
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("=== SUMA DE DOS NÚMEROS ===");
        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextDouble();

        // Realizar la suma
        resultado = num1 + num2;

        // Mostrar el resultado
        System.out.println("\n=== RESULTADO ===");
        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + resultado);
        
        scanner.close(); // Cerrar Scanner
    }
}
