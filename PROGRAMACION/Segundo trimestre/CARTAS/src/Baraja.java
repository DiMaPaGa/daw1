public class Baraja {

    //atributos

    private int [] baraja = new int[40];
    private int numeroCarta;

    private String []paloCarta =new String [] {"Espadas", "Bastos", "Oros", "Copas"};

    private int cartasDescartadas;

    //constructores

    public void crearCarta(){
       do{
           this.numeroCarta= (int)Math.random()*12;
       } while (numeroCarta==8|| numeroCarta==9);



        int valor=(int)Math.random()*4;

        switch (valor){
            case 0:
                String s = this.paloCarta[0];
                break;

            case 1:
                String s = this.paloCarta[1];
                break;





        }







    }






}
