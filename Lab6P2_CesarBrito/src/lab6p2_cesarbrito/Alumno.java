package lab6p2_cesarbrito;

public class Alumno {

    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String carrera;
    private String facultad;
    private int edad;
    private int registro;
    private int id;
    private int yearCarrera;
    private int promedio;

    public Alumno() {
    }

    public Alumno(String username, String password, String nombre, String apellido, String carrera, String facultad, int edad, int registro, int id, int yearCarrera, int promedio) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.facultad = facultad;
        this.edad = edad;
        this.registro = registro;
        this.id = id;
        this.yearCarrera = yearCarrera;
        this.promedio = promedio;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearCarrera() {
        return yearCarrera;
    }

    public void setYearCarrera(int yearCarrera) {
        this.yearCarrera = yearCarrera;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return nombre + " - " + registro;
    }

}
