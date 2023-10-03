
package daw1.programacion;
import java.sql.SQLOutput;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edadUsuario= scanner.nextInt();
        System.out.println("Tu edad es: "+ edadUsuario);
        System.out.print("Introduce tu peso: ");
        int pesoUsuario= scanner.nextInt();
        System.out.println("Tu peso es: "+ pesoUsuario);
        System.out.print("Introduce tu altura: ");
        float alturaUsuario= scanner.nextFloat();
        System.out.println("Tu altura es: "+ alturaUsuario);
        System.out.print("Introduce tu CI: ");
        int CIUsuario= scanner.nextInt();
        System.out.println("Tu CI es: "+ CIUsuario);
        System.out.println("FIN");
	// Comenzamos...Comentario de una línea.

        /*
        Probamos comentario que afecta a diferentes
        lineas.
         */
/*int edadDiana = 39;
int edadMoises = 39;
boolean estaLloviendo=false;
boolean somosRicos=true;
float precio = 1.89f;
double lat = 23.598741;*/

//Actividad

        /*int edadJorge =39;
        float alturaDiana= 1.76f;
        boolean Esrepetidor= true;
        double resultado= 1.58459763;
        char genero= 'M' ; //un int seria una bena decisión
        float cambio= 4.50f;
        int numeroDNI= 30229753;
        char letraDNI= 'w';
        int numeroMatricula= 7106;
        char letra1Matricula= 'B';
        char letra2Matricula= 'C';
        char letra3Matricula= 'D';

System.out.println ("Mi edad es: "+ 39);
System.out.println (10+6);
System.out.println (edadDiana + 6);
System.out.println ("edad" + (6 + 9));
System.out.println ("edad" + 6 + 9);
System.out.println (3+((4/2)*5)-1);
System.out.println (4.0f/3);Carga solo los enteros si no tiene nada decimal (4/3).
Tal y como está, ya lo convierte en float, pero también hubiera valido poner (4f/3)
También vale hacer un "castin" como a continuaciónSystem.out.println((float)4)/3;*/

            /*INCREMENTOS
             *
             * edadJorge++;
             * edadJorge +=2; dará 41
             * edadJorge -=2; dará 37
             * edadJorge *=2; dará 58
             * edadJorge /=2; si lo convierto en float, dará la mitad.
             *
             * */

            boolean sonIguales= 3==4;
            boolean sonDistintos= 3!=4;

            System.out.println("el 3 es igual al 4?" + sonIguales);
            int edadMaria= 30;
            int edadSamuel=40;
            int edadJesus=20;

            boolean mariaMenorSamuel =(edadMaria<edadSamuel);
            System.out.println("Maria es menor que Samuel?" + mariaMenorSamuel);
            boolean mariaMenorJesus =(edadMaria<edadJesus);
            System.out.println("Maria es menor que Jesús?" + mariaMenorJesus);
            boolean mariaEsMayor= (edadMaria>edadSamuel)&&(edadMaria>edadJesus);
            System.out.println("Maria es la mayor? " + mariaEsMayor);
            boolean mariaEsMayorQueAlguno= (edadMaria>edadSamuel)||(edadMaria>edadJesus);
            System.out.println("Maria es mayor que alguno de los dos? " + mariaEsMayorQueAlguno);
            boolean mariaNoEsLaMayor = (edadMaria < edadJesus) || (edadMaria < edadSamuel) ;
            System.out.println("Maria no es la mayor?" + mariaNoEsLaMayor);
            // Tambien se puede...
            mariaNoEsLaMayor = !mariaEsMayor;
            System.out.println("Maria no es la mayor?" + mariaNoEsLaMayor);

            // Explicacion de castings;

            int edad=42;
            float valor =edad; //Podría hacerse. Pero no permite que algo de menos precision integre algo de mas precisión
            //para forzarlo, estan los casting.
            edad=(int) valor;
            //Pierdes la parte decimal y nos quedamos con la parte entera.
       /* float f1=30.0f;
        float f2=(float) 30.0;
        double d1=40.0;
        char miLetra = 'J';
        miLetra++;
        System.out.println(miLetra);
        int edad = miLetra;
        System.out.println(miLetra);
        System.out.println((char)74);*/

            9. Imprimir por pantalla el resultado de comprobar si la primera es mayor que la segunda.

            10. Cambiar la primera con el valor de la segunda multiplicado por dos, y volver a imprimir por pantalla
            el resultado de la comprobación anterior.

            11. Imprimir por pantalla el resultado de comprobar si la primera es menor o igual que la segunda.

            12. Repetir el ejercicio anterior pero almacenando el resultado de la comprobación
            en una variable, e imprimiendo después por pantalla dicha variable.

        }//main
    }//class



}