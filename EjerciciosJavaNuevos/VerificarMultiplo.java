import java.util.Scanner;

public class VerificarMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 != 0) {
            System.out.println("El número es múltiplo de 3 y NO es múltiplo de 5.");
        } else {
            System.out.println("El número NO es múltiplo de 3 o es múltiplo de 5.");
        }

        scanner.close();
    }
}
