import java.util.Objects;

public class Producto{

    //Atributos
    private String id;
    private String nombreDeProducto;

    private float precioUnitario;
    private int numeroUnidades;



    //Constructores

    public Producto (){
        this.id=" ";

    }
    public Producto (String id){
        this.id=id;

    }

    public Producto (String id, String nombreDeProducto, float precioUnitario, int numeroUnidades){
        this(id);
        this.nombreDeProducto=nombreDeProducto;
        this.precioUnitario=precioUnitario;
        this.numeroUnidades=numeroUnidades;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "Producto{" +
                ", nombreDeProducto='" + nombreDeProducto + '\'' +
                ", numeroUnidades=" + numeroUnidades +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

    public void incrementoPrecio (int cantidad){
        this.precioUnitario += cantidad;

    }

    public float calcularPrecioTotalProducto (){
        return this.precioUnitario*this.numeroUnidades;
    }

    public void imprimirPrecioTotalProductos(){
        System.out.println(calcularPrecioTotalProducto());
    }


    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id);
    }*/

    public boolean equals(Producto producto) {
        if (producto== null) return false;
       /* if (this == producto) return true;*///solo devolverá true si se le pasa el mismo objeto(referencia)ej: mismo melon

        return this.id.equals(producto.getId());
    }



}
