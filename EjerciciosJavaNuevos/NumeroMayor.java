import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        if ((numero > 5 && numero < 10) || (numero > 20 && numero < 30)) {
            System.out.println("El número cumple una de las dos condiciones.");
        } else {
            System.out.println("El número NO cumple ninguna de las dos condiciones.");
        }

        scanner.close();
    }
}
