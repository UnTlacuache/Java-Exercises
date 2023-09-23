import java.util.Scanner;

public class VerificarCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Convertimos la cadena a minúsculas para hacer la búsqueda insensible a mayúsculas
        cadena = cadena.toLowerCase();

        if (cadena.contains("java") && !cadena.contains("python")) {
            System.out.println("La cadena contiene 'Java' y NO contiene 'Python'.");
        } else {
            System.out.println("La cadena NO cumple con los criterios especificados.");
        }

        scanner.close();
    }
}
