import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        int inicio, fin;
        int i;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        //Determinamos el número menor y mayor
        inicio = Math.min(num1, num2);
        fin = Math.max(num1, num2);

        System.out.println("\nNúmeros comprendidos entre " + inicio + " y " + fin + ":");

        i = inicio;
        while (i <= fin){
            System.out.println(i + " ");
            i++;
        }

        System.out.println();
        sc.close();
    }
}
