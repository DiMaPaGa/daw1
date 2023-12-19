import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
/* Resumen Actividades: switch (diasemana); primitiva; paroimpar con módulo; IMC; switch (mes año); contraseña;
                        descuentos; temperatura clima; contar cifras; switch matrículasasignturas; promedio notas;
                        calcular%HyM; swapping;ordenar números crediente o decreciente; múltiplos; leer cifras de
                        un número de 3 cifras; calculadora; (int)Math.floor(Math.random()*6max+1min);
 */
      /*   int diaSemana= 9;
// Se usan para enteros, chart o cadenas.
      switch(diaSemana){
          case 1:
              System.out.println("Hoy es lunes");
              break;
          case 2:
              System.out.println("Hoy es martes");
              break;
          case 3:
              System.out.println("Hoy es miércoles");
              break;
          case 4:
              System.out.println("Hoy es jueves");
              break;
          case 5:
              System.out.println("Hoy es viernes");
              break;
          case 6:
              System.out.println("Hoy es sábado");
              break;
          case 7:
              System.out.println("Hoy es domingo");
              break;
          default:
              System.out.println("Día no válido");
              break;
      }
        System.out.println("FIN");*/

        /*7. Leer seis números y comprobar si coinciden con la combinación ganadora de la
        primitiva (1, 3, 10, 20, 33, 40), imprimiendo un mensaje al respecto.*/

      /*  System.out.println("Incorpora el primer número");
        int num1 = scan.nextInt();
        System.out.println("Incorpora el segundo número");
        int num2 = scan.nextInt();
        System.out.println("Incorpora el tercer número");
        int num3 = scan.nextInt();
        System.out.println("Incorpora el cuarto número");
        int num4 = scan.nextInt();
        System.out.println("Incorpora el quinto número");
        int num5 = scan.nextInt();
        System.out.println("Incorpora el sexto número");
        int num6 = scan.nextInt();*/

        /*if (num1 == 1) {
            System.out.println("Coincide el primer número" + num1);
        }
        if (num2 == 3) {
            System.out.println("Coincide el segundo número " + num2);
        }
        if (num3 == 10) {
            System.out.println("Coincide el tercer número " + num3);
        }
        if (num4 == 20) {
            System.out.println("Coincide el cuarto número " + num4);
        }
        if (num5 == 33) {
            System.out.println("Coincide el quinto número " + num5);
        }
        if (num6 == 44) {
            System.out.println("Coincide el sexto número " + num6);*/
       /* if (num1 == 1 && num2 == 3 && num3 == 10 && num4 == 20 && num5 == 33 && num6 == 40) {
            System.out.println("¡¡Te ha tocado la lotería!!");
        } else {
            System.out.println("No te ha tocado la lotería, lo siento");
        }*/

       /* 8. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los
        números leídos tienen el rango apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        mensaje de error y el programa acabará.*/
        //solución del profesor
      /*  boolean num1Valido= (num1>=1 && num1<=49);
        boolean num2Valido= (num2>=1 && num2<=49);
        boolean num3Valido= (num3>=1 && num3<=49);
        boolean num4Valido= (num4>=1 && num4<=49);
        boolean num5Valido= (num5>=1 && num5<=49);
        boolean num6Valido= (num6>=1 && num6<=49);

        if(num1Valido && num2Valido && num3Valido && num4Valido && num5Valido && num6Valido){
            if (num1 == 1 && num2 == 3 && num3 == 10 && num4 == 20 && num5 == 33 && num6 == 40) {
                System.out.println("¡¡Te ha tocado la lotería!!");
            } else {
                System.out.println("No te ha tocado la lotería, lo siento");
            }
        } else {
            System.out.println("Error, algún número no se ajusta a los valores permitidos");
        }*/

       /* if ((num1 < 1 || num1> 49) || (num2 < 1 || num2 > 49) || (num3 < 1 || num3 > 49) || (num4 < 1 || num4 > 49) || (num5 < 1 || num5 > 49) || (num6 < 1 || num6 > 49)) {
            System.out.println("Error, algún número no se ajusta a los valores permitidos");
        }
           else if (num1 == 1 && num2 == 3 && num3 == 10 && num4 == 20 && num5 == 33 && num6 == 40) {
                System.out.println("¡¡Te ha tocado la lotería!!");
            } else {
                System.out.println("No te ha tocado la lotería, lo siento");
            }*/
            //9.  Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo%).

           /* System.out.println("Incorpora un número");
            int parOimpar = scan.nextInt();

            if (parOimpar%2 == 0) {
                System.out.println("El número ingresado es par");
            } else {
                System.out.println("el númer ingresado es impar");
            }*/

      /* 10. Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        normal o está por encima de lo normal.*/

           /* System.out.println("Indica cuánto pesas en kilogramos");
            float peso = scan.nextFloat();
            System.out.println("Indica cuánto mides en metros");
            float tuAltura = scan.nextFloat();
            float IMC = peso / (float) Math.pow(tuAltura, 2);

            if (IMC < 18.5) {
                System.out.println("Tienes un IMC bajo");
            }
            else if (IMC >= 18.5 && IMC <= 24.9) {
                System.out.println("Tienes un IMC normal");
            }
            else if (IMC >= 25.0 && IMC <= 29.9) {
                System.out.println("Tienes un IMC de sobrepeso");
            }
            else {
                System.out.println("Tienes un IMC de obesidad");
            }*/

       /* 11. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        correspondiente. En caso de leer un número fuera de rango, imprimir por pantalla un
        mensaje de error.*/

         /*   System.out.println("Ingresa el número del mes");
            int mes = scan.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Es enero");
                    break;
                case 2:
                    System.out.println("Es febrero");
                    break;
                case 3:
                    System.out.println("Es marzo");
                    break;
                case 4:
                    System.out.println("Es abril");
                    break;
                case 5:
                    System.out.println("Es mayo");
                    break;
                case 6:
                    System.out.println("Es junio");
                    break;
                case 7:
                    System.out.println("Es julio");
                    break;
                case 8:
                    System.out.println("Es agosto");
                    break;
                case 9:
                    System.out.println("Es septiembre");
                    break;
                case 10:
                    System.out.println("Es octubre");
                    break;
                case 11:
                    System.out.println("Es noviembre");
                    break;
                case 12:
                    System.out.println("Es diciembre");
                    break;
                default:
                    System.out.println("Identificador no válido");
                    break;
            }*/


          /*12. Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el
          que desee. Pida por pantalla un número y si coincide escriba “Contraseña correcta,
          accediendo al sistema”, en caso contrario escriba “Contraseña incorrecta, cerrando
          sesión”.*/

          /*  int codigo;
            codigo = 7777;
            System.out.println("Inserte contraseña");
            También puedo crear una variable que guarde lo de scan y lo comparamos con código.

            if (codigo == scan.nextInt()) {
                System.out.println("Contraseña correcta, accediendo al sistema");
            } else {
                System.out.println("Contraseña incorrecta, cerrando sesión");
            }
*/


        /*13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        valor, e imprimir por pantalla el precio final. Recuerde que debe imprimir el precio
        final tras aplicar el descuento, no la cantidad que se descuenta.*/

          /*  System.out.println("Introduzca el precio del producto");
            float precioProduc = scan.nextFloat();
            float precioConDescuento = (precioProduc * 0.85f);
            float cantidadDescontada= precioProduc-precioConDescuento;
            System.out.println("El precio del producto aplicando descuento es: " + precioConDescuento );
            System.out.println("La cantidad descontada ha sido de: "+ cantidadDescontada);*/

        /* 14. Modifique el anterior para que además se imprima la cantidad que se descuenta.*/
        /*15. Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo
        de clima de acuerdo a la siguiente tabla.*/
      /*  System.out.println("Introduzca la temperatura en centígrados");
        int temperaturaClima = scan.nextInt();
        if (temperaturaClima<=10){
            System.out.println("Hoy hace frío");
        }
        else if (temperaturaClima>10 && temperaturaClima<=20){
            System.out.println("Hoy está nublado");
        }
        else if (temperaturaClima>20 && temperaturaClima<=30){
            System.out.println("Hoy está el día caluroso");
        }
        else {
            System.out.println("Hoy la temperatura es tropical");
        }*/
