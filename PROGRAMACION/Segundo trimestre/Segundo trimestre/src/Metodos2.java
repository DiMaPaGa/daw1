import java.util.Scanner;

public class Metodos2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //11.	Crear un método estático que reciba el lado de un cuadrado y devuelva su área.


        float lado = 5f;

        System.out.println(areaCuadrado(lado));

        //12. Triángulo

        System.out.println("indicame tamaño de la base");
        float base = scan.nextFloat();
        System.out.println("indicame tamaño de la altura");
        float altura = scan.nextFloat();

        System.out.println(areaTriangulo(base, altura));

        // 14.	Crear un método estático que reciba un valor en euros y lo devuelva convertido a dólares americanos.

        System.out.println("indicame valor en euros");
        float euros = scan.nextFloat();

        System.out.println(conversorDolares(euros));

        //17.	Crear un método estático que reciba un número entero y una posición, y devuelva el dígito que
//        se encuentra en dicha posición.

        String numero;
        boolean valido;

        do {
            System.out.println("Introduce un número: ");
            numero = scan.nextLine();
            valido = esNumero(numero);

        } while (!valido && numero.length() > 0);


        valido = false;

        String posicion = "";
        do {
            System.out.println("Introduce un número: ");
            numero = scan.nextLine();
            if (esNumero(posicion) && esValido(numero, posicion)) {
                valido = true;
            }
        } while (!valido);

        int numFinal = Integer.parseInt(numero);
        int posFinal = Integer.parseInt(posicion);

        devolverPosicion(numFinal, posFinal);


    }//main

    public static char devolverPosicion(int numero, int posicion) {
        String num = numero + "";

        return num.charAt(posicion);

    }

    public static boolean esValido(String numero, String posicion) {
        int posicionNum = Integer.parseInt(posicion);

        return (numero.length() > posicionNum) && posicionNum >= 0;
    }

    public static boolean esNumero(String numero) {
        boolean esNumero = true;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) < '0' || numero.charAt(i) > '9') {
                esNumero = false;
                break;
            }
        }

        return esNumero;
    }


    public static float conversorDolares(float euros) {

        return (euros * 1.09f);
    }

    public static float areaTriangulo(float base, float altura) {

        return (base * altura) / 2;
    }

    public static float areaCuadrado(float lado) {
        float area = lado * lado;
        return area;
    }



//codigo ale
   /*  public static int pedirnumeros() {
        Scanner scan = new Scanner(System.in);
        boolean valido;
        int numero = 0;
        do {
            System.out.print("Introduce un numero: ");
            valido = scan.hasNextInt();
            if (valido) {
                numero = scan.nextInt();
            } else {
                System.out.println("no es un numero!!");
                String guardado = scan.nextLine();
            }
        } while (!valido);
        return numero;
    }

   // numeroPosicion = (numero/((int)(Math.pow(10,(posicion-1)))))%10;

    //return Integer.toString(numEntero).charAt(pos);
    //public static char digitoEnPosicion(int numEntero, int pos) {
    //        return Integer.toString(numEntero).charAt(pos);
    //    }*/





}//class
