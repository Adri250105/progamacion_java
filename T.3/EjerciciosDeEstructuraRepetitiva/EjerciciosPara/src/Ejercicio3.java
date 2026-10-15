import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double suma, num;

        System.out.print("Ingrese la cantidad de números a sumar (N): ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser un entero positivo mayor a 0.");
        } else {
            suma = 0.0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el valor " + i + ": ");
                num = scanner.nextDouble();
                suma += num;
            }

            System.out.println("La suma total de los " + n + " valores ingresados es: " + suma);
        }

        scanner.close();
    }
}