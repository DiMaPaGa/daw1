public class JuegoNaipes {

    private final Baraja baraja1 = new Baraja();
    private int numJugadores;
    private Jugador[] jugadoresPartida;

    private final int MAXIMO_JUGADORES = 4;



   public JuegoNaipes(){

       jugadoresPartida = new Jugador[MAXIMO_JUGADORES];
       numJugadores=0;
   }



    public void setJugadoresPartida(Jugador[] jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }


    public void registrarJugador (String nombre, String apellido1, String apellido2) throws Exception {

       if(numJugadores>MAXIMO_JUGADORES) {
           throw new Exception("Ya hay 4 jugadores registrados");
       }

        for (int i = 0; i < jugadoresPartida.length; i++) {

            if(jugadoresPartida[i]!=null && jugadoresPartida[i].getNombre().equals(nombre)&&jugadoresPartida[i].getApellido1().equals(apellido1)&&jugadoresPartida[i].getApellido2().equals(apellido2)){
                throw new Exception("El jugador ya está registrado");
            }
        }

        Jugador nuevoJugador= new Jugador(nombre, apellido1,apellido2);
        jugadoresPartida[numJugadores]= nuevoJugador;
        numJugadores++;

    }

    public void mostrarJugadores(){
        for (int i = 0; i < jugadoresPartida.length ; i++) {
            if(jugadoresPartida[i]!=null) {
                System.out.println(jugadoresPartida[i].getNombre() + " " + jugadoresPartida[i].getApellido1() + " " + jugadoresPartida[i].getApellido2());
            }

        }

        }

    public void eliminarJugador(String nombre, String apellido1, String apellido2) throws Exception {
        int eliminar=-1;

        for (int i = 0; i < numJugadores; i++) {
            if(jugadoresPartida[i].getNombre().equals(nombre)&&jugadoresPartida[i].getApellido1().equals(apellido1)&&jugadoresPartida[i].getApellido2().equals(apellido2)) {
            eliminar=i;
            }

        }
        if (eliminar==-1) {

            throw new Exception("El jugador no está registrado");


        }

        for (int i = eliminar; i < numJugadores-1 ; i++) {
            jugadoresPartida[i]=jugadoresPartida[i+1];

        }

        jugadoresPartida[numJugadores-1]= null;
        numJugadores--;




        }



    public Jugador getJugador (String nombre, String apellido1, String apellido2) throws Exception {
        for (int i = 0; i < numJugadores; i++) {
            if(jugadoresPartida[i].getNombre().equals(nombre)&&jugadoresPartida[i].getApellido1().equals(apellido1)&&jugadoresPartida[i].getApellido2().equals(apellido2)){
                return jugadoresPartida[i];
            }

        }
       throw new Exception("El jugador no está registrado");
    }

    public Jugador[] getJugadores() {
        return jugadoresPartida;
    }






    }






