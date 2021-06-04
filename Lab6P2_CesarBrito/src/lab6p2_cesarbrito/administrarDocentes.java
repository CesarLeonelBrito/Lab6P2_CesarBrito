package lab6p2_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarDocentes {

    private ArrayList<Docente> listaDocentes = new ArrayList();
    private File archivo = null;

    public administrarDocentes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaDocentes;
    }

    public void setDocente(Docente p) {
        this.listaDocentes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Docente t : listaDocentes) {
                bw.write(t.getUsername() + ";");
                bw.write(t.getPassword() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getTitulo() + ";");
                bw.write(t.getPostgrado() + ";");
                bw.write(t.getFacultad() + ";");
                bw.write(t.getNumRegistro() + ";");
                bw.write(t.getCantidadImpartido() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaDocentes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaDocentes.add(new Docente(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
