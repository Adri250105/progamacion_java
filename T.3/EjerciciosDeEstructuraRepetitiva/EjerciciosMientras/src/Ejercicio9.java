import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;

        while (suma <= 1000){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            suma = suma + num;
        }

        System.out.println("La suma total es de: " + suma);

        sc.close();
    }
}
