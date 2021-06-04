package lab6p2_cesarbrito;

import java.util.ArrayList;

public class Docente {

    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String titulo;
    private String postgrado;
    private String facultad;
    private int numRegistro;
    private int cantidadImpartido;
    private ArrayList<Proyecto> proyectos = new ArrayList();

    public Docente() {
    }

    public Docente(String username, String password, String nombre, String apellido, String titulo, String postgrado, String facultad, int numRegistro, int cantidadImpartido) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.postgrado = postgrado;
        this.facultad = facultad;
        this.numRegistro = numRegistro;
        this.cantidadImpartido = cantidadImpartido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPostgrado() {
        return postgrado;
    }

    public void setPostgrado(String postgrado) {
        this.postgrado = postgrado;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getCantidadImpartido() {
        return cantidadImpartido;
    }

    public void setCantidadImpartido(int cantidadImpartido) {
        this.cantidadImpartido = cantidadImpartido;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    

    @Override
    public String toString() {
        return nombre;
    }

}
