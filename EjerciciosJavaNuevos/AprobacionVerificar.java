import java.util.Scanner;

public class AprobacionVerificar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la nota del estudiante: ");
        int nota = scanner.nextInt();

        System.out.println("¿El estudiante ha obtenido un resultado de 'Aprobado' en su evaluación? (true/false): ");
        boolean aprobadoEnEvaluacion = scanner.nextBoolean();

        if (nota >= 70 || aprobadoEnEvaluacion) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante NO ha aprobado.");
        }

        scanner.close();
    }
}