/* Act.16. Pedir un número entre 0 y 99999 y decir cuántas cifras tiene. Suponga que se
introducirán números en ese rango.*/
    /*    System.out.println("Ingrese un número de 0 a 99999");
        int numero = scan.nextInt();

        if (numero>=0 && numero<10){
            System.out.println("Su número tiene 1 cifra");
        } else if (numero>=10 && numero<100) {
            System.out.println("Su número tiene 2 cifras");
        } else if (numero>=100 && numero<1000) {
            System.out.println("Su número tiene 3 cifras");
        } else if (numero>=1000 && numero<10000) {
            System.out.println("Su número tiene 4 cifras");
        } else if (numero>=10000 && numero<100000) {
            System.out.println("Su número tiene 5 cifras");
        } else {
            System.out.println("Identficador no válido");
        }*/
/*17. La universidad ha categorizado las matrículas de acuerdo a la facultad que va a
estudiar el postulante. Ingrese por teclado el nombre de la facultad donde va a
estudiar, y muestre el importe y la mensualidad. (Use el control switch-case, y
recuerde que el nombre que introduzca debe coincidir exactamente con el nombre
de universidad).*/

     /*   System.out.println("Ingrese su facultad según los siguientes identificadores: Sistemas, Derecho, Naviera, Pesquera, Contabilidad o Administración");
        String identificador = scan.next(); //nextLine lo lee todo, si hubiera respetado el nombre como estaba "Ing. de sistemas" el next se hubiera quedado en Ing. y hubiera dado error.

        switch (identificador) {
            case "Sistemas":
                System.out.println("Importe de matricula: 350€, mensualidad: 650€");
                break;
            case "Derecho":
                System.out.println ("Importe de matricula: 300€, mensualidad: 550€");
                break;
            case "Naviera":
                System.out.println ("Importe de matricula: 300€, mensualidad: 500€");
                break;
            case "Pesquera":
                System.out.println ("Importe de matricula: 310€, mensualidad: 460€");
                break;
            case "Contabilidad":
                System.out.println ("Importe de matricula: 280€, mensualidad: 490€");
                break;
            case "Administración":
                System.out.println ("Importe de matricula: 360€, mensualidad: 520€");
                break;
            default:
                System.out.println("Identificador no válido. Revise que el nombre indicado se ajuste a las opciones indicadas.");
                break;
        }*/

