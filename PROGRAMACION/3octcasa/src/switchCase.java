import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
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

        System.out.println("Incorpora el primer número");
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
        int num6 = scan.nextInt();

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
        if (num1 == 1 && num2 == 3 && num3 == 10 && num4 == 20 && num5 == 33 && num6 == 40) {
            System.out.println("¡¡Te ha tocado la lotería!!");
        } else {
            System.out.println("No te ha tocado la lotería, lo siento");
        }

       /* 8. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los
        números leídos tienen el rango apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        mensaje de error y el programa acabará.*/
        //solución del profesor
        boolean num1Valido= (num1>=1 && num1<=49);
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
        }

       /* if ((num1 < 1 || num1> 49) || (num2 < 1 || num2 > 49) || (num3 < 1 || num3 > 49) || (num4 < 1 || num4 > 49) || (num5 < 1 || num5 > 49) || (num6 < 1 || num6 > 49)) {
            System.out.println("Error, algún número no se ajusta a los valores permitidos");
        }
           else if (num1 == 1 && num2 == 3 && num3 == 10 && num4 == 20 && num5 == 33 && num6 == 40) {
                System.out.println("¡¡Te ha tocado la lotería!!");
            } else {
                System.out.println("No te ha tocado la lotería, lo siento");
            }*/
            //9.  Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo%).

            System.out.println("Incorpora un número");
            int parOimpar = scan.nextInt();

            if (parOimpar%2 == 0) {
                System.out.println("El número ingresado es par");
            } else {
                System.out.println("el númer ingresado es impar");
            }

      /* 10. Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        normal o está por encima de lo normal.*/

            System.out.println("Indica cuánto pesas en kilogramos");
            float peso = scan.nextFloat();
            System.out.println("Indica cuánto mides en metros");
            float tuAltura = scan.nextFloat();
            float IMC = (peso / (float) (Math.pow(tuAltura, 2)));

            if (IMC < 18.5) {
                System.out.println("Tienes un IMC bajo");
            }
            if (IMC >= 18.5 && IMC <= 24.9) {
                System.out.println("Tienes un IMC normal");
            }
            if (IMC >= 25.0 && IMC <= 29.9) {
                System.out.println("Tienes un IMC de sobrepeso");
            }
            if (IMC >= 30.0) {
                System.out.println("Tienes un IMC de obesidad");
            }

       /* 11. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        correspondiente. En caso de leer un número fuera de rango, imprimir por pantalla un
        mensaje de error.*/

            System.out.println("Ingresa el número del mes");
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
                    System.out.println("Identficador no válido");
                    break;
            }


          /*12. Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el
          que desee. Pida por pantalla un número y si coincide escriba “Contraseña correcta,
          accediendo al sistema”, en caso contrario escriba “Contraseña incorrecta, cerrando
          sesión”.*/

            int codigo;
            codigo = 7777;
            System.out.println("Inserte contraseña");

            if (codigo == scan.nextInt()) {
                System.out.println("Contraseña correcta, accediendo al sistema");
            } else {
                System.out.println("Contraseña incorrecta, cerrando sesión");
            }



        /*13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        valor, e imprimir por pantalla el precio final. Recuerde que debe imprimir el precio
        final tras aplicar el descuento, no la cantidad que se descuenta.*/

            System.out.println("Introduzca el precio del producto");
            float precioProduc = scan.nextFloat();
            float precioConDescuento = (precioProduc * 0.75f);
            float cantidadDescontada= precioProduc-precioConDescuento;
            System.out.println("El precio del producto aplicando descuento es: " + precioConDescuento );
            System.out.println("La cantidad descontada ha sido de: "+ cantidadDescontada);

        /* 14. Modifique el anterior para que además se imprima la cantidad que se descuenta.*/
        /*15. Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo
        de clima de acuerdo a la siguiente tabla.*/
        System.out.println("Introduzca la temperatura en centígrados");
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
        }
/* Pedir un número entre 0 y 99999 y decir cuántas cifras tiene. Suponga que se
introducirán números en ese rango.*/



        }//main
    }//class
