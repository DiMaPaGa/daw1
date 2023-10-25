import java.sql.SQLOutput;
import java.util.Scanner;

public class BoletinBucles2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

         // 1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese nombre, repitiendo dicho saludo hasta que se muestre un total de diez veces.
        System.out.println("Escribe tu nombre");
        String nombre= scan.next();

        for (int i=0; i<10; i++){
            System.out.println("Tu nombre es "+ nombre);
        }

        //2. Leer un número entero, y escribir un mensaje de error tantas veces como diga ese número.
        System.out.println("Introduce un número");
        int numero= scan.nextInt();

        for (int i=0; i<numero; i++){
            System.out.println("Error");
        }

        // 3. Crear una contraseña numérica en una variable. Pedir por pantalla la contraseña de inicio hasta que el usuario la acierte.
        System.out.println("Introduce una contraseña de 4 números");
        int contraseña= scan.nextInt();
        int correcta= 5555;

        while (contraseña!=correcta) {
            System.out.println("Error, incorpore una nueva contraseña");
            contraseña= scan.nextInt();

        }

        // 4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una frase al respecto. Si se mete un cero, volver a pedir un número.




        // 5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un numero negativo o cero, volver a pedir un número.




        // 6. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes correspondiente. En caso de leer un número fuera de rango, volver a pedir un número entre 1 y 12.




        // 7. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.





















    }   //main


} //class
