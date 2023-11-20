import java.util.Scanner;

public class Ejercicio3Simulacro {
    public static void main (String [] args){
        Scanner scan= new Scanner (System.in);

        System.out.println("introduzca un valor para el tamaño de su banderín");
        int n= scan.nextInt();
        String rojo="\033[0;31m";
        String amarillo="\033[0;33m";
        String reset="\033[0m";

    /*    for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i;j++) { //Recuerda: la j anidada se imprimirá mientras que sea menor o igual a i dado que i controla la impresión hasta que se llega a n y j es j++ dado que estamos pintando la parte creciente del banderin.

                    if (j==0||j==i){ //pinta la primera (j==0) y la última (j==i)
                        System.out.print(rojo + "+" + reset);
                    } else{
                        System.out.print(amarillo + "*" + reset);
                    }
                }
                System.out.println();
            }
        for (int i = 1; i < n; i++) {
            for (int j = n-i; j > 0; j--) {//Aqui, casi igual solo que j irá decreciendo para que pinte cada vez menos *, i empieza en 1 para que no vuelva a pintar las máximas * y j por eso empieza desde n-i, mientras que j sea mayor que 0.
                if (j==1||j==n-i){//rojo cuando se cumplen la condicion de inicio y final de j.
                    System.out.print(rojo + "+" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }*/
       /* for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j>0; j--) { //Recuerda: la j anidada se imprimirá mientras que sea menor o igual a i dado que i controla la impresión hasta que se llega a n y j es j++ dado que estamos pintando la parte creciente del banderin.
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k==0||k==i){ //pinta la primera y la última
                    System.out.print(rojo + "*" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {//Aqui, casi igual solo que j irá decreciendo para que pinte cada vez menos *, i empieza en 1 para que no vuelva a pintar las máximas * y j por eso empieza desde n-i, mientras que j sea mayor que 0.
                System.out.print(" ");
            }
            for (int k = n - i; k > 0; k--) {
                if (k == 1 || k == n - i) {//rojo cuando se cumplen la condicion de inicio y final de j.
                    System.out.print(rojo + "+" + reset);
                } else {
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }*/

      /*  System.out.println("Ingrese un numero");
        int estrellas= scan.nextInt();
        int contador=1;
        boolean retorno =false;
        String rojo="\033[0;31m";
        String amarillo="\033[0;33m";
        String reset="\033[0m";

       while(contador!=0){

            for (int i = 0; i < contador; i++) {
                if (i == 0 || i == contador - 1) {
                    System.out.print(rojo + "*" + reset);
                } else {
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();


            if (contador==estrellas){
                retorno=true;
            }
            if (retorno){
                contador--;
            } else{
                contador++;
            }

*/
      /*  while(contador!=0){

            for (int i = 0; i < contador; i++) {
                if (i == 0 || i == contador - 1) {
                    System.out.print(rojo + "+" + reset);
                } else {
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();


            if (contador==estrellas){
                retorno=true;
            }
            if (retorno){
                contador--;
            } else{
                contador++;
            }



        }*/









    }
}
