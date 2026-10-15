import java.util.Scanner;

public class Ej1Repetir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        if (num < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else {
            // Bucle Repetir-Mientras (do-while)
            do {
                System.out.println(num);
                num--; // Decrementa en 1 en cada iteración
            } while (num >= 1); // Condición para continuar
        }

        sc.close();
    }
}
