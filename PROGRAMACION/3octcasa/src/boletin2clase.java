public class boletin2clase {
  public static void main (String[] args){
/*EJERCICIO 1
1. Crea una variable de tipo entero y asígnale el valor 10. */
int entero=10;

    //2. Imprímela por pantalla.
    System.out.println(entero);
    //3. Decrementa su valor una vez.
   entero--;

    //4. Imprímela por pantalla.
      System.out.println(entero);

    //5. Multiplícalo por dos.

    entero *=2;


    //6. Réstale cuatro unidades.
    entero -=4;
    //7. Imprímela por pantalla.
      System.out.println(entero);
    //8. Incrementa su valor cuatro veces usando el operador de incremento (++).
      entero ++;
      entero ++;
      entero ++;
      entero ++;

    // 9. Imprímela por pantalla.
      System.out.println(entero);
    //10. Crea una segunda variable y asígnale el resultado de sumar una unidad a la primera.
     int sumada= (entero+1);

    // 11. Imprime las dos variables.
      System.out.println(entero + ","+sumada);

    //12. Divide la segunda entre dos.
    sumada /=2;

    //13. Imprime las dos variables y comprueba si el resultado es el correcto comparando con otros compañeros.
      System.out.println(entero);
      System.out.println(sumada);

/*EJERCICIO 2
Desarrollar un algoritmo para calcular el área de un rectángulo, cuya fórmula es base x altura.  Para ello: */

      //1. Cree una variable para almacenar el valor de la base, y asigne un valor.
      float base=2.5f;

      // 2. Cree una variable para almacenar el valor de la altura, y asigne un valor.
      float altura=1.5f;

      // 3. Cree una variable para almacenar el área, y utilice la fórmula anterior para asignarle el valor adecuado.
      float area= (base*altura);

      //4. Imprima por pantalla el área, utilizando una instrucción println.
      System.out.println("El área del rectángulo es: "+ area);
      //5. Tenga en cuenta que debe elegir el tipo adecuado para cada variable.
      /*EJERCICIO 3
      Desarrollar un algoritmo para convertir de euros a dólares teniendo en cuenta que un euro son  1.16 dólares. Para ello:*/

      //1. Cree una variable para almacenar el factor de conversión (1.16).
      float conversion= 1.16f;
      //2. Cree una variable para almacenar la cantidad de euros (no asigne ningún valor aún).
      float euros;
      // 3. Utilice una instrucción de asignación para darle un valor a la variable anterior.
      euros= 3.75f;
      // 4. Cree una variable para almacenar la cantidad de dólares, y asigne el resultado de multiplicar el factor de conversión por la cantidad de euros.
      float dolares;
      dolares= (euros*conversion);
      //5. Imprima por pantalla el resultado, utilizando una instrucción println.
      System.out.println(euros + " euros, son en total: " + dolares + " dólares.");

      /*EJERCICIO 4
      Modifique el ejercicio 2 para ahorrarnos la creación de la variable del área. Para ello: */
      //elimine dicha variable, y ponga en la instrucción println la fórmula del área directamente.
      System.out.println(base*altura);

      /*EJERCICIO 5
      Modifique el ejercicio 3 para ahorrarnos la creación de la variable del factor de conversión.*/
      dolares= (euros*1.16f);
      System.out.println(dolares);

      //        EJERCICIO 6
     // 1. Cree una variable de tipo entero y asigne el valor 3.
      int valor= 3;
     // 2. Decremente su valor tres veces con el operador de decremento (- -).
      valor --;
      valor --;
      valor --;

      System.out.println(valor);
     // 3. Incremente su valor 6 unidades con el operador de suma simplificada (+=).
     valor +=6;
      System.out.println(valor);
      // 4. Incremente su valor en una unidad utilizando el operador de incremento (++).
      valor ++;
      System.out.println(valor);
      // 5. Duplique su valor como desee.
      valor *=2; //variable=variable*2
      System.out.println(valor);

      //6. Utilice el operador módulo (%) para comprobar el resto de dividir la variable entre 2, imprimiendo por pantalla el resultado.

      valor %=2;
      System.out.println(valor);

      //7. ¿Cómo se puede comprobar si un número es par o impar?
      //Si el resultado del operador anterior es = a 0, será que es par. Si es cualquier otro valor, es impar.

     boolean esPar= (valor==0);
      System.out.println(esPar);






  }//main

}//class
