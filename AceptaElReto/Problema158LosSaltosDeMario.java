import java.util.Scanner;

public class Problema158LosSaltosDeMario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCasosPrueba;
        int muros;
        int saltosArriba, saltosAbajo;
        int muroAnterior, muroActual;

        System.out.println("Introduce la cantidad de casos de prueba: ");
        numCasosPrueba = sc.nextInt();

        while (numCasosPrueba > 0){
            saltosArriba = 0;
            saltosAbajo = 0;

            System.out.println("Cuántos muros hay?");
            muros = sc.nextInt();

            System.out.println("¿Cuánto mide el primer muro?");
            muroAnterior = sc.nextInt();

            for (int i = 1; i < muros; i++) {
                System.out.println("¿Cuánto mide el siguiente muro?");
                muroActual = sc.nextInt();

                if (muroActual > muroAnterior){
                    saltosArriba++;
                } else if (muroActual < muroAnterior) { // Añadimos el 'if' por si miden lo mismo
                    saltosAbajo++;
                }

                muroAnterior = muroActual;
            }

            // Ahora el resultado se muestra UNA SOLA VEZ al terminar los muros de este caso
            System.out.println(saltosArriba + " " + saltosAbajo);

            // Y restamos el caso de prueba aquí, cuando ya hemos terminado el caso entero
            numCasosPrueba--;

        }

        sc.close();

    }
}
