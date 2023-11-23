 import java.util.Scanner;

public class Boletin5 {

public static void main (String[] args){

    Scanner scan =new Scanner(System.in);


    /*1. Lea por pantalla dos numeros enteros y almacene en una variable el resultado
    de comprobar si el primero es superior al segundo multiplicado por dos.*/
    //System.out.println("Ingrese un valor");
    //int valor1= scan.nextInt();
   // System.out.println("Ingrese otro valor");
   // int valor2= scan.nextInt();
   // boolean PrimeroMayorASegundo= valor1>(valor2*2);
   // System.out.println(PrimeroMayorASegundo);

    /*2. Lea por pantalla una edad y almacene en una variable el resultado de comprobar
    si es mayor de edad.*/
   // System.out.println("¿Qué edad tienes?");
   // int edad= scan.nextInt();
   // boolean esMayorDeEdad= (edad>=18);
  ///  System.out.println(esMayorDeEdad);

    /*3. Repita pero comprobando si es menor de edad.*/
   //System.out.println("¿Qué edad tienes?");
   // int edad2= scan.nextInt();
   // boolean esMenorDeEdad= (edad2<18);
  //  System.out.println(esMenorDeEdad);

    /*4. Lea por pantalla un numero entero y almacene en una variable el resultado
    de comprobar si es par.*/
    //System.out.println("Ingresa un número entero.");
   // int numero= scan.nextInt();
   // numero= numero%2;
  //  boolean esPar= numero==0;
  //  System.out.println(esPar);
    /*5. Repita pero comprobando si es impar.*/
  //  System.out.println("Ingresa un número entero.");
  //  int numero2= scan.nextInt();
  //  numero2= numero2%2;
  //  boolean esImpar= numero2!=0;
 //   System.out.println(esImpar);
   /* 6. Lea por pantalla un numero y compruebe si está comprendido entre 0 y 100,
            ambos incluidos.*/
   // System.out.println("Ingresa un número.");
   // float numero3= scan.nextFloat();
  //  boolean Entre0y100= numero3>=0 && numero3<=100;
  //  System.out.println("¿Su numero está comprendido entre 0 y 100?"+ Entre0y100);

    //7. Lea por pantalla un numero y compruebe si es positivo y además impar.
  //  System.out.println("Ingresa un número entero.");
  //  int numero4= scan.nextInt();
   // boolean esPositivo= numero4>=0;
  //  System.out.print("¿Su numero es positivo?" + esPositivo);
 //   numero4=numero4%2;
   // boolean esImpar2= numero4!=0;
  //  System.out.println(" ¿Su numero es impar?"+ esImpar2);
    //8. Lea por pantalla un numero entero y compruebe si es el 3, el 7 o el 9.
  // System.out.println("Ingresa un número entero.");
   // int numero5= scan.nextInt();
   // boolean es3o7o9= numero5==3 || numero5==7 || numero5==9;
  //  System.out.println("¿Su numero es 3, 7 o 9? " + es3o7o9);

    /*Refuerzo:

   9. Crear un programa que imprima por pantalla las tablas de la verdad de:

    1. La operacion lógica NOT (este lo hará el profesor).
    2. La operación lógica OR.
    3. La operación lógica AND.*/

    System.out.println("TABLA DE LA VERDAD DE NOT");

    boolean p=true;
    boolean q=true;
    boolean notp= !p;
    boolean notq= !q;

    System.out.println("Si P es " + p + " y Q es " + q +" entonces no P es "+ notp + " y no Q es "+notq);

    p=true;
    q=false;
    notp= !p;
    notq= !q;

    System.out.println("Si P es " + p + " y Q es " + q +" entonces no P es "+ notp + " y no Q es "+notq);

    p=false;
    q=true;
    notp= !p;
    notq= !q;

    System.out.println("Si P es " + p + " y Q es " + q +" entonces no P es "+ notp + " y no Q es "+notq);

    p=false;
    q=false;
    notp= !p;
    notq= !q;

    System.out.println("Si P es " + p + " y Q es " + q +" entonces no P es "+ notp + " y no Q es "+notq);

    System.out.println("TABLA DE LA VERDAD DE OR");
   p=true;
   q=true;
   boolean or=p||q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ or);

    p=false;
    q=true;
    or=p||q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ or);

    p=true;
    q=false;
    or=p||q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ or);

    p=false;
    q=false;
    or=p||q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ or);

    System.out.println("TABLA DE LA VERDAD DE AND");
    p=true;
    q=true;
    boolean and=p && q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ and);

    p=false;
    q=true;
    and=p && q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ and);

    p=true;
    q=false;
    and=p && q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ and);

    p=false;
    q=false;
    and=p && q;

    System.out.println("Si P es " + p + " y q es " + q +" entonces "+ and);



} //main
}//class
