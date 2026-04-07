package ejercicio1;
import java.util.ArrayList;

public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estadoActual;
    private ArrayList<Examen> examenes;
    private ArrayList<Tratamiento> tratamientos;

    public Paciente(String id, String nombre, int edad, String genero, String tipoCancer, String etapa, String estadoActual) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estadoActual = estadoActual;
        this.examenes = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    public void agregarExamen(Examen e) { this.examenes.add(e); }
    public void agregarTratamiento(Tratamiento t) { this.tratamientos.add(t); }

    public String getTipoCancer() { return tipoCancer; }
    public String getEstadoActual() { return estadoActual; }
}