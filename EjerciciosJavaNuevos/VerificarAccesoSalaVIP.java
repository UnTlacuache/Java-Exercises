import java.util.Scanner;

public class VerificarAccesoSalaVIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("¿La persona tiene una invitación especial? (true/false): ");
        boolean tieneInvitacionEspecial = scanner.nextBoolean();

        if (edad >= 18 || tieneInvitacionEspecial) {
            System.out.println("La persona tiene acceso a la sala VIP.");
        } else {
            System.out.println("La persona NO tiene acceso a la sala VIP.");
        }

        scanner.close();
    }
}
