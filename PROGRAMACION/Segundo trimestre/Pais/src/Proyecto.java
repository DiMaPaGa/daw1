public class Proyecto {

    private String descripcion;
    private int duracion;
    private float sueldoDiario;


    public Proyecto(String descripcion, int duracion, float sueldoDiario){
        this.descripcion=descripcion;
        this.duracion=duracion;
        this.sueldoDiario=sueldoDiario;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(float sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public float calculoSalario(){

      return this.duracion*this.sueldoDiario;
    }


}
