import java.sql.SQLOutput;
import java.util.Scanner;

public class ActividadesRepaso1trimestre {

    public static void main (String[] args){

        Scanner scan=new Scanner(System.in);
        Scanner bool=new Scanner(System.in);
        Scanner textA=new Scanner(System.in);
        Scanner textP=new Scanner(System.in);



 /*
1. Desarrolla un programa que permita introducir alumnos y profesores. Al comienzo del programa, te preguntará si quiere introducir un alumno o un profesor,
debiendo introducir 1 para profesor o 3 para alumno. El siguiente paso debe ser introducir el nombre y apellidos del usuario que quiere introducir,
mostrando al finalizar su posición junto al nombre y apellido (ej: Profesor: Juan Carlos Salés). Despues el programa debe preguntar si quiere introducir
otro usuario. En caso afirmativo, el programa volverá a ejecutarse. En caso negativo, el programa debe imprimir el número de alumnos y profesores que
se han introducido.
*/
       int eleccion=0;
        int alumnado=0;
        int profesorado=0;
        boolean seleccion= true;

        do{

        do{
            System.out.println("¿Desea introducir a un profesor (marcar 1) o un alumno (marcar 3)?");
            eleccion= scan.nextInt();

        }while (eleccion!=1 && eleccion!=3);

        if (eleccion==1){
          profesorado++;
            System.out.println("Incorpore Nombre y Apellidos");
            String nombreProf= textP.nextLine();
            System.out.println("Profesor: "+ nombreProf);

        } else {
            alumnado++;

            System.out.println("Incorpore Nombre y Apellidos");
            String nombreAlum= textA.nextLine();
            System.out.println("Alumno: "+ nombreAlum);

        }

        System.out.println("¿Desea incluir otro usuario? Introduzca true o false");
        seleccion= bool.nextBoolean();

    }while (seleccion);

        System.out.println("Ha introducido "+ alumnado+ " alumnos y  "+ profesorado+ " profesores.");



/*
2. Desarrolla un programa que lea por pantalla un año y escriba un algoritmo que indique si es bisiesto.
¿Cuales son las condiciones para que un año sea bisiesto? Son las siguientes y vale con que se
cumpla alguna de ellas, es decir, si se cumple CUALQUIERA de estas dos condiciones el año sera bisiesto:
- Es divisible entre 4 y no es divisible entre 100.
- Es divisible entre 100 y 400.

Ejemplos de años bisiestos: 1900(no es bisiesto), 2000 y 2020.
Ejemplos de años no bisiestos: 1901, 2001 y 2021.
*/

   System.out.println("Introduzca un año");
    int year= scan.nextInt();

    if ((year%4==0 && year%100!=0)||(year%100==0 && year%400==0)){
        System.out.println(year + " es bisiesto");
    } else{
        System.out.println(year + " no es bisiesto");
    }


/*
3. Leer por pantalla el numero de hombres que tiene una clase, y tambien el número de mujeres, e imprimir el porcentaje que hay de cada uno de ellos como sigue:
si se leen 3 hombres y 7 mujeres, se escribiría:

Total de personas: 10
Hombres: 30% (3)
Mujeres: 70% (7)
*/
   System.out.println("¿Introduzca el número de hombres que hay en clase?");
   int hombres= scan.nextInt();
   System.out.println("¿Introduzca el número de mujeres que hay en clase?");
   int mujeres= scan.nextInt();
   int total=mujeres+hombres;
   int porcH=hombres*100/total;
   int porcM=mujeres*100/total;

        System.out.println("Total de personas: "+(total));
        System.out.println("Hombres: " + porcH+ "% ("+hombres+")");
        System.out.println("Mujeres: " + porcM+ "% ("+mujeres+")");


/*
4. Comprobar qué porcentaje es mayor, e imprimir un mensaje al respecto. Por ejemplo, para el ejercicio anterior, se debería imprimir:

El porcentaje de mujeres es mayor.

Nota: si no sabe hacer el ejercicio 3, cree dos variables y asigne un valor a cada
una con un escaner, y trabaje con ellas para este ejercicio.
*/
       if (hombres> mujeres){
            System.out.println("El porcentaje de hombres es mayor.");
        } else if (mujeres>hombres) {
            System.out.println("El porcentaje de mujeres es mayor.");
        } else {
            System.out.println("Ambos porcentajes son iguales");
        }


/*
5. Con el porcentaje menor, cree y muestre una cuenta atras hasta el numero 1. Por ejemplo, en el caso anterior, se mostraría:
30
29
28
...
1
FIN

Nota: si no sabe hacer el ejercicio 3, cree una variable y asigne un valor con
un escaner, y trabaje con ella para este ejercicio.
*/

       if (hombres> mujeres){
            for (int i = porcM; i >=0 ; i--) {
                if (i==0){
                    System.out.println("Fin");
                } else {
                    System.out.println(i);
                }
            }
        } else if (mujeres>hombres) {
            for (int i = porcH; i >=0 ; i--) {
                if (i==0){
                    System.out.println("Fin");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = porcM; i >=0 ; i--) {
                if (i==0){
                    System.out.println("Fin");
                } else {
                    System.out.println(i);
                }
            }
        }


/*
6. Partiendo de una variable de tipo char que contiene la letra del DNI de un estudiante de oposiciones (inicialice con la letra que desee). Los estudiantes
cuya letra va desde la A hasta la M serán asignados a la sala 1, y el resto a la sala 2. Mediante una estructura switch-case, compruebe el valor de la letra e
imprima un mensaje indicando qué sala le sería asignada al usuario de la variable.
*/
    char letra='A';
        System.out.println("Introduzca la letra de su DNI");
        letra=textA.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
                System.out.println("El estudiante está asignado a la Sala 1.");
                break;
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("El estudiante está asignado a la Sala 2.");
                break;
            default:
                System.out.println("Letra de DNI no válida.");

        }


/*
7. Leer por pantalla un numero entero e imprimir una cuenta atrás desde dicho número hasta el cero. Si el número es inferior o igual a cero,
imprimir un mensaje de error y acabar.
*/

        System.out.println("Introduzca un número");
        int numero= scan.nextInt();

        if (numero<=0){
            System.out.println("Error");
        } else{
            for (int i = numero; i >=0 ; i--) {
                System.out.println(i);
            }
        }


    }//main
}//class
