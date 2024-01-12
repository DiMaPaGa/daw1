import java.util.Scanner;

public class examenrec1trimestre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    /*Ejercicio 1 (2,5 puntos):
Desarrollar un programa que recorra los números del 0 al 100 (ambos
incluidos) e imprima lo siguiente según su iteración:
1) Si la iteración en la que se encuentra es múltiplo de 3, imprima por
pantalla la palabra “fizz”.
2) Si la iteración en la que se encuentra es múltiplo de 5, imprimir por
pantalla la palabra “buzz”.
3) Si la iteración en la que se encuentra es múltiplo de 3 y de 5 a la vez,
imprimir por pantalla la palabra “fizzbuzz”.
4) En caso contrario, imprimir el número de la iteración en la que se
encuentra.
Nota: Todas las impresiones serán con un salto de línea.*/



     /*   for (int i = 0; i <=100 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }
            else if (i%3==0){
                System.out.println("fizz");
            } else if (i%5==0){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }*/

/*Ejercicio 2 (3,5 puntos):

Atención: Este ejercicio está destinado a evaluar la asignación de variables,
las operaciones básicas (numéricas y booleanas), la impresión por pantalla y
el escáner. No se evaluará el ejercicio en caso de usar estructuras de
decisión (es decir, no se puede usar IF ni SWITCH).
a) (2 puntos): Desarrollar un algoritmo que pida por pantalla un año e
imprima una variable booleana que verifique si es año bisiesto o no.
Para ésto se deben declarar tres variables booleanas (llamadas p, q y r
respectivamente) con las siguientes condiciones:
1) Que el año anteriormente solicitado sea divisible por 4 (es
decir, su resto al dividirlo por 4 sea 0).
2) Que el año anteriormente solicitado sea divisible por 100 (es
decir, su resto al dividirlo por 100 sea 0).
3) Que el año anteriormente solicitado sea divisible por 400 (es
decir, su resto al dividirlo por 400 sea 0).
Para que se verifique que un año es bisiesto debe imprimirse por
pantalla la siguiente proposición lógica:
Un año será bisiesto si o bien es divisible por 4 y no es divisible
por 100 o bien es divisible por 400.
b) (1.5 puntos): Se puede hacer una proposición lógica más eficiente
que la anterior. Para ésto, imprimir por pantalla la siguiente proposición
lógica (sin borrar nada de lo realizado anteriormente, simplemente
añadir esta línea al programa anterior): Un año será bisiesto si es
divisible por 4 y o bien no es divisible por 100 o bien es divisible
por 400.*/

       /* System.out.println("Introduce un año");
        int anio= scan.nextInt();


        boolean p= anio%4==0;
        boolean q= anio%100==0;
        boolean r= anio%400==0;

        boolean bisiesto= ((p && !q) || r);
        System.out.println("Es bisiesto: " + bisiesto);

        boolean bisiesto2= p && (!q || r);
        System.out.println("Es bisiesto: " + bisiesto);*/

/*Ejercicio 3 (4 puntos):
Mediante una estructura SWITCH-CASE y un BUCLE del tipo que quiera,
cree un menú para este examen que permita elegir como opción cuál de los
dos primeros ejercicios se quiere ejecutar. Si se elige la opción 1 (es decir, si
se lee por teclado el número entero 1) se ejecutará el código del primer
ejercicio y tras ello, se volverá a mostrar el menú para que el usuario elija de
nuevo una opción. Si se elige la opción 2 (es decir, si se lee por teclado el
número entero 2) se ejecutará el código del segundo ejercicio y tras ello, se
volverá a mostrar el menú para que el usuario elija de nuevo una opción. Si
se lee cualquier otro número, el programa termina. SIGA ESTOS PASOS:
a) (1.5 puntos): muestre las opciones del menú y después pida al
usuario un entero y guárdelo en una variable. Cree la estructura
SWITCH-CASE con el número de casos necesarios para cumplir el
enunciado. NO TOQUE EL CÓDIGO DE LOS DOS PRIMEROS
EJERCICIOS.
b) (1.5 puntos): modifique el apartado anterior para que el menú se
vuelva a mostrar y se vuelva a pedir al usuario un entero cuando se
seleccione la opción 1 o 2. Cuando se seleccione la tercera el
programa termina. NO TOQUE EL CÓDIGO DE LOS DOS PRIMEROS
EJERCICIOS.
c) (1 punto): corte el código del ejercicio 1 y péguelo en el caso
adecuado de forma que cuando el usuario seleccione la opción 1, se
ejecute el código del ejercicio 1. Haga lo mismo con el código del
ejercicio 2. Es importante que corte y pegue para obtener los dos
puntos de este apartado, de forma que cuando el profesor ejecute su
examen, lo primero que ve es el menú de selección de ejercicio y no
haya código repetido. Es decir, el código de los ejercicios 1 y 2 debe
estar integrado en este menú, no repetido. SI NO SE SIENTE CAPAZ
DE HACERLO O CREE QUE VA A ESTROPEAR SU EXAMEN, NO
HAGA ESTE APARTADO C.*/

        int ejercicio;

        do {

        System.out.println("¿cuál de los dos primeros ejercicios desea ejecutar?");
        System.out.println("1: ejercicio 1");
        System.out.println("2: ejercicio 2");
        System.out.println("Otro Número: Salir");
            ejercicio= scan.nextInt();



        switch (ejercicio){
            case 1:
                System.out.println("Ejercicio 1");
                for (int i = 0; i <=100 ; i++) {
                    if (i%3==0 && i%5==0){
                        System.out.println("fizzbuzz");
                    }
                    else if (i%3==0){
                        System.out.println("fizz");
                    } else if (i%5==0){
                        System.out.println("buzz");
                    } else {
                        System.out.println(i);
                    }

                }
                break;

            case 2:
                System.out.println("Ejercicio 2");
                System.out.println("Introduce un año");
                int anio= scan.nextInt();


                boolean p= anio%4==0;
                boolean q= anio%100==0;
                boolean r= anio%400==0;

                boolean bisiesto= ((p && !q) || r);
                System.out.println("Es bisiesto: " + bisiesto);

                boolean bisiesto2= p && (!q || r);
                System.out.println("Es bisiesto: " + bisiesto);
                break;

            default:
                System.out.println("Ha terminado");
                break;

        }
    } while (ejercicio==1 || ejercicio==2);

    }
}
