public class Libro {

    //Atributos

    private long isbn;

    private String titulo;
    private String autor;

    private int numeroPaginas;
    private String editorial;


    //Constructores

public Libro(){

}

public Libro(long isbn, String titulo, String autor){
 this();
 this.isbn=isbn;
 this.titulo=titulo;
 this.autor=autor;


}

public Libro(long isbn, String titulo, String autor, int numeroPaginas, String editorial){
 this (isbn, titulo, autor);
 this.numeroPaginas=numeroPaginas;
 this.editorial=editorial;

}

    public long getIsbn() {
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

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " - ISBN: " + isbn + " - AUTOR: "+ autor + " - PÁGINAS=" + numeroPaginas;
    }
}
