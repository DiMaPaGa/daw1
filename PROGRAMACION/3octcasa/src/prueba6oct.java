import java.util.Scanner;

public class prueba6oct {

    public static void main (String[] args){

        Scanner scan =new Scanner(System.in);

        /*Resumen actividades:Ingresar datos para mostrar por pantalla junto a mayoria edad; adivinar número;
                              convertir char en número o letra con suma int */
    //Actividad 1.

      System.out.println("¿Cuál es tu nombre?: ");
        String nombre= scan.next();
        System.out.println("¿Cuál es tu año de nacimiento?: ");
        int anyoNacimiento= scan.nextInt();
        System.out.println("¿Cuál es el nombre de su primer contacto?: ");
        String nombreContac1= scan.next();
        System.out.println("¿Cuál es el nombre de su segundo contacto?: ");
        String nombreContac2= scan.next();
        System.out.println("Usted se llama "+ nombre+ "tiene "+ (2023-anyoNacimiento)+ " años." + "Su primer contacto es "+ nombreContac1+ " y su segundo contacto es "+ nombreContac2+ ".");
        int edad=(2023-anyoNacimiento);
        boolean menorEdad= (edad<18);
        System.out.println("Menor de edad? "+ menorEdad);

    //Actividad 2.

        int numero=5;
        System.out.println("Adivine un número entero del 1 al 5");
        int numeroUsuario= scan.nextInt();
        boolean victoria= (numeroUsuario==numero);
        System.out.println("Victoria?"+ victoria);

     //Actividad 3.
        char letraNom= 'D';
        System.out.println("Ingrese un número entero");
        int numEntero= scan.nextInt();
        char letraResultante= letraNom+=numEntero;// también puede ser letra= (char)(letra + entero)
        System.out.println("1. La letra resultante es: "+ letraResultante);
        int codigoResultante= letraNom+numEntero; //sout(int)letra
        System.out.println("2. El código de la letra resultante es: "+ codigoResultante);












    }// main


} //class
