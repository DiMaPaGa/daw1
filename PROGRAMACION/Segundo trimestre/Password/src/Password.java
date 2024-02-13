public class Password {

    //ATRIBUTOS

    private final int LONGITUD_POR_DEFECT0 = 8;
    private int longitud;
    private String contrasenia;

    //CONSTRUCTOR

    public Password() {
        this.longitud=LONGITUD_POR_DEFECT0;
        this.contrasenia=generarContrasenia(LONGITUD_POR_DEFECT0);

    }

    public Password (int longitud){
        this.longitud= longitud;
        this.contrasenia=generarContrasenia(longitud);


    }

    //METODOS

    public boolean esFuerte() {
        int mayusculas=0;
        int minusculas=0;
        int numeros=0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".indexOf(contrasenia.charAt(i))!=-1){
                mayusculas++;
            } else if ("abcdefghijklmnñopqrstuvwxyz".indexOf(contrasenia.charAt(i))!=-1){
                minusculas++;

            } else if ("1234567890".indexOf(contrasenia.charAt(i))!=-1){
                numeros++;
            }

        }
        return mayusculas >2 && minusculas>1 && numeros>5;

    }

    public String generarContrasenia(int longitud) {

        String caracteres= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

        String contrasenia="";
        for (int i = 0; i < longitud; i++) {
            int caracterAleatorio = (int) (Math.random() * 64);
            contrasenia += caracteres.charAt(caracterAleatorio);
        }

            return contrasenia;

    }


    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
