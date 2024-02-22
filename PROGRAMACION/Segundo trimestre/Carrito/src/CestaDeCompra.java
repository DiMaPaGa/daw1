public class CestaDeCompra {

private float precio;



public CestaDeCompra(){
    this.precio=0;

}

public void añadirProducto (Producto producto){

    this.precio += producto.getPrecio();

}

public float getPrecio() {
        return precio;
    }
}
