import java.util.Scanner;

public class Ej1RepetirMientras {
    public static void main(String[] args) {
        /*
        ¿Tiene la misma funcionalidad que Mientras?
        SÍ. Como el valor inicial (i = 1) ya cumple la condición (1 <= 50),
        ambos bucles se comportarán exactamente igual y mostrarán la secuencia del 1 al 50.
         */

        Scanner scanner = new Scanner(System.in);

        int i;

        i = 1;

        do {
            System.out.println(i);
            i++;
        }while (i <= 50);
    }
}
