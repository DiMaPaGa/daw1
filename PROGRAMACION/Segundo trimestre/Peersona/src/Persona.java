import java.util.concurrent.ThreadLocalRandom;

public class Persona {

    private String nombre;
    private int edad;
    private String dni= generarDNI();
    private char sexo;

    private final char sexopordef='H';
    private float peso;
    private float altura;



    public Persona(){
        this.sexo=this.sexopordef;

    }

    public Persona(String nombre, int edad, char sexo ){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;


    }

    public Persona(String nombre, int edad, char sexo, String dni,float peso, float altura ){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;

    }

    public int calcularIMC (float peso, float altura){
        int valor;
        float imc=((this.peso)/(this.altura*this.altura));
        if (imc<20){
            valor=-1;
        }else if (imc>25){
            valor=1;
        } else{
            valor=0;
        }


        return valor;
    }

    public boolean esMayorEdad (int edad){
            boolean mayor= false;
            if(edad>=18){
                mayor=true;
            }
           return mayor;
    }

    private void comprobarSexo (char sexo){
        if(sexo!='H'&& sexo!='M'){
            this.sexo=sexopordef;
        }

    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    private String generarDNI() {

        long num= ThreadLocalRandom.current().nextLong(10000000L,99999999L+1L);
        int codigoAscii = (int)Math.floor(Math.random()*(122 - 97)+97);
        String dni= "";
        dni += " "+num+ (char)codigoAscii;

        return dni;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

