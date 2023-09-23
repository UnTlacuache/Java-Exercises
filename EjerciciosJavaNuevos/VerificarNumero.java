import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 10 && numero < 20) {
            System.out.println("El número está entre 10 y 20.");
        } else {
            System.out.println("El número NO está entre 10 y 20.");
        }

        scanner.close();
    }
}
