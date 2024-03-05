package daw1.programacion;

public class Main {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Moisés", "hombre", 39, 1.82f, 80f);
        Jugador jugador2 = new Jugador("Julio", "hombre", 22, 1.89f, 90f);
        Jugador jugador3 = new Jugador("Pedro", "hombre", 19, 1.72f, 75f);
        Jugador jugador4 = new Jugador("Maria", "mujer", 29, 1.80f, 70f);
        Jugador jugador5 = new Jugador("Mariola", "mujer", 39, 1.62f, 60f);
        Jugador jugador6 = new Jugador("Julia", "mujer", 37, 1.72f, 69f);
        Jugador jugador7 = new Jugador("Lydia", "mujer", 35, 1.75f, 69f);
        Jugador jugador8 = new Jugador("Ana", "mujer", 30, 1.58f, 50f);
        Jugador jugador9 = new Jugador("Nando", "hombre", 40, 1.70f, 80f);


        Equipo equipo1 = new Equipo("Los numero 1", 6, 3, 0);
        equipo1.inscribirJugador(jugador1);
        equipo1.inscribirJugador(jugador8);
        equipo1.inscribirJugador(jugador9);
        Equipo equipo2 = new Equipo("Sevilla", 4, 1, 2);
        equipo2.inscribirJugador(jugador7);
        equipo2.inscribirJugador(jugador2);
        equipo2.inscribirJugador(jugador3);
        Equipo equipo3 = new Equipo("Betis", 3, 2, 1);
        equipo3.inscribirJugador(jugador4);
        equipo3.inscribirJugador(jugador5);
        equipo3.inscribirJugador(jugador6);

        System.out.println(equipo1.imprimirPlantilla());

        Liga jugones = new Liga("Española", 2024);
        jugones.anadirEquipo(equipo1);
        jugones.anadirEquipo(equipo2);
        jugones.anadirEquipo(equipo3);

        jugones.imprimirClasificacion();

        System.out.println(jugones.participa(equipo1));

    }
}
