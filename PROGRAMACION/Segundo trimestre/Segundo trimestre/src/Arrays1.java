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

        float[] arrayFloat= {10.9f, 9.5f, 8.5f, 7.5f, 6.5f, 5.5f, 4.5f, 6.5f, 5.5f, 4.5f};
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

        }

        // Modificar el ejercicio anterior de forma que el array sea de String.

        System.out.println("Actividad 2*********");

        /*String[] arrayString = new String[10];
        for (int i = 0; i < arrayFloat.length ; i++) {

            arrayString [i]= arrayFloat[i]+ "s";
            System.out.println(arrayString[i]);
        }*/

        //CORRECCION CLASE

        String[] arrayString = {"10.9", "9.5", "8.5", "7.5", "6.5", "5.5", "4.5", "6.5", "5.5", "4.5"};

        for (String var:arrayString) {
            System.out.println(var);
        }

        for (int i = 0; i < arrayString.length ; i++) {
            arrayString[i]=i+"";
        }
        for (String var:arrayString) {
            System.out.println(var);
        }

       /* 3.	Modificar el ejercicio anterior de forma que el array sea de char (utilice únicamente números de una cifra en el inicializador).*/
        System.out.println("Actividad 3*********");

        char[] arrayChar = {'1', '9', '8', '7', '6', '5', '4', '6', '5', '4'};

        for (char var:arrayChar) {
            System.out.println(var);
        }

        for (int i = 0; i < arrayChar.length ; i++) {
            arrayChar[i]= (char) i;
        }
        for (int var:arrayChar) {
            System.out.println(var);
        }

        // RESULTADO DE CLASE

        char[] arraychar={'1','2','3','4','5','6','7','8','9','0'};
        for (char var:arraychar) {
            System.out.println(var);
        }

        for (int i = 0; i <arraychar.length ; i++) {

            arraychar[i] = (char) (i) ;
        }
        for (char var:arraychar) {
            System.out.println((int)var); //EN LUGAR DE PARSEAR ARRIBA LO HACES ABAJO, ES VÁLIDO TAMBIÉN.
        }

        /*4.	Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada posición. Elija el tipo que desee y los valores iniciales que desee.*/

        System.out.println("Actividad 4*********");

        int[] ejemplo4= {8,2,1,4,15};

        for (int i = 0; i < ejemplo4.length; i++) {
            System.out.println(ejemplo4[i]);
        }



        /*5.	Modifica el ejercicio anterior para que, a continuación, pida por pantalla 5 nuevos valores y rellene el array con ellos, volviéndolo a imprimir.*/

        System.out.println("Actividad 4 con scanner");

        int[] ejemplo4b= new int[5];

        for (int i = 0; i < ejemplo4b.length; i++) {
            System.out.println("Incorpore el valor para la posición "+ (i+1));
            ejemplo4b[i]= scan.nextInt();
        }

        for (int i = 0; i < ejemplo4b.length; i++) {
            System.out.println(ejemplo4b[i]);
        }























    }//main


}// class
