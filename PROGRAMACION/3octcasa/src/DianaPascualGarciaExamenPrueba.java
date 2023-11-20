import java.util.Scanner;

public class DianaPascualGarciaExamenPrueba {

    public static void main (String[] args){

        Scanner scan =new Scanner (System.in);

    //Ejercicio 1
        System.out.println("Incorpore su género siendo 1 mujer y 2 hombre");
        int genero= scan.nextInt();

        if (genero==2){
            System.out.println("Ha elegido hombre");
            System.out.println("Qué clase desea? Elija numero: 1 Buscavidas, 2 Guerrero o 3 Mago");
            int claseHombre= scan.nextInt();
            switch (claseHombre){
                case 1:
                    System.out.println("Ha elegido Buscavidas como clase.");
                    break;

                case 2:
                    System.out.println("Ha elegido Guerrero como clase.");
                    break;

                case 3:
                    System.out.println("Ha elegido Mago como clase.");
                    break;

                default:
                    System.out.println("Será Buscavidas como clase.");
                    break;
            }

        } else{
            System.out.println("Ha elegido mujer");

            System.out.println("Qué clase desea? Elija numero: 1 Asesina, 2 Druida o 3 Amazonas");
            int claseMujer= scan.nextInt();
            switch (claseMujer){
                case 1:
                    System.out.println("Ha elegido Asesina como clase.");
                    break;

                case 2:
                    System.out.println("Ha elegido Druida como clase.");
                    break;

                case 3:
                    System.out.println("Ha elegido Amazonas como clase.");
                    break;

                default:
                    System.out.println("Será Asesina como clase.");
                    break;
            }
        }
    // ejercicio 2:
        int pregunta=1;
        do {
            System.out.println("Introduzca el número de la opción que desee indicar: 0 = fin examen 1= ejercicio1 finalizado, 2=ejercicio2 finalizado, 3. ejercicio3 finalizado, 4.ejercicio4 finalizado.");
            pregunta= scan.nextInt();

            switch (pregunta){
                case 0:
                    System.out.println("Examen finalizado con éxito");
                    break;

                case 1:
                    System.out.println("Ejercicio 1 finalizado.");
                    break;

                case 2:
                    System.out.println("Ejercicio 2 finalizado.");
                    break;

                case 3:
                    System.out.println("Ejercicio 3 finalizado.");
                    break;

                case 4:
                    System.out.println("Ejercicio 4 finalizado.");
                    break;

                default:
                    System.out.println("Error, número fuera de rango.");
                    break;
            }

        } while (pregunta!=0);

    // Ejercicio 4

        System.out.println("¿Has hecho los ejercicios 1, 2 y 4? Diga true o false");
        boolean pregunta1= scan.nextBoolean();
        System.out.println("¿Has intentado el ejercicio 3? Diga true o false");
        boolean pregunta2= scan.nextBoolean();
        System.out.println("¿Has hecho bien el ejercicio 3? Diga true o false");
        boolean pregunta3= scan.nextBoolean();
        System.out.println("¿Te has olvidado de los ejercicios 1 y 2? Diga true o false");
        boolean pregunta4= scan.nextBoolean();

        if((pregunta1 && !pregunta2) || pregunta3 && !pregunta4){
            System.out.println(" Has terminado correctamente, ¡Enhorabuena!");
        } else {
            System.out.println("Sigue practicando");
        }




    }//main


}//class
