
public class CatalogoCategoria extends Catalogo{
    
    private String nombreCategoria;
    private String detalleCategoria;

    public CatalogoCategoria() {
        this.nombreCategoria = "";
        this.detalleCategoria = "";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDetalleCategoria() {
        return detalleCategoria;
    }

    public void setDetalleCategoria(String detalleCategoria) {
        this.detalleCategoria = detalleCategoria;
    }
    
    
}
