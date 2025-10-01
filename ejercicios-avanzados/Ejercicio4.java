import java.util.Scanner;

/**
 * Ejercicio4 - Intercambio de valores usando operaciones XOR
 * Este ejercicio demuestra cómo intercambiar dos números sin usar una variable auxiliar
 * utilizando operaciones XOR bit a bit.
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INTERCAMBIO DE VALORES CON XOR ===");
        System.out.println("Ingrese primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("\nValores originales:");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        
        // Intercambio usando XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        System.out.println("\nValores intercambiados:");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        
        scanner.close();
    }
    
    /**
     * Método alternativo para intercambio con XOR
     * @param a Primer número
     * @param b Segundo número
     */
    public static void intercambioXOR(int a, int b) {
        System.out.println("Valores originales: a=" + a + ", b=" + b);
        
        // Intercambio usando XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("Valores intercambiados: a=" + a + ", b=" + b);
    }
}

