import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, aux, cont;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        if (num <= 0){
            System.out.println("El número debe ser un entero positivo mayor que 0");
        } else {
            cont = 0;
            aux = num;

            while (aux > 0){
                aux = aux/10;
                cont++;
            }

            System.out.println("El número " + num + " tiene " + cont + " digitos");
        }
    }
}