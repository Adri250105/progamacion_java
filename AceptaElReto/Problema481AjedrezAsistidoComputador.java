import java.util.Scanner;

public class Problema481AjedrezAsistidoComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fila, columna;
        char letraColumna;

        System.out.println("=== SISTEMA DE AJEDREZ ASISTIDO ===");
        System.out.println("Introduce la fila y columna (escribe 0 0 para salir): ");

        while (true) {
            System.out.print("Introduce la fila (1-8): ");
            fila = scanner.nextInt();

            System.out.print("Introduce la columna (1-8): ");
            columna = scanner.nextInt();

            // Si ambos son 0, salimos del bucle y terminamos
            if (fila == 0 && columna == 0) {
                System.out.println("¡Programa finalizado!");
                break;
            }

            // Convertimos el número de columna (1-8) a letra ('a'-'h')
            letraColumna = (char) ('a' + (columna - 1));

            // Mostramos el resultado en formato algebraico (ej: d1, h1)
            System.out.println("Casilla en notación algebraica: " + letraColumna + fila);
            System.out.println();
        }

        scanner.close();
    }
}