import java.util.ArrayList;

public class Clase {
    private ArrayList<Estudiante> estudiantes;
    private Profesor idProfesor;
    private Asignatura idAsignatura;
    private String horario;

    public Clase(Profesor idProfesor, Asignatura idAsignatura, String horario, ArrayList<Estudiante> estudiantes) {
        this.idProfesor = idProfesor;
        this.idAsignatura = idAsignatura;
        this.horario = horario;
        this.estudiantes = estudiantes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getHorario() {
        return horario;
    }

    public Asignatura getIdAsignatura() {
        return idAsignatura;
    }

    public Profesor getIdProfesor() {
        return idProfesor;
    }

    public void imprimirEstudiantes() {
        System.out.println("Estudiantes en la clase:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
    }

    public void imprimirProfesor() {
        System.out.println("Profesor: " + idProfesor.getNombre());
    }
}
