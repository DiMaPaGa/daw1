import java.util.Scanner;

public class metodos {

    public static void main (String[] args){
        Scanner scan =new Scanner(System.in);
/*1.	Crear un método estático que tenga la siguiente firma:

public static float duplicar(float num)

e implementarlo: el método debe devolver el valor num multiplicado por 2.*/

    /*    float var= 3.0f;
        System.out.println(duplicar(3.0f));
        float varDuplicada = duplicar (3.0f);
        System.out.println(varDuplicada);
        System.out.println(duplicar(scan.nextFloat()));
*/
       /* 2.	Crear un método estático que tenga la siguiente firma:

        public static void saludar(String nombre)

        e implementarlo: el método debe imprimir por pantalla la cadena “Hola nombre”, donde nombre será la cadena que se recibe como argumento.*/

   /*     String nombre = scan.next();
    saludar("Diana");
    saludar(nombre);

    String cadena="Hola mundo";
    imprimirLetras(cadena);

/*
        5.	Crear un método que se utilice para poder separar con claridad el final de un ejercicio del boletín y
        el comienzo del siguiente, de forma que cuando se llame a este método de la siguiente forma:

        imprimirCabecera(“ejercicio 5”);

        se imprima por pantalla lo siguiente:

        ******************
            EJERCICIO 5
        ******************

         */

        /*encabezado("ejercicio 5");*/

        /*
        6.	Modificar el ejercicio anterior, para que el método reciba un segundo argumento de tipo int,
        que serán la cantidad de asteriscos que deben imprimirse en cada una de las dos líneas. De esta forma,
        cuando se llame a este método de la siguiente forma:

        imprimirCabecera(“ejercicio 2”, 4);

        se imprima por pantalla lo siguiente:

        ****
        EJERCICIO 2
        ****
         */

       /* System.out.println("¿Qué texto desea incluir en el encabezado?");
        String texto= scan.nextLine();
        System.out.println("¿Cuántos asteriscos quiere?");
        int estrellas= scan.nextInt();

        encabezado(texto, estrellas);*/

        /*
        7.	Crear un método estático que reciba un número e imprima la tabla de multiplicar de dicho número con
        el siguiente formato (ejemplo para una entrada de 2):
        =========================
        TABLA DE MULTIPLICAR DEL 2
        =========================
        2 x 0 = 0
        2 x 1 = 2
        2 x 2 = 4
        …
        2 x 10 = 20
         */

        /*System.out.println("Indique un número");
        tabla(scan.nextInt()) ;*/

        /*
        8.	Crear un método estático de nombre esPositivo, que reciba un número entero y devuelva un valor
        booleano indicando si el número es positivo (true) o no (false).
         */

      /*  System.out.println("Incorpora un número");
        System.out.println(esPositivo(scan.nextInt()));*/

        /*
        9.	Crear un método estático de nombre contarPositivos. Este método lee por pantalla números enteros
        continuamente, y para únicamente cuando el usuario introduce un cero. Cuando esto ocurre, el método
        devuelve (=return) la cantidad de números positivos que el usuario ha introducido por pantalla.
         */
        System.out.println("Ha introducido "+ contarPositivos()+ " numeros positivos.");

        //variacion mia del 9= Mostrando los números positivos.

       System.out.println("Los números positivos introducidos han sido: " + contarPositi());

        /*
        10.	Crear un método estático que reciba la base y la altura de un rectángulo y devuelva (como dice devuelva es return, si fuera imprima=void)su área.

         */
        System.out.println("indicame tamaño de la base");
        float base= scan.nextFloat();
        System.out.println("indicame tamaño de la altura");
        float altura= scan.nextFloat();

        System.out.println(areaRectangulo(base, altura));


    }//main

    public static float areaRectangulo(float base, float altura){
        float area= base * altura;
        return area;
    }

    public static String contarPositi (){
        Scanner scanm =new Scanner(System.in);
        int valor;
        int contador=0;
        String cadena="";

        do{
            System.out.println("Introduce un número");
            valor=scanm.nextInt() ;
            if (valor>0){
                contador++;
                cadena+=valor+" ";
            }

        }while (valor!=0);

        System.out.println(contador);

        return cadena;


    }
    public static int contarPositivos (){
        Scanner scanm =new Scanner(System.in);
        int valor;
        int contador=0;

        do{
            System.out.println("Introduce un número");
            valor=scanm.nextInt();
            if (valor>0){
               contador++;
            }

        }while (valor!=0);

        return contador;


    }

    public static boolean esPositivo (int numero){
        boolean positivo;

        if (numero>=0){
            positivo=true;
        } else{
            positivo=false;
        }

        return positivo;


    }

    public static void tabla (int multiplicando){
        int veces=25;
        lineaencabezado(veces);
        System.out.println("TABLA DE MULTIPLICAR DEL "+ multiplicando);
        lineaencabezado(veces);
        int multiplicador=10;
        for (int i = 0; i <= multiplicador; i++) {
            System.out.println(multiplicando+ " x "+i+ " = "+ (multiplicando*i));
        }
    }

    public static void lineaencabezado (int veces){
        for (int i = 0; i < veces; i++) {
            System.out.print("=");

        }
        System.out.println();
    }

    public static void encabezado(String ejercicio, int asteriscos){

        impresion(asteriscos);
        System.out.println(ejercicio.toUpperCase());
        impresion(asteriscos);

    }

    public static void impresion (int veces){
        for (int i = 0; i < veces ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }




    public static float duplicar (float num){
        int a=1;
        int b=1;
        int c=1;
        int d=1;
        int e=1;
        int f=1;
        int g=1;


        return num*2;
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);

    }

    public static void imprimirLetras (String frase){
        for (int i = 0; i < frase.length() ; i++) {
            System.out.println(frase.charAt(i));

        }
    }


}//class

