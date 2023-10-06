public class boletin2 {
    public static void main (String[] args){

        /* ej.1 1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.
    ¿Qué se ha impreso?*/

        //int edad;
        //System.out.println(edad);

        //Imprime un error al no encontrarse la variable inicializada.

    /*2.a Crear una variable entera con el valor 0. Incrementar su valor en 3 unidades utilizando el operador
    de suma + y asignación =, e imprimirla por pantalla.*/

        int valor=0;
        valor +=3;
        System.out.println(valor);

        //2.b Decrementar su valor en una unidad utilizando el operador de decremento --. Imprimirla por pantalla.

        valor--;
        //o valor -=1;
        System.out.println(valor);

     /*3. Incrementar su valor en 4 unidades sin utilizar el operador de suma + y asignación =, e imprimirla
     por pantalla (no puede usar el =).*/

        valor++;
        valor++;
        valor++;
        valor++;

        System.out.println(valor);

//4. Crear otra variable entera y asignarle el valor 48.76.

        float valor2=(int)48.76;

        //5. Modificarla dividiendo por 50 e imprimir el resultado por pantalla.

        valor2 /=50;
        System.out.println(valor2);

        //6. Modificarla sumándole 1 y multiplicando por 48 e imprimir el resto de dividirla entre 46.

        //tambien puede hacerse sin necesidad de quedar nueva variable: ¡Ojo! el enunciado te pide el resto.

        valor2 +=1;
        valor2 *=48;
        System.out.println(valor2%46);


        //7. Sin modificar el valor de la variable, imprimir por pantalla el resultado de elevarla al cuadrado.

        System.out.println(valor2*valor2);

        //8. Crear dos variables de tipo float, dándoles un valor inicial e imprimiéndolas por pantalla.

        float ejemplo=1.09f;
        float prueba=2.34f;
        System.out.println(ejemplo);
        System.out.println(prueba);
        System.out.println(ejemplo+ ","+ prueba);
        //9. Imprimir por pantalla el resultado de comprobar si la primera es mayor que la segunda.


        boolean ejemploMayorPrueba = ejemplo>prueba;
       // System.out.println(ejemploMayorPrueba);
        System.out.println(ejemplo>prueba);

        /*10. Cambiar la primera con el valor de la segunda multiplicado por dos, y volver a imprimir por pantalla
        el resultado de la comprobación anterior.*/

        ejemplo=(2*prueba);
        System.out.println(ejemplo);
        System.out.println(prueba);
        ejemploMayorPrueba= ejemplo>prueba;

        //System.out.println(ejemploMayorPrueba);
        System.out.println(ejemplo>prueba);

       // 11. Imprimir por pantalla el resultado de comprobar si la primera es menor o igual que la segunda.
        //System.out.println(!ejemploMayorPrueba);
        System.out.println(ejemplo<=prueba);


        /*12. Repetir el ejercicio anterior pero almacenando el resultado de la comprobación
        en una variable, e imprimiendo después por pantalla dicha variable.*/
        ejemploMayorPrueba= ejemplo>prueba;
        System.out.println(ejemploMayorPrueba);

      /*ejemploMayorPrueba=!ejemploMayorPrueba;
      System.out.println(ejemploMayorPrueba);*/



    }//main
}//class
