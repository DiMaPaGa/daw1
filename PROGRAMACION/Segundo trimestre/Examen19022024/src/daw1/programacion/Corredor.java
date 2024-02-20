package daw1.programacion;

public class Corredor {

    //atributos

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private float velocidadMaxima;
    private int dorsal;
    private float peso;
    private float altura;

    //constructores

    public Corredor(String dni) {
        this.dni= generarDNI();

    }

    public Corredor(String dni, String nombre, String apellido1, String apellido2) {
        this(dni);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

    }

    public Corredor(String dni, String nombre, String apellido1, String apellido2, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this(dni, nombre, apellido1, apellido2);
        this.diaNacimiento =diaNacimiento;
        this.mesNacimiento =mesNacimiento;
        this.anioNacimiento =anioNacimiento;


    }








    //Métodos

    private String generarDNI() {
        int numdni = generarNumDNI();

        char letraDNI = generarLetraDNI(numdni);

        return this.dni = String.valueOf(numdni + letraDNI);
    }


    private int generarNumDNI() {
        int numDni = 0;
        for (int i = 0; i < 8; i++) {
            int numAleatorio;
            if (i == 0) {
                numAleatorio = (int) (Math.random() * 9 + 1);
            } else {
                numAleatorio = (int) (Math.random() * 9);
            }
            numDni = numDni * 10 + numAleatorio;



        }
        return numDni;
    }

    private char generarLetraDNI (int numDNI){
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion= numDNI%23;

        return letras.charAt(posicion);
    }

    private boolean contieneNulo (String prueba){
        return prueba==null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (contieneNulo(nombre)) {
            throw new NullPointerException("nombre no válido");
        }
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        if (contieneNulo(apellido1)) {
            throw new NullPointerException("apellido1 no válido");
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        if (contieneNulo(apellido2)) {
            throw new NullPointerException("apellido2 no válido");
        }
        this.apellido2 = apellido2;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        if (diaNacimiento<=0){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>31&&mesNacimiento==1||diaNacimiento>31&&mesNacimiento==3||diaNacimiento>31&&mesNacimiento==5||diaNacimiento>31&&mesNacimiento==7||diaNacimiento>31&&mesNacimiento==8||diaNacimiento>31&&mesNacimiento==10||diaNacimiento>31&&mesNacimiento==12){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>28&&mesNacimiento==2){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>30&&mesNacimiento==4||diaNacimiento>30&&mesNacimiento==6||diaNacimiento>30&&mesNacimiento==9||diaNacimiento>30&&mesNacimiento==11){
            throw new IllegalArgumentException("día no válidO");
        }

        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {

        if (mesNacimiento<=0||mesNacimiento>12){
            throw new IllegalArgumentException("mes no válido");
        }
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento<=1900){
            throw new IllegalArgumentException("año no válido");
        }
        this.anioNacimiento = anioNacimiento;
    }

    public String getDni() {
        return dni;
    }


    public int getDiaNacimiento() {
        return diaNacimiento;
    }


    public int getMesNacimiento() {
        return mesNacimiento;
    }


    public int getAnioNacimiento() {

        return anioNacimiento;
    }


    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        if (velocidadMaxima<=0f){
            throw new IllegalArgumentException("velocidad no válida");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getDorsal() {

        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.dorsal = dorsal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {

        if (peso<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {

        if (altura<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.altura = altura;
    }

    public int getEdad(int anioNacimiento){

        int edad= getAnioNacimiento()-2024;

      return edad;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", dni='" + dni + '\'' +
                ", diaNacimiento=" + diaNacimiento +
                ", mesNacimiento=" + mesNacimiento +
                ", anioNacimiento=" + anioNacimiento +
                ", velocidadMaxima=" + velocidadMaxima +
                ", dorsal=" + dorsal +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
