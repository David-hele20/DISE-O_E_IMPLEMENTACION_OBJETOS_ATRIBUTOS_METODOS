package ejercicio1;

public class Tratamiento {
    private String idTratamiento;
    private String nombreTratamiento;
    private int duracionDias;
    private String efectosSecundarios;

    public Tratamiento(String idTratamiento, String nombre, int duracion, String efectos) {
        this.idTratamiento = idTratamiento;
        this.nombreTratamiento = nombre;
        this.duracionDias = duracion;
        this.efectosSecundarios = efectos;
    }

    public double calcularEficacia(String tipoCancer) {
        if (tipoCancer.equalsIgnoreCase("Leucemia")) return 85.5;
        if (tipoCancer.equalsIgnoreCase("Sarcoma")) return 70.0;
        if (tipoCancer.equalsIgnoreCase("Linfoma")) return 78.2;
        return 50.0;
    }
}