import java.util.Scanner;

public class arrayMultidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/* Partiendo de la siguiente matriz haga los siguientes ejercicios:
0 0 0
0 0 0
0 0 0

1.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles: Están las soluciones con y sin bucles
1 1 1
0 0 0
0 0 0 7.	Modifica todos los ejercicios anteriores para que la modificación y la impresión se realicen mediante bucles.*/
    /*    System.out.println("\nActividad 1\n");

        int [][] matriz1={{0,0,0},{0,0,0},{0,0,0}};

        for (int i = 0; i < matriz1.length ; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1 [i][j] + " ");
            }
            System.out.println();
        }*/
      /*  System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.println(matriz[0][2]+" ");
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.println(matriz[1][2]+" ");
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();*/

       /* matriz1[0][0]=1;
        matriz1[0][1]=1;
        matriz1[0][2]=1;*/

        /*System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.println(matriz[0][2]+" ");
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.println(matriz[1][2]+" ");
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]+" ");
        System.out.println();*/

        /*System.out.println();

        for (int i = 0; i < matriz1.length ; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1 [i][j] + " ");
            }
            System.out.println();
        }*/

       /* 2.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        1 0 0
        1 0 0
        1 0 0*/

        /*System.out.println("\nActividad 2\n");

        int [][] matriz2={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };


        for (int i = 0; i < matriz2.length ; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        matriz2[0][0]=1;
        matriz2[1][0]=1;
        matriz2[2][0]=1;*/

       /* System.out.println();
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
        System.out.println();*/

          /*  for (int i = 0; i < matriz2.length ; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println();
            }

        System.out.println();*/


        /*3.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 0
        0 0 0
        1 1 1*/

      /*  System.out.println("\nActividad 3\n");

        int [][] matriz3={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };


        for (int i = 0; i < matriz3.length ; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        matriz3[2][0]=1;
        matriz3[2][1]=1;
        matriz3[2][2]=1;

        for (int i = 0; i < matriz3.length ; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/



      /*  matriz[0][0]=0;
        matriz[1][0]=0;
        matriz[2][1]=1;
        matriz[2][2]=1;

        System.out.println();
        System.out.print(matriz[0][0]+" ");
        System.out.print(matriz[0][1]+" ");
        System.out.print(matriz[0][2]);
        System.out.println();
        System.out.print(matriz[1][0]+" ");
        System.out.print(matriz[1][1]+" ");
        System.out.print(matriz[1][2]);
        System.out.println();
        System.out.print(matriz[2][0]+" ");
        System.out.print(matriz[2][1]+" ");
        System.out.print(matriz[2][2]);
        System.out.println();*/

        /*4.	Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles
        para que tenga el siguiente contenido, y tras modificarla completamente imprímela por pantalla sin utilizar bucles:
        0 0 1
        0 0 1
        0 0 1*/

       /* System.out.println("\nActividad 4\n");

       int [][] matriz4={{0,0,0},{0,0,0},{0,0,0}};

        for (int i = 0; i < matriz4.length ; i++) {
            for (int j = 0; j <matriz4.length ; j++) {
                System.out.print(matriz4[i][j]+ " ");

            }
            System.out.println();
        }

        matriz4[0][2]=1;
        matriz4[1][2]=1;
        matriz4[2][2]=1;

        System.out.println();
        for (int i = 0; i < matriz4.length ; i++) {
            for (int j = 0; j <matriz4.length ; j++) {
                System.out.print(matriz4[i][j]+ " ");

            }
            System.out.println();
        }*/

       /* System.out.println();
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
        System.out.println();*/

        /*
        8.	Leer por pantalla un número entero n, y generar una matriz de dimensiones nxn como la que se muestra a
        continuación. Imprimir la matriz por pantalla tras haberla generado completamente.
        Ejemplo para n = 3:
        1   1   1
        1	1   1
        1   1   1
         */

       /* System.out.println("\nActividad 8\n");

        System.out.println("Incorpora un número por pantalla");
        int dimension=scan.nextInt();

        int [][] matriz9=new int[dimension][dimension];

        for (int i = 0; i < matriz9.length ; i++) {
            for (int j = 0; j <matriz9.length ; j++) {
                matriz9[i][j]=1;//si quisieramos que el valor sea aleatorio, =(int) (Math.ramdom()*10)+1
                System.out.print(matriz9[i][j]+ " ");

            }
            System.out.println();
        }*/
        
        //modificar el ejercicio para que sea n*m

       System.out.println("\nActividad 9\n");

        System.out.println("Incorpora un número para altura");
        int m=scan.nextInt();
        System.out.println("Incorpora un número para base");
        int n=scan.nextInt();

        int[][] act9= new int[m][n];

        for (int i = 0; i < act9.length ; i++) {
            for (int j = 0; j <act9[i].length ; j++) { //incorporar aqui el valor de la altura con [i] al calcular el length
                act9[i][j]=(int)(Math.random()*10);
                System.out.print(act9[i][j]+ " ");

            }
            System.out.println();
        }

        //Leer por pantalla un caracter y un numero n, e imprimir por pantalla.

        System.out.println("Escribe un carácter");
        String caracter= scan.next();
        System.out.println("Escribe un número");
        int numero= scan.nextInt();

        String [][] arr10= new String [numero][numero];

        for (int i = 0; i < arr10.length ; i++) {
            for (int j = 0; j <arr10.length ; j++) {
                if (i==0 || j==0){
                    arr10[i][j]=caracter;
                } else{
                    arr10[i][j]="0";
                }

                System.out.print(arr10[i][j]+ " ");

            }
            System.out.println();
        }

