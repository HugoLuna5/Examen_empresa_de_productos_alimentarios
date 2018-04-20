package excento.model;

public class Refrigerados extends Producto {

    private String codOrganism;
    private String temperatura;



    /*Constructor principal*/

    public Refrigerados() {
    }

    public Refrigerados(String statusProducto, String fecha_cad, String num_lote, String fechaEnva, String paisOR, String codOrganism, String temperatura) {
        super(statusProducto, fecha_cad, num_lote, fechaEnva, paisOR);
        this.codOrganism = codOrganism;
        this.temperatura = temperatura;
    }

    public String getCodOrganism() {
        return codOrganism;
    }

    public void setCodOrganism(String codOrganism) {
        this.codOrganism = codOrganism;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
