import java.util.Scanner;

public class boletin1String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*1. Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
        por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.*/

       /*String nombre= "Diana";

        System.out.println("Bienvenida "+ nombre);*/

        //2. Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.

      /*  System.out.println("Introduce tu nombre");
        nombre= scan.next();

        System.out.println("Bienvenida "+ nombre);*/

        /*3. Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
        se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
        más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la
        condición de salida (3 intentos y si acierta sale, aunque le queden intentos).*/

       /* String contrasena="abcde";
        int intentos=0;

        do {
            System.out.println("Introduce contraseña");
            String solicitud= scan.next();
            if (solicitud.equals(contrasena)) {
                System.out.println("Enhorabuena");
                break;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta, le quedan "+ (3-intentos)+ " intentos.");
            }

        } while (intentos<3);

        if (intentos>2){
            System.out.println("Acceso bloqueado");
        }*/



        /*4. Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuántas vocales hay en
        total (recorre el String con un bucle y charAt).*/

      /*  String frase= "La lluvia en Sevilla es una maravilla";
        int contador=0;

        for (int i=0; i<frase.length();i++){
            char letra= frase.toLowerCase().charAt(i);
            if ("aeiouáéíóú".indexOf(letra) !=-1){
                contador++;
            }
        }

        System.out.println("Hay "+ contador + " vocales.");*/

