import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Bucle para insistir mientras el número introducido sea negativo
        do {
            System.out.print("Introduce un número entero: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("El número no puede ser negativo. Inténtalo de nuevo.");
            }
        } while (n < 0);

        double resultado = factorial(n);

        // Mostramos el resultado (como long para evitar decimales innecesarios en fatoriales pequeños/medianos)
        System.out.println("El factorial de " + n + " (" + n + "!) es: " + (long) resultado);

        scanner.close();
    }

    public static double factorial(int n) {
        double resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
