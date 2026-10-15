import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int num, i;
        long factorial;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("El factorial no está definido por números negativos");
        } else {
            factorial = 1;
            i = 1;

            while (i <= num){
                factorial = factorial * i;
                i++;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }

        sc.close();
    }
}
