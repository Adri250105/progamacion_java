import java.util.Random;
import java.util.Scanner;

public class JuegoGuerraDeDados {

    // Variables globales (de clase) para la configuración y utilidades
    static int puntosParaGanar = 1000;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirEntero("Selecciona una opción: ");
            switch (opcion) {
                case 1:
                    configurar();
                    break;
                case 2:
                    jugar();
                    break;
                case 3:
                    System.out.println("\n¡Gracias por jugar! Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        } while (opcion != 3);
    }

    /**
     * Muestra el menú principal de la aplicación.
     */
    private static void mostrarMenu() {
        System.out.println("=== MENU GUERRA DE DADOS ===");
        System.out.println("1. Configurar (Puntos para ganar: " + puntosParaGanar + ")");
        System.out.println("2. Jugar");
        System.out.println("3. Salir");
    }

    /**
     * Permite cambiar la cantidad máxima de puntos requerida para ganar.
     */
    private static void configurar() {
        System.out.println("\n--- CONFIGURACIÓN ---");
        int nuevosPuntos = pedirEntero("Introduce el número de puntos necesario para ganar: ");
        if (nuevosPuntos > 0) {
            puntosParaGanar = nuevosPuntos;
            System.out.println("¡Configuración actualizada con éxito!\n");
        } else {
            System.out.println("El número de puntos debe ser mayor que 0.\n");
        }
    }

    /**
     * Controla el flujo principal de una partida entre dos jugadores.
     */
    private static void jugar() {
        System.out.println("\n--- NUEVA PARTIDA ---");
        System.out.print("Nombre del Jugador 1: ");
        String j1 = scanner.nextLine();
        System.out.print("Nombre del Jugador 2: ");
        String j2 = scanner.nextLine();

        long puntosJ1 = 0;
        long puntosJ2 = 0;
        int ronda = 1;

        while (puntosJ1 < puntosParaGanar && puntosJ2 < puntosParaGanar) {
            System.out.println("\n==========================================");
            System.out.println("              RONDA " + ronda);
            System.out.println("==========================================");

            // Turno Jugador 1
            long resultadoJ1 = jugarTurno(j1);

            // Turno Jugador 2
            long resultadoJ2 = jugarTurno(j2);

            // Resolución de la ronda
            System.out.println("\n--- RESULTADO DE LA RONDA " + ronda + " ---");
            if (resultadoJ1 > resultadoJ2) {
                long ganancia = resultadoJ1 + resultadoJ2;
                puntosJ1 += ganancia;
                puntosJ2 -= resultadoJ2;
                System.out.println("¡Gana la ronda " + j1 + "!");
                System.out.println(j1 + " suma " + ganancia + " puntos.");
                System.out.println(j2 + " resta " + resultadoJ2 + " puntos.");
            } else if (resultadoJ2 > resultadoJ1) {
                long ganancia = resultadoJ1 + resultadoJ2;
                puntosJ2 += ganancia;
                puntosJ1 -= resultadoJ1;
                System.out.println("¡Gana la ronda " + j2 + "!");
                System.out.println(j2 + " suma " + ganancia + " puntos.");
                System.out.println(j1 + " resta " + resultadoJ1 + " puntos.");
            } else {
                System.out.println("¡Empate en esta ronda! Ningún jugador altera sus puntos.");
            }

            // Marcador actual
            System.out.println("\n--- MARCADOR ACTUAL ---");
            System.out.println(j1 + ": " + puntosJ1 + " / " + puntosParaGanar + " pts");
            System.out.println(j2 + ": " + puntosJ2 + " / " + puntosParaGanar + " pts");

            ronda++;
        }

        // Anuncio del ganador
        System.out.println();
        System.out.println("¡FIN DE LA PARTIDA!");
        if (puntosJ1 >= puntosParaGanar && puntosJ2 >= puntosParaGanar) {
            if (puntosJ1 > puntosJ2) {
                System.out.println("¡El ganador es " + j1.toUpperCase() + " con " + puntosJ1 + " puntos!");
            } else {
                System.out.println("¡El ganador es " + j2.toUpperCase() + " con " + puntosJ2 + " puntos!");
            }
        } else if (puntosJ1 >= puntosParaGanar) {
            System.out.println("¡El ganador es " + j1.toUpperCase() + " con " + puntosJ1 + " puntos!");
        } else {
            System.out.println("¡El ganador es " + j2.toUpperCase() + " con " + puntosJ2 + " puntos!");
        }
        System.out.println();
    }

    /**
     * Simula el lanzamiento de dados de un jugador y calcula su puntuación en el turno.
     */
    private static long jugarTurno(String jugador) {
        System.out.println("\nTurno de: " + jugador);
        int dadoBase = lanzarDado();
        int dadoOperacion = lanzarDado();

        System.out.println("Dado 1 (Base): " + dadoBase);
        System.out.println("Dado 2 (Operación): " + dadoOperacion);

        long resultado = calcularPuntos(dadoBase, dadoOperacion);
        System.out.println("Puntos obtenidos en la tirada: " + resultado);

        return resultado;
    }

    /**
     * Devuelve un valor aleatorio entre 1 y 6 (simulando un dado de 6 caras).
     */
    private static int lanzarDado() {
        return random.nextInt(6) + 1;
    }

    /**
     * Aplica la operación correspondiente según el valor del segundo dado.
     */
    private static long calcularPuntos(int base, int operacion) {
        switch (operacion) {
            case 1: // Factorial
                return factorial(base);
            case 2: // Sumatorio
                return sumatorio(base);
            case 3: // Cuadrado
                return (long) base * base;
            case 4: // Elevado a 0
                return 1;
            case 5: // El mismo número
                return base;
            case 6: // Vale 0
                return 0;
            default:
                return 0;
        }
    }

    /**
     * Calcula el factorial de un número n.
     */
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Calcula el sumatorio de 1 hasta n.
     */
    private static long sumatorio(int n) {
        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Auxiliar para pedir enteros controlando errores de entrada.
     */
    private static int pedirEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String entrada = scanner.nextLine();
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido.");
            }
        }
    }
}