import java.util.Scanner;

public class BoletinString3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //11.	Lee por pantalla una cadena de caracteres y elimina todas las vocales.

        System.out.println("Introduzca una frase");
        String frase = scan.nextLine().replaceAll("[aeiouAEIOU]","");
        System.out.println("Su frase eliminando las vocales es: '" + frase + "'");



// 12.	Lee por pantalla la cadena “Supermercado” y comprueba si tiene la letra m. Repite introduciendo la misma cadena y comprueba si tiene la letra M.

        String supermercado;

        do {

            System.out.println("Introduzca la cadena: Supermercado");
            supermercado = scan.next();

        } while (!supermercado.equals("Supermercado"));



        int contadorCaracterm=0;
        int contadorCaracterM=0;
        for (int i = 0; i < supermercado.length(); i++) {
            if (supermercado.charAt(i) == 'm') {
                contadorCaracterm++;
            }
            if (supermercado.charAt(i) == 'M') {
                contadorCaracterM++;
            }


        }

        if (contadorCaracterm>0){
            System.out.println("Si tiene la letra 'm'");
        } else {
            System.out.println("No tiene 'm'");
        }

        if (contadorCaracterM>0){
            System.out.println("Si tiene la letra 'M'");
        } else {
            System.out.println("No tiene 'M'");
        }



// 13.	Lee por pantalla dos cadenas y compáralas. Debes imprimir ‘La primera va antes’, ‘La segunda va antes’ o ‘Son iguales’, dependiendo del resultado de la comparación.

        System.out.println("Incorpora una cadena");
        String cadena13a= scan.next();
        System.out.println("Incorpora otra cadena");
        String cadena13b= scan.next();

        if (cadena13a.compareTo(cadena13b)<0){
            System.out.println("La primera va antes");

        } else if (cadena13a.compareTo(cadena13b)>0) {
            System.out.println("La segunda va antes");

        } else {
            System.out.println("Son iguales");
        }


// 14.	Repite ignorando mayúsculas.

        if (cadena13a.compareToIgnoreCase(cadena13b)<0){
            System.out.println("La primera va antes");

        } else if (cadena13a.compareToIgnoreCase(cadena13b)>0) {
            System.out.println("La segunda va antes");

        } else {
            System.out.println("Son iguales");
        }


//15.	Lee por pantalla dos cadenas y comprueba si son iguales.

        System.out.println("Incorpora una cadena");
        String cadena15a= scan.next();
        System.out.println("Incorpora otra cadena");
        String cadena15b= scan.next();

        if (cadena15a.compareTo(cadena15b)==0) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }


// 16.	Repite ignorando mayúsculas.


        if (cadena15a.compareToIgnoreCase(cadena15b)==0) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }


//17.	Lee un carácter por teclado y muestra por consola el código ASCII al que pertenece. Por ejemplo: si introduzco una a, debe mostrar 97.

        System.out.println("Introduce un carácter");
        String ej17= scan.next();
        char caracter= ej17.charAt(0);
        System.out.println((int) caracter);

// 18.	Lee una cadena de caracteres por teclado que represente un número de dos cifras, e imprime por pantalla el carácter que representa.

        System.out.println("introduzca un número de dos cifras");
        String ej18= scan.next();
        int codigo= Integer.parseInt(ej18);
        System.out.println((char)codigo);


/*19.	Escribe una aplicación con un String que contenga una contraseña inventada. Después se pedirá que introduzcas la contraseña, con 3 intentos.
Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Logged in”. Cuando falle, debe imprimir ‘Prueba otra vez…’ y volver a leer por
teclado. En el tercer fallo, debe imprimir Error’ y el programa termina. */

        String contrasena="abcde";
        int intentos=0;

        do {
            System.out.println("Introduce contraseña");
            String solicitud= scan.next();
            if (solicitud.equals(contrasena)) {
                System.out.println("Logged in");
                break;
            } else {
                intentos++;
                if (intentos>2){
                    System.out.println("Error");
                } else {
                    System.out.println("Prueba otra vez...");
                }
            }

        } while (intentos<3);


/*22. Se pretende leer por pantalla una contraseña e indicarle al usuario si su seguridad es fuerte, media o débil. Cree un algoritmo
que lea una cadena e imprima por pantalla su nivel de seguridad en base a los siguientes criterios:
                - Si la longitud de la cadena es inferior a cinco, siempre es débil. Ejemplo: "hola" es debil.
                - Si la longitud es superior o igual a cinco y solo tiene letras o solo tiene números, es media. Ejemplo: "holaholita" o "57213".
                - Si la longitud es superior o igual a cinco y tiene tanto letras como números, es alta. Ejemplo: “adios365”
        Nota: puede usar todo lo aprendido sobre Java. Suponga que la cadena solo tiene letras y números, nunca caracteres especiales.*/


        System.out.println("Introduzca contraseña");
        String contrasenia = scan.next();
        boolean numero=false;
        boolean letra=false;
        String cadenaNumeros="0123456789";

        if (contrasenia.length()<5){
            System.out.println("La contraseña " + contrasenia + " es débil");
        } else {
            for (int i = 0; i < contrasenia.length()-1 ; i++) {
                char signo = contrasenia.charAt(i);
                if (cadenaNumeros.indexOf(signo)==-1){
                    letra=true;
                } else {
                    numero=true;
                }
            }
            if (letra && numero){
                System.out.println("La contraseña " + contrasenia + " es fuerte");
            }
            else {
                System.out.println("La contraseña " + contrasenia + " es media");
            }
        }



    }
}

