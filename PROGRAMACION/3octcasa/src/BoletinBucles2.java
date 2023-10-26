import java.sql.SQLOutput;
import java.util.Scanner;

public class BoletinBucles2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /* // 1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese nombre, repitiendo dicho saludo hasta que se muestre un total de diez veces.
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
        System.out.println("Contraseña correcta");

        // 4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una frase al respecto. Si se mete un cero, volver a pedir un número.
        System.out.println("Introduce un número");
        float entero= scan.nextFloat();
        while(entero==0){
            System.out.println("Cero no es válido. Incorpore otro número: ");
            entero= scan.nextFloat();
        }

        if(entero<0){
            System.out.println("Es negativo");
        }
        else{
            System.out.println("Es positivo");
        }

        // 5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un numero negativo o cero, volver a pedir un número.
        System.out.println("Introduce un número");
        float entero2= scan.nextFloat();

        while(entero2==0 || entero2<0) {
            System.out.println("No es válido. Incorpore un número positivo: ");
            entero2= scan.nextFloat();
        }
        if(entero%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }

        // 6. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes correspondiente. En caso de leer un número fuera de rango, volver a pedir un número entre 1 y 12.
        System.out.println("Incorpore el número del mes");
        int mes= scan.nextInt();
        while(mes<1 || mes>12) {
            System.out.println("No es válido. Incorpore un número del 1 al 12: ");
            mes= scan.nextInt();
        }
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No debería salir este mensaje");
                break;
        }
*/
        // 7. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.
        System.out.println("Incorpore un número");
        int valor= scan.nextInt();
        boolean primo=true;
        int contador= 0;

        for (int i=2;i<valor;i++){
            if (valor%i==0){
                System.out.println(valor + "es divisible entre " + i);
                primo=false;
                if (primo==false){
                    contador++;
                }
            } else{
                if (primo==true){
                }
            }
        }
        if (contador==0){
            System.out.println(valor+ " es primo");
        } else{
            System.out.println(valor+ " NO es primo");
        }




















    }   //main


} //class
