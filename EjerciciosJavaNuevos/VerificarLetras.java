import java.util.Scanner;

public class VerificarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        boolean contieneA = false;
        boolean contieneB = false;

        // Recorremos la cadena para verificar la presencia de "a" y "b"
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a') {
                contieneA = true;
            } else if (caracter == 'b') {
                contieneB = true;
            }
        }

        if (contieneA && contieneB) {
            System.out.println("La cadena contiene tanto 'a' como 'b'.");
        } else {
            System.out.println("La cadena NO contiene tanto 'a' como 'b'.");
        }

        scanner.close();
    }
}
