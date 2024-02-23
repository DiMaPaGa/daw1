public class Playlist {

    private Cancion cancion = new Cancion(" ", " ");

    private String nombrePlaylist;
    private String[] cancionesPlaylist;
    private float duracionTotal;

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public String[] getCancionesPlaylist() {
        return cancionesPlaylist;
    }

    public void setCancionesPlaylist(String[] cancionesPlaylist) {
        this.cancionesPlaylist = cancionesPlaylist;
    }

    public float getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(float duracionTotal) {
        this.duracionTotal = duracionTotal;
    }


    public void agregarPlaylist(String[] cancionesPlaylist, Cancion cancion) {

        int valor = cancionesPlaylist.length;
        String[] canciones = new String[valor + 1];
        canciones = cancionesPlaylist;
        for (int i = 0; i < canciones.length; i++) {
            if (i == cancionesPlaylist.length + 1) {
                canciones[i] = this.cancion.getNombreCancion() + this.cancion.getDuracionCancion();

            }
        }

    }

    public void imprimirArray(String[] canciones) {
        for (int i = 0; i < canciones.length; i++) {
            System.out.println(canciones[i]);

        }
    }
}
