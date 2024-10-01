import java.util.Scanner;
public class Ejercicio6 {
    //Suma de dos números
    public static void main(String[] args) {
        double num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número");
        num2 = scanner.nextDouble();

        resultado = num1 + num2;

        System.out.println("El resultado es: " + resultado );
    }
}
