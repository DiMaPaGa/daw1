public class Main {
    public static void main(String[] args) {

        Playlist miLista = new Playlist("MiLista");
        miLista.agregarPlaylist(new Cancion("Gracias a ti", "3:20"));
        miLista.agregarPlaylist(new Cancion("Echoes", "3:06"));
        miLista.agregarPlaylist(new Cancion("Love really hurts", "3:00"));
        miLista.agregarPlaylist(new Cancion("It´s my life", "3:46"));
        miLista.agregarPlaylist(new Cancion("Shape of you", "4:23"));


        System.out.println(miLista.duracionTotalPlaylist(miLista.getCanciones()));
        System.out.println(miLista.imprimirPlaylist());



        Cancion cancionBuscada= new Cancion("Gracias a ti", "3:20");
        System.out.println(miLista.buscarCancion(cancionBuscada));

        System.out.println(miLista.eliminarPlaylist(cancionBuscada));

        System.out.println(miLista.duracionTotalPlaylist(miLista.getCanciones()));

        System.out.println(miLista.imprimirPlaylist());

        miLista.reproducir();


    }
}