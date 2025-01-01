import java.util.ArrayList;

public class Profesor extends Persona {
    public Profesor(String nombre, String email, int id, ArrayList<Clase> clases) {
        super(nombre, email, id, clases);
    }

    public void imprimirClases() {
        System.out.println("Clases y Asignaturas de " + getNombre() + ":");
        for (Clase clase : getClases()) {
            System.out.println("- Clase: " + clase.getIdAsignatura().getNombre() + ", Horario: " + clase.getHorario());
        }
    }

    public ArrayList<Clase> getClases() {
        return super.getClases();
    }

    public void setClases(ArrayList<Clase> clases) {
        super.setClases(clases);
    }
}
