public class Baraja {

    //atributos

    private String [][] baraja;
    private String []palosCartas =new String [] {"Espadas", "Bastos", "Oros", "Copas"};
    private int [] numeroCarta= {1,2,3,4,5,6,7,10,11,12};



    private String paloCarta;

    private String [][] cartasDisponibles;

    private int numeroCartasSolicitadas;

    //constructores
    public Baraja (){
        baraja= new String[palosCartas.length][numeroCarta.length];
        rellenarBaraja();
    }


    //Métodos


    public void barajar(String[][] baraja){


    };

    /*public String darCarta(String[][] baraja){

    return;
    };*/

    public void cartasDisponibles (){


    };



    private void rellenarBaraja(){

        for (int i = 0; i < palosCartas.length; i++) {
            for (int j = 0; j < numeroCarta.length ; j++) {
                baraja [i][j]=(" "+numeroCarta[j]+" "+palosCartas[i]);

            }

        }

    }

    private void imprimirBaraja(String [][]baraja){

        for (int i = 0; i < palosCartas.length; i++) {
            for (int j = 0; j < numeroCarta.length ; j++) {
                System.out.println(baraja [i][j]=(" "+numeroCarta[j]+" "+palosCartas[i]));

            }

        }

    }














}
