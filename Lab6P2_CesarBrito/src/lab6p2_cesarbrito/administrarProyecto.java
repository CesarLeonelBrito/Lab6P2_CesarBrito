package lab6p2_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarProyecto {

    private ArrayList<Proyecto> listaProyectos = new ArrayList();
    private File archivo = null;

    public administrarProyecto(String path) {
        archivo = new File(path);
    }

    public ArrayList<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(ArrayList<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaProyectos;
    }

    public void setProyecto(Proyecto p) {
        this.listaProyectos.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyecto t : listaProyectos) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getDuracion() + ";");
                bw.write(t.getFechaEntrega() + ";");
                bw.write(t.getPuntuacion() + ";");
                bw.write(t.getDificultad() + ";");
                bw.write(t.getMaxParticipantes() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProyectos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProyectos.add(new Proyecto(sc.next(), sc.next(), sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
