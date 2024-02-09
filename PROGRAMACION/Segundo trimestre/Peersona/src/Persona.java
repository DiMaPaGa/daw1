import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private final static char SEXO_POR_DEFECTO ='H';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;


//CONSTRUCTORES
    public Persona(){
        this.sexo= comprobarSexo(sexo);
        this.dni=generarDNI();


    }

    public Persona(String nombre, int edad, char sexo ){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=comprobarSexo(sexo);
        this.dni=generarDNI();



    }

    public Persona(String nombre, int edad, char sexo,float peso, float altura ){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo= comprobarSexo(sexo);
        this.dni=generarDNI();
        this.peso=peso;
        this.altura=altura;


    }

    public int calcularIMC (float peso, float altura){
        int valor;
        float imc=((peso)/(altura*altura));
        if (imc<20){
            valor=-1;
        }else if (imc>25){
            valor=1;
        } else{
            valor=0;
        }


        return valor;
    }

    public boolean esMayorEdad (){
           return this.edad>=18;
    }

    private char comprobarSexo (char sexo){
        if(sexo=='H'|| sexo=='M'|| sexo=='h'|| sexo=='m'){
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
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
        //String dni = ""+num+ (char)codigoAscii;
        return ""+num+ (char)codigoAscii;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

