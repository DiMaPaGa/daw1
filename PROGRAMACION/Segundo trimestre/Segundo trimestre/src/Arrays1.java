import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        1.	Crear un array de float de tamaño 10 mediante un inicializador (dando valores iniciales a su gusto).
        Imprimir el contenido del array por consola. Una vez impreso, modificar el array para que en cada posición
        se almacene el índice que le corresponde. Una vez que el array esté completamente modificado, volver a
        imprimir el array y comprobar que ha hecho el ejercicio de forma correcta. Siga las instrucciones al pie de
        la letra (siempre).
         */

      /*  float[] arrayFloat= {10.9f, 9.5f, 8.5f, 7.5f, 6.5f, 5.5f, 4.5f, 6.5f, 5.5f, 4.5f};
        for (float var: arrayFloat ) {
            System.out.println(var);
        }
        for (int i = 0; i < arrayFloat.length ; i++) {
            arrayFloat[i]=i;
        }
        for (int i = 0; i < arrayFloat.length ; i++) {
            System.out.println(arrayFloat[i]);
        }
       //si lo quisieramos hacer por foreach y convirtiendo los números resultantes en enteros
        for (float var: arrayFloat ) {
            System.out.println((int) var);

        }*/

        // Modificar el ejercicio anterior de forma que el array sea de String.

       // System.out.println("Actividad 2*********");

      /*  String[] arrayString = new String[10];
        for (int i = 0; i < arrayFloat.length ; i++) {

            arrayString [i]= arrayFloat[i]+ "s";
            System.out.println(arrayString[i]);
        }*/

        //CORRECCION CLASE

        //String[] arrayString = {"10.9", "9.5", "8.5", "7.5", "6.5", "5.5", "4.5", "6.5", "5.5", "4.5"};

       /* for (String var:arrayString) {
            System.out.println(var);
        }

        for (int i = 0; i < arrayString.length ; i++) {
            arrayString[i]=i+"";
        }
        for (String var:arrayString) {
            System.out.println(var);
        }*/

       /* 3.	Modificar el ejercicio anterior de forma que el array sea de char (utilice únicamente números de una cifra en el inicializador).*/
       /* System.out.println("Actividad 3*********");

        char[] arrayChar = {'1', '9', '8', '7', '6', '5', '4', '6', '5', '4'};

        for (char var:arrayChar) {
            System.out.println(var);
        }

        for (int i = 0; i < arrayChar.length ; i++) {
            arrayChar[i]= (char) i;
        }
        for (int var:arrayChar) {
            System.out.println(var);
        }*/

        // RESULTADO DE CLASE

        /*char[] arraychar={'1','2','3','4','5','6','7','8','9','0'};
        for (char var:arraychar) {
            System.out.println(var);
        }

        for (int i = 0; i <arraychar.length ; i++) {

            arraychar[i] = (char) (i) ;
        }
        for (char var:arraychar) {
            System.out.println((int)var); //EN LUGAR DE PARSEAR ARRIBA LO HACES ABAJO, ES VÁLIDO TAMBIÉN.
        }*/

        /*4.	Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada posición. Elija el tipo que desee y los valores iniciales que desee.*/

       /* System.out.println("Actividad 4*********");

        int[] ejemplo4= {8,2,1,4,15};

        for (int i = 0; i < ejemplo4.length; i++) {
            System.out.println(ejemplo4[i]);
        }*/



        /*5.	Modifica el ejercicio anterior para que, a continuación, pida por pantalla 5 nuevos valores y rellene el array con ellos, volviéndolo a imprimir.*/

        /*System.out.println("Actividad 4 con scanner");

        int[] ejemplo4b= new int[5];

        for (int i = 0; i < ejemplo4b.length; i++) {
            System.out.println("Incorpore el valor para la posición "+ (i+1));
            ejemplo4b[i]= scan.nextInt();
        }

        for (int i = 0; i < ejemplo4b.length; i++) {
            System.out.println(ejemplo4b[i]);
        }*/
//otra forma de recorrer lo anterior
       /* for (int var: ejemplo4b) {
            System.out.print(var+" ");
        }*/
        // 6.	Modifica el programa anterior para que el número de posiciones del array se lea por pantalla.

      /*  System.out.println("Actividad 6");

        System.out.println("Introduce número de dígitos que quieres incorporar");
        int valor= scan.nextInt();

        int[] array6= new int [valor];

        for (int i = 0; i < array6.length; i++) {
            System.out.println("Incorpore el valor para la posición "+ i);
            array6[i]= scan.nextInt();
        }

        for (int var: array6) {
            System.out.print(var+" ");
        }*/

        // 8.	Crear un array de enteros donde indicamos por teclado el tamaño del array, rellenamos el array con números aleatorios entre 0 y 9, y mostramos por pantalla el valor de cada posición y la suma de todos los valores.
       /* System.out.println("Introduce el tamaño del array");
        int tamayo= scan.nextInt();
        int[] array8 =new int [tamayo];

        for (int i = 0; i < array8.length ; i++) {
            array8[i]= (int) Math.floor(Math.random() * (9 + 1));
        }

        for (int var: array8) {
            System.out.print(var+" ");
        }

        int sum=0;
        for (int i = 0; i < array8.length; i++) {
            sum+= array8[i];
        }
        System.out.println("La suma de todos los valores es "+ sum);*/


       // la fórmula es Math.floor(Math.random() * (max - min + 1)) + min. En la actividad incorporo el (int) para evitar decimales
       // 9.	Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Partiendo del array ya creado y completamente relleno, obtener la suma de todos ellos y la media.
       /* int valorArray=100;
        int[] centenario= new int [valorArray];

        for (int i = 0; i < centenario.length ; i++) {
            centenario[i]=(i+1);
        }
        for (int var:centenario) {
            System.out.println(var);
        }

        int suma=0;
        for (int i = 0; i < centenario.length; i++) {
            suma += centenario[i];
        }
        System.out.println("La suma de todos los valores es "+ suma);
        System.out.println("La media es "+(float)suma/valorArray);*/

        /*10.	Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array por teclado
        y si la posición es correcta, se añadirá a una cadena inicialmente vacía que se mostrará al final del ejercicio. Se dejará de pedir números cuando
        se introduzca un número negativo.
        Por ejemplo, si escribo los siguientes números
        0 // Añadirá la ‘A’
        5 // Añadirá la ‘F’
        25 // Añadirá la ‘Z’
        50 // Error, inserte otro número
        -1 // fin
        Cadena resultante: AFZ*/

        System.out.println("Actividad 10");
        char[] alfabeto= new char['Z'-'A'+1];
        char letra='A';

        for (int i = 0; i < alfabeto.length; i++) {
            alfabeto[i]=letra;
            letra++;
        }

        for (int i = 0; i < alfabeto.length; i++) {
            System.out.println(i+"-->"+alfabeto[i]);
        }

        int posicion=0;
        String cadena= "";


        do{
            System.out.println("Incorpora la posicion de la letra que desees");
            posicion= scan.nextInt();
            if (posicion>=0 && posicion<=25){
                cadena+=alfabeto[posicion];
            } else if (posicion<0) {
                break;
            } else {
                System.out.println("Error, inserte otro número");
            }

        }while (posicion>=0);

            System.out.println("FIN");
            System.out.println("Cadena resultante: "+ cadena);


























    }//main


}// class
