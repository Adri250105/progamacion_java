import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        System.out.println("Introduce un número (negativo para salir): ");
        int num = sc.nextInt();

        // El bucle se repite mientras el número ingresado sea >= 0
        while (num >= 0) {
            suma += num; // Acumulamos el número

            System.out.println("Introduce otro número (negativo para salir): ");
            num = sc.nextInt(); // Pedimos el siguiente número
        }

        // Al salir del bucle (cuando num < 0), mostramos la suma acumulada
        System.out.println("\nLa suma total de los números positivos es: " + suma);
        System.out.println("Fin del programa");

        sc.close();
    }
}
