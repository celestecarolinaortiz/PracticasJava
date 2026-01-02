public class Carrera {
    String nombre;
    int duracionAnios;
    boolean enCurso;

    public Carrera(String nombre, int anios, boolean enCurso) {
        this.nombre = nombre;
        this.duracionAnios = anios;
        this.enCurso = enCurso;
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

}
