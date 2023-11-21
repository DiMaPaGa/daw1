import java.util.Scanner;

public class DianaPascualGarciaExamenPrueba {

    public static void main (String[] args){

        Scanner scan =new Scanner (System.in);

    //Ejercicio 1
        System.out.println("Incorpore su género siendo 1 mujer y 2 hombre");
        int genero= scan.nextInt();//aqui se puede crear la variable clase tambien, que se llame igual en los dos casos antes del switch.

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
//EJERCICIO 3

       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i;j++) { //Recuerda: la j anidada se imprimirá mientras que sea menor o igual a i dado que i controla la impresión hasta que se llega a n y j es j++ dado que estamos pintando la parte creciente del banderin.

                if (j==0||j==i){ //pinta la primera (j==0) y la última (j==i)
                    System.out.print(rojo + "+" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }
        for (int i = n; i >=0; i--) {
            for (int j = i; j >= 0; j--) {//Aqui, casi igual solo que j irá decreciendo para que pinte cada vez menos *, i empieza en 1 para que no vuelva a pintar las máximas * y j por eso empieza desde n-i, mientras que j sea mayor que 0.
                if (j==0||j==i){//rojo cuando se cumplen la condicion de inicio y final de j.
                    System.out.print(rojo + "+" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=n>; j++) { //Recuerda: la j anidada se imprimirá mientras que sea menor o igual a i dado que i controla la impresión hasta que se llega a n y j es j++ dado que estamos pintando la parte creciente del banderin.
               if(j>= n-i) {
                   System.out.println("* ");
               } else{
                   System.out.println(" ");
               }
            }
            System.out.println();
        }

        for (int i = n-1; i >0 ; i--) {
            for (int j = n; j >= 0 ; j--) {
                if(j< i) {
                    System.out.println("* ");
                } else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }




    }//main


}//class
