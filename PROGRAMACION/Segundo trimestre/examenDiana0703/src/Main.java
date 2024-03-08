public class Main {
    public static void main(String[] args) throws Exception {

        // Ejercicio 1:

        double[] array={2.54326D, 2.34563423D, 42.4544D};

        arrayString(array);
        System.out.println(arrayconFormato(array));




        //Ejercicio 2:

        String [][]cadena= {{"Hola", "mundo"},{"Feliz","Semana"},{"Cuidado","ahi"}};

        System.out.println(contadorCaracteres(cadena));

        //Ejercicio 3

        Videojuego videojuego1=new Videojuego("WOW", "PC", "Aventuras", 80.20f);
        Personaje personaje1=new Personaje("Tara");
        Personaje personaje2=new Personaje("Azrael");

        System.out.println(videojuego1.toString());
        System.out.println(personaje1.toString());











    }//main
     //métodos ejercicio 1
    public static String[] arrayString (double[] array){

        String[] arrayresultado= new String[array.length];

        for (int i = 0; i < array.length ; i++) {
            arrayresultado[i]= array[i]+"";
        }

        for (String elemento: arrayresultado) {
            System.out.println(elemento);
            
        }

        return arrayresultado;

    }

    public static String arrayconFormato (double[] array){

        String arrayimpresa="[";

        for (int i = 0; i < array.length; i++) {
            arrayimpresa+=array[i]+";";
            if(i== array.length-1){
                arrayimpresa+=array[i]+"";

            }

        }
        arrayimpresa+="]";

        return arrayimpresa;
    }


    //metodos ejercicio 2

    public static String contadorCaracteres(String[][] array2d){
        String cadenaRecuentoCaracteres="";
        int contador=0;

        for (int i = 0; i < array2d.length; i++) {
            contador=0;
            cadenaRecuentoCaracteres+=" fila"+(i+1)+":";
            for (int j = 0; j < array2d[i].length; j++) {
                contador+=array2d[i][j].length();
                }
            cadenaRecuentoCaracteres+=" "+ contador;
            }
        return cadenaRecuentoCaracteres;
        }






}//class
