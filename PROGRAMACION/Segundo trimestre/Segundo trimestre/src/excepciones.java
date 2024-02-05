import java.util.InputMismatchException;
import java.util.Scanner;

//ATRIBUTOS ESTÁTICOS

public class excepciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* 1. Realice un programa que lea por pantalla dos números enteros, e imprima el resultado de
/ dividirlos. Observe la excepción que se lanza al dividir por cero, y tras ello modifique su código
    para que capture dicha excepción.*/

        System.out.println("Introduce un numero");
        int valor2=0;

        try {
            int valor1= scan.nextInt();

            System.out.println(valor1 / valor2);
        } catch(ArithmeticException e){
            System.err.println(e);
        } catch(InputMismatchException e){
            System.err.println("No estas introduciendo un número");
        } finally {
            System.out.println("Hola mundo");
        }

        /*2. Realice un programa que cree un array de 10 posiciones inicializado con números crecientes
a partir de 1. Escriba un bucle que vaya desde i=0 hasta i<=longitud y los imprima por pantalla. Observe
la excepción que se lanza, y tras ello modifique su código para que capture dicha excepción.*/

        int []pruebaexc= new int[10];

           for (int i = 0; i <= pruebaexc.length; i++) {
               try {
               System.out.println(pruebaexc[i]=i);
               } catch (ArrayIndexOutOfBoundsException e){
                   System.out.println("es un error"+e);
                   System.err.println("es un error"+e);
               } finally{
                   System.out.println("Hola mundo");
               }
           }






    }
}
