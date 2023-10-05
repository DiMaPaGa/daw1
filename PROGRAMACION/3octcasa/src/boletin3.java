import java.util.Scanner;

public class boletin3 {
    public static void main (String[] args){
Scanner scan =new Scanner(System.in);

/* Copia y pega los enunciados de cada ejercicio en IntelliJ y coméntalos. Tras
terminar cada uno y comprobar que está bien, comenta su código y pasa al
siguiente. Es muy importante en este boletin que comente el código anterior.*/

/*1. Lee por pantalla una altura y almacénala en una variable. Imprime la variable
por pantalla.*/

      // System.out.println("Indica tu altura en centimetros");
        // int altura= scan.nextInt();
       // System.out.println("Mides "+altura);
        //Es indispensable tras importar Scanner, crear variable, hacer llamada al cliente para
        //que ingrese el valor, otorgarle este valor a la variable previamente creada y finalmente
        //imprimirla.


/*2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable
por pantalla.*/
        //int edad;
       // System.out.println("Indica tu edad en años");
       // edad= scan.nextInt();
        //System.out.println("Tienes "+edad + " años");
        //Hago un procedimiento similar a la actividad anterior.

//3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?
       /* System.out.println("Indica tu altura en centimetros");
        System.out.println("Mides "+scan.nextInt()+ " centimetros"); //lo peor de hacerlo así es que no se guarda el valor
        System.out.println("Indica tu edad en años");
        System.out.println("Tienes "+scan.nextInt()+ " años.");
        //Sí se puede. Dejo las llamadas al cliente y tras incorporar sus datos, los imprimo directamente
        //por pantalla utilizando el método scanner.nextInt()*/
//4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.
       /* System.out.println("Indica tu temperatura");
        float temperatura= scan.nextFloat();//tambien podría haber sido int
        System.out.println("Tu temperatura es  "+ temperatura + grados Celsius);*/

//4.b Repite pero imprimiendo por pantalla en grados Kelvin (hay que convertir).
        /*System.out.println("Tu temperatura en grados Kelvin es  "+ (temperatura+273.15f));
        //como sólo queremos que salga por pantalla, convierto el valor de temperatura sumando directamente
        //por el convertidor a Kelvin =273.15)*/

/*5. Crea un programa que calcule el área de un rectángulo (base x altura),
pidiendo por pantalla los datos necesarios.*/
/*float base;
float altura;
        System.out.println("Indica cuánto mide la base");
        base= scan.nextFloat();
        System.out.println("Indica cuánto mide la altura");
        altura= scan.nextFloat();
        System.out.println("El área de tu rectángulo es "+(base*altura));*/

/*6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo
por pantalla los datos necesarios.*/
/*float peso;
float tualtura;
            System.out.println("Indica cuánto pesas en kilogramos");
            peso= scan.nextFloat();
            System.out.println("Indica cuánto mides en metro");
            tualtura= scan.nextFloat();
            System.out.println("Tu IMC es "+(peso/(tualtura*tualtura)));*/
            //Hay una forma alternativa de subir al cuadrado que es :Math.pow(numero que
            // queremos elevar, numero por el que queremos elevar Ejemplo. queremos elevar 3
            // al cuadrado, seria Math.pow(3,2);

/*7. Crea un programa que lea el precio sin IVA de un producto e imprima
el valor final con IVA del mismo.*/
        /*float precioSinIVA;
        float IVA=1.21f;
        System.out.println("Indica el precio de un artículo sin IVA");
        precioSinIVA= scan.nextFloat();
        System.out.println("Tu producto con IVA vale: "+(precioSinIVA*IVA));*/

/*8. Crea un programa que lea el precio sin IVA de tres productos e imprima
el valor total con IVA que paga el comprador, así como el valor medio con y sin
IVA.*/
      /*  float producto1;
        float producto2;
        float producto3;

//float total= suma de los tres por el iva
//float medio= (valor1+2+3)/3
//float medioCon Iva= total/3


        System.out.println("Indica el precio del primer producto sin IVA");
        producto1= scan.nextFloat();
        System.out.println("Indica el precio del segundo producto sin IVA");
        producto2= scan.nextFloat();
        System.out.println("Indica el precio del segundo producto sin IVA");
        producto3= scan.nextFloat();
        float total=(producto1+producto2+producto3);
        System.out.println("El coste total de tus productos con IVA es: "+(total*IVA)+" euros.");
        System.out.println("El coste medio de tus productos sin IVA es: "+(total/3) + " euros, y con IVA es "+ ((total*IVA)/3));
*/
/*9. Crea un programa que lea el nombre de una persona, y a continuación su edad
y altura, e imprima todo por pantalla en una misma línea. ¿Funciona?*/
        System.out.println("¿Cuál es tu nombre?");
        String nombre= scan.next();
        System.out.println("¿Cuál es tu edad?");
        int edad= scan.nextInt();
        System.out.println("¿Cuál es tu altura en centímetros?");
        int altura2= scan.nextInt();
        System.out.println("Te llamas "+ nombre+ " tienes "+ edad+ " años" + " y mides "+ altura2+ " centímetros.");
/*10. Repita el ejercicio anterior pero leyendo primero los numeros y después
el nombre. ¿Funciona?*/

        System.out.println("¿Cuál es tu edad?");
        edad= scan.nextInt();
        System.out.println("¿Cuál es tu altura en centímetros?");
        altura2= scan.nextInt();
        System.out.println("¿Cuál es tu nombre?");
        nombre= scan.next();
        System.out.println("Te llamas "+ nombre+ " tienes "+ edad+ " años" + " y mides "+ altura2+ " centímetros.");

        //De momento nos olvidamos del NextLine para evitar errores cuando intentamos leer una cadena que viene tras otros tipos de datos

    }//main
}//class
