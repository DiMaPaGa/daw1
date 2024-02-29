import java.util.Objects;

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


    public boolean equals(Cancion tema) {
        if (this == tema) return true;
        if (tema == null) return false;
        return nombreCancion.equals(tema.nombreCancion);
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", duracionCancion='" + duracionCancion + '\'' +
                '}';
    }
}
