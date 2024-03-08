import java.util.Objects;

public class Personaje implements Comparable<Personaje> {
    //atributos

    private final int identificador;
    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;


    //constructores
    private Personaje(){
        this.identificador=generarIdentificador();
        this.nombre=" ";
        this.nivel=20;
        this.vida=20;
        this.ataque=20;

    }

    public Personaje(String nombre){
        this();
        getNombre();
        getNivel();
        getVida();
        getAtaque();


    }
    private int generarIdentificador() {
        int identificador= (int) (Math.random()*(100000000-100000+1)+100000);

        return identificador;
    }



    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        } else {
            throw new Exception("Nombre no válido");

        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) throws Exception {
        if (nivel >= 20) {
            this.nivel = nivel;
        } else {
            throw new Exception("Nivel no válido");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) throws Exception {
        if (vida >= 20) {
            this.vida = vida;
        } else {
            throw new Exception("Vida no válida");
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) throws Exception {
        if (ataque >= 20) {
            this.ataque = ataque;
        } else {
            throw new Exception("Ataque no válido");
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "identificador=" + identificador +
                ", Su nombre es='" + nombre + '\'' +
                ", Su nivel=" + nivel +
                ", Su vida=" + vida +
                ", Y un poder de ataque de ataque=" + ataque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return nivel == personaje.nivel && Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int compareTo(Personaje personaje) {
        return personaje.getNivel()-(this.getNivel());
    }
}
