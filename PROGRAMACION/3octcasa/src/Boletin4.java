import java.sql.SQLOutput;

public class Boletin4 {
    public static void main (String[] args){

//Ejercicio 1.
/* Crea variables del tipo adecuado para almacenar tu nombre, apellido1, apellido2, DNI,
edad, género y estado (solter@ o casad@). A continuación, imprime los datos por
pantalla, cada uno en una línea.*/

    String nombre= "Diana";
    String apellido1="Pascual";
    String apellido2="García";
    String DNI="30229753W";
    int edad=39;
    String genero="Mujer" ;
    boolean EstasCasado= false;
        System.out.println(nombre+ "\n" + apellido1 + "\n" + apellido2 + "\n" + DNI + "\n" + edad + "\n" + genero + "\n" + EstasCasado );

//Ejercicio 2.
/*Modifica el ejercicio anterior para imprimir todos los datos en una única línea, usando
el operador de concatenación +. Busque información para concatenar cadenas por
internet si lo necesita.*/

        System.out.println(nombre+ " " + apellido1 + " " + apellido2 + " " + DNI + " " + edad + " " + genero + " " + "¿estas casad@? " + EstasCasado );

//Ejercicio 3.
/*Se tiene la nota de tres alumn@s almacenada en tres variables. Imprima por pantalla
la nota media.*/

        float notaAlum1= 8.5f;
        float notaAlum2= 8.5f;
        float notaAlum3= 8.5f;
        System.out.println("La nota media es "+ ((notaAlum1+notaAlum2+notaAlum3)/3));

//Ejercicio 4.
/*Se tiene la nota de l@s dos mejores alumn@s en dos variables. Imprima por pantalla si
la primera nota es superior a la segunda.*/


        float mejorNota1=10f;
        float mejorNota2=9.9f;

        System.out.println("¿Es la primera nota mejor que la segunda?: " + (mejorNota1>mejorNota2));

//Ejercicio 5.
/*Cree una variable de tipo char y asigne el valor ‘A’ (tenga cuidado de usar comillas
simples y no las copie desde este fichero). Imprima la variable por pantalla. A
continuación, ejecute el operador de incremento (++) sobre la variable. Vuelva a
imprimir la variable por pantalla. Repita hasta tres veces más este proceso. ¿Cuál es la
letra que se imprime al final?*/

        char letra= 'A';
        System.out.println(letra);
        letra++;
        System.out.println(letra);
        letra++;
        letra++;
        letra++;
        System.out.println(letra);

//Ejercicio 6.
/*Se necesita calcular el área de un círculo. Busca por internet la fórmula e impleméntala
usando los tipos de variables más adecuados. Mediante una variable de nombre radio,
comprueba distintos valores.*/

//float radio=5;
//float area= (float)Math.PI*(radio*radio); //He elegido float porque para este ejercicio no necesito un nivel de precisión por encima de los 5 decimales.
       // System.out.println(area);

 // float radio=5;
 // double area= Math.PI*(radio*radio)
 // System.out.println(area);

 //float radio=5;
 //float pi=3.1416f;
 //float area=pi*(radio*radio);
      // System.out.println(area);

//Ejercicio 7.
/*Se necesita calcular el perímetro de un círculo. Busca por internet la fórmula e
impleméntala usando los tipos de variables más adecuados. Mediante una variable de
nombre radio, comprueba distintos valores.*/

float radio=2.5f;
float perimetro=(float)(2*Math.PI)*(radio*radio); //He elegido float porque para este ejercicio no necesito un nivel de precisión por encima de los 5 decimales.
        System.out.println(perimetro);

 // ¡¡ Ojo!!  Tener en cuenta que si queremos que una variable booleana tome un cambio de valor, tras el cambio del valor en una de las variables, hay
        // que volver a formularla para que salga correctamente.

//Ejercicio 8.
/* Cree una variable de tipo char y asigne el valor ‘M’, y otra también de tipo char y
asigne el valor ‘P’. Utilice el operador de comparación <; dentro de una instrucción
System.out.println para comprobar si la primera variable es menor que la segunda.
¿Qué se imprime por pantalla?*/

char letra2= 'M';
char letra3= 'P';
        System.out.println(letra2<letra3);//Me sale true.

//Ejercicio 9.
/* Cree dos variables de tipo entero y asigne dos valores cualesquiera. Compruebe si la
primera es superior al doble de la segunda, e imprima por pantalla dicha comparación.*/


int entero1=2;
int entero2=3;
boolean entero1MayorEntero2= entero1>(entero2*2);
        System.out.println(entero1MayorEntero2);

//Ejercicio 10.
/* Cree dos variables de tipo entero, asigne a la primera un valor distinto de cero y a la
segunda el valor cero. Imprima por pantalla el resultado de dividir la primera entre la
segunda. ¿Qué es lo que ocurre? ¿Qué se muestra por pantalla? Cuando termine el
ejercicio, comente el código.*/


 int var1=2;
 int var2=0;
      //  System.out.println(var1/var2); por pantalla de muestra un error de excepción
        //  aritmética, dado que no se puede dividir ninguna cantidad entre 0.

//Ejercicio 11.
/*Introduzca comentarios de una única línea antes de cada ejercicio resuelto, de forma
que aparezca el número del ejercicio.*/

//Ejercicio 12.
/*Introduzca comentarios multilínea antes de cada ejercicio resuelto y debajo de los
comentarios de una línea, de forma que aparezca el enunciado del ejercicio.*/


//Ejercicio 13.
/*13. Cree una variable que almacene la edad de un señor, y compruebe si ese señor
pertenece a la cuarta edad, es decir, si tiene más de cien años. Imprima por pantalla el
resultado.*/

 int edadSeñor=101;
        System.out.println(edadSeñor>100);

//Ejercicio 14.
/* Cree una variable de tipo entero y almacene el resultado de 2/3. A continuación, cree
una variable de tipo double y almacene el resultado de 2.0/3. Compruebe si ambos
resultados son exactamente iguales, e imprima por pantalla dicha comprobación.*/

 int division= 2/3;
 double divDouble= 2.0/3;
        System.out.println("El resultado con entero da: "+ division + " mientras que con double da: " + divDouble);

//Ejercicio 15.
/*Cree una variable de tipo double, asígnele un valor y elévela al cuadrado. Realice este
ejercicio como mínimo de tres formas distintas.*/

double varDouble= 5;
        System.out.println(varDouble*varDouble);
        System.out.println(Math.pow(varDouble,2));
double cuadrado=varDouble*varDouble;
        System.out.println(cuadrado);

//Ejercicio 16.
/* Cree una variable de tipo double y de nombre facturaLuz, y asigne un valor entre 50 y
90. Multiplíquela por 99999999999999999999999 para obtener el nuevo precio de la
factura de la luz e imprima por pantalla. ¿Qué ocurre?*/

double facturaLuz=82;
      //  System.out.println(facturaLuz*99999999999999999999999); El número es demasiado largo.

//Ejercicio 17.
/* Modifique el valor anterior hasta encontrar un valor lo más grande posible que haga
que el programa se ejecute correctamente. ¿Cuántas cifras ha podido usar? ¿Qué
número se ha impreso por pantalla?*/

        System.out.println(facturaLuz*999999999); //Sólo he podido usar 9 cifras.
        // Por pantalla sale 8.1999999918E10 que es un exponencial, por lo que la cantidad real es
        // 81999999918 euros.

//Ejercicio 18.
/* Se tiene la fecha de nacimiento de una persona almacenada en tres variables (día,
mes, año). Dicha persona intenta entrar en la web del videojuego DIABLO IV, pero la
entrada está solo permitida a personas nacidas antes del 01/01/2003. Imprima por
pantalla si la persona podrá entrar en la web.*/

int dia= 15;
int mes= 3;
int anyo=1984;
boolean tengoEdadDIABLO= (anyo<=2003);
        System.out.println(tengoEdadDIABLO);

//Ejercicio 19.
/* Tras probar la anterior web, intenta entrar en la web del ministerio de economía para
ver si tiene acceso a becas. Únicamente pueden optar a becas aquellas personas
nacidas del 01/01/2003 en adelante. Imprima por pantalla si tiene derecho a beca.*/

boolean tengoEdadBecas= (anyo>=2003);
        System.out.println(tengoEdadBecas);

//Ejercicio 20.
/*20. Imprima por pantalla si hoy es el cumpleaños de dicha persona.*/

boolean hoyCumpleaños= (dia==6 && mes==10 && anyo==2023);
        System.out.println("¿Es tu cumpleaños?: "+ hoyCumpleaños);

//Ejercicio 21.
/* Imprima por pantalla si la persona es un milenial (busque en Wikipedia la fecha de
nacimiento de dicha generación).*///entre 1981 y 1997

boolean eresMilennial= (anyo>=1981 && anyo<=1997);
        System.out.println("¿Eres Milennial? " + eresMilennial);
//Ejercicio 22.
/* Se tiene la fecha de nacimiento de otra persona. Dos personas son de la misma
generación si la diferencia de los años de nacimiento esta entre 0 y 5 o entre -5 y 0.
Imprima por pantalla si ambos son de la misma generación.*/
int anyo2=1997;
int limiteSuperior= (anyo+5);
int limiteInferior= (anyo-=5);
boolean sonMismaGeneracion= (anyo2>=limiteInferior) && (anyo2<=limiteSuperior);
        System.out.println("¿Son de la misma generación? "+ sonMismaGeneracion);




    } //main
}//class
