import java.util.Arrays;

public class Biblioteca{



    private Libro [] libros;
    private int indice;

    public Biblioteca(){
        this.libros=new Libro[100];
        this.indice=0;
    }


    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public boolean anadirLibro (Libro libro){
        boolean anadido=false;
        if(indice==libros.length){
            System.out.println("No hay espacio para añadir este libro");
        } else {
        if(buscarLibro(libro.getReferencia())){
            System.out.println("El libro ya está añadido");
        } else {
            libros[this.indice]=libro;
            this.indice++;
            anadido=true;
            }
        }

        return anadido;
    }

    /*public boolean anadirLibro(String referencia) {
        boolean anadido = false;
        if (buscarLibro(referencia)) {
            System.out.println("Ya existe un libro con dicha referencia");
        } else {
            for (int i = 0; i < libros.length; i++) {
                if (libros[i] == null) {
                    libros[i] = new Libro(referencia);
                    anadido = true;
                    break;
                }
            }
        }
        return anadido;
    }*/

    public boolean eliminarLibroPorReferencia (String referencia) {
        boolean eliminado = false;
        if(buscarLibro(referencia)){

            for (int i = 0; i < libros.length-1; i++) {
                if(libros[i]!=null && libros[i].getReferencia().equals(referencia)){
                    eliminado=true;
                }
                if(eliminado){
                    libros[i]=libros[i+1];
                }
            }
            if(eliminado){
                indice--;
            }

        }
        return eliminado;
    }


    public boolean buscarLibro(String referencia) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && referencia.equals(libros[i].getReferencia())) {
                return true;
            }
        }
        System.out.println("Libro no encontrado");
        return false;
    }


    public Libro buscarLibro (int posicion){
        this.indice=posicion;

        return libros[posicion];
    }



    public boolean eliminarLibroPorPosicion (int posicion) {
        boolean eliminado = false;

            if(posicion<0||posicion>=libros.length){
                System.out.println("La posición indicada no es correcta");
            }
            if(libros[posicion]== null){
                System.out.println("No hay libro que eliminar en esa posicion");

            } else{
                for (int i = posicion; i < libros.length-1; i++) {
                    libros[i]=libros[i+1];
                }
                eliminado=true;
                indice--;
            }

            return eliminado;
    }

    public int cantidadLibrosDisponibles() {
        int cantidadlibros = 0;
            for (Libro elemento : libros) {
                if (elemento != null) {

                    cantidadlibros+=elemento.ejemplaresDisponibles();
                }
            }

        return cantidadlibros;
    }

    public Libro devolverlibroPorReferencia (String referencia){
        Libro guardado=null;
        for (Libro elemento: libros) {
            if(elemento!=null && elemento.getReferencia().equals(referencia)){
                guardado=elemento;
            }
        }
            return guardado;

    }

    @Override
    public String toString() {

        Libro[] librosReales=new Libro[indice];

        for (int i = 0; i < indice; i++) {
            librosReales[i]=libros[i];
        }

        Arrays.sort(librosReales);


        return "Lista de libros de la biblioteca: \n"+
                Arrays.toString(librosReales);
    }


}
