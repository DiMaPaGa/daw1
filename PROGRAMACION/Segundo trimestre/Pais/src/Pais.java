public class Pais {

    private String nombre;
    private long poblacion;
    private double pib;

    public Pais (String nombre, long poblacion, double pib){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.pib=pib;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public double pibPerCapita(){

        return (this.pib*1000000)/this.poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", pib=" + pib +
                '}';
    }
}
