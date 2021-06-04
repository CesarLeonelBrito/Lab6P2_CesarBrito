package lab6p2_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarAlumnos {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private File archivo = null;

    public administrarAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaAlumnos;
    }

    public void setAlumno(Alumno p) {
        this.listaAlumnos.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumno t : listaAlumnos) {
                bw.write(t.getUsername() + ";");
                bw.write(t.getPassword() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCarrera() + ";");
                bw.write(t.getFacultad() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getRegistro() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getYearCarrera() + ";");
                bw.write(t.getPromedio() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaAlumnos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaAlumnos.add(new Alumno(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
