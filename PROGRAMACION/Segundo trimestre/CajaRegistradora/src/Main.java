public class Main {
    public static void main(String[] args) {

CajaRegitradora lista= new CajaRegitradora();
Producto boli= new Producto("Abc123", "Boligrafo",0.50f, 1);
Producto lapiz= new Producto("Abc122", "Lápiz",0.20f, 1);
Producto rotulador= new Producto("Abc124", "Rotulador",0.75f, 1);
Producto goma= new Producto("Abc120", "goma",0.20f, 1);
Producto calculadora= new Producto("Abc130", "Calculadora",8.50f, 1);
Producto cuaderno= new Producto("Abc121", "Cuaderno",2.50f, 1);

calculadora.incrementoPrecio(1);

System.out.println(lista.anadirProducto(boli));
System.out.println(lista.anadirProducto(lapiz));
System.out.println(lista.anadirProducto(calculadora));

lista.incrementarUnidades("Abc121", 1);
lista.incrementarUnidades("Abc130", 1);

System.out.println(lista.buscarProducto(cuaderno));
System.out.println(lista.buscarProducto(calculadora));

System.out.println(lista.anadirProducto(goma));
System.out.println(lista.borrarProducto(goma));


lista.incrementarUnidades("Abc130", 1);
lista.disminuirUnidades("Abc130", 2);

System.out.println(lista.buscarProducto(rotulador));

System.out.println(lista.calcularTotal());

lista.generarTicket();
lista.imprimirTicket();







    }
}