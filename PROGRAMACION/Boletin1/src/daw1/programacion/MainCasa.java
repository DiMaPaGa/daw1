package daw1.programacion;

public class MainCasa {

 public static void main(String[] args) {

 // 1. Imprime por pantalla tu nombre.

   //Para esta actividad puedo, directamente crear un System.out.print añadiendo un String con mi nombre:
  System.out.println("Diana");
  /*o bien, crear una variable String denominada miNombre, a la que le añada mi nombre como valor y luego
  llamarla:*/

  String miNombre="Diana";
     System.out.println(miNombre);


//2. Imprime por pantalla tu nombre y dos apellidos, cada uno en una línea.
     /*De nuevo puedo, directamente crear tres System.out.println añadiendo un String a cada uno con los
      datos solicitados: */

     System.out.println("Diana");
     System.out.println("Pascual");
     System.out.println("Garcia");

     /*o bien, mantener la variable String miNombre de la actividad anterior y crear otras dos que sean,
     apellido1 y apellido2. Y seguidamente, los llamo desde diferentes Sistem.out.Println*/
     String apellido1="Pascual";
     String apellido2="Garcia";

     System.out.println(miNombre);
     System.out.println(apellido1);
     System.out.println(apellido2);

// 3.a Repite el ejercicio anterior pero imprimiendo todo en la misma línea.
//Puedo ponerlo todo en un único System.out.print

     System.out.println("Diana Pascual Garcia");
//Tambien puedo crear la variable String miNombreYApellidos para llamarla.

     String miNombreYApellidos= "Diana Pascual Garcia";
     System.out.println(miNombreYApellidos);

/*3.b Repite el ejercicio anterior imprimiendo todo en la misma línea, usando
 tres instrucciones de impresión.*/
/*Hago lo mismo que en la actividad 2, solo que eliminando 'ln' del final del comando.
Añado un espacio al final de los dos primeros String.
 Como excepción, si he añadido ln en la última llamada para que no se acople la
 llamada de la siguiente actividad*/

     System.out.print("Diana ");
     System.out.print("Pascual ");
     System.out.println("Garcia");
//También puedo llamarlas desde las variables creadas antes, pero añadiendo un espacio como string:

     System.out.print(miNombre+" ");
     System.out.print(apellido1+" ");
     System.out.println(apellido2);
 //4. Imprime tu edad.

     //De nuevo, puedo crear un System.out.print añadiendo un String con mi edad:
     System.out.println(39);
  /*o bien, crear una variable int denominada miEdad, a la que le añada mi edad como valor y luego
  llamarla:*/

     int miEdad = 39;
     System.out.println(miEdad);

//5. Imprime el primer digito de tu edad en una línea, y el segundo en otra.

     System.out.println(3);
     System.out.println(9);
/*o bien, crear dos variables int denominada miEdadDecada y MiEdadUnidad, inicializarlas y luego
  llamarlas:*/

     int miEdadDecada = 3;
     int miEdadUnidad = 9;

     System.out.println(miEdadDecada);
     System.out.println(miEdadUnidad);

/*6. Imprime el primer digito de tu edad. Tras ello y con una nueva instrucción,
 imprime el segundo. Tienen que aparecer ambos en la misma línea.*/

//Lo hago igual, solo que la primera llamada termina en print, quitando ln;

     System.out.print(3);
     System.out.println(9);

 //O de nuevo, hacerlo llamando a los valores de las variables miEdadDecada y miEdadUnidad;

     System.out.print(miEdadDecada);
     System.out.println(miEdadUnidad);

 /*7. Imprime al revés tu nombre, de forma que cada letra aparezca en una línea.
 Por ejemplo, en mi caso (Jorge) la salida del programa sería:
 e
 g
 r
 o
 J*/
 //Simplemente, debo cuidar que cada llamada incorpore ln tras el print
     System.out.println("a");
     System.out.println("n");
     System.out.println("a");
     System.out.println("i");
     System.out.println("D");
 /*8. Repite lo anterior, pero entre cada letra debe aparecer una línea en blanco.
 Por ejemplo, en mi caso (Jorge) la salida del programa sería:
e

g

r

o

J*/
/*Además de lo contemplado en la actividad anterior, debo incorporar un espacio tras cada letra
 dentro del string*/

     System.out.println("a\n");
     System.out.println("n\n");
     System.out.println("a\n");
     System.out.println("i\n");
     System.out.println("D\n");

/*9. Imprime por pantalla tu nombre concatenándolo con tu edad, de forma que quede
un espacio en blanco entre ambos.*/

    System.out.println("Diana "+39);
    System.out.println(miNombre+" "+39);

/*10. Imprime por pantalla el número 3 concatenándolo con el número 7. Comprueba
si tu compañero lo ha hecho igual que tú.*/

    System.out.println("3"+7);

    /*11. Imprime por pantalla la cadena "Hola mundo" y a continuación, la cadena
"Hola\nmundo". ¿Para qué sirve el '\n'? ¿Puede utilizarse varias veces seguidas?*/

    System.out.println("Hola mundo");
    System.out.println("Hola\nmundo");
    System.out.println("Hola\n\nmundo");

    //sirve para incorporar un salto de línea. Y se puede emplear varias veces de seguida.
//12. ¿Para qué sirve el operador '+'?
  /* Puede tener dos usos: Para concatenar elementos o variables en el caso de que sean de diferente naturaleza
   (como por ejemplo, un String con un valor int), o bien, para sumar dos datos o variables inicializadas con datos
   del mismo tipo (Ejemplo, dos Int o dos Float).
   */
    } //main
}//class
