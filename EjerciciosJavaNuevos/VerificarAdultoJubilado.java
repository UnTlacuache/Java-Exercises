import java.util.Scanner;

public class VerificarAdultoJubilado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        if (edad >= 18 && edad < 65) {
            System.out.println("La persona es adulta y no es jubilada.");
        } else {
            System.out.println("La persona NO es adulta o es jubilada.");
        }

        scanner.close();
    }
}
