package ejercicio1;
import java.util.ArrayList;

public class Hospital {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();

        // 1. Adicionar 6 pacientes con diferente tipo de cáncer
        pacientes.add(new Paciente("1", "Juan", 45, "M", "Sarcoma", "II", "En tratamiento"));
        pacientes.add(new Paciente("2", "Maria", 30, "F", "Leucemia", "I", "En remisión"));
        pacientes.add(new Paciente("3", "Pedro", 60, "M", "Linfoma", "III", "En tratamiento"));
        pacientes.add(new Paciente("4", "Ana", 55, "F", "Sarcoma", "IV", "Fallecido"));
        pacientes.add(new Paciente("5", "Luis", 20, "M", "Leucemia", "II", "En remisión"));
        pacientes.add(new Paciente("6", "Elena", 38, "F", "Linfoma", "I", "En tratamiento"));

        // 2. Adicionar dos exámenes a tres (3) pacientes
        for (int i = 0; i < 3; i++) {
            pacientes.get(i).agregarExamen(new Examen("EX01", "2024-05-01", "Biopsia", "Normal"));
            pacientes.get(i).agregarExamen(new Examen("EX02", "2024-05-10", "Resonancia", "Estable"));
        }

        // 3. Adicionar dos tratamientos a tres (3) pacientes
        for (int i = 0; i < 3; i++) {
            pacientes.get(i).agregarTratamiento(new Tratamiento("TR01", "Quimioterapia", 20, "Náuseas"));
            pacientes.get(i).agregarTratamiento(new Tratamiento("TR02", "Inmunoterapia", 15, "Fatiga"));
        }

        // 4. Mostrar pacientes por tipo de cáncer
        int sarcoma = 0, leucemia = 0, linfoma = 0;
        for (Paciente p : pacientes) {
            if (p.getTipoCancer().equalsIgnoreCase("Sarcoma")) sarcoma++;
            else if (p.getTipoCancer().equalsIgnoreCase("Leucemia")) leucemia++;
            else if (p.getTipoCancer().equalsIgnoreCase("Linfoma")) linfoma++;
        }

        System.out.println("--- PACIENTES POR TIPO DE CÁNCER ---");
        System.out.println("Sarcoma: " + sarcoma);
        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);

        // 5. Mostrar porcentaje por estado actual
        double remision = 0, tratamiento = 0, fallecido = 0;
        for (Paciente p : pacientes) {
            if (p.getEstadoActual().equalsIgnoreCase("En remisión")) remision++;
            else if (p.getEstadoActual().equalsIgnoreCase("En tratamiento")) tratamiento++;
            else if (p.getEstadoActual().equalsIgnoreCase("Fallecido")) fallecido++;
        }

        System.out.println("\n--- PORCENTAJE POR ESTADO ACTUAL ---");
        int total = pacientes.size();
        System.out.println("En remisión: " + (remision / total * 100) + "%");
        System.out.println("En tratamiento: " + (tratamiento / total * 100) + "%");
        System.out.println("Fallecido: " + (fallecido / total * 100) + "%");
    }
}