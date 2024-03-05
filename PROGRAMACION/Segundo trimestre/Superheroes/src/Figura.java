import java.util.Objects;

public class Figura implements Comparable<Figura> {


    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;
    private static int contadorNumFig = 0;


    private static String[] codigosRegistrados = new String[100];

    private Figura() {

    }

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) throws Exception {
        setCodigo(codigo);
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;


    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        if (!codigoEnUso(codigo)) {
            this.codigo = codigo;
            codigosRegistrados[contadorNumFig] = codigo;
            contadorNumFig++;
        } else {
            throw new Exception("El código ingresado ya está en uso por otra figura");
        }
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

    public void subirPrecio(double cantidad) {

        this.precio = getPrecio() + cantidad;
    }//this.precio+= cantidad

    @Override
    public int compareTo(Figura figura) {
        return (int) (this.getPrecio() - figura.getPrecio());
    }


    public boolean equals(Figura obj) {

        if (obj == null) return false;
        if (this == obj) return true;
        Figura figura = (Figura) obj;

        return Objects.equals(codigo, figura.codigo);
    }

    private static boolean codigoEnUso(String codigo) {
        for (int i = 0; i < contadorNumFig; i++) {
            if (codigo.equals(codigosRegistrados[i])) {
                return true;
            }
        }
        return false;
    }
}