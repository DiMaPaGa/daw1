import java.util.InputMismatchException;

public class Libro {

    //Atributos

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String editorial;


    //Constructores

private Libro(){

}

public Libro(String isbn, String titulo, String autor){
 this();
 setIsbn(isbn);
 setTitulo(titulo);
 setAutor(autor);


}

public Libro(String isbn, String titulo, String autor, int numeroPaginas, String editorial){
 this (isbn, titulo, autor);//en un principio ha puesto todos this.Aquí tb.
 setNumeroPaginas(numeroPaginas);
 setEditorial(editorial);

}

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setIsbn(String isbn) {
    if (contieneNulo(isbn)) {
        throw new NullPointerException("ISBN no válido");
    }
    if(isbn.length() !=10 && isbn.length()!=13){
        throw new IllegalArgumentException ("El ISBN solo comprende 10 ó 13 dígitos");
    }//si meto esto en el método de contine digitos, me evito una comprobación y puedo llamar al método ISBNvalido;
    if (!contieneDigitos(isbn)){
        throw new InputMismatchException("el ISBN solo puede contener dígitos");
    }

        this.isbn = isbn;
    }


    public void setTitulo(String titulo) {
        if (contieneNulo(titulo)) {
            throw new NullPointerException("Título no válido");
        }
        if (titulo.equals("")){
            throw new IllegalArgumentException ("Título no incorporado");
        }

        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (contieneNulo(autor)) {
            throw new NullPointerException("Autor no válido");
        }
        if (titulo.equals("")){
            throw new IllegalArgumentException ("Autor no incorporado");
        }
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
    if (numeroPaginas<=0){
        throw new IllegalArgumentException("Número de páginas no válido");
    }

        this.numeroPaginas = numeroPaginas;
    }

    public void setEditorial(String editorial) {
        if (contieneNulo(editorial)) {
            throw new NullPointerException("editorial no válida");
        }
        if (titulo.equals("")){
            throw new IllegalArgumentException ("Editorial no incorporado");
        }

        this.editorial = editorial;
    }

    //borrar el Override
    public String toString() {
        return "Título: " + this.titulo + " - ISBN: " + this.isbn + " - AUTOR: "+ this.autor + " - PÁGINAS=" + this.numeroPaginas;
    }

    private boolean contieneDigitos (String isbn){

    // Incorpora aquí también la comprobacion de la longitud.
        //if(isbn.length() !=10 && isbn.length()!=13){
        //        return false;
        //    }

        for (int i = 0; i < isbn.length() ; i++) {
            if (!Character.isDigit(isbn.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean contieneNulo (String prueba){
     return prueba==null;
    }


}
