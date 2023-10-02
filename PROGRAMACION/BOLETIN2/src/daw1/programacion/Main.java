package daw1.programacion;

public class Main {

    public static void main(String[] args) {
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
     var++;
     var++;
     var++;
     var++;

     System.out.print(valor);

     //4. Crear otra variable entera y asignarle el valor 48.76.

     float entera=48.76f;
     int var2=(int)48.76;

     //5. Modificarla dividiendo por 50 e imprimir el resultado por pantalla.

     entera /=50;
     System.out.println(entera);

     //6. Modificarla sumándole 1 y multiplicando por 48 e imprimir el resto de dividirla entre 46.

     float resultado;
     resultado = ((entera + 1) * 48f) / 46;
     System.out.println(resultado);
     //tambien puede hacerse sin necesidad de quedar nueva variable: ¡Ojo! el enunciado te pide el resto.

     entera +=1;
     entera *=48;
     System.out.println(entera%46);


     //7. Sin modificar el valor de la variable, imprimir por pantalla el resultado de elevarla al cuadrado.

     System.out.println(resultado*resultado);

     //8. Crear dos variables de tipo float, dándoles un valor inicial e imprimiéndolas por pantalla.

     float valor1=3.09f;
     float valor2=2.34f;
     System.out.println(valor1);
     System.out.println(valor2);
     System.out.printf(valor1+ ","+ valor2);
    }
}
