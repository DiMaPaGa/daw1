public class Main {
    public static void main(String[] args) {


        Producto producto1 =new Producto("Pipas", "Frutos secos", 456, 0.5f);
        Producto producto2 =new Producto("CocaCola", "Bebidas", 456, 0.5f);

    CestaDeCompra cesta=new CestaDeCompra();
    cesta.añadirProducto(producto1);
    cesta.añadirProducto(producto1);
    cesta.añadirProducto(producto2);

        System.out.println(cesta.getPrecio());



    }
}