import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Por favor, ingresa la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Por favor, ingresa la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        if (esTrianguloValido(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno (ningún lado es igual).");
            }
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo válido.");
        }

        scanner.close();
    }

    // Función para verificar si los lados forman un triángulo válido
    public static boolean esTrianguloValido(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
