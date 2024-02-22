public class Producto implements Comparable<Producto>{

    //Atributos
    private String id;
    private String nombreDeProducto;

    private float precioUnitario;
    private int numeroUnidades;
    private Producto producto;

    private float precioTotal=0;


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
        return this.id.equals(producto.id);
    }

    public int compareTo(Producto producto) {
        return (int) (this.precioUnitario- producto.precioUnitario);
    }

    public void calcularPrecio (float[] precios){

        for (int i = 0; i < precios.length; i++) {
            precioTotal += precios[i];
        }

    }

    public void imprimirPrecio (){
        System.out.println(precioTotal);
    }





}
