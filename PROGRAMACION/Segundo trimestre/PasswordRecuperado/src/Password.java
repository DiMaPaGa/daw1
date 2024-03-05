public class Password {
    //ATRIBUTOS

    private final int LONGITUD_POR_DEFECT0 = 8;
    private int longitud;
    private String contrasenia;

    //CONSTRUCTOR

    private Password() {
        this.longitud = LONGITUD_POR_DEFECT0;// hasta aqui en clase
        this.contrasenia = generarContrasenia(LONGITUD_POR_DEFECT0);//no, porque en el ejercicio no hace falta en el método incorporar la longitud. Se hace en el set.

    }

    public Password(int longitud) {
        //this();
        this.longitud = longitud;
        this.contrasenia = generarContrasenia(longitud);// generarContrasenia()


    }

    //METODOS

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".indexOf(contrasenia.charAt(i)) != -1) {
                mayusculas++;
            } else if ("abcdefghijklmnñopqrstuvwxyz".indexOf(contrasenia.charAt(i)) != -1) {
                minusculas++;

            } else if ("1234567890".indexOf(contrasenia.charAt(i)) != -1) {
                numeros++;
            }

        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;

    }

    /*public boolean esFuerte(){

    boolean tieneMayus= comprobarMayus();
    boolean tieneMinus= comprobarMinus();
    boolean tieneNumeros= comprobarNumeros();


    return tieneMayus && tieneMinus && tieneNumeros;
    }

    private boolean comprobarMayus(){
    int contadorMayus=0;

    for (int i=0; i< this.password.length(); i++){
    if (this.password.charAt(i)>='A'&& this.password.charAt(i)<='Z'){
    contadorMayus++;
    }

   if (contadorMayus >2){
   break;}


    }

    return contadorMayus>2;
    }

    private boolean comprobarMinus(){
    int contadorMinus=0;

    for (int i=0; i< this.password.length(); i++){
    if (this.password.charAt(i)>='a'&& this.password.charAt(i)<='z'){
    contadorMinus++;
    }

   if (contadorMinus >1){
   break;}


    }

    return contadorMinus>1;
    }

     private boolean comprobarNumeros(){
    int contadorNumeros=0;

    for (int i=0; i< this.password.length(); i++){
    if (CHARACTER.ISdIGIT(THIS.PASSWORD.CharAt(i)))

    contadorNumeros++;
    }

   if (contadorNumeros >5){
   break;}


    }

    return contadornumeros>5;
    }




    */



    public String generarContrasenia(int longitud) {

        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

        String contrasenia = "";
        for (int i = 0; i < longitud; i++) {
            int caracterAleatorio = (int) (Math.random() * caracteres.length());
            contrasenia += caracteres.charAt(caracterAleatorio);
        }

        return contrasenia;

    }

    /*private void generarPassword(){

    String caracteres= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

    for (int i=0; i< this.longitud; i++){
     posicion= (int)Math.random()*caracteres.length();
     password+= caracteres.charAt(posicion);

    }

    this.password=password;



}*/


    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        //generarPassword();
    }
}
