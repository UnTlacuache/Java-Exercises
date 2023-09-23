import java.util.Scanner;

public class VerificarVotacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("¿La persona está inhabilitada legalmente para votar? (true/false): ");
        boolean inhabilitadaLegalmente = scanner.nextBoolean();

        if (edad >= 18 && !inhabilitadaLegalmente) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona NO puede votar.");
        }

        scanner.close();
    }
}
