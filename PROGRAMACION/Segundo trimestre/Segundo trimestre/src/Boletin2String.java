import java.util.Scanner;

public class Boletin2String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1.	Lee por pantalla una cadena de caracteres e imprime su longitud.

        /*System.out.println("Introduce cadena");
        String cadena1= scan.nextLine(); // Si no se pone el Line no te cuenta los huecos.
        System.out.println(cadena1.length());*/

        // 2.	Lee por pantalla una cadena de caracteres e imprime su primera letra.

       /* System.out.println("Introduce cadena");
        String cadena2= scan.nextLine();
        System.out.println("La primera letra es "+ cadena2.charAt(0));*/

        // 3.	Lee por pantalla una cadena de caracteres e imprime su última letra. Ten en cuenta que la cadena introducida puede cambiar en cada ejecución.
        /*System.out.println("Introduce cadena");
        String cadena3= scan.nextLine();
        System.out.println(cadena3.charAt(cadena3.length()-1));*/

        /*clase
        String cadena = scan.next();
        int lenght = cadena.length()-1;
        System.out.println(cadena.charAt(lenght));
         */

        // 4.	Lee por pantalla una cadena de caracteres e imprime la letra central o su aproximada.

       /* System.out.println("Introduce cadena");
        String cadena4= scan.next();
        int mitad= (cadena4.length()-1)/2;
        System.out.println(cadena4.charAt(mitad));*/

        /*System.out.print("Introduce una frase: ");
        String ej4 = scanner.nextLine();

        char LetraCentral = ej4.charAt(ej4.length()/2); //parece que no hace falta poner aquí -1

        System.out.println("La letra central es: "+LetraCentral);*/

        // 5.	Repite los tres ejercicios anteriores imprimiendo junto a la letra su código ASCII, separados por un espacio.

       /* System.out.println(cadena1.length() + " " + (char) cadena1.length());
        System.out.println(cadena2.charAt(0) + " " + (int) cadena2.charAt(0));
        System.out.println(cadena3.charAt(cadena3.length()-1)+ " " + (int) cadena3.charAt(cadena3.length()-1));
        System.out.println(cadena4.charAt(mitad) + " " + (int) cadena4.charAt(mitad));*/
        /* clase
        System.out.print("Por favor, introduce una cadena: ");
        String cadena = scan.nextLine();
        int valor01 = cadena.length()-1;
        System.out.println(cadena.charAt(0)+" "+(int)cadena.charAt(0));
        System.out.println(cadena.charAt(valor01)+" "+(int)cadena.charAt(valor01));
        System.out.println(cadena.charAt(valor01/2)+" "+(int)cadena.charAt(valor01/2));*/

        // 6.	Lee por pantalla una cadena de caracteres, y vuelve a imprimirla en mayúsculas.

        /*System.out.println("Incorpora cadena en minúsculas");
        String cadenaMin= scan.nextLine();
        System.out.println(cadenaMin.toUpperCase());*/

        // 7.	Lee por pantalla una cadena de caracteres, e imprímela en minúsculas.

        /*System.out.println("Incorpora cadena en mayúsculas");
        String cadenaMay= scan.nextLine();
        System.out.println(cadenaMay.toLowerCase());*/

        // 8.	Lee por pantalla una cadena de caracteres y reemplaza todas las aes por espacios en blanco.

        /*System.out.println("Incorpora cadena");
        String cadenaRem1= scan.nextLine();
        System.out.println(cadenaRem1.toLowerCase().replace('a',' '));*/
        /*clase
        String cadena = scan.nextLine();
         String resultado = cadena.replaceAll("[aA]", " ");
         System.out.println(resultado); */
        // 9.	Lee por pantalla una cadena de caracteres y elimina todas las aes.

        /*System.out.println("Incorpora cadena");
        String cadenaRem2= scan.nextLine();
        System.out.println(cadenaRem2.toLowerCase().replace("a",""));*/

        /*clase
        System.out.print("Introduce una cadena de caracteres y eliminare las aes: ");
        String cadena9 = strscan.nextLine();
        cadena9 = cadena9.toLowerCase().replaceAll("a", "");
        System.out.println("La cadena con el reemplazo queda: " + cadena9);
         */




        // 10.	Lee por pantalla una cadena de caracteres y reemplaza las vocales por espacios en blanco.

       /* System.out.println("Ingresa una cadena: ");
        String cadenaOriginal = scan.nextLine();

        for (int i = 0; i < cadenaOriginal.length()-1; i++) {
            char caracter = cadenaOriginal.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                    caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                cadenaOriginal = cadenaOriginal.replace(caracter,' ');
            }

        }
        System.out.println(cadenaOriginal);*/

        /* clase
        System.out.println("Introduzca una frase");
        frase = scan.nextLine().replaceAll("[aeiouAEIOU]"," ");
        System.out.println("Su frase eliminando las vocales es: '" + frase.toLowerCase() + "'");
         */


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


/*22. Se pretende leer por pantalla una contraseña e indicarle al usuario si su seguridad es fuerte, media o débil. Cree un algoritmo que lea una cadena e imprima por pantalla su nivel de seguridad en base a los siguientes criterios:
                - Si la longitud de la cadena es inferior a cinco, siempre es débil. Ejemplo: "hola" es debil.
                - Si la longitud es superior o igual a cinco y solo tiene letras o solo tiene números, es media. Ejemplo: "holaholita" o "57213".
                - Si la longitud es superior o igual a cinco y tiene tanto letras como números, es alta. Ejemplo: “adios365”
        Nota: puede usar todo lo aprendido sobre Java. Suponga que la cadena solo tiene letras y números, nunca caracteres especiales.*/

    }
}