/*String ej4 = "La lluvia en Sevilla es una maravilla";
        int contVocales = 0;

        for (int i = 0; i <ej4.length() ; i++) {
            char vocal = ej4.charAt(i);
            if (vocal== 'a' || vocal== 'e' || vocal== 'i' || vocal== 'o' || vocal== 'u'){
                contVocales++;
            }
        }*/

        // 5. Reemplaza todas las a del String anterior por una e.

       /* String frase2 = frase.replace("a","e");
        System.out.println(frase2);*/

        /*System.out.println(sevilla.replace('a','e')); también y más corto"*/


        /*6. Dada una cadena mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
        Entrada: cad = &quot;Hola tu&quot;
        Salida: La cantidad de vocales es 3*/


     /*   System.out.println("Entrada");
        String entrada= scan.next();
        int vocales=0;

        for (int i=0; i<entrada.length();i++){
            char comparar= entrada.toLowerCase().charAt(i);
            if ("aeiouáéíóú".indexOf(comparar) != -1){
                vocales++;
            }
        }
        System.out.println("Hay "+ vocales + " vocales.");

                /*if (comparar =='a'||comparar =='e'||comparar =='i'||comparar =='o'||comparar =='u'){
                vocales++;*/

        /*System.out.println("Introduce una frase");
        String cantidadVocales=scan.nextLine();
        int fraseVocales=0;
        for (int i = 0; i < cantidadVocales.length() ; i++) {
            if ((cantidadVocales.charAt(i) == 'a') || (cantidadVocales.charAt(i) == 'e') || (cantidadVocales.charAt(i) == 'i') || (cantidadVocales.charAt(i) == 'o') || (cantidadVocales.charAt(i) == 'u'))
                fraseVocales++;
        }
        System.out.println(cantidadVocales+" Tiene un total de: "+ frase
                System.out.println(cantidadVocales+" Tiene un total de: "+ fraseVocales +" Vocales");*/


        /*7. Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
        Entrada: &quot;casa blanca&quot;
        Salida: &quot;acnalb asac&quot;*/

        /*System.out.println("Introduce texto");
        String cadenaDada=scan.next();*/

       /* String cadenaDada="Casa blanca";
        String cadenaReversa= "";

        for (int i = cadenaDada.length()-1; i>=0 ; i--) {
            cadenaReversa+=cadenaDada.charAt(i);
        }
        System.out.println(cadenaReversa);*/

       /* String cadena = "casa blanca";
        int i = cadena.length();
        do{
            i--;
            System.out.print(cadena.charAt(i));
        }while(i>0);*/



        /*8. Dada una cadena cad, y un carácter car, verificar cuántas veces se repite el carácter car
        en la cadena cad, por ejemplo:
        Entrada: cad = &quot;casa blanca&quot;, car = &#39;a&#39;
        Salida: El carácter &#39;a&#39; se repite 4 veces*/

        /*System.out.println("Introduce una cadena:");
        String cad = scan.next().toLowerCase();

        System.out.println("Introduce un carácter:");
        char car = scan.next().toLowerCase().charAt(0);

        int contadorCaracter=0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == car) {
                 contadorCaracter++;
            }
        }
        System.out.println("El carácter '" + car + "' se repite " + contadorCaracter + " veces");*/


        /*9. Lee un número por teclado y muestra por consola el carácter al que pertenece en la
        tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.*/

       /* System.out.println("Introduce un número:");
        int codigoASCII = scan.nextInt();
        char caracterASCII = (char) codigoASCII;
        System.out.println("El carácter correspondiente al código ASCII " + codigoASCII + " es: " + caracterASCII);*/

        /*System.out.println("Introduce un número:");
        String codigoASCII = scan.next();
        int codigo=Integer.parseInt(codigoASCII)
        char caracterASCII = (char) codigoASCII;
        System.out.println("El carácter correspondiente al código ASCII " + codigoASCII + " es: " + caracterASCII);
        resultado de clase*/

       /* 10. Modifica el ejercicio anterior para que, en lugar de pedir un número, pida un carácter y
        muestre su código en la tabla ASCII.*/

       /* System.out.println("Introduce un carácter:");
        char caracterEntrada = scan.next().charAt(0);
        int codigoASCIICaracter = (int) caracterEntrada;
        System.out.println("El código ASCII de '" + caracterEntrada + "' es: " + codigoASCIICaracter);*/

        /* clase
        sout
        char diez=scan.next().charAt(0);
        sout (int)
         */


        /* 11. Recorre un String y transforma cada carácter a su código ASCII. Muéstralos en línea
        recta, separados por un espacio entre cada carácter.

        System.out.println("Introduce una cadena:");
        String cadena = scan.next();
        for (int i = 0; i < cadena.length(); i++) {
            int codigoASCIIChar = (int) cadena.charAt(i);
            System.out.print(codigoASCIIChar + " ");
        }*/

        /*String word=scan.nextLine();
        int car=word.length();
        for(int
        char
         */


        /*12. Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int,
        pero se leerán como String y luego se convertirán) y un signo aritmético (String), según
        este último se realizará la operación correspondiente. Al final mostrará el resultado en
        consola. Los signos aritméticos disponibles son:
        +: suma los dos operandos.

        -: resta los operandos.

                *: multiplica los operandos.
                /: divide los operandos, este debe dar un resultado con decimales (double)
^: 1º operando como base y 2º como exponente.
                %: módulo, resto de la división entre operando1 y operando2.*/

        /*System.out.println("Introduce el primer operando:");
        String operando1 = Integer.parseInt(scan.next());
        System.out.println("Introduce el segundo operando:");
        String operando2 = Integer.parseInt(scan.next());
        System.out.println("Introduce el signo aritmético (+, -, *, /, ^, %):");
        String operacion = scan.next();
        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        System.out.println("Resultado: " + resultado);*/

        /*correcction de clase:*/

       /* System.out.print("Por favor, introduce valor PRIMER operando : ");
        String operando1s = scan.nextLine();
        System.out.print("Por favor, introduce SIGNO de la operacion : ");
        String signo = scan.nextLine();
        System.out.print("Por favor, introduce valor SEGUNDO operando  : ");
        String operando2s = scan.nextLine();


        int operando1v = Integer.parseInt(operando1s);
        int operando2v = Integer.parseInt(operando2s);
        float resulta=1;

         if ("+".equals(signo)){
            resulta=operando1v+operando2v;
        } else if ("-".equals(signo)) {
            resulta=operando1v-operando2v;
        } else if ("*".equals(signo)){
            resulta=operando1v*operando2v;
        } else if ("/".equals(signo)){
            resulta=operando1v/operando2v;
        } else if ("^".equals(signo)){
            for (int i=0; i<operando2v; i++){
                resulta=resulta*operando1v;
            }
        } else if }
        } else if ("%".equals(signo)){
            resulta=(operando2v*100)/operando1v;
        }
        System.out.println("RESULTADO DE LA OPERACION = "+resulta);*/

    }
}


