public class Agenda {
    public static void main(String[] args) {
        System.out.println("AGENDA");
        int exitProgram = 1;
        Perfil [] agenda = new Perfil[5];

        while (exitProgram != 0) {
            System.out.println("Seleccione una acción: \n1 - Añadir un contacto. \n2 - Consultar agenda. \n0 - Salir.");
            try {
                exitProgram = Input.num();
                Options(exitProgram, agenda);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("Por favor, seleccione una opción válida.");
                exitProgram = 1;
            }
        }
    }

    public static void Options(int select, Perfil[] agenda) {
        if (select == 1) {
            CreateContact(agenda);
        } else if (select == 2) {
            ShowAgenda(agenda);
        } else if (select != 0) {
            System.out.println("Por favor, seleccione una opción válida");
        }
    }

    public static void CreateContact(Perfil[] agenda) {
        int exitCreateContact = 1;

        while (exitCreateContact != 0) {
            Perfil newContact = new Perfil();
            System.out.println(newContact.getData());
            try {
                WriteAgenda(agenda, newContact);
            } catch (Exception ex) {
                System.out.println("[ERROR]: " + ex.getMessage());
            }
            System.out.println("Desea crear un nuevo contacto: \n1 - Sí \n0 - no");
            try {
                exitCreateContact = Input.num();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                exitCreateContact = 1;
            }
        }
    }

    public static void WriteAgenda(Perfil[] agenda, Perfil newContact) {
        for (int i = 0; i < 5; i++) {
            if (agenda[i] == null) {
                agenda[i] = newContact;
                break;
            } else if (agenda[4] != null) {
                agenda[5] = newContact;
            }
        }
    }
    public static void ShowAgenda(Perfil[] agenda) {
        for (int i = 0; i < 5; i++) {
            if (agenda[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println(agenda[i].getData());
            }
        }
    }
}
