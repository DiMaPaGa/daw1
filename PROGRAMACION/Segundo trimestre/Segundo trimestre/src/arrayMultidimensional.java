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
0 0 0
7.	Modifica todos los ejercicios anteriores para que la modificación y la impresión se realicen mediante bucles.*/
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

       /*System.out.println("\nActividad 9\n");

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
        }*/

        //Leer por pantalla un caracter y un numero n, e imprimir por pantalla.

     /*   System.out.println("Escribe un carácter");
        String caracter= scan.next();
        System.out.println("Escribe un número");
        int numero= scan.nextInt();

        String [][] matrix= new String [numero][numero];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if (i==0 || j==0){
                    matrix[i][j]=caracter;
                } else{
                    matrix[i][j]="0";
                }

                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }*/


/*
        5.	Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        0 0 0 a
        0 0 0 a
        0 0 0 a
        a a a a
         */
      /*  System.out.println("\nActividad 5\n");

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if (j== matrix[i].length-1 || i==matrix[j].length-1){
                    matrix[i][j]=caracter;
                } else{
                    matrix[i][j]="0";
                }

                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }*/

       /* 6.	Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        a a a a
        a 0 0 a
        a 0 0 a
        a a a a*/

      /*  System.out.println("\nActividad 6\n");

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if (j== matrix[i].length-1 || i==matrix[j].length-1 || i==0 || j==0){
                    matrix[i][j]=caracter;
                } else{
                    matrix[i][j]="0";
                }

                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }*/


       /* System.out.println("\nActividad 7 de di\n");

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if (j==i){
                    matrix[i][j]=caracter;
                } else{
                    matrix[i][j]="0";
                }

                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();
        }*/

       /* 1.	Leer por pantalla un número entero n, y crear una matriz de String de dimensiones nxn como la que se muestra a continuación. Imprimir la matriz por pantalla después de haberla rellenado completamente.

        Ejemplo para n = 4:
        1.0    2.0    3.0     4.0
        5.0    6.0    7.0     8.0
        9.0    10.0  11.0  12.0
        13.0  14.0  15.0  16.0*/

       /*System.out.println("\nActividad 1 de dia 19\n");

        System.out.println("Introduce un número: ");
        int n= scan.nextInt();

        String [][] eje2= new String [n][n];
        int valor=1;


        for (int i = 0; i < eje2.length ; i++) {
            for (int j = 0; j <eje2[i].length ; j++) {
                eje2 [i][j]= valor + ".0";
                valor++;
                System.out.print(eje2 [i][j]+" ");
            }
            System.out.println();
        }*/

       /* System.out.println("\nActividad 1 de dia 19 con float\n");

        float valor2=1.0f;
        for (int i = 0; i < eje2.length ; i++) {
            for (int j = 0; j <eje2[i].length ; j++) {
                eje2 [i][j]= valor2+" ";
                valor2++;
                System.out.print(eje2 [i][j]);
            }
            System.out.println();
        }*/


        /*
        2.	Crear una matriz de String de dimensiones 2x4 y rellenarla con nombres de compañeros o familiares.
                El programa a continuación debe leer por pantalla una posición de la matriz válida, leer un nuevo
        nombre por pantalla y sustituir el nombre que exista en esa posición. Debe repetirse la operación hasta que
        el usuario introduzca una posición inválida. Antes de finalizar, imprima la matriz.
         */
      /* String [][] eje3= {{"Moisés","Diana","Ana", "Nando"},{"María","Paco","Lydia","Fabiola"}};
        int fila;
        int columna;
        String cadena;
        boolean validada;


        do {
            System.out.println("Introduce un numero de fila:");
            fila = scan.nextInt();
            System.out.println("Introduce un numero de columna: ");
            columna = scan.nextInt();

            validada=fila>=0 && fila< eje3.length && columna>=0 && columna< eje3[fila].length;

                if (validada){
                    System.out.println("Cambie la cadena");
                    cadena= scan.next();
                    eje3[fila][columna]=cadena;
                }


        } while (validada);

        System.out.println("HA TERMINADO. El array queda: ");

        for (int i = 0; i < eje3.length ; i++) {
            for (int j = 0; j < eje3[i].length; j++) {
                System.out.print(eje3[i][j] + " ");
            }
        }*/

        /*3.	Repetir el ejercicio anterior para que antes del último paso (imprimir la matriz),
        se lea por pantalla un String. En caso de ser “MAYUSCULAS”, pasar a mayúsculas el contenido
        de la matriz. En caso de ser “minusculas”, pasar a minúsculas el contenido de la matriz. En cualquier otro caso, no hacer nada. A continuación, imprimir la matriz.*/

        /*String [][] eje3= {{"Moisés","Diana","Ana", "Nando"},{"María","Paco","Lydia","Fabiola"}};
        int fila;
        int columna;
        String cadena;
        boolean validada;


        do {
            System.out.println("Introduce un numero de fila:");
            fila = scan.nextInt();
            System.out.println("Introduce un numero de columna: ");
            columna = scan.nextInt();

            validada=fila>=0 && fila< eje3.length && columna>=0 && columna< eje3[fila].length;

            if (validada){
                System.out.println("Cambie la cadena");
                cadena= scan.next();
                eje3[fila][columna]=cadena;
            }


        } while (validada);*/

