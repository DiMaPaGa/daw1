import java.util.InputMismatchException;

public class Libro {

    //Atributos

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String editorial;


    //Constructores

public Libro(){

}

public Libro(String isbn, String titulo, String autor){
 this();
 setIsbn(isbn);
 setTitulo(titulo);
 setAutor(autor);


}

public Libro(String isbn, String titulo, String autor, int numeroPaginas, String editorial){
 this (isbn, titulo, autor);
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
    if(isbn.length()<10 || isbn.length()>13){
        throw new IllegalArgumentException ("El ISBN solo comprende de 10 a 13 dígitos");
    }
    if (!contieneDigitos(isbn)){
        throw new InputMismatchException("el ISBN solo puede contener dígitos");
    }

        this.isbn = isbn;
    }


    public void setTitulo(String titulo) {
        if (contieneNulo(titulo)) {
            throw new NullPointerException("Título no válido");
        }

        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if (contieneNulo(autor)) {
            throw new NullPointerException("Autor no válido");
        }
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
    if (numeroPaginas<=0){
        throw new IllegalArgumentException("Número de páginas  válido");
    }

        this.numeroPaginas = numeroPaginas;
    }

    public void setEditorial(String editorial) {
        if (contieneNulo(editorial)) {
            throw new NullPointerException("editorial no válida");
        }

        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " - ISBN: " + isbn + " - AUTOR: "+ autor + " - PÁGINAS=" + numeroPaginas;
    }

    private boolean contieneDigitos (String isbn){
        for (int i = 0; i < isbn.length() ; i++) {
            if (!Character.isDigit(isbn.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean contieneNulo (String prueba){
     if (prueba==null){
         return true;
     }
     return false;
    }


}
