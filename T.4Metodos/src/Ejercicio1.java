import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int resultado;

        System.out.println("Introduce un número entero: ");
        num = scanner.nextInt();

        resultado = potenciaSupera(num);

        System.out.println("Para el número " + num + ", la función devuelve: " + resultado);
        System.out.println("(Ya que 2^" + resultado + " = " + (int)Math.pow(2, resultado) + " es la primera potencia de 2 que lo supera)");

        scanner.close();
    }

    public static int potenciaSupera(int num) {
        int potencia = 1;
        int exponente = 0;

        while (potencia <= num) {
            potencia *= 2;
            exponente++;
        }

        return exponente;
    }
}
