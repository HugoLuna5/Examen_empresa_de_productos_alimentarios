package excento.model;

import excento.interfaces.congeladosAgua;
import excento.interfaces.congeladosAire;
import excento.interfaces.congeladosNitrogeno;

import javax.swing.*;

public class Congelados extends Producto implements congeladosAgua, congeladosAire, congeladosNitrogeno {




    private String temperatura;



    @Override
    public void congeladosAgua(String infoSalinidad) {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Salinidad "+infoSalinidad);

    }

    @Override
    public void congeladosAire(String infoComposicion) {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Informacion de composición: \n"+infoComposicion);

    }

    @Override
    public void congeladosNitrogeno(String infoMetodoEmpleado, String tiempoExp) {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Metodo empleado: "+infoMetodoEmpleado+"\nTimepo: "+tiempoExp);

    }



    public Congelados() {
    }

    public Congelados(String statusProducto, String fecha_cad, String num_lote, String fechaEnva, String paisOR, String temperatura) {
        super(statusProducto, fecha_cad, num_lote, fechaEnva, paisOR);
        this.temperatura = temperatura;
    }


    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
