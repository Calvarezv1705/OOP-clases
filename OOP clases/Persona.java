import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String email;
    private int id;
    private ArrayList<Clase> clases;

    public Persona(String nombre, String email, int id, ArrayList<Clase> clases) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.clases = clases;
    }

    public void imprimir() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
}
