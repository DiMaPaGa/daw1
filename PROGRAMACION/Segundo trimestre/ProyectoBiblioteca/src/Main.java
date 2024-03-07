import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca=new Biblioteca();
        int eleccion;
        do {
            eleccion = Menu.leer();
            switch (eleccion) {
                case 1:
                    libroNuevo(biblioteca);
                    break;
                case 2:
                    mostrarLibros(biblioteca);
                    break;
                case 3:
                    buscarLibros(biblioteca);
                    break;
                case 4:
                    darDeBajaLibroPorReferencia(biblioteca);
                    break;
                case 5:
                    darDeBajaLibroPorPosicion(biblioteca);
                    break;
                case 6:
                    realizarPrestamo(biblioteca);
                    break;
                case 7:
                    realizarDevolucion(biblioteca);
                    break;
                case 8:
                    mostrarLibrosDisponibles(biblioteca);
                    break;
                case 0:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
        }while(eleccion!=0);



    } //main

    private static void mostrarLibrosDisponibles(Biblioteca biblioteca) {
        Libro[] librosReales=new Libro[biblioteca.getIndice()];

        for (int i = 0; i < biblioteca.getIndice(); i++) {
            librosReales[i]=biblioteca.getLibros()[i];
        }
        Arrays.sort(librosReales);
        System.out.println("Los libros disponibles para préstamo son: ");
        for (Libro elemento: librosReales){
            if(elemento.estaDisponible()){
                System.out.println(elemento.toString()+"\n");
            }
        }
              {

        }
    }




    public static void libroNuevo(Biblioteca biblioteca) {
        Scanner scanLN = new Scanner(System.in);

        System.out.println("Incorpore la referencia del libro");
        String referencia = scanLN.nextLine();
        if (biblioteca.buscarLibro(referencia)) {
            System.out.println("Ya existe un libro con dicha referencia");
        } else {
            System.out.println("Incorpora el título del libro");
            String titulo = scanLN.nextLine();
            System.out.println("Incorpora el autor/a del libro");
            String autor = scanLN.nextLine();
            Libro libro = new Libro(referencia, titulo, autor);
            if (biblioteca.anadirLibro(libro)) {
                System.out.println("El libro ha sido incorporado a la biblioteca satisfactoriamente");
            } else {
                System.out.println("El libro no ha podido ser incorporado. La biblioteca está llena");
            }

        }
    }

    private static void mostrarLibros(Biblioteca biblioteca) {
        System.out.println(biblioteca.toString());
    }

        private static void buscarLibros(Biblioteca biblioteca) {
                Scanner scanBL = new Scanner(System.in);
                System.out.println("Incorpore la referencia del libro que desea buscar: ");
                String referencia = scanBL.nextLine();
                Libro libro = biblioteca.devolverlibroPorReferencia(referencia);
                if (libro != null) {
                    System.out.println(libro.toString());
                } else {
                    System.out.println("Libro no encontrado");
                }
            }

    private static void darDeBajaLibroPorReferencia(Biblioteca biblioteca) {
        Scanner scanBXR= new Scanner (System.in);
        System.out.println("Incorpore la referencia del libro");
        String referencia= scanBXR.nextLine();
        if(biblioteca.eliminarLibroPorReferencia(referencia)){
            System.out.println("Libro eliminado a través de referencia correctamente");
        } else{
            System.out.println("Libro no encontrado");
        }

    }

    private static void darDeBajaLibroPorPosicion(Biblioteca biblioteca) {
        Scanner scanBXP= new Scanner (System.in);
        System.out.println("Incorpore la referencia del libro");
        int posicion= scanBXP.nextInt();
        if(biblioteca.eliminarLibroPorPosicion(posicion)){
            System.out.println("Libro eliminado a través de posición correctamente");
        } else{
            System.out.println("Libro no encontrado");
        }

    }

    private static void realizarPrestamo(Biblioteca biblioteca) {

        Scanner scanRP= new Scanner (System.in);
        System.out.print("Introduce la referencia del libro para préstamo: ");
        String referencia = scanRP.nextLine();
        Libro libro = biblioteca.devolverlibroPorReferencia(referencia);
        if (libro != null) {
            if (libro.prestamo()) {
                System.out.println("Préstamo realizado correctamente.");
            } else {
                System.out.println("No hay ejemplares disponibles para préstamo.");
            }
        } else {
            System.out.println("No se encontró el libro con esa referencia.");
        }
    }

    private static void realizarDevolucion(Biblioteca biblioteca) {
        Scanner scanRD= new Scanner (System.in);
        System.out.print("Introduce la referencia del libro para devolucion: ");
        String referencia = scanRD.nextLine();
        Libro libro = biblioteca.devolverlibroPorReferencia(referencia);
        if (libro != null) {
            if (libro.devolucion()) {
                System.out.println("Devolución realizada correctamente.");
            } else {
                System.out.println("No hay ejemplares prestados de este libro.");
            }
        } else {
            System.out.println("No se encontró el libro con esa referencia.");
        }
    }




} //class
