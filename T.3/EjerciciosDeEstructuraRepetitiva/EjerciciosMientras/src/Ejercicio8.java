import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        int exponente;
        double resultado;
        int i;

        System.out.print("Introduce la base: ");
        base = sc.nextDouble();

        System.out.print("Introduce el exponente: ");
        exponente = sc.nextInt();

        if (exponente < 0) {
            System.out.println("Introduce un exponente: ");
        } else {
            resultado = 1.0;
            i = 1;

            while (i <= exponente) {
                resultado = resultado * base;
                i++;
            }

            System.out.println(base + " elevado a " + exponente + " es igual a: " + resultado);
        }

        sc.close();
    }
}