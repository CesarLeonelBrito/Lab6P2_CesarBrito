package lab6p2_cesarbrito;

import java.util.ArrayList;

public class Clase {

    private String nombre;
    private String seccion;
    private int codigo;
    private int codigoCarrera;
    private int maxAlumnos;
    private int aula;
    private ArrayList<Proyecto> proyectos = new ArrayList();
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Clase() {
    }

    public Clase(String nombre, String seccion, int codigo, int codigoCarrera, int maxAlumnos, int aula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codigoCarrera = codigoCarrera;
        this.maxAlumnos = maxAlumnos;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return seccion + " - " + nombre;
    }

}
