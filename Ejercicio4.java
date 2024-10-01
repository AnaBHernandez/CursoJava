import java.util.Scanner;
public class Ejercicio4 {
    //Intercambiar usando XOR bit a bit
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1=scanner.nextInt();
        System.out.println("Ingrese segundo número");
        int num2=scanner.nextInt();       
        
    }
    public static void intercambio(int a, int b)  {
        System.out.println("valor de a=" +a);
        System.err.println("valor de b=" +b);
        int aux;
        aux=a;
        a=b;
        b=aux;
        System.out.println("intercambiado de a=" +a);
        System.err.println("intercambiado de b=" +b);
    }
    
}

