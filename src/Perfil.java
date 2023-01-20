import java.util.InputMismatchException;

public class Perfil {
    private String name = "";
    private String lastname = "";
    private int phone = 0;

    Perfil() {
        System.out.println("Introduzca un nombre:");
        this.name = Input.str();
        System.out.println("Introduzca un apellido:");
        this.lastname = Input.str();
        System.out.println("Introduzca un teléfono:");

        boolean phoneOk = false;
        while (!phoneOk) {
            try {
                phoneOk = true;
                this.phone = Input.num();
            } catch (InputMismatchException ex) {
                phoneOk = false;
                System.out.println("Por favor, introduzca un valor válido.");
            }
        }
    }

    public String getData() {
        return (this.name + " " + this.lastname + ": " + this.phone);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}