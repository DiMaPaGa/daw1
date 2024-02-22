public class Producto Comparable<Producto>{

    //Atributos
    private String id;
    private String nombreDeProducto;

    private float precioUnitario;
    private int numeroUnidades;


    //Constructores

    public Producto (){

    }

    public Producto (String id, String nombreDeProducto, float precioUnitario, int numeroUnidades){

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
                "id='" + id + '\'' +
                ", nombreDeProducto='" + nombreDeProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", numeroUnidades=" + numeroUnidades +
                '}';
    }

    public void incrementoPrecio (int cantidad){
        this.precioUnitario += cantidad;

    }


    public boolean equals(Producto producto) {
        return Producto.equals(producto);
    }

    @Override
    public int compareTo(Producto o) {
        return 0;
    }
}