/*18. Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su
promedio, sabiendo que la primera y segunda tiene 20% de peso cada una, la
tercera y cuarta tienen 30% de peso cada una.*/

      /*  System.out.println("Ingrese su primera nota");
        float nota1= scan.nextFloat();

        System.out.println("Ingrese su segunda nota");
        float nota2= scan.nextFloat();

        System.out.println("Ingrese su tercera nota");
        float nota3= scan.nextFloat();

        System.out.println("Ingrese su cuarta nota");
        float nota4= scan.nextFloat();

        float notaFinal= (nota1*0.2f)+(nota2*0.2f)+(nota3*0.3f)+(nota4*0.3f);
        System.out.println("Tu nota final es "+ notaFinal);*/


/* 19. Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y
permita calcular el porcentaje de hombres y mujeres.*/

       /* System.out.println("¿Cuántos hombres hay en el aula?");
        int hombres= scan.nextInt();
        System.out.println("¿Cuántas mujeres hay en el aula?");
        int mujeres= scan.nextInt();
        int total= hombres+mujeres;
        System.out.println("En la clase, el "+ ((hombres*100f)/total) + "% son hombres y el " + ((mujeres*100f)/total)+ "% son mujeres");

        float porcHombres= (hombres*100f)/total;
        float porcMujeres= (mujeres*100f)/total;

        System.out.println("En la clase, el "+ porcHombres + "% son hombres y el " + porcMujeres+ "% son mujeres");*/


