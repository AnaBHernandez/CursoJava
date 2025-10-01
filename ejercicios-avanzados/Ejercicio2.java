import java.util.Scanner;

/**
 * Ejercicio2 - Intercambio de valores usando variable auxiliar
 * Este ejercicio demuestra cómo intercambiar dos valores utilizando una variable temporal.
 * Es el método más común y fácil de entender para el intercambio de variables.
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, AUX; // Declaración de variables
        
        // Entrada de datos
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca valor de B: ");
        B = sc.nextInt();
        
        // Mostrar valores originales
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        
        // Algoritmo de intercambio con variable auxiliar
        AUX = A;    // Guardar valor de A en variable temporal
        A = B;      // Asignar valor de B a A
        B = AUX;    // Asignar valor guardado (original de A) a B
        
        // Mostrar valores intercambiados
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
        
        sc.close(); // Cerrar Scanner
    }
}