import java.util.Scanner;

public class PositivoNoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 0 && numero != 0) {
            System.out.println("El número es positivo y no es igual a cero.");
        } else {
            System.out.println("El número NO es positivo o es igual a cero.");
        }

        scanner.close();
    }
}
