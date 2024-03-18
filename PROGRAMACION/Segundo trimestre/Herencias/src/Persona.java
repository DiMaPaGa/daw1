public class Persona {

    private String nombre;
    private int edad;

    public Persona(){

    }

    public Persona(String n, int e){
        nombre=n;
        edad=e;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad;
    }

}
