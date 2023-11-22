import java.util.Scanner;

public class Ejercicio3Simulacro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* System.out.println("introduzca un valor para el tamaño de su banderín");
        int n= scan.nextInt();
        String rojo="\033[0;31m";
        String amarillo="\033[0;33m";
        String reset="\033[0m";*/

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

       /* Lea un entero que represente un año (puede ser un número negativo). Dependiendo del valor de dicho número, debe imprimir los siguientes mensajes:
        -	Valor inferior a cero: “prehistoria”.
        -	Valor desde cero hasta 800: “pre-edad media”.
        -	Valor desde 801 hasta 1599: “edad media”.
        -	Valor desde 1600 hasta 1899: “pre-edad moderna”,
        -	Valor desde 1900 hasta la actualidad (2023): “edad moderna”




        Lea dos números enteros por pantalla, que llamaremos num1 y num2. Suponga que ambos números son positivos, es decir, no realice validación para ello.
        Decremente al entero num1 el valor del entero num2 tantas veces como sea necesario, hasta que num1 sea cero o negativo. Cuando esto ocurra, el algoritmo termina y se imprime el valor final de num1 junto con la cantidad de veces que se le ha restado num2.
*/
      /*  int cont = 0;
        System.out.println("Introduce un numero");
        int num_1 = scan.nextInt();

        System.out.println("Introduce otro numero");
        int num_2 = scan.nextInt();

        do {
            num_1 -= num_2;
            cont ++;

        }while (num_1 > 0);

        System.out.println(" el numero1 es: " + num_1 +  " y se ha restado: " + cont + " veces");*/

        /*
        Introducir por pantalla un numero y que imprima todas las iteraciones desde 1 hasta el numero introducido.
        Debe mostrar por pantalla un formato asi, en este caso introduciendo el 6:
        1
        22
        333
        4444
        55555
        666666 Igual si imprimiera asteriscos
         */

        System.out.println("Introduce un número");
        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        /*Se quiere desarrollar un programa que simule las opciones de menú de un cajero de un
banco, y en base a la opción que elija, realizará una operación u otra.
Los requerimientos del menú son los siguientes:
Hacer que el usuario meta por pantalla un número entre 0 y 4. Según el caso, el
programa realizará la siguiente impresión por pantalla:
0 -> Saliendo del cajero.
1 -> Su saldo es *saldo*.
2 -> Ha ingresado *ingreso*. Su saldo es *saldo*.
3 -> Ha retirado *retiro*. Su saldo es *saldo*.
Los valores que están entre * son las variables que se deben introducir por pantalla.
Si el usuario introduce un número que no está en estos casos, se deberá imprimir por
pantalla el siguiente mensaje:
"Error, número fuera de rango".
Una vez se haga todo este proceso, volver a repetir los requerimientos mientras que el
usuario no haya introducido el número 0.*/

        int eleccion = 0;
        int saldo = 1000;
        int retirada = 0;
        int ingreso= 0;

        do {
            System.out.println("¿Qué desea hacer? 0=salir del cajero; 1= Ver su saldo; 2= Ingresar dinero; 3= retirar saldo");
            eleccion = scan.nextInt();

            switch (eleccion) {
                case 0:
                    System.out.println("Saliendo del cajero");
                    break;

                case 1:
                    System.out.println("su saldo es " + saldo + " euros");
                    break;

                case 2:
                    System.out.println("¿Cuánto desea ingresar?");
                    ingreso = scan.nextInt();
                    saldo = saldo + ingreso; // o saldo +=ingreso.
                    System.out.println("Ha ingresado " + ingreso + " euros. Su saldo actual es de " + saldo + " euros.");
                    break;

                case 3:
                    System.out.println("¿Cuánto dinero desea retirar?");
                    retirada = scan.nextInt();
                    saldo = saldo - retirada; //tambien vale saldo -= retirada.
                    System.out.println("Tras su retirada, su saldo actual es " + saldo + " euros.");
                    break;

                default:
                    System.out.println("Error, número fuera de rango");
                    break;

            }
        } while (eleccion != 0);

        /* Sumar numeros pares. Crea un programa que te pida introducir un numero, suponemos que sea positivo, y que
        muestre cuantos numeros pares hay desde el 1 hasta el numero introducido, mostrando por pantalla el resultado.*/

        System.out.println("introduce un número");
        int digito= scan.nextInt();
        int contador=0;
        int resultado=0;

        while (resultado>0) {
            resultado=digito/2;
            contador++;

        }
        System.out.println(" Contiene" + contador + " número pares.");


    }
}
