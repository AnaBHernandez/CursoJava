import java.util.Scanner;

/**
 * Ejercicio3 - Operaciones aritméticas básicas
 * Este ejercicio demuestra las cuatro operaciones aritméticas fundamentales:
 * - Suma (+)
 * - Resta (-)
 * - Multiplicación (*)
 * - División (/)
 * Utiliza el tipo de dato float para manejar números decimales.
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de datos
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Ingrese el primer número:");
        float numero1 = input.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float numero2 = input.nextFloat();

        // Realizar y mostrar operaciones aritméticas
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("El resultado de la suma es: " + (numero1 + numero2));
        System.out.println("El resultado de la resta es: " + (numero1 - numero2));
        System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
        
        // Verificar división por cero
        if (numero2 != 0) {
            System.out.println("El resultado de la división es: " + (numero1 / numero2));
        } else {
            System.out.println("Error: No se puede dividir por cero");
        }
        
        input.close(); // Cerrar Scanner
    }
}
        