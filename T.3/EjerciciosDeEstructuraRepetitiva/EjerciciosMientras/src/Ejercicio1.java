import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Los primeros 50 enteros son: ");

        while (num < 50){
            System.out.println(num);
            num++;
        }

        sc.close();
    }
}
