public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private String sexo;
    private float altura;
    private float peso;

    private static String apellido= "Pastrana"; //no son del objeto, sino de la clase



    //constructores

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    public Persona(){
        this.nombre="DEFAULT";
        this.edad= 1;
        this.sexo="no";
        this.altura= 2;
        this.peso= 3;
    }

    public Persona(String nombre, int edad, String sexo){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;


    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura){
        this(nombre, edad, sexo);// CON ESTO LLAMO AL CONSTRUCTOR PERSONA DE ARRIBA QUE INCORPORA 3 DATOS
        this.peso = peso;
        this.altura= altura;


    }

    public String getNombre() {
        return nombre; //siempre devuelven, pero no reciben
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; //siempre reciben, pero no devuelven
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    @Override //sobreescribir
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }


    public boolean equals(Object obj){
        Persona persona = (Persona) obj; //convertimos un objeto en otro objeto casteandole el objeto que queremos
        boolean nombreIgual = this.nombre.equals(persona.nombre);//aqui puede ponerse equalsIgnoreCase(persona.nombre)
        boolean edadIgual = this.edad ==persona.edad;
        boolean sexoIgual = this.sexo.equals(persona.sexo);

        return nombreIgual && edadIgual && sexoIgual;
    }

    public void cumplirAnios (){
        this.edad+=1;
    }
}