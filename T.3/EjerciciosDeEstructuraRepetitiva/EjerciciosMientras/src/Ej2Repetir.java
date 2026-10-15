import java.util.Scanner;

public class Ej2Repetir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int i;
        int cA, cE, cI, cO, cU;
        char car;

        cA = 0;
        cE = 0;
        cI = 0;
        cO = 0;
        cU = 0;

        System.out.println("\"Ingrese la cantidad de caracteres a leer (N):");
        num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Debe ingresar un valor de N mayor a 0.");
        } else {
            i = 1;

            // Bucle do-while (Repetir-Mientras)
            do {
                System.out.print("Ingrese el caracter " + i + ": ");
                car = sc.next().charAt(0);

                // Normalización a minúscula para simplificar la comparación
                switch (Character.toLowerCase(car)) {
                    case 'a': cA++; break;
                    case 'e': cE++; break;
                    case 'i': cI++; break;
                    case 'o': cO++; break;
                    case 'u': cU++; break;
                }

                i++;
            } while (i <= num); // Condición para repetir

            // Resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Vocal 'a' / 'A': " + cA);
            System.out.println("Vocal 'e' / 'E': " + cE);
            System.out.println("Vocal 'i' / 'I': " + cI);
            System.out.println("Vocal 'o' / 'O': " + cO);
            System.out.println("Vocal 'u' / 'U': " + cU);
        }

        sc.close();
    }
}
