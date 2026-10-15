import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //A. Números del 1 al 50
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        //Serie descendente de N a 1
        int num;

        System.out.println("Introduce un número: ");
        num = scanner.nextInt();

        if (num >= 1) {
            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }

        if (num >= 1) {
            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }

        //C. Factorial de N
        int n;

        System.out.println("Introduce un número: ");
        n = scanner.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
