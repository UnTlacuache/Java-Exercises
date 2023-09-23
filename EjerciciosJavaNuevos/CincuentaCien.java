import java.util.Scanner;

public class CincuentaCien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero < 50 || numero > 100) {
            System.out.println("El número es menor que 50 o mayor que 100.");
        } else {
            System.out.println("El número NO es menor que 50 ni mayor que 100.");
        }

        scanner.close();
    }
}
