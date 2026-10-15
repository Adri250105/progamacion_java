import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cociente = 0;
        int divisor;
        int dividendo;
        int resto;

        System.out.println("Introduzca el dividendo: ");
        dividendo = sc.nextInt();

        System.out.println("Introduzca el divisor: ");
        divisor = sc.nextInt();

        resto = dividendo;

        while (resto >= divisor){
            resto = resto - divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);

        sc.close();
    }
}