/* correcciones de clase

/*
7. Modifica todos los ejercicios anteriores para que la modificación y la impresión se realicen mediante bucles.
*/

/*
int[][] array = {
{0, 0, 0},
{0, 0, 0},
{0, 0, 0}
};

array[0][2] = 1;
array[1][1] = 1;
array[2][0] = 1;

for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array[i].length; j++) {
System.out.print(array[i][j] + " ");
}
System.out.println();
}
*/


/*
1. Leer por pantalla un número entero n, y generar una matriz de dimensiones nxn como la que se muestra a
continuación. Imprimir la matriz por pantalla tras haberla generado completamente.
Ejemplo para n = 3:
1 1 1
1 1 1
1 1 1
*/


/*
System.out.println("Introduzca un numero: ");
int tamanyo = scan.nextInt();

int[][] array = new int[tamanyo][tamanyo];
for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array[i].length; j++) {
array[i][j] = (int)(Math.random()*10);
System.out.print(array[i][j] + " ");
}
System.out.println();
}

*/


// 2. Modificar el ejercicio anterior para que cada posición tenga un número aleatorio entre 0 y 9.

// 3. Modificar el ejercicio anterior para que las dimensiones sean nxm.

/*
System.out.println("Introduzca un tamanyo m: ");
int alto = scan.nextInt();
System.out.println("Introduzca un tamanyo n: ");
int ancho = scan.nextInt();

int[][] array = new int[alto][ancho];

for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array[i].length; j++) {
array[i][j] = (int)(Math.random()*10);
System.out.print(array[i][j] + " ");
}
System.out.println();
}
*/

/*
4. Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
a a a a
a 0 0 0
a 0 0 0
a 0 0 0
*/

/*
        Scanner scanString = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter = scanString.nextLine().charAt(0);
        System.out.println("Introduce un tamanyo: ");
        int tamanyo = scan.nextInt();

        char[][] arrayChar = new char[tamanyo][tamanyo];

        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[i].length; j++) {
                if (i == 0 || j == 0) {
                    arrayChar[i][j] = caracter;
                } else {
                    arrayChar[i][j] = '0';
                }
                System.out.print(arrayChar[i][j] + " ");
            }
            System.out.println();
        }
 */













    } // class
}//main
