import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre:");
        String name = Input.str();
        System.out.println("Introduzca su apellido:");
        String lastname = Input.str();
        System.out.println("Introduzca su edad:");
        int phone = 0;
        boolean phoneOk = false;
        while (!phoneOk) {
            try {
                phoneOk = true;
                phone = Input.num();
            } catch (InputMismatchException ex) {
                phoneOk = false;
                System.out.println("Por favor, introduzca un valor válido.");
            }
        }

        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastname);
        System.out.println("Edad: " + phone);
    }
}
