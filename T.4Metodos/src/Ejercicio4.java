import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int m;

        System.out.print("Introduce el valor de n: ");
        n = scanner.nextInt();

        System.out.print("Introduce el valor de m: ");
        m = scanner.nextInt();

        if (n < 0 || m < 0 || m > n) {
            System.out.println("Error: Asegúrate de que n >= 0, m >= 0 y que m sea menor o igual que n.");
        } else {
            double resultado = combinatorio(n, m);
            System.out.println("El número combinatorio C(" + n + ", " + m + ") es: " + (long) resultado);
        }

        scanner.close();
    }

    public static double factorial(int n) {
        double resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double combinatorio(int n, int m) {
        if (m < 0 || m > n) {
            return 0; // Validación básica de rango
        }
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
