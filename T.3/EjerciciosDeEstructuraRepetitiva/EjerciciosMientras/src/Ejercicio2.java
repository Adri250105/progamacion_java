import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int i = 1; // Empezamos a sumar desde 1
        int suma = 0;

        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();

        // Si num es >= 1, sumamos. Si num < 1, el bloque if no se ejecuta
        // y 'suma' conserva su valor inicial (0).
        if (num >= 1) {
            while (i <= num) {
                suma += i;
                i++;
            }
        }

        System.out.println("La suma es: " + suma);
        sc.close();
    }
}