// 21. Leer por pantalla dos números enteros, e intercambiar sus valores (swapping).

       /* System.out.println("Introduzca un número entero");
        int valor1= scan.nextInt();
        int valor2= valor1;

        System.out.println("Introduzca otro número entero");
        valor1= scan.nextInt();

        System.out.println("Intercambiamos y ahora el valor1 vale "+ valor1 + " y el valor2 vale "+ valor2);*/
//O con variable temporal que guarde mi dato. tmp=a; a=b; b=tmp;
//22. Leer por pantalla dos números enteros, e imprimirlos por pantalla en orden creciente.

       /* System.out.println("Introduzca un número entero");
        int valor3= scan.nextInt();

        System.out.println("Introduzca otro número entero");
        int valor4= scan.nextInt();

        if (valor3>valor4) {
            System.out.println (valor4+ " es menor que "+ valor3);
        } else if (valor3<valor4) {
            System.out.println(valor3 + " es menor que " + valor4);
        }
       /* } else {
            System.out.println("Ambos números son iguales. Su valor es: "+ valor3);//no haría falta
        }*/
//

/*23. Leer por pantalla tres números enteros, e imprimirlos por pantalla en orden
creciente.*/

       System.out.println("Introduzca números diferentes entre sí. Introduzca un número entero");
        int valor5= scan.nextInt();

        System.out.println("Introduzca otro número entero");
        int valor6= scan.nextInt();

        System.out.println("Introduzca el último número entero");
        int valor7= scan.nextInt();
        int mayor;
        int menor;
        int mediano;

        /*inténtalo pero comparando en grupo de dos nada más.

      if ((valor5 > valor6) && (valor5 > valor7)) {
            mayor=valor5;

        } else if ((valor6 > valor5) && (valor6 > valor7)) {
            mayor=valor6;
        } else {
            mayor=valor7;
        }
        if ((valor5 < valor6) && (valor5 < valor7)) {
            menor=valor5;
        } else if ((valor6 < valor5) && (valor6 < valor7)) {
            menor=valor6;
        } else {
            menor=valor7;
        }

        if ((valor5!=mayor && valor5!=menor)) {
            mediano=valor5;
        } else if ((valor6!=mayor && valor6!=menor)) {
            mediano=valor6;
        } else {
            mediano=valor7;
        }*/

        if (valor5>valor6){
            mayor=valor5;
            mediano=valor6;
        } else{
            mayor=valor6;
            mediano=valor5;
        }
        if (mediano>valor7){
            menor=valor7;
        } else{
            menor=mediano;
            mediano=valor7;

        }
        if (mayor>menor){
            System.out.println(menor+ mediano+ mayor);
        } else{
            int tmp=mayor;
            mayor=menor;
            menor=tmp;
            System.out.println(menor+ mediano+ mayor);
        }
/* solución con swaping

    tem= num1;
    if(num1>num2){
    tem= num1;
    num1=num2;
    num2=tmp;
    }

    if(num2>num3){
    tem= num2;
    num2=num3;
    num3=tmp;
    }

    if(num1>num2){
    tem= num1;
    num1=num2;
    num2=tmp;
    }
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
 */
        System.out.println("El orden creciente sería, primero  "+ menor + " después "+ mediano + " y por último " + mayor);
//24. Repetir el ejercicio anterior, e imprimirlos en orden decreciente.

        System.out.println("El orden decreciente sería, primero  "+ mayor + " después "+ mediano + " y por último " + menor);

       /* System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);*/

/*25. Lea un número por pantalla y determine si es múltiplo de 10 (use el operador módulo
//%).*/

        System.out.println("Introduzca un número");
        int numEjercicio25= scan.nextInt();

        if (numEjercicio25%10==0) {
            System.out.println("El número introducido es múltiplo de 10");
        } else {
            System.out.println("El número introducido NO es múltiplo de 10");
        }

