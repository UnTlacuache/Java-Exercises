import java.util.Scanner;

public class VerificarAprobacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la nota del estudiante: ");
        int nota = scanner.nextInt();

        if (nota >= 60 && nota <= 100) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante NO ha aprobado.");
        }

        scanner.close();
    }
}
