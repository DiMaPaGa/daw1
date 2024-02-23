public class Tarea {

    private String nombre;
    private String descripcion;

    private boolean completada;

    public Tarea (String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.completada=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public boolean marcarComoCompletada(){
        completada=true;
        return this.completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                '}';
    }



}
