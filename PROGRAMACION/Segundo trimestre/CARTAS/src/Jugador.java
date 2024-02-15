public class Jugador {

  private String nombre;
  private String apellido1;
  private String apellido2;


  public Jugador(){

  }

    public Jugador(String nombre, String apellido1, String apellido2){
      this.nombre=nombre;
      this.apellido1=apellido1;
      this.apellido2=apellido2;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
}
