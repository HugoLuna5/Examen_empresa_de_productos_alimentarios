package excento.model;

public class Producto {



    private String statusProducto;
    private String fecha_cad;
    private String num_lote;
    private String fechaEnva;
    private String paisOR;


    public Producto() {
    }


    public Producto(String statusProducto, String fecha_cad, String num_lote, String fechaEnva, String paisOR) {
        this.statusProducto = statusProducto;
        this.fecha_cad = fecha_cad;
        this.num_lote = num_lote;
        this.fechaEnva = fechaEnva;
        this.paisOR = paisOR;
    }

    public String getStatusProducto() {
        return statusProducto;
    }

    public void setStatusProducto(String statusProducto) {
        this.statusProducto = statusProducto;
    }

    public String getFecha_cad() {
        return fecha_cad;
    }

    public void setFecha_cad(String fecha_cad) {
        this.fecha_cad = fecha_cad;
    }

    public String getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(String num_lote) {
        this.num_lote = num_lote;
    }

    public String getFechaEnva() {
        return fechaEnva;
    }

    public void setFechaEnva(String fechaEnva) {
        this.fechaEnva = fechaEnva;
    }

    public String getPaisOR() {
        return paisOR;
    }

    public void setPaisOR(String paisOR) {
        this.paisOR = paisOR;
    }
}