//correccion del nuevo ejercicio 3 con actividad corregida en clase
     /*   int positioni;
        int positionj;

        String[][] nombres = {
                {"Ana","Bernardo","Carlos","Domingo"},
                {"Ernesto","Francisco","Gabriel","Hector"}
        };

        do {
            String sustituto;
            System.out.print("Introduzca el número de la matriz: ");
            positioni = scan.nextInt();
            System.out.print("Introduzca el número del nomrbe: ");
            positionj = scan.nextInt();

            if ((positioni<=1) && (positionj
                    <=3 && positionj>=0 && positioni>=0)){
                System.out.print("Ahora introduzca el nombre que lo sustituirá: ");
                sustituto = scan2.nextLine();
                nombres[positioni][positionj] = sustituto;
            }
        } while ((positioni<=1) && (positionj<=3) && (positionj>=0 && positioni>=0));

        System.out.println("Quieres los nombres en mayusculas o en minusculas?\nIntroduzca 'MAYUSCULAS' o 'minusculas'");
        String mayusculas = scanString.nextLine();
        if (mayusculas.equals("MAYUSCULAS")){
            for (int i = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j] = nombres[i][j].toUpperCase();
                }
            }
        }else if (mayusculas.equals("minusculas")) {
            for (int i
                 = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j] = nombres[i][j].toLowerCase();
                }
            }
        }*/

        /*
        1. Leer por teclado un entero y crear una matriz cuadrada (mismo numero de filas que de columnas). Dependiendo
         del tamaño tendrá esta forma:
// Tamaño 1
        1
// Tamaño 2
        10
        10
// Tamaño 3
        101
        101
        101
// Tamaño 4
        1010
        1010
        1010
        1010
         */

        System.out.println("incorpora un número");
        int number = scan.nextInt();

        int[][] arr1 = new int[number][number];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (j % 2 == 0) {
                    arr1[i][j] = 1;
                    System.out.print(arr1[i][j]);
                } else {
                    arr1[i][j] = 0;
                    System.out.print(arr1[i][j]);
                }

            }
            System.out.println();
        }



        /* solucion de clase

        String[][] nombres = {
                {"Vargas", "MAnuel", "Bojita", "Adan"},
                {"Julian", "Carlos", "Juan", "David"},
        };
        int alto;
        int ancho;
        String nombre = "";
        do {

            System.out.println("introduce la posicion de altura");
            alto = scan.nextInt();
            System.out.println("introduce la posicion de ancho");
            ancho = scan.nextInt();
           if (alto<2&&alto>=0&&ancho<4&&ancho>=0) {
               Syst
System.out.println("introduce un nombre");
               nombre = scan.next();
               nombres[alto][ancho] = nombre;
           }else{
               System.out.println("Posicion invalida");
               break;
           }



    }while(alto<2||alto>=0||ancho<3||ancho>=0);
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println(" ");
         */













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
