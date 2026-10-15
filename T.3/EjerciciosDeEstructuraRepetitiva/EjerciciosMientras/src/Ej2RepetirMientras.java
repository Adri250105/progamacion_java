import java.util.Scanner;

public class Ej2RepetirMientras {
    public static void main(String[] args) {
        /*
        ¿Tiene la misma funcionalidad que Mientras?

    Con la estructura Si/Sino (validación previa): SÍ, la funcionalidad es equivalente.

    Sin la estructura Si/Sino: NO. Si se ingresa un número menor a 1 (por ejemplo, n = -5),
    el bucle Mientras no ejecutaría nada, pero el Repetir-Mientras imprimiría -5 al menos una vez antes de verificar la condición.
         */

        Scanner scanner = new Scanner(System.in);

        int num, i;

        System.out.println("Ingrese un número: ");
        num = scanner.nextInt();

        if (num >= 1){
            i = num;
            do {
                System.out.println(i);
                i--;
            }while (i>=1);
        } else {
            System.out.println("El número debe ser mayor o igual a 1");
        }

        scanner.close();
    }
}
