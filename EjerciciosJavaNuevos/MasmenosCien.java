import java.util.Scanner;

public class MasmenosCien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 100 || numero < -100) {
            System.out.println("El número es mayor que 100 o menor que -100.");
        } else {
            System.out.println("El número NO es mayor que 100 ni menor que -100.");
        }

        scanner.close();
    }
}
