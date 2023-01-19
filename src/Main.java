import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Perfil user = new Perfil();

        System.out.println("Introduzca un nombre:");
        user.name = Input.str();
        System.out.println("Introduzca un apellido:");
        user.lastname = Input.str();
        System.out.println("Introduzca un teléfono:");

        boolean phoneOk = false;
        while (!phoneOk) {
            try {
                phoneOk = true;
                user.phone = Input.num();
            } catch (InputMismatchException ex) {
                phoneOk = false;
                System.out.println("Por favor, introduzca un valor válido.");
            }
        }

        System.out.println("Nombre: " + user.name);
        System.out.println("Apellido: " + user.lastname);
        System.out.println("Teléfono: " + user.phone);
    }
}
