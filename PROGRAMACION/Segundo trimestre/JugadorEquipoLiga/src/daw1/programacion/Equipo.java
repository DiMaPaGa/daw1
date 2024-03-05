package daw1.programacion;

import java.util.Arrays;

public class Equipo implements Comparable<Equipo>{

    private Jugador [] jugadores;
    private String nombreEquipo;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;

    private Equipo(){
        Jugador[] jugadores=null;
    }

    public Equipo(String nombreEquipo, int partidosGanados, int partidosEmpatados, int partidosPerdidos){
        this();
        this.nombreEquipo=nombreEquipo;
        this.partidosGanados=partidosGanados;
        this.partidosEmpatados=partidosEmpatados;
        this.partidosPerdidos=partidosPerdidos;
    }


    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPuntuacion(){

        return (this.partidosGanados*3)+(this.partidosEmpatados);
    }

    public boolean esJugador(Jugador jugador){
        int posicion=-1;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugador.equals(jugadores[i])){
                posicion=i;
            }
        }
        return posicion>-1;
    }

    public boolean inscribirJugador(Jugador jugador){
        boolean add=false;
        if(jugadores==null){
            jugadores=new Jugador[1];
            jugadores[0]=jugador;
            add=true;
        } else {
            boolean posicion = this.esJugador(jugador);
            if (posicion) {
                System.out.println("El jugador indicado ya se encuentra en el equipo");
            } else {
                Jugador[] antiguaLista = jugadores;
                jugadores = new Jugador[antiguaLista.length + 1];
                for (int i = 0; i < jugadores.length; i++) {
                    if (i == jugadores.length - 1) {
                        jugadores[i] = jugador;
                        add= true;
                    } else {
                        jugadores[i] = antiguaLista[i];
                    }

                }
            }
        }
        return add;
    }



    public String imprimirPlantilla() {
        return "Equipo{" +
                "jugadores=" + Arrays.toString(jugadores) + " Puntos: "+ getPuntuacion()+
                '}';
    }

    @Override
    public int compareTo(Equipo equipo) {
        return equipo.getPuntuacion()-this.getPuntuacion();
    }
}
