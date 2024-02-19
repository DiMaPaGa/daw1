import java.util.Scanner;

public class Metodos2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //11.	Crear un método estático que reciba el lado de un cuadrado y devuelva su área.


      /*  float lado = 5f;

        System.out.println(areaCuadrado(lado));*/

        //12. Triángulo

       /* System.out.println("indicame tamaño de la base");
        float base = scan.nextFloat();
        System.out.println("indicame tamaño de la altura");
        float altura = scan.nextFloat();

        System.out.println(areaTriangulo(base, altura));

        // 14.	Crear un método estático que reciba un valor en euros y lo devuelva convertido a dólares americanos.

        System.out.println("indicame valor en euros");
        float euros = scan.nextFloat();

        System.out.println(conversorDolares(euros));*/

        //17.	Crear un método estático que reciba un número entero y una posición, y devuelva el dígito que
//        se encuentra en dicha posición.

        String numero;
        boolean valido;

        do {
            System.out.println("Introduce un número: ");
            numero = scan.nextLine();
            valido = esNumero(numero);

        } while (!valido && numero.length() > 0);


        valido = false;

        String posicion;
        do {
            System.out.println("Introduce una posición: ");
            posicion = scan.nextLine();
            if (esNumero(posicion) && esValido(numero, posicion)) {
                valido = true;
            }
        } while (!valido);

        int numFinal = Integer.parseInt(numero);
        int posFinal = Integer.parseInt(posicion);

        System.out.println(devolverPosicion(numFinal, posFinal));

        //18.	Crear un método estático que reciba un String, y lo devuelva del revés.

      /* System.out.println("Introduce texto");
        String cadenaDada=scan.next();
        System.out.println(cadenareversa(cadenaDada));*/

       // 19.	Crear un método estático que reciba un String, y compruebe si es un palíndromo. Debe usar el método del ejercicio anterior.
       /* String frase="aabbaa";
        System.out.println(comprobacion(frase));*/

       // 23.	Crear un método estático que reciba un array de algún tipo primitivo y lo imprima por pantalla.

       /* int [] datos= {4,3,5,6,7};
        array(datos);*/

        //24.	Cree un método que reciba un array de enteros, y por cada entero del array imprima su tabla de multiplicar.

        /*int valorArray= (int)(Math.random() * (15-5+1)+5);
        int [] tablas = new int[valorArray];
        tablas= rellenarArray(tablas);
        System.out.println("\n Mi array es de "+ valorArray +" espacios.");


        ejer24(tablas);*/

       // 25.	Crear un método que reciba un array 1D de enteros y lo ordene.

       /* int [] array= new int[10];
        array= rellenarArray2(array);
        array=ordenarArrayInt2(array);
        imprimirArray(array);*/



        /*28.	Crear un método que reciba un array de enteros, un número y una posición, y devuelva un nuevo array que tenga los
        mismos contenidos del original, pero con sus elementos desplazados a partir de la posición especificada, donde se almacenará
        además el número pasado en el segundo argumento.

        Por ejemplo, si el método recibe los siguientes datos:

[3, 8, 9]
        Número: 13
        Posición: 1

        El nuevo array devuelto por el método debe ser el siguiente:

[3, 13, 8, 9]*/

      /* int valorArray= (int)(Math.random()*(15-5+1)+5);
        int [] matrizPrevia = new int[valorArray];
        System.out.println("Mi matriz es: ");
        matrizPrevia=rellenarArray(matrizPrevia);

        int valor= (int)(Math.random() * (30-1+1)+1);
        System.out.println("El valor es: " + valor);
        int posicion= (int)(Math.random() * (matrizPrevia.length+1));
        System.out.println("La posición es: " + posicion);

        //int []nuevaMatriz= crearNuevaMatriz(matrizPrevia, valor, posicion);

        //imprimirArray(nuevaMatriz);

        imprimirArray(crearNuevaMatriz(matrizPrevia, valor, posicion));*/

    /*29.	Crear un método que reciba dos arrays y un entero, y copie tantos elementos del segundo array en el
    primer array como diga el entero, comenzando desde la posición cero en ambos. Suponga que no se saldrá de los límites.

Por ejemplo, si array1 = [7,2,1,0] y array2 = [3,2,2,7,6] y entero=3, al acabar el método el primer array se modificará y su
contenido será array1 = [3,2,2,0] (en negrita están las posiciones que se han modificado).*/

      //int tamanoArray1= (int)(Math.random()*(15-5+1)+5);
        //int tamanoArray2= (int)(Math.random()*(15-5+1)+5)+tamanoArray1;
       // int numero= 2 ;//(int)(Math.random()*(15-5+1)+5)-(tamanoArray2-tamanoArray1);
        int posicionArray2= 2;// (int)(Math.random()*(tamanoArray2-1+1)+1);
        int posicionArray1= 2;

       /*Ejemplo: copiarArray(array3,array4,3);
        imprimirArray(array3);*/
