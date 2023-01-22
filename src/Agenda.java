public class Agenda {
    private Perfil[] agenda;
    private int contador;

    public Agenda(int capacidad) {
        agenda = new Perfil[capacidad];
        contador = 0;
    }

    public void addPerfil(Perfil perfil) {
        try {
            agenda[contador] = perfil;
            contador++;
        } catch(Exception ex) {
            System.out.println("[ERROR]: La agenda está llena.");
        }
    }

    public Perfil[] getAgenda() {
        return agenda;
    }

    public boolean getContador() {
        if (this.contador >= this.agenda.length) {
            return false;
        } else {
            return true;
        }
    }
}
