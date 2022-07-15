
public class CatalogoProductos extends Catalogo{
    
    private String descProducto;
    private String descCategoria;
    private int cantidadExistente;
    private double precioUnitario;
    private boolean estado;

    public CatalogoProductos() {
        this.descProducto = "";
        this.descCategoria = "";
        this.cantidadExistente = 0;
        this.precioUnitario = 0.00;
        this.estado = true;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
