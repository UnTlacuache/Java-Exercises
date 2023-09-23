import java.util.Scanner;

public class NegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero == 0) {
            System.out.println("El número es igual a cero.");
        } else {
            System.out.println("El número NO es negativo ni igual a cero.");
        }

        scanner.close();
    }
}
