import java.util.Scanner;

public class Ej4RepetirMientras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, temp, digitos;

        System.out.println("Ingrese un número entero positivo:");
        num = scanner.nextInt();

        if (num <= 0){
            System.out.println("El número debe ser un entero positivo");
        }else {
            temp = num;
            digitos = 0;

            do {
                temp = temp/10;
                digitos++;
            }while (temp > 0);

            System.out.println("El número " + num + " tiene " + digitos + " dígito(s)");
        }

        scanner.close();
    }
}