/*26. Leer por pantalla un número de tres cifras, e imprimir cada una de sus cifras en una
línea.*/
        System.out.println("Introduzca un número de tres cifras");
        int num3cifras= scan.nextInt();

        int centenas=(num3cifras/100);
        int decenas=((num3cifras/10)-(centenas*10));
        int unidades=(num3cifras-(centenas*100)-(decenas*10));
        System.out.println("De su número, el primer dígito es "+centenas);
        System.out.println("El segundo es" +decenas);
        System.out.println("El tercero es"+ unidades);
/* int cifra1=num%10;
int cifra2=(num/10)%10;
int cifra3=num/100;
 */

/*27. Crea una aplicación llamada CalculadoraInversa, que lea por pantalla dos operandos
(int) y un signo aritmético (String), y según este último se realizará la operación
correspondiente. Al final mostrará el resultado en consola. Los signos aritméticos
disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
%: módulo, resto de la división entre operando1 y operando2.
Para leer por pantalla usar nextInt y next.*/
    /*    System.out.println("Entra en la calculadora Inversa. Introduce un número");
        int operando1= scan.nextInt();
        System.out.println("Introduce otro número");
        int operando2= scan.nextInt();
        System.out.println("Indique si desea +, -, *, / ,o %");
        String operando= scan.next();

        switch (operando) {
            case "+":
                System.out.println("El resultado de su suma es "+ (operando1+operando2));
                break;
            case "-":
                System.out.println ("El resultado de su resta es "+ (operando1-operando2));
                break;
            case "*":
                System.out.println ("El resultado de su multiplicación es "+ (operando1*operando2));
                break;
            case "/":
                System.out.println ("El resultado de su división es "+ (operando1/operando2));
                break;
            case "%":
                System.out.println ("El resto de dividir los dos números entre sí es " +(operando1%operando2));
                break;
            default:
                System.out.println("Identificador no válido. Revise que el operando asignado.");
                break;
        }**/


 /*28. En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
resultados:

Si los tres dados son seis, mostrar el mensaje “Muy buena suerte”
Si dos dados son seis, mostrar el mensaje “Buena suerte”
Si un dado es seis, mostrar el mensaje “Mala Suerte”
Si ningún dado se obtiene seis, mostrar el mensaje “Muy mala suerte”
Simule los lanzamientos con tres números aleatorios, usando instrucciones Java que
los genere.*/

        /*int dado1=(int)Math.floor(Math.random()*6+1);
        int dado2=(int)Math.floor(Math.random()*6+1);
        int dado3=(int)Math.floor(Math.random()*6+1);
        System.out.println("Sus resultados han sido "+dado1+", "+dado2+", "+dado3+".");

        if (dado1==6 && dado2==6 && dado3==6){
            System.out.println("Muy buena suerte");
        } else if ((dado1==6 && dado2==6 && dado3!=6)||(dado1==6 && dado2!=6 && dado3!=6)||(dado1!=6 && dado2==6 && dado3==6)){
            System.out.println("Buena suerte");
        } else if ((dado1==6 && dado2!=6 && dado3!=6)||(dado1!=6 && dado2==6 && dado3!=6)||(dado1!=6 && dado2!=6 && dado3==6)){
            System.out.println("Mala suerte");
        } else {
            System.out.println("Muy mala suerte");
        }*/

        /*
        int contador=0;
        if(num1==6){
        contador++;
        }
         if(num2==6){
        contador++;
        }
         if(num3==6){
        contador++;
        }

        switch (contador) {
            case "0":
                System.out.println("Muy mala suerte");
                break;
            case "1":
                System.out.println ("Mala suerte");
                break;
            case "2":
                System.out.println ("Buena suerte");
                break;
            case "3":
                System.out.println ("Muy buena suerte");
                break;
            default:
                System.out.println ("Este caso no debe darse NUNCA");
                break;
         */


        }//main
    }//class
