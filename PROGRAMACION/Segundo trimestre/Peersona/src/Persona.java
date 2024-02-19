import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private final char SEXO_POR_DEFECTO = 'H'; //static no es necesario porque es una variable auxiliar para solo una variable concreta
    private final int PESO_POR_EXCESO = 1;
    private final int PESO_IDEAL = 0;
    private final int PESO_POR_DEBAJO = -1;
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;


    //CONSTRUCTORES
    public Persona() {
        this.sexo = comprobarSexo(sexo);//sexo_por_defecto
        this.dni = generarDNI();


    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();


    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this(nombre, edad, sexo);
        this.dni = generarDNI();
        this.peso = peso;
        this.altura = altura;


    }

    public int calcularIMC(float peso, float altura) {

        float imc = ((peso) / (altura * altura));
        if (imc < 20) {
            return PESO_POR_DEBAJO;
        } else if (imc > 25) {
            return PESO_POR_EXCESO;
        } else {
            return PESO_IDEAL;
        }

    }

    public int calcularIMC() {

        float imc = ((this.peso) / (this.altura * this.altura));
        if (imc < 20) {
            return PESO_POR_DEBAJO;
        } else if (imc > 25) {
            return PESO_POR_EXCESO;
        } else {
            return PESO_IDEAL;
        }

    }

    public boolean esMayorEdad() {

        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }

    }

    /*private void comprobarSexo (char sexo){

      if (sexo == 'M' || sexo == 'm') {
        this.sexo=sexo;
    } else {
        this.sexo = SEXO_POR_DEFECTO;
    }

}*/


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

        long num = ThreadLocalRandom.current().nextLong(10000000L, 99999999L + 1L);
        int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
        //String dni = ""+num+ (char)codigoAscii;
        return "" + num + (char) codigoAscii;

    }

    /* private void generarDNI(){
    int numdni=generarNumDNI();
    String letraDNI= generarLetraDNI(numDNI);

    this.dni=numDNI + letraDNI;
    *
    * }*/

    /*private int generarNumDNI() {
        int numDni = 0;
        for (int i = 0; i < 8; i++) {
            int numAleatorio;
            if (i == 0) {
                numAleatorio = (int) (Math.random() * 9 + 1);
            } else {
                numAleatorio = (int) (Math.random() * 9);
            }
            numDni = numDni * 10 + numAleatorio;

            return numDni;

        }
    }*/

  /*  private char generarLetraDNI (int numDNI){
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion= numDni %23;

        return letras.charAt(posicion);
    }*/








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

