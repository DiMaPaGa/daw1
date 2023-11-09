import java.util.Scanner;

public class actividadclase7nov {

    public static void main (String []args){

        Scanner scan =new Scanner(System.in);


        //8.	Leer por pantalla un entero e imprimirlo elevado a la quinta potencia. Utilizar un bucle para realizar el cálculo.

       /* System.out.println("Ingresa un número");
        int numero= scan.nextInt();
        int resultado=1;


        for (int i=0; i<5;i++){
            resultado= resultado *numero;
        }
        System.out.println(resultado);*/

       // 9.	Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe elevarse el número.

       /* System.out.println("Ingresa un número");
        int numero= scan.nextInt();
        System.out.println("A qué potencia");
        int potencia= scan.nextInt();
        int resultado=1;


        for (int i=0; i<potencia;i++){
            resultado= resultado *numero;
        }
        System.out.println(resultado);*/

    // 10.	Leer por pantalla un número n, e imprimir por pantalla una fila de asteriscos con tantas columnas como diga n.

      /*  System.out.println("Dí un número");
        int estrellas= scan.nextInt();

        for (int i=0; i<estrellas; i++){
            System.out.print("*");
        }*/

        //11.	Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.
        // ejemplo para n = 4
       /* System.out.println("Dí un número");
        int estrellas= scan.nextInt();

        for (int i = 0; i < estrellas; i++) {
            for (int j = 0; j < estrellas; j++) {
                System.out.print("*"); //incorpora las estrellas en la linea
            }
            System.out.println(); //salta a la siguiente
        }*/

// 12.	Leer por pantalla un numero n, e imprimir por pantalla un cuadrado cuya altura viene dada por n.
       /* System.out.println("Dí un número");
        int estrellas= scan.nextInt();

        for (int i = 0; i < estrellas; i++) {
            for (int j = 0; j < estrellas; j++) {
                if (i==0|| j==0 || i == estrellas-1 || j==estrellas-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/

        //13.	Leer por pantalla un número n, e imprimir por pantalla un triángulo cuya altura viene dada por n.

       /* System.out.println("Escribe un número");
        int triangulo= scan.nextInt();

        for (int i=0; i<triangulo; i++) {
            for (int j=0; j< triangulo;j++){
                if (i==j||j<i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }*/
// pirámide Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo número de niveles viene dado por
      /*  System.out.println(" escribe un número");
    int piramide= scan.nextInt(); //i=altura y j espacios k asteriscos

        for (int i=0; i<piramide; i++) {
            for (int j=0; j< piramide -i;j++){
                    System.out.print(" ");
                }
            for (int k=1; k<=(i*2)-1; k++){
                System.out.print("*");

                }
            System.out.println();
            }*/

   // 1.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números positivos. Por ejemplo, para n=5 debe imprimir 1 2 3 4 5

     /*   System.out.println("Escriba un número");
        int n= scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);

        }*/



        //2.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números pares. Por ejemplo, para n=5 debe imprimir 2 4 6 8 10

      /*  System.out.println("Escriba un número");
        int n= scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i*2+ " ");

        }*/

        //3.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números impares. Por ejemplo, para n=5 debe imprimir 1 3 5 7 9
   /* System.out.println("Escriba un número");
        int n= scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i*2)-1+ " ");

        }*/

        // 4.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números cuadrados. Por ejemplo, para n=5 debe imprimir 1 4 9 16 25

/*System.out.println("Escriba un número");
        int n= scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i*i)+" ");

        }*/

        // 5.	Escriba un programa que lea por pantalla un número entero n, e imprima
        // la suma de los n primeros números positivos. Por ejemplo, para n=5 debe imprimir 1+2+3+4+5=15

       /* System.out.println("Escriba un número");
        int n= scan.nextInt();
        int sumatorio=0;

        for (int i = 1; i <= n; i++) {

                if (i==n){
                    System.out.print(i+ "=");
                    sumatorio=i+sumatorio; //tambien puede ponerse solo resultado +=i;
                } else{
                    System.out.print(i+ "+");
                    sumatorio=i+sumatorio;
                }
        }
        System.out.print(sumatorio);*/



        //6.	Escriba un programa que lea por pantalla dos números entero m y n, e imprima el número m repetido n veces. Por ejemplo, para m=8 y n=5 debe imprimir 8 8 8 8 8

     /*   System.out.println("Escriba un número");
        int m= scan.nextInt();
        System.out.println("Escriba otro");
        int n= scan.nextInt();

        for (int i=0; i<n; i++) {
            if (i==n-1){
                System.out.print(m);
            } else {
                System.out.print(m +" ");
            }
            }*/
// 7.	Escriba un programa que lea por pantalla un número n, e imprima una cuenta atrás. Por ejemplo, para n=5 debe imprimir
//5
//4
//3
//2
//1
//0
      /*  System.out.println("Escribe un número");
        int n= scan.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }*/


   //     8.	Escriba un programa que lea por pantalla dos números entero m y n, e imprima la letra ‘M’ repetida m veces y la letra ‘N’ repetida n veces.
        //     Por ejemplo, para m=8 y n=5 debe imprimir M M M M M M M M N N N N N

      /*  System.out.println("Escriba cuántas M");
        int m= scan.nextInt();
        System.out.println("Escriba cuántas N");
        int n= scan.nextInt();

        int total= m+n;
        for(int i=1;i<=total;i++) {
            if(i<=m){
                System.out.print("M ");
            }
            else  if (i==total){
                System.out.print("N");
            } else {
                System.out.print("N ");
            }
        }*/

// 9.	Escriba un programa que lea por pantalla un número n, e imprima los n primeros términos
// (con n >= 0) de la sucesión 4n+3. Por ejemplo, para n=4 debe imprimir 3 7 11 15

     /*   System.out.println("Escribe un número");
        int n= scan.nextInt();
        int resultado=0;

        for (int i = 0; i < n;i++) {
            System.out.print(4*i+3+ " ");
        }*/

    } //main






} //class
