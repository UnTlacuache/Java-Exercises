import java.util.Scanner;

public class VerificarAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valores predefinidos de nombre de usuario y contraseña
        String usuarioValido = "usuario";
        String contraseñaValida = "contraseña123";

        System.out.println("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        if (nombreUsuario.equals(usuarioValido) && contraseña.equals(contraseñaValida)) {
            System.out.println("Acceso concedido. Bienvenido, " + nombreUsuario + "!");
        } else {
            System.out.println("Acceso denegado. El nombre de usuario o la contraseña son incorrectos.");
        }

        scanner.close();
    }
}
