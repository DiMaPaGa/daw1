
import java.util.Scanner;

public class Actividad13nov {

    public static void main (String []args){

        Scanner scan= new Scanner (System.in);

       //1. Tabla del dos

       /* int resultado=0;

        for (int i = 0; i <=10 ; i++) {
            resultado=2*i;
            System.out.println("2 x "+ i + " = "+ resultado);
        }*/

        // 2. Pidiendo por comando


      /* System.out.println("Ingresa un número");
        int num= scan.nextInt();
        int resultado=0;
        int contador=0;*/

        /*for (int i = 0; i <=10 ; i++) {
            resultado=num*i;
            System.out.println( num+ " x "+ i + " = "+ resultado);
        }*/

   /* while (contador<=10){
        resultado= num*contador;
        System.out.println( num+ " x "+ contador + " = "+ resultado);
        contador++;
    }
    */

        // Imprimir el abecedario

        char letra='a';

      /*  for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i+" ");

        }*/

       /* for (int i = letra; i <='z' ; i++) {

            System.out.println(letra);
            letra++;

            if(i=='n'){
                System.out.println("ñ");

            }
        }*/

        // Leer un número entero de tres cifras, forzando al usuario a que introduzca un número de esas características. Imprimir por pantalla si es par o impar.

        int numero=0;

        do{
            System.out.println("Introduce un número de 3 cifras");
            numero= scan.nextInt();
        } while (numero<100 || numero>999);

        if (numero%2==0){
            System.out.println(numero+ " es par.");
        } else {
            System.out.println(numero+ " es impar.");
        }
// Leer un carácter para saber el estado de una persona (S para soltera o C para casado), forzando al usuario que introduzca S o C.
// Dependiendo de lo que haya introducido, imprimir: La persona es soltera o bien La persona esa casada.

        String estadoCivil;

        do{
            System.out.println("Introduce S si eres solter@ o C si eres casad@");
            estadoCivil= scan.next();
        } while (estadoCivil!="s" || estadoCivil!="c" );

        if (estadoCivil=="s"){
            System.out.println("Eres solter@");
        } else {
            System.out.println("Eres casad@");
        }










    } //main

}//class
