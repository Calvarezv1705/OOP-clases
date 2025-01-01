public class Asignatura {
    private String nombre;
    private String codigo;
    private int num_cred;

    public Asignatura(String nombre, String codigo, int num_cred) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.num_cred = num_cred;
    }

    public void imprimir() {
        System.out.println(
                "Nombre de la asignatura: " + nombre + ", Codigo: " + codigo + ", numero de creditos: " + num_cred);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNum_cred() {
        return num_cred;
    }

    public void setNum_cred(int num_cred) {
        this.num_cred = num_cred;
    }
}
