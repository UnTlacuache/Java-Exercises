import java.util.Scanner;

public class VerificarDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 2 y por 3.");
        } else {
            System.out.println("El número NO es divisible por 2 y por 3.");
        }

        scanner.close();
    }
}
