package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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


    }//main
}//class
