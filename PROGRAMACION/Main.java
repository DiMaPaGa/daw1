public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String hola= "hola";

        //String hola= "Hola";
        //String prueba= ""; /*El valor es 0*/

        String numero;
        //String numero.lenght/*No se podría usar, es un null*/

        "hola".charAt(0); //Empieza siempre desde 0.

        "hola".length();/*devuelve el valor real de la longitud de caracteres"*/

        String saludo= "Hola*mundo";
        String despedida= "adios";

       /* for (int i=0; i<saludo.length(); i++){
            System.out.println(saludo.charAt(1));
        }

        System.out.println(saludo.substring(2));
        System.out.println(saludo.substring(3,8));// no incluye el último*/

        System.out.println(saludo.substring(0,saludo.length()/2));
        System.out.println(saludo.substring(saludo.length()/2));

        System.out.println(saludo.substring(0,saludo.length()/2));
        System.out.println(saludo.substring(saludo.length()/2-1));

        saludo.concat(despedida);

        System.out.println(saludo.indexOf('n'));
        System.out.println(saludo.indexOf('N'));//-1 significa no encontrado
        System.out.println(saludo.indexOf('o',2));//empieza a buscar a partir de una posicion
        System.out.println(saludo.indexOf('o'));
        System.out.println(saludo.indexOf("mundo"));










    }
}