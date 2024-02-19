import java.util.Locale;
import java.util.Scanner;

public class Boletin15122023 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        //1. Comprobar si una cadena es palíndromo, es decir, si se lee igual en los dos sentidos.

       /*System.out.println("Introduce un texto");
        String palindromo= scan.next().toLowerCase();
        String inversa="";

        for (int i = palindromo.length()-1; i >= 0; i--) {
            inversa +=palindromo.charAt(i);

        }
        if (palindromo.equals(inversa)){
            System.out.println("Es un palíndromo");
        } else{
            System.out.println("No es un palíndromo");
        }*/

        //2. Extraer el correo electrónico, mostrando solo la parte anterior al @.

       /* String correo="";
        do{
            System.out.println("Introduce un correo electrónico");
            correo= scan.next();
        } while (correo.indexOf('@')==-1);


        System.out.println(correo.substring (0, correo.indexOf('@')));*/

        /*String correo=scan.nextLine();
         * int guardado= correo.indexOf('@')
         * Sout (correo.substring(0,guardado));*/


        //3. Crear un programa que te pida una cadena e indique cuántos caracteres distintos tiene, es decir, cuántos números tiene, cuántos espacios y cuántas letras.

      /*System.out.println("Introduce un texto");
        String texto= scan.nextLine();
        char espacio=' ';
        int letras=0;
        int numeros=0;
        int espacios=0;
        char caracter;
        String numero="0123456789";

        for (int i = 0; i < texto.length(); i++) {
            caracter=texto.charAt(i);

            if (caracter == espacio) {
                espacios++;
            }  else if (numero.indexOf(Character.toLowerCase(caracter))==-1){
                letras++;
            } else {
                numeros++;

            }

        }

        System.out.println("La cadena tiene "+ letras + " letras, "+ numeros+ " números y "+ espacios+ " espacios");*/



 /* System.out.println("Introduce un texto");
        String texto = scan.nextLine();
        char espacio = ' ';
        int letras = 0;
        int numeros = 0;
        int espacios = 0;
        char caracter;

        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            if (Character.isWhitespace(caracter)) {
                espacios++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            } else if (Character.isLetter(caracter)) {
                letras++;
            } else {
                especiales++;
            }
        }

        System.out.println("La cadena tiene " + letras + " letras, " + numeros + " números y " + espacios + " espacios");

        scan.close();  // Cierra el scanner al finalizar*/


        /*1- Leer una frase por teclado (máximo 80 caracteres) y construir otras dos cadenas de forma que una contenga
        los caracteres en la posición par y la otra los caracteres en posición impar.*/

      /*  String parrafo = "";
        String par = "";
        String impar = "";
        do {
            System.out.println("Incorpora una frase de máximo 80 caracteres");
            parrafo = scan.nextLine();

        } while (parrafo.length() > 80);

        for (int i = 0; i < parrafo.length(); i++) {
            if (i % 2 == 0) {
                par += parrafo.charAt(i);
            } else {
                impar += parrafo.charAt(i);

            }
        }

            System.out.println("La cadena par es: " + par);
            System.out.println(" La cadena impar es: " + impar);
*/

            //2- Introducir una cadena y pasarla en función de una variable de  opción (boolean) a mayúsculas o a minúsculas e imprimir la cadena resultante.

      /*  System.out.println("Introduce un texto");
        String cadena2= scan.nextLine();
        boolean minuscula= true;
        //boolean mayus=scan.nextBoolean(); Asi en clase

            System.out.println("Si desea que el texto esté en minúsculas, escriba 'true' y si la prefiere en mayúsculas, escriba 'false'");
            minuscula=scan1.nextBoolean();


        if (minuscula) {
            System.out.println(cadena2.toLowerCase());

        } else {
            System.out.println(cadena2.toUpperCase());

        }*/



            //3- Crear un programa que lea una cadena y una palabra, y que nos diga la posición de dicha palabra en la frase. Si no la encuentra que devuelva un 0.

       /* System.out.println("Escribe una cadena");
        String cadena3= scan.nextLine();
        System.out.println("Escribe una palabra");
        String palabra3= scan1.next();

        System.out.println(cadena3.indexOf(palabra3)+1);*/


            //4- Introducir una cadena de caracteres, y después muestre un mensaje indicando:
            //a) Si la cadena introducida tiene menos de 5 caracteres, entre 5 y 15 caracteres o más de 15 caracteres.
            //b) Si la cadena introducida comienza por la letra 'a'.

      /* System.out.println("Escribe una cadena");
        String cadena4= scan.nextLine().toLowerCase();

        if (cadena4.length()<5){
            System.out.println("La cadena tiene menos de 5 caracteres");
        } else if (cadena4.length()>15) {
            System.out.println("La cadena tiene más de 15 caracteres");
        } else{
            System.out.println("La cadena tiene entre 5 y 15 caracteres");
        }

        if (cadena4.charAt(0)=='a'){
            System.out.println("La cadena empieza por a");
        } else{
            System.out.println("La cadena NO empieza a");
        }*/



            //5 - Introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.

      /*  System.out.println("Escribe una frase");
        String cadena5= scan.nextLine().toLowerCase();
        System.out.println("Introduce una vocal");
        //char vocal= scan.nextLine().toUpperCase().charAt(0);
        String vocal5= scan1.next();
        String cadenaResult= "";

        for (int i = 0; i < cadena5.length()-1; i++) {

            if (cadena5.charAt(i)==(vocal5.charAt(0))){
                cadenaResult += cadena5.toUpperCase().charAt(i);

            } else {
                cadenaResult +=cadena5.charAt(i);
            }

        }
        System.out.println(cadenaResult);*/



       /* 6 - Introduzca por pantalla un número de una, dos o tres cifras y almacenalo en un string, obligando al usuario a que el valor introducido sea numérico.
 Después imprima por pantalla si el número tiene una, dos o tres cifras.*/

        boolean esNumero;
       String numero="";
        do {
            esNumero=true;
            System.out.println("Escribe una número");
            numero= scan.nextLine();
            if (numero.length()>=1 && numero.length()<=3){

                for (int i = 0; i <numero.length(); i++) {
                    if (numero.charAt(i)<'0' || numero.charAt(i)>'9'){
                        esNumero=false;
                        System.out.println("Ha introducido un valor incorrecto");
                        break;
                    }
                }
            } else {
                esNumero=false;
                System.out.println("La longitud del número debe ser de una, dos o tres cifras");
            }
        } while (!esNumero);

        System.out.println(" El número tiene " + numero.length() + " cifras.");






    }
}
