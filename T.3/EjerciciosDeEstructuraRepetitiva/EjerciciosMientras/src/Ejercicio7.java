import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int i, num;
        int positivos, negativos, nulo;

        positivos = 0;
        negativos = 0;
        nulo = 0;
        i = 1;

        System.out.println("Generando y procesando 100 números aleatorios...\n");

        while (i <= 100){
            num = rnd.nextInt(101) - 50;

            if (num > 0){
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                nulo++;
            }

            i++;
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números nulos: " + nulo);

        System.out.println("Total procesados  : " + (positivos + negativos + nulo));
    }
}
