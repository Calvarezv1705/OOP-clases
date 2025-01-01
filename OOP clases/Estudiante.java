import java.util.ArrayList;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String email, int id, String carrera, ArrayList<Clase> clases) {
        super(nombre, email, id, clases);
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return super.getClases();
    }

    public void setClases(ArrayList<Clase> clases) {
        super.setClases(clases);
    }

    public void imprimirClases() {
        System.out.println("Clases y Asignaturas de " + getNombre() + ":");
        for (Clase clase : getClases()) {
            System.out.println("- Clase: " + clase.getIdAsignatura().getNombre() + ", Horario: " + clase.getHorario());
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
