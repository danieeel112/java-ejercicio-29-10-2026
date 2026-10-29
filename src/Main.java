
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int distanciaAB = Math.abs(A - B);
            int distanciaBC = Math.abs(C - B);

            // Si los años están a ambos lados del año 0,
            // hay que tener en cuenta que el año 0 no existió.
            if (A < 0 && C > 0) {
                distanciaBC--;
            }

            if (distanciaAB < distanciaBC) {
                System.out.println(A);
            } else if (distanciaBC < distanciaAB) {
                System.out.println(C);
            } else {
                System.out.println("EMPATE");
            }
        }

        sc.close();
    }
}



