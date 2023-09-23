import java.util.Scanner;

public class ParMultiploCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es múltiplo de 5.");
        } else {
            System.out.println("El número NO es par ni múltiplo de 5.");
        }

        scanner.close();
    }
}
