import java.util.Scanner;

public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número menor que 100: ");
        int numero = scanner.nextInt();

        if (numero < 100 && esPrimo(numero)) {
            System.out.println("El número " + numero + " es un número primo menor que 100.");
        } else {
            System.out.println("El número NO es primo o es mayor o igual a 100.");
        }

        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
