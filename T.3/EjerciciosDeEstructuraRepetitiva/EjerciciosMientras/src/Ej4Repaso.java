import java.util.Scanner;

public class Ej4Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        boolean esValida = true;

        do {
            System.out.println("Ingrese una edad entre 5 y 25 años (debe ser impar):");
            edad = sc.nextInt();

            if (edad >= 5 && edad <= 25 && edad % 2 != 0) {
                esValida = true;
                System.out.println("-> Entradas correcta registrada: " + edad + " años.");
            } else {
                esValida = false;
                System.out.println("-> Dato incorrecto. Debe ser entre 5 y 25 años y NO ser par. Intente nuevamente.\n");
            }

        }while (!esValida);
    }
}
