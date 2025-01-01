import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clase> clases = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        Asignatura a1 = new Asignatura("calculo", "st0242", 4);

        Asignatura a2 = new Asignatura("algebra", "st00243", 3);

        Asignatura a3 = new Asignatura("logica", "st0260", 3);

        System.out.println("clases:");

        System.out.println("---------------------------------");

        a1.imprimir();

        a2.imprimir();

        a3.imprimir();

        Estudiante e1 = new Estudiante("camilo", "Camilo@gmail.com", 1034, "ingenieria de sistemas", new ArrayList<>());

        estudiantes.add(e1);

        Estudiante e2 = new Estudiante("felipe", "felipe@gmail.com", 1029, "administracion", new ArrayList<>());

        estudiantes.add(e2);

        Estudiante e3 = new Estudiante("andres", "andres@gmail.com", 1156, "mercadeo", new ArrayList<>());

        estudiantes.add(e3);

        Profesor p1 = new Profesor("javier", "Javier@gmail.com", 12345, new ArrayList<>());

        Profesor p2 = new Profesor("Carlos", "Carlos@gmail.com", 98765, new ArrayList<>());

        Clase c1 = new Clase(p2, a3, "3:00PM a 6:00PM", estudiantes);

        clases.add(c1);

        Clase c2 = new Clase(p1, a2, "9:00AM a 11:00AM", estudiantes);

        clases.add(c2);

        e1.setClases(clases);

        e2.setClases(clases);

        e3.setClases(clases);

        p1.setClases(clases);

        p2.setClases(clases);

        System.out.println("---------------------------------");

        System.out.println("Lista de estudiantes de c1:");

        System.out.println("---------------------------------");

        c1.imprimirEstudiantes();

        System.out.println("---------------------------------");

        System.out.println("Profesor de c1:");

        c1.imprimirProfesor();

        System.out.println("---------------------------------");

        System.out.println("Lista de estudiantes de c2:");

        System.out.println("---------------------------------");

        c2.imprimirEstudiantes();

        System.out.println("---------------------------------");

        System.out.println("Profesor de c2:");

        c2.imprimirProfesor();

        System.out.println("---------------------------------");

        e1.imprimirClases();

        System.out.println("---------------------------------");

        p2.imprimirClases();

        System.out.println("---------------------------------");
    }
}