//en clase se hace la solucin con escaner


      /*  int [] array1= {7,2,1,0}; //new int [tamanoArray1];
        int [] array2= {3,2,2,7,6}; //new int [tamanoArray2];
        int entero;
        int posicion;
        imprimirArray(array1)
        do{
            System.out.println("Introduce cuantos enteros quieres copiar");
            entero=scan.nextInt();
            System.out.println("Introduce la posicion");
            posicion= scan.nextInt();

        }while ((entero+ posicion) >array1.length);*/


        //System.out.println("numero es valor= "+ numero);
        //array1= rellenarArray2(array1);
        //array2= rellenarArray2(array2);







       /* int [] array1={7,2,1,0};
        int [] array2={3,2,2,7,6};
        int entero= 1;*/



       /* intercambioArrays(array1, array2, entero);*/
        /*copiarArray(array3,array4,3);
        imprimirArray(array3);*/

       // 30.	Repetir lo anterior, pero añadiendo un cuarto argumento, que indique la posición del segundo array a partir de la cual se empezará.
       /*copiarArray30 (array1, array2, numero, posicionArray2);
        imprimirArray(array1);*/

       // imprimirArray(array1);


       // 31.	Repetir lo anterior, pero añadiendo un quinto argumento, que indique la posición del primer array a partir de la cual se empezará

       int [] array3= {7,2,1,0}; //new int [tamanoArray1];
        int [] array4= {3,2,2,7,6}; //new int [tamanoArray2];

       /* copiarArray31 (array3, array4, numero, posicionArray2, posicionArray1);
        imprimirArray(array3);*/



        //Métodos que reciba dos arrays y los devuelva concatenados.

      /*  int [] arrayFinal= devolverarraycomplejo(array3, array4);

       imprimirArray(arrayFinal);*/



    }//main

    public static int[] devolverarraycomplejo (int[] array1, int[]array2){
        int [] nuevaarray= new int[array1.length + array2.length];

        for (int i = 0; i < nuevaarray.length ; i++) {
            if (i<array1.length){
                nuevaarray[i]= array1[i];
            } else {
                nuevaarray[i]= array2[i- array1.length];

            }

        }


        return nuevaarray; //para almacenar en el método la nueva array;
    }




    public static void copiarArray31 (int[] array1, int[] array2, int numero, int posicionArray2, int posicionArray1) {
        for (int i = posicionArray1; i < (posicionArray1+numero); i++) {
            array1[i] = array2[posicionArray2];
            posicionArray2++;
        }
    }

    public static void copiarArray30 (int[] array1, int[] array2, int numero, int posicionArray2) {
        for (int i = 0; i < numero; i++) {
            array1[i] = array2[posicionArray2+i];
        }
    }

    public static void copiarArray(int[] array1, int[] array2, int numero) {
        for (int i = 0; i < numero; i++) {
            array1[i] = array2[i];
        }
    }

    public static void intercambioArrays (int[]array1, int[] array2, int entero){

        for (int i = 0; i < array1.length; i++) {

            if (i < entero) {
                array1[i] = array2[i];
                System.out.print(array1[i] + " ");

            } else {
                System.out.print(array1[i] + " ");
            }

        }


    }

    public static int[] crearNuevaMatriz (int[] array, int valor, int posicion){
        int [] nuevaMatriz= new int[array.length+1];

        for (int i = 0; i < nuevaMatriz.length-1; i++) {

            if(i<posicion){
                nuevaMatriz[i]=array[i];
            } else {
                nuevaMatriz[i] = valor;
                valor=array[i];
            }

        }

        return nuevaMatriz;
    }

    /*otra solucion
    public static int[] introducirValor(int[] array, int numero, int posicion) {
        int[] nuevoArray = new int[array.length + 1];
        for (int i = 0; i < nuevoArray.length; i++) {
            if (i < posicion) {
                nuevoArray[i] = array[i];
            } else if (i == posicion) {
                nuevoArray[i] = numero;
            } else {
                nuevoArray[i] = array[i - 1];
            }
        }

        return nuevoArray;
    }*/


    public static void imprimirArray (int[] nuevaMatriz){
        for (int var : nuevaMatriz) {
            System.out.print(var+ " ");
        }
        System.out.println();

    }


    public static int [] ordenarArrayInt (int [] arrayOrdenar){
        int valor1;
        int valor2;

        int contador;
        int posicion ;
        for (int j = 0; j < 10; j++) {
            contador =10-j;
            posicion = 0;
            do {
                valor1 = arrayOrdenar[posicion];
                valor2 = arrayOrdenar[posicion+1];
                if (valor1 > valor2) {
                    arrayOrdenar[posicion] = valor2;
                    arrayOrdenar[posicion + 1] = valor1;
                }
                contador--;
                posicion++;
            } while (contador > 1);
        }
        return arrayOrdenar;
    }

    public static int[] ordenarArrayInt2 (int[] arrayOrdenar){
        for (int i = 0; i < arrayOrdenar.length-1 ; i++) {
            for (int j = 0; j < (arrayOrdenar.length-1)-i; j++) {
                if (arrayOrdenar[j] > arrayOrdenar[j + 1]) {
                    int mochila = arrayOrdenar[j];
                    arrayOrdenar[j] = arrayOrdenar[j + 1];
                    arrayOrdenar[j + 1] = mochila;
                }

            }
        }

        return arrayOrdenar;
    }
    public static int[] rellenarArray2(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random() *(100-1+1)+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return array;
    }

    public static int[] rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random() *(9-1+1)+1);
            System.out.print(array[i]+" ");
        }
        return array;
    }
    public static void ejer24 (int [] tablas){
        int multiplicador=10;
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("\n Tabla del " + tablas[i]+"\n");
            for (int j = 0; j <= multiplicador; j++) {
            System.out.println(tablas[i]+ " x "+ j+ " = "+ (j*tablas[i]));
            }

        }

    }



    public static void array (int [] datos){
        for (int var : datos) {
            System.out.println(var+ " "); }

        }

    public static void tabla (int multiplicando){

        System.out.println("TABLA DE MULTIPLICAR DEL "+ multiplicando);
        int multiplicador=10;
        for (int i = 0; i <= multiplicador; i++) {
            System.out.println(multiplicando+ " x "+i+ " = "+ (multiplicando*i));
        }
    }


    public static boolean comprobacion (String frase){
        boolean comprobacion = false;
        //String reves = cadenareversa();pero me lo puedo ahorrar...
        if (frase.equals(cadenareversa(frase))){
            comprobacion= true;
        }
        return comprobacion;
    }

    public static String cadenareversa (String cadenaDada){

        String reversa= "";

        for (int i = cadenaDada.length()-1; i>=0 ; i--) {
            reversa+=cadenaDada.charAt(i);
        }

        return reversa;
    }

    public static char devolverPosicion(int numero, int posicion) {
        String num = numero + "";

        return num.charAt(posicion);

    }

    public static boolean esValido(String numero, String posicion) {
        int posicionNum = Integer.parseInt(posicion);

        return (numero.length() > posicionNum) && posicionNum >= 0;
    }

    public static boolean esNumero(String numero) {
        boolean esNumero = true;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) < '0' || numero.charAt(i) > '9') {
                esNumero = false;
                break;
            }
        }

        return esNumero;
    }


    public static float conversorDolares(float euros) {

        return (euros * 1.09f);
    }

    public static float areaTriangulo(float base, float altura) {

        return (base * altura) / 2;
    }

    public static float areaCuadrado(float lado) {
        float area = lado * lado;
        return area;
    }



//codigo ale
   /*  public static int pedirnumeros() {
        Scanner scan = new Scanner(System.in);
        boolean valido;
        int numero = 0;
        do {
            System.out.print("Introduce un numero: ");
            valido = scan.hasNextInt();
            if (valido) {
                numero = scan.nextInt();
            } else {
                System.out.println("no es un numero!!");
                String guardado = scan.nextLine();
            }
        } while (!valido);
        return numero;
    }

   // numeroPosicion = (numero/((int)(Math.pow(10,(posicion-1)))))%10;

    //return Integer.toString(numEntero).charAt(pos);
    //public static char digitoEnPosicion(int numEntero, int pos) {
    //        return Integer.toString(numEntero).charAt(pos);
    //    }*/





}//class
