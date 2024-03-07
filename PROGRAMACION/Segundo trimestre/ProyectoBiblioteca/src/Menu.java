import java.util.Scanner;

public class Menu {

    public static void mostrar(){
        System.out.println("1. Nuevo libro\n" +
                "2. Mostrar todos los libros\n" +
                "3. Buscar libros\n" +
                "4. Bajas de libros por referencia\n" +
                "5. Bajas de libros por posición\n" +
                "6. Préstamo\n" +
                "7. Devolución\n" +
                "8. Mostrar libros disponibles\n" +
                "0. FIN");
    }

    public static int leer(){
        int eleccion;
        do {
            System.out.println("Indique el número de la opción que decida ejecutar: ");
            mostrar();
            Scanner scan = new Scanner(System.in);
            eleccion = scan.nextInt();
        }while (eleccion <0 || eleccion>8);
        return eleccion;
        }
    }

