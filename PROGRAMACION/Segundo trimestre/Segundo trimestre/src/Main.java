public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        String hola= "hola";

        //String hola= "Hola";
        //String prueba= ""; /*El valor es 0*/

        String numero;
        //String numero.lenght/*No se podría usar, es un null*/

        "hola".charAt(0); //Empieza siempre desde 0.

        "hola".length();/*devuelve el valor real de la longitud de caracteres"*/

        String saludo= "Hola mundo";
        String despedida= "adios";

       /*for (int i=0; i<saludo.length(); i++){
            System.out.println(saludo.charAt(1));
        }*/

       /* System.out.println(saludo.substring(2));
        System.out.println(saludo.substring(3,8));// no incluye el último

        System.out.println(saludo.substring(0,saludo.length()/2));
        System.out.println(saludo.substring(saludo.length()/2));

        System.out.println(saludo.substring(0,saludo.length()/2));
        System.out.println(saludo.substring(saludo.length()/2-1));

        System.out.println(saludo.concat(despedida));

        System.out.println(saludo.indexOf('n'));
        System.out.println(saludo.indexOf('N'));//-1 significa no encontrado
        System.out.println(saludo.indexOf('o',2));//empieza a buscar a partir de una posicion
        System.out.println(saludo.indexOf('o'));
        System.out.println(saludo.indexOf("mundo"));
        System.out.println(saludo.indexOf('n', 2));
        System.out.println(saludo.lastIndexOf ("mundo"));
        System.out.println(saludo.lastIndexOf ('o'));// lee la última y lanza el valor de
        System.out.println(saludo.indexOf("mundo")+1);// solo imprime un dígito*/

       int posicionMundo= saludo.indexOf("mundo");

        //System.out.println(saludo.indexOf(' '));// ESTÁ EN LA POSICIÓN 4
        int hueco=saludo.indexOf(' ');
        //System.out.println(saludo.substring(0, hueco)); //Se imprime hasta 4, porque el límite lo deja fuera.
        //System.out.println(saludo.substring(hueco+1));// lo hace del primer límite en adelante.

        String palabra1= "Diana";
        String palabra2= "diana";

        /*boolean comprobacion;

        comprobacion= palabra1.equals(palabra2);
        System.out.println(comprobacion);
        comprobacion= palabra1.equalsIgnoreCase(palabra2);
        System.out.println(comprobacion);*/


        //System.out.println(palabra1.compareTo(palabra2)); // me da -32, indicando que el primer código asci es mayor que el segundo.
        //System.out.println(palabra1.compareToIgnoreCase(palabra2));//Aquí vuelve a dejar de distinguir mayusculas y minúsculas.
        //trim elimina los espacios del principio de la cadena.

        String cadena= "      Ho la      ";
        System.out.println(cadena.trim());
        String cadenasinespacio=cadena.trim();

        //replace: Reemplaza

        String word1="Rare";

      /*  System.out.println(cadenasinespacio.replace(" ", ""));

        System.out.println(cadena.toUpperCase().trim().replace(" ","*"));
        System.out.println(cadena.toLowerCase().replace(" ", "*").trim());//este estaría mal si te pidiera que eliminara antes los espacios de los laterales.
        System.out.println("\t"+"=tabulación");*/

        //se convierten en String con unas comillas dobles, también con los boleanos

        int num= 123;
        String variable = num + "";
        System.out.println(variable+1);
        int num2= Integer.parseInt(variable); // Pasa de String a int o a cualquier variable que elija
        System.out.println(num2+1); //Aquí sale 124 porque ya lo había convertido en entero
        String variable1 = Integer.toString(num);
        String variable2 = String.valueOf(num);
        System.out.println(variable);
        System.out.println(variable1);
        Boolean verdad= true;
        String mentira= verdad+"";
        String mentira1 = Boolean.toString(verdad);
        String mentira2 = String.valueOf(verdad);
        System.out.println(mentira);
        System.out.println(mentira1);
        System.out.println(mentira2);//Double.toString


        //O llamando a la clase
















    }
}