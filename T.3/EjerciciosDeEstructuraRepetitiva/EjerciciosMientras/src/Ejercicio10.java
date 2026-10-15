import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int producto = 0;
        int contador = 0;

        int num1, num2;

        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        while (contador < num2){
            producto = producto + num1;
            contador++;
        }

        System.out.println("El producto con sumas sucesivas del número " + num1 + " y el " + num2 + " es: " + producto);

        sc.close();
    }
}
