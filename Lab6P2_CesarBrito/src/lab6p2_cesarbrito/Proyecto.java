package lab6p2_cesarbrito;

public class Proyecto {

    private String titulo;
    private String descripcion;
    private String duracion;
    private String fechaEntrega;
    private int puntuacion;
    private int dificultad;
    private int maxParticipantes;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, String duracion, String fechaEntrega, int puntuacion, int dificultad, int maxParticipantes) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fechaEntrega = fechaEntrega;
        this.puntuacion = puntuacion;
        this.dificultad = dificultad;
        this.maxParticipantes = maxParticipantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
