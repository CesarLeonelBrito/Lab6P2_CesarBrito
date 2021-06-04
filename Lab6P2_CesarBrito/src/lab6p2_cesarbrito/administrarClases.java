package lab6p2_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarClases {

    private ArrayList<Clase> listaClases = new ArrayList();
    private File archivo = null;

    public administrarClases(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaClases;
    }

    public void setClase(Clase p) {
        this.listaClases.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clase t : listaClases) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getSeccion() + ";");
                bw.write(t.getCodigo() + ";");
                bw.write(t.getCodigoCarrera() + ";");
                bw.write(t.getMaxAlumnos() + ";");
                bw.write(t.getAula() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaClases = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaClases.add(new Clase(sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
