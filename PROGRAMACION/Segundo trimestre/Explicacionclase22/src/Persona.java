public class Persona /*implements Comparable<Persona>*/{

    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public boolean equals(Object obj) { //método equals
    Persona persona=(Persona) obj;

    return this.nombre.equals(persona.nombre)&& this.apellido.equals(persona.apellido);
    }


   /* public int compareTo(Persona persona) {
        return this.edad- persona.edad;
    }

   public int compareTo(Persona persona) {
        return this.nombre.compareTo(persona.nombre);
    }*/

}
