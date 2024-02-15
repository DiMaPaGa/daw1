public class JuegoNaipes {

    private final Baraja baraja1 = new Baraja();
    private int numJugadores;

    private final int MAXIMO_JUGADORES = 4;
    private String[] jugadoresPartida = new String[4];


    private void registrarJugador () {
        String jugadoractivo = (" " + nombre + " " + apellido1 + " " + apellido2);

        if(comprobarJugador(jugadoractivo));




        }


    }

    private boolean comprobarJugador(String jugadoractivo) {

        boolean incluido=false;
        for (int i = 0; i < jugadoresPartida.length; i++) {
            if (jugadoractivo.equals(jugadoresPartida[i])) {
                System.out.println("Este jugador ya está incluido");
                incluido=true;
                break;
            }
        }
        return incluido;
    }

}
