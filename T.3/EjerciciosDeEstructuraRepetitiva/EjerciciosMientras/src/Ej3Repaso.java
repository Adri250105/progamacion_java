import java.util.Scanner;

public class Ej3Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.println("Ingrese un número entero: ");
        num = sc.nextInt();

        // Si el número no es positivo (<= 0), se imprime un solo asterisco
        if (num <= 0) {
            System.out.println("*");
        } else {
            i = 1;

            // Bucle do-while (repetir-mientras)
            do {
                System.out.print("*");
                i++;
            } while (i <= num);

            System.out.println(); // Salto de línea final
        }

        sc.close();
    }
}
