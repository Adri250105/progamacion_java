import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double producto = 1.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = scanner.nextDouble();
            producto *= num;
        }

        System.out.println("El producto total de los 5 números es: " + producto);
        scanner.close();
    }
}