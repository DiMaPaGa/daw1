public class Libro implements Comparable<Libro>{

    private String referencia;
    private String titulo;
    private String autor;
    private  int ejemplares;
    private  int prestados;

    private Libro(){
        this.referencia="";
        this.titulo="";
        this.autor="";
        ejemplares=20;
        prestados=0;
    }

    public Libro(String referencia){
        this();
        this.referencia=referencia;

    }

    public Libro(String referencia, String titulo, String autor){
    this(referencia);
    this.titulo=titulo;
    this.autor=autor;

    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "referencia='" + referencia + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares disponibles="+ ejemplares+ '\'' +
                '}';
    }

    public boolean prestamo(){

        if(this.estaDisponible()){
        this.prestados++;
        this.ejemplares--;
        return true;

        } else{
            System.out.println("No hay ejemplares para prestar");
            return false;
        }

    }

    public boolean devolucion() {

        if (this.prestados > 0) {
            this.prestados--;
            this.ejemplares++;
            return true;
        } else {
            System.out.println("No hay ejemplares para prestar");
            return false;
        }
    }

    public boolean estaDisponible(){
        if(this.ejemplares>0){
            return true;
        } else{
            return false;
        }

    }

    public int ejemplaresDisponibles(){

            return this.ejemplares;

    }


    @Override
    public int compareTo(Libro libro) {


        return  libro.getTitulo().compareTo(this.getTitulo());


    }
}
