import java.util.Scanner;
//Intercambiar usando operaciones aritméticas:
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese el primer número:");
        float numero1 = input.nextFloat();
        System.out.println("Ingrese el segundo número:");
        float numero2 = input.nextFloat();

        //Operaciones
        System.out.println("El resultado de la suma es: " + (numero1 + numero2));
        System.out.println("El resultado de la resta es: " + (numero1 - numero2));
        System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
        System.out.println("El resultado de la división es: " + (numero1 / numero2));
    }
}
        