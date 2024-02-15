public class Main {
    public static void main(String[] args) {


        Carta [] baraja= crearBaraja();

        baraja = barajar(baraja);

        System.out.println();





    }



    private static Carta [] crearBaraja() {
        Carta [] baraja= new Carta[40];
        String[] palos= {"Espadas", "Copas", "Oros", "Bastos"};
        int[] numeros={1,2,3,4,5,6,7,10,11,12};
        int contador=0;
        for (String var:palos) {
            for (int var2:numeros) {
                Carta carta=new Carta (var2,var);
                baraja[contador]=carta;
                contador++;

            }

        }
        return baraja;

        }

    private static Carta[] barajar(Carta[] baraja) {
        Carta []cartasBarajadas= new Carta[40];
        int [] posicionesGuardadas= new int[40];
        int cont=0;
        int valorRandom=0;
        while(cont< cartasBarajadas.length){
            valorRandom=(int) Math.random()*(baraja.length-0);
            if(comprobarPosicion(posicionesGuardadas, valorRandom)){
                cartasBarajadas[cont]=baraja[valorRandom];
                posicionesGuardadas[cont]=valorRandom;
                cont++;
            }
        }

        return cartasBarajadas;
    }

    private static boolean comprobarPosicion(int[] posicionesGuardadas, int valorRandom) {
        boolean paraGuardar=true;

        for (int num:posicionesGuardadas) {
            if (valorRandom==num){
                paraGuardar=false;
            }

        }

        return paraGuardar;
    }


}