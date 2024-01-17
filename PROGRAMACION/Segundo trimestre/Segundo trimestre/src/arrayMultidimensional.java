import java.util.Scanner;

public class arrayMultidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/* Partiendo de la siguiente matriz haga los siguientes ejercicios:
0 0 0
0 0 0
0 0 0

1.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
1 1 1
0 0 0
0 0 0*/
        int [][] matriz={{0,0,0},{0,0,0},{0,0,0}};

       /* for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz [i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.println(matriz[0][2]+" ");
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.println(matriz[1][2]+" ");
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();

        matriz[0][0]=1;
        matriz[0][1]=1;
        matriz[0][2]=1;

        System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.println(matriz[0][2]+" ");
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.println(matriz[1][2]+" ");
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();

       /* 2.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 0 0
        1 0 0
        1 0 0*/

        matriz[0][1]=0;
        matriz[0][2]=0;
        matriz[1][0]=1;
        matriz[2][0]=1;

        System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.print(matriz[0][2]+" ");
        System.out.println();
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.print(matriz[1][2]+" ");
        System.out.println();
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();



        /*3.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 0
        0 0 0
        1 1 1*/

        matriz[0][0]=0;
        matriz[1][0]=0;
        matriz[2][1]=1;
        matriz[2][2]=1;

        System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.print(matriz[0][2]+" ");
        System.out.println();
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.print(matriz[1][2]+" ");
        System.out.println();
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();

        /*4.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles
        para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 0 1
        0 0 1*/

        matriz[0][2]=1;
        matriz[1][2]=1;
        matriz[2][0]=0;
        matriz[2][1]=0;

        System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.print(matriz[0][2]+" ");
        System.out.println();
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.print(matriz[1][2]+" ");
        System.out.println();
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();









    } // class
}//main
