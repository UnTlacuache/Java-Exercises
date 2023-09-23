import java.util.Scanner;

public class VerificarEdadPermiso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("¿La persona tiene un permiso de conducir? (true/false): ");
        boolean tienePermiso = scanner.nextBoolean();

        if (edad >= 18 && tienePermiso) {
            System.out.println("La persona es mayor de edad y tiene un permiso de conducir.");
        } else {
            System.out.println("La persona NO es mayor de edad o NO tiene un permiso de conducir.");
        }

        scanner.close();
    }
}
