import java.util.Scanner;

public class Ej3RepetirMientras {
    /*
    ¿Tiene la misma funcionalidad que Mientras?Para $n \ge 1$:
    SÍ, ambos bucles multiplican y decrementan correctamente.
    Caso $n = 0$: Con el condicional Si temp > 0, la funcionalidad es idéntica ($0! = 1$).
    Sin esa protección, el Repetir-Mientras ejecutaría $1 \times 0$ dando resultado final 0 (incorrecto), mientras que el bucle Mientras simplemente no entraría y mantendría fact = 1 (correcto).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, temp;
        double fact;

        System.out.println("Ingrese un entero positivo o cero:");
        num = scanner.nextInt();

        if ( num < 0){
            System.out.println("El número no es positivo");
        } else {
            fact = 1;
            temp = 1;

            if (temp > 0){
                do {
                    fact = fact * temp;
                    temp--;
                }while (temp >= 1);
            }

            System.out.println("El factorial de " + num + " es: " + fact);
            scanner.close();
        }
    }
}
