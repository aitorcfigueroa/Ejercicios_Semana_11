import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("AGENDA");
        int exitProgram = 1;
        int capacity = (int) (Math.random()*5)+1;
        System.out.println("La agenda tiene " + capacity + " huecos disponibles.");
        Agenda agenda = new Agenda(capacity);

        //Menú principal
        while (exitProgram != 0) {
            System.out.println("\nSeleccione una acción: \n1 - Añadir un contacto. \n2 - Consultar agenda. \n0 - Salir.");
            try {
                exitProgram = Input.num();
                Options(exitProgram, agenda);
            } catch (InputMismatchException ex) {
                System.out.println("[ERROR]: Por favor, seleccione una opción válida.");
                exitProgram = 1;
            }
        }
    }

    public static void Options(int select, Agenda agenda) {
        if (select == 1) {
            CreateContact(agenda);
        } else if (select == 2) {
            ShowAgenda(agenda);
        } else if (select != 0) {
            System.out.println("Por favor, seleccione una opción válida");
        }
    }

    public static void CreateContact(Agenda agenda) {
        boolean agendaEmpty = agenda.getContador();
        //Comprobamos que la agenda no esté completa y en ese caso creamos
        //un contacto y lo introducimos en la agenda.
        if (agendaEmpty) {
            Perfil newContact = new Perfil();
            System.out.println("Contacto creado: " + newContact.getData());
            agenda.addPerfil(newContact);
        } else {
            System.out.println("La agenda ya está llena.");
        }
    }

    public static void ShowAgenda(Agenda agenda) {
        Perfil[] consult = agenda.getAgenda();

        for (int i = 0; i < agenda.getAgenda().length; i++) {
            if (consult[i] == null) {
                System.out.println(i+1 + " - Empty");
            } else {
                System.out.println(i+1 + " - " + consult[i].getData());
            }
        }
    }
}
