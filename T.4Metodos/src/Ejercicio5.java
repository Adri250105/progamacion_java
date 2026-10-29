import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFilas;
        long valor;

        System.out.print("Introduce el número de filas para el triángulo de Pascal: ");
        numFilas = scanner.nextInt();

        if (numFilas <= 0) {
            System.out.println("El número de filas debe ser mayor que 0.");
        } else {
            System.out.println("\nConstrucción del Triángulo de Pascal:");

            // Bucle externo para recorrer cada fila (n)
            for (int n = 0; n < numFilas; n++) {
                // Bucle interno para calcular y mostrar cada elemento de la fila (m)
                for (int m = 0; m <= n; m++) {
                     valor = (long) combinatorio(n, m);
                    // Mostramos el número combinatorio en formato (n sobre m)
                    System.out.print("(" + n + "," + m + ") ");
                }
                System.out.println(); // Salto de línea al terminar cada fila
            }
        }

        scanner.close();
    }

    // Función factorial
    public static double factorial(int n) {
        double resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Función combinatorio C(n, m)
    public static double combinatorio(int n, int m) {
        if (m < 0 || m > n) {
            return 0;
        }
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
