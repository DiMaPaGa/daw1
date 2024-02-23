public class Cancion {

    private String nombreCancion;
    private String duracionCancion;


    public Cancion(String nombreCancion, String duracionCancion){
        this.nombreCancion=nombreCancion;
        this.duracionCancion=duracionCancion;

    }


    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(String duracionCancion) {
        this.duracionCancion = duracionCancion;
    }
}
