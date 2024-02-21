public class Producto {

    private String nombreProducto;
    private String categoría;
    private int lote;
    private float precio;

    public Producto (){
        this. nombreProducto="ProductName default";
        this.categoría="Category default";
        this.lote=1;
        this.precio=1;


    }



    public Producto (String nombreProducto, String categoria, int lote, float precio){
        this();
        setNombreProducto(nombreProducto);
        setCategoría(categoria);
        setLote(lote);
        setPrecio(precio);


    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        if(nombreProducto!= null && !nombreProducto.equals("")) {
            this.nombreProducto = nombreProducto;
        }
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        if(categoría!= null && !categoría.equals("")) {
        this.categoría = categoría;
        }
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        if(lote>0) {
            this.lote = lote;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio>0)
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", categoría='" + categoría + '\'' +
                ", lote=" + lote +
                ", precio=" + precio +
                '}';
    }
}
