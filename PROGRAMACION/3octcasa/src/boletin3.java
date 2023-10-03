import java.util.Scanner;

public class boletin3 {
    public static void main (String[] args){
Scanner scan =new Scanner(System.in);

/* Copia y pega los enunciados de cada ejercicio en IntelliJ y coméntalos. Tras
terminar cada uno y comprobar que está bien, comenta su código y pasa al
siguiente. Es muy importante en este boletin que comente el código anterior.*/

/*1. Lee por pantalla una altura y almacénala en una variable. Imprime la variable
por pantalla.*/

       // int altura;
       // System.out.println("Indica tu altura en centimetros");
       // altura= scan.nextInt();
       // System.out.println("Mides "+altura);
        //Es indispensable tras importar Scanner, crear variable, hacer llamada al cliente para
        //que ingrese el valor, otorgarle este valor a la variable previamente creada y finalmente
        //implrimirla.


/*2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable
por pantalla.*/
        //int edad;
       // System.out.println("Indica tu edad en años");
       // edad= scan.nextInt();
        //System.out.println("Tienes "+edad);
        //Hago un procedimiento similar a la actividad anterior.

//3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?
        System.out.println("Indica tu altura en centimetros");
        System.out.println("Mides "+scan.nextInt());
        System.out.println("Indica tu edad en años");
        System.out.println("Tienes "+scan.nextInt());
        //Sí se puede. Dejo las llamadas al cliente y tras incorporar sus datos, los imprimo directamente
        //por pantalla utilizando el método scanner.nextInt()
//4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.
        System.out.println("Indica tu temperatura");
        float temperatura= scan.nextFloat();
        System.out.println("Tu temperatura es  "+ temperatura);

//4.b Repite pero imprimiendo por pantalla en grados Kelvin (hay que convertir).
        System.out.println("Tu temperatura en grados Kelvin es  "+ (temperatura*273.15f));
        //como sólo queremos que salga por pantalla, convierto el valor de temperatura multiplicando directamente
        //por el convertidor a Kelvin =273.15)
/*5. Crea un programa que calcule el área de un rectángulo (base x altura),
pidiendo por pantalla los datos necesarios.*/
float base;
float altura;
        System.out.println("Indica cuánto mide la base");
        base= scan.nextFloat();
        System.out.println("Indica cuánto mide la altura");
        altura= scan.nextFloat();
        System.out.println("El área de tu rectángulo es "+(base*altura));

/*6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo
por pantalla los datos necesarios.*/
float peso;
float tualtura;
            System.out.println("Indica cuánto pesas en kilogramos");
            peso= scan.nextFloat();
            System.out.println("Indica cuánto mides en metro");
            tualtura= scan.nextFloat();
            System.out.println("Tu IMC es "+(peso/(tualtura*tualtura)));

/*7. Crea un programa que lea el precio sin IVA de un producto e imprima
el valor final con IVA del mismo.*/

/*8. Crea un programa que lea el precio sin IVA de tres productos e imprima
el valor total con IVA que paga el comprador, así como el valor medio con y sin
IVA.*/

/*9. Crea un programa que lea el nombre de una persona, y a continuación su edad
y altura, e imprima todo por pantalla en una misma línea. ¿Funciona?*/

/*10. Repita el ejercicio anterior pero leyendo primero los numeros y después
el nombre. ¿Funciona?*/



    }//main
}//class
