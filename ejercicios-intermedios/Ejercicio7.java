import java.util.Scanner;

/**
 * Ejercicio7 - Expresiones aritméticas con tres números
 * Este ejercicio demuestra:
 * - Operaciones aritméticas con múltiples variables
 * - Reutilización de variables para diferentes cálculos
 * - Operaciones de suma, resta y multiplicación
 * - Manejo de tres entradas del usuario
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {  
        int num1, num2, num3, resultado; // Declaración de variables
        Scanner scanner = new Scanner(System.in);

        // Entrada de tres números
        System.out.println("=== CALCULADORA CON TRES NÚMEROS ===");
        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        num3 = scanner.nextInt();

        // Realizar diferentes operaciones
        System.out.println("\n=== RESULTADOS ===");
        
        // Suma de los tres números
        resultado = num1 + num2 + num3;
        System.out.println("Suma: " + num1 + " + " + num2 + " + " + num3 + " = " + resultado);

        // Resta secuencial
        resultado = num1 - num2 - num3;
        System.out.println("Resta: " + num1 + " - " + num2 + " - " + num3 + " = " + resultado);

        // Multiplicación de los tres números
        resultado = num1 * num2 * num3;
        System.out.println("Multiplicación: " + num1 + " × " + num2 + " × " + num3 + " = " + resultado);
        
        scanner.close(); // Cerrar Scanner
    }
}
