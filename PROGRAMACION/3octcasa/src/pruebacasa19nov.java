import java.util.Scanner;

public class pruebacasa19nov {
    public static void main (String[] args){

      /*  Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int estrellas= scan.nextInt();
        int contador=1;
        boolean retorno =false;
        String rojo="\033[0;31m";
        String amarillo="\033[0;33m";
        String reset="\033[0m";*/

     /*   while(contador!=0){

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
       /* while(contador!=0){

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

   /*     System.out.println("introduzca un valor para el tamaño de su banderín");
        int n= scan.nextInt();
        String rojo="\033[0;31m";
        String amarillo="\033[0;33m";
        String reset="\033[0m";*/

    /*    for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i;j++) {

                    if (j==0||j==i){ //pinta la primera (j==0) y la última (j==i)
                        System.out.print(rojo + "+" + reset);
                    } else{
                        System.out.print(amarillo + "*" + reset);
                    }
                }
                System.out.println();
            }
        for (int i = 1; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                if (j==1||j==n-i){
                    System.out.print(rojo + "+" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }*/
       /* for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k==0||k==i){
                    System.out.print(rojo + "*" + reset);
                } else{
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k > 0; k--) {
                if (k == 1 || k == n - i) {
                    System.out.print(rojo + "+" + reset);
                } else {
                    System.out.print(amarillo + "*" + reset);
                }
            }
            System.out.println();
        }*/



    }
}
