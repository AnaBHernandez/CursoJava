import java.util.Scanner;
public class Ejercicio7 {
    //Expresiones aritméticas simples
    public static void main(String[] args) {  
        int num1, num2, num3, resultado;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese número primero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese número segundo");
        num2 = scanner.nextInt();
        System.out.println("Ingrese número tercero");
        num3 = scanner.nextInt();

        resultado = num1 + num2 + num3;
        System.out.println("Suma: " + resultado);

        resultado = num1 - num2 - num3;
        System.out.println("Resta: " + resultado);

        resultado = num1 * num2 * num3;
        System.out.println("Multiplicación: " + resultado);}

}
