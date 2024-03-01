public class Figura {

    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    private Figura(){

    }

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe){
        this.codigo=codigo;
        this.precio=precio;
        this.dimension= dimension;
        this.superheroe= superheroe;


    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimension=" + dimension +
                '}';
    }

    public void subirPrecio(double cantidad){
        this.precio=getPrecio()+cantidad;
    }
}
