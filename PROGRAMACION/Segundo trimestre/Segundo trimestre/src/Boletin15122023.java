import java.util.Scanner;

public class Boletin15122023 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Comprobar si una cadena es palíndromo, es decir, si se lee igual en los dos sentidos.

       /* System.out.println("Introduce un texto");
        String palindromo= scan.next();
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



        //3. Crear un programa que te pida una cadena e indique cuántos caracteres distintos tiene, es decir, cuántos números tiene, cuántos espacios y cuántas letras.

        System.out.println("Introduce un texto");
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

        System.out.println("La cadena tiene "+ letras + " letras, "+ numeros+ " números y "+ espacios+ " espacios");

 /* System.out.println("Introduce un texto");
        String texto = scan.nextLine();
        char espacio = ' ';
        int letras = 0;
        int numeros = 0;
        int espacios = 0;
        char caracter;

        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            if (caracter == espacio) {
                espacios++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            } else if (Character.isLetter(caracter)) {
                letras++;
            }
        }

        System.out.println("La cadena tiene " + letras + " letras, " + numeros + " números y " + espacios + " espacios");

        scan.close();  // Cierra el scanner al finalizar*/


    }
}
