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

        float[] arrayFloat= {10.9f, 9.5f, 8.5f, 7.5f, 6.5f, 5.5f, 4.5f};
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

        String[] arrayString = new String[10];
        for (int i = 0; i < arrayFloat.length ; i++) {

            arrayString [i]= arrayFloat[i]+ "s";
            System.out.println(arrayString[i]);
        }






















    }//main


}// class
