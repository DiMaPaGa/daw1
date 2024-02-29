public class CajaRegitradora {

    private Producto[]productos;


    public CajaRegitradora(){
        Producto[]productos=null;

    }

public int buscarProducto(Producto producto){
        int posicion=-1;
    for (int i = 0; i < productos.length; i++) {
        if (producto.equals(productos[i])){
            posicion=i;
        }
    }
     return posicion;
    }

    public boolean anadirProducto(Producto producto){
        boolean add=false;
        if(productos==null){
            productos=new Producto[1];
            productos[0]=producto;
            add=true;
        } else {
            int posicion = this.buscarProducto(producto);
            if (posicion > -1) {
                productos[posicion].setNumeroUnidades(productos[posicion].getNumeroUnidades() + 1);
            } else {
                Producto[] antiguaLista = productos;
                productos = new Producto[antiguaLista.length + 1];
                for (int i = 0; i < productos.length; i++) {
                    if (i == productos.length - 1) {
                        productos[i] = producto;
                        add= true;
                    } else {
                        productos[i] = antiguaLista[i];
                    }

                }
            }
        }
        return add;
    }

    public boolean borrarProducto (Producto producto){
        boolean borrado=false;
        if(productos==null){
            System.out.println("No hay elementos que borrar, la lista no está inicializada");
        } else {
            int posicion = this.buscarProducto(producto);
            if (posicion > -1) {
                borrado = true;
                Producto[] antiguaLista = productos;
                productos = new Producto[antiguaLista.length - 1];
                int contador = 0;
                for (Producto elemento : antiguaLista) {
                    if (!producto.equals(elemento)) {
                        productos[contador] = elemento;
                        contador++;
                    }
                }
            }
        }
        return borrado;
    }

    public void disminuirUnidades(String id, int cantidad){
        if(productos==null){
            System.out.println("La lista no está inicializada");
        } else {
            int posicion = this.buscarProducto(new Producto(id));
            if (posicion > -1) {
                productos[posicion].setNumeroUnidades(productos[posicion].getNumeroUnidades() - cantidad);
            }
        }

    }

    public void incrementarUnidades(String id, int cantidad){
        if(productos==null){
            System.out.println("La lista no está inicializada");
        } else {
            int posicion = this.buscarProducto(new Producto(id));
            if (posicion > -1) {
                productos[posicion].setNumeroUnidades(productos[posicion].getNumeroUnidades() + cantidad);
            }
        }

    }

    public float calcularTotal (){
        float total=0;
        if(productos==null){
            System.out.println("La lista no está inicializada");
        } else {
            for (int i = 0; i < productos.length; i++) {
                total += productos[i].calcularPrecioTotalProducto();

            }
        }
        return total;
    }

    public String generarTicket (){
        String ticket= "";
        if(productos==null){
            System.out.println("La lista no está inicializada");
        } else {
            for (Producto elemento : productos) {
                ticket += elemento.toString() + elemento.calcularPrecioTotalProducto() + "\n";
            }
        }
        ticket+= this.calcularTotal();

      return ticket;
    }

    public void imprimirTicket (){
        System.out.println(generarTicket());
    }

}
