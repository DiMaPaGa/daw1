package daw1.programacion;

import java.util.Objects;

public class Jugador {

    private String nombre;
    private String genero;
    private int edad;
    private float altura;
    private float peso;

    private Jugador(){

    }

    public Jugador(String nombre){
        this();
        this.nombre=nombre;
    }

    public Jugador(String nombre, String genero, int edad, float altura, float peso){
        this(nombre);
        this.genero=genero;
        this.edad=edad;
        this.altura=altura;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean equals(Jugador jugador) {
        if (jugador == null) return false;

        return this.nombre.equals(jugador.getNombre());
    }


/*Ojo que dice imprimirPerfil, imprime, mejor no como el toString sino public void imprimirPerfil()*/
    public String imprimirPerfil() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
