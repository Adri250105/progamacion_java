import java.util.Scanner;

public class Problema605OrdenadoElArmario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de todas las variables al principio
        String prenda;
        int verano;
        int invierno;

        System.out.println("Introduce los casos de prueba (ej: V V A . o solo . para salir): ");

        while (true) {
            prenda = scanner.next();

            // Si el primer token es un punto, es el fin de la entrada
            if (prenda.equals(".")) {
                break;
            }

            // Inicializamos los contadores para este caso de prueba
            verano = 0;
            invierno = 0;

            // Procesamos la primera prenda que acabamos de leer
            if (prenda.equals("V")) {
                verano++;
            } else if (prenda.equals("I")) {
                invierno++;
            } else if (prenda.equals("A")) {
                verano++;
                invierno++;
            }

            // Continuamos leyendo el resto de prendas del caso actual hasta encontrar el punto
            while (true) {
                prenda = scanner.next();

                if (prenda.equals(".")) {
                    break;
                }

                if (prenda.equals("V")) {
                    verano++;
                } else if (prenda.equals("I")) {
                    invierno++;
                } else if (prenda.equals("A")) {
                    verano++;
                    invierno++;
                }
            }

            // Mostramos el resultado al terminar cada caso de prueba
            if (verano > invierno) {
                System.out.println("VERANO");
            } else if (invierno > verano) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }
        }

        scanner.close();
    }
}