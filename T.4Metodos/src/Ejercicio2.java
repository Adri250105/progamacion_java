import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorDigitos = 0;
        String frase;
        char c;

        System.out.print("Introduce una frase: ");
        frase = scanner.nextLine();


        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (esdigito(c) == 1) {
                contadorDigitos++;
            }
        }

        System.out.println("El número total de dígitos en la frase es: " + contadorDigitos);

        scanner.close();
    }

    public static int esdigito(char c) {
        if (c >= '0' && c <= '9') {
            return 1;
        }
        return 0;
    }
}
