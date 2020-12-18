
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Carlos Flores
 */
public class admintxt {

    private File archivo = null;
    private ArrayList<Clientes> lista = new ArrayList();

    public admintxt(String path) {
        archivo = new File(path);
    }

    public void setClie(Clientes u) {
        this.lista.add(u);
    }

    public admintxt() {
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Clientes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clientes> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "admintxt{" + "archivo=" + archivo + ", lista=" + lista + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clientes t : lista) {
                for (int i = 0; i < t.getHistorial().size(); i++) {
                    Date fecha = new Date();
                    bw.write("Bienvenidos a Popeyes " + ";");
                    bw.newLine();
                    bw.write("Popeyes Virtual le Informa " + ";");
                    bw.newLine();
                    bw.write("Usted Ordeno " + ";");
                    bw.newLine();
                    bw.write("#*#*#*#*#*#*##*#*#*#*" + ";");
                    bw.newLine();
                    bw.write("Orden: " + t.getHistorial().get(i).getNumero() + ";");
                    bw.newLine();
                    bw.write("Fecha: " + "18 DICIEMBRE" + ";");
                    bw.newLine();
                    bw.write("Nombre: " + t.getNombre() + ";");
                    bw.newLine();
                    bw.write("Apellido: " + t.getApellido() + ";");
                    bw.newLine();
                    bw.write("Edad: " + t.getEdad() + ";");
                    bw.newLine();
                    bw.write("Tarjeta: " + t.getTarjeta() + ";");
                    bw.newLine();
                    bw.write("Total Complementos: " + t.getTotal() + ";");
                    bw.newLine();
                    bw.write("Piezas: " + t.getHistorial().get(i).getPiezas() + ";");
                    bw.newLine();
                    bw.write("Papas: " + t.getHistorial().get(i).getPapas() + ";");
                    bw.newLine();
                    bw.write("Frescos: " + t.getHistorial().get(i).getFresco() + ";");
                    bw.newLine();
                    bw.write("Pures: " + t.getHistorial().get(i).getPure() + ";");
                    bw.newLine();
                    bw.write("Pies: " + t.getHistorial().get(i).getPie() + ";");
                    bw.newLine();
                    bw.write("Gracias Por Su Compra " + ";");
                    bw.newLine();
                    bw.write("Use Esta Factura para un Descuento  " + ";");
                    bw.newLine();
                    bw.write("FELIZ NAVIDAD LE DESEA POPEYES " + ";");
                    bw.newLine();
                    bw.write("SU CAJERO FUE: LUIS FLORES" + ";");
                    bw.newLine();
                    bw.write("Mas Informacion visite Popeyes.com " + ";");
                    bw.newLine();
                }

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new Clientes(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat(), sc.nextFloat())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
