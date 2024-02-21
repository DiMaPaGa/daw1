public class Main {
    public static void main (String []args){

        Long numTarjeta= 371244024441300L;
        String numero=numTarjeta+"";
        int contador=0;
        double numeroInvertido=0;
        int suma=0;
        boolean esNumeroLuhn;
        String tipo="";


        for (int i = 0; i <numero.length(); i++) {
            contador++;

        }

        System.out.println("El número de cifras que tiene la tarjeta es "+ contador);


        for (int i = contador; i > 0; i--) {
            long numInv=numTarjeta%10;
            numeroInvertido += numInv*Math.pow(10, contador - i);
            numTarjeta/=10;

        }

        System.out.println("El número invertido quedaría así "+ numeroInvertido);

        for (int i = 0; i < contador; i++) {
            long digito = (long) (numeroInvertido % 10);
            if (i % 2 != 0) {
                digito *= 2;
                if (digito > 9) {
                    digito = digito / 10 + digito % 10;
                }
            }
            suma += digito;
            numeroInvertido /= 10;
        }

        System.out.println("La suma de las cifras del número invertido da "+ suma);

        esNumeroLuhn= suma%10 == 0;

        System.out.println("¿Es este número un numero LUHN? "+ esNumeroLuhn);

        //Finalmente, este último paso lo añado yo.

        if (esNumeroLuhn){
            long primerDigito= Long.parseLong(String.valueOf(numero.charAt(0)));

            if (primerDigito == 4) {
                System.out.println("La tarjeta es una Visa.");
            } else if (primerDigito == 5) {
                System.out.println("La tarjeta es una Mastercard.");
            } else if (primerDigito == 3) {
                System.out.println("La tarjeta es una American Express.");
            } else {
                System.out.println("No se reconoce la marca de la tarjeta.");
            }
        }






    }
}
