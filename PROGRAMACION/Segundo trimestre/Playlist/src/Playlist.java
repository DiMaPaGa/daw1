import java.util.Arrays;

public class Playlist {


    private String nombrePlaylist;
    private Cancion[]canciones;
    private String duracionTotal="";

    private int posicion;

    public Playlist(String nombrePlaylist){
        this.nombrePlaylist=nombrePlaylist;

    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public String getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(String duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public String buscarCancion(Cancion tema){
        String mensaje= null;
        for (int i = 0; i < canciones.length; i++) {
            if (tema.equals(canciones[i])){
                posicion=i;
                mensaje="Se encuentra en la posición"+posicion;
            }
        }
        return mensaje;
    }
    public boolean agregarPlaylist(Cancion tema) {
        boolean add=false;
        if(canciones==null){
            canciones=new Cancion[1];
            canciones[0]=tema;
            add=true;
        } else {
            String nombre = this.buscarCancion(tema);
            if (nombre==null) {
                Cancion[] antiguaLista = canciones;
                canciones = new Cancion [antiguaLista.length + 1];
                for (int i = 0; i < canciones.length; i++) {
                    if (i == canciones.length - 1) {
                        canciones[i] = tema;
                        add= true;
                    } else {
                        canciones[i] = antiguaLista[i];
                    }

                }
            }
        }
        return add;
    }

    public boolean eliminarPlaylist(Cancion tema) {
        boolean borrado=false;
        if(canciones==null){
            System.out.println("No hay elementos que borrar, la lista no está inicializada");
        } else {
            String nombre = this.buscarCancion(tema);
            if (nombre!=null) {
                borrado = true;
                Cancion[] antiguaLista = canciones;
                canciones = new Cancion[antiguaLista.length - 1];
                int contador = 0;
                for (Cancion elemento : antiguaLista) {
                    if (!tema.equals(elemento)) {
                        canciones[contador] = elemento;
                        contador++;
                    }
                }
            }
        }
        return borrado;
    }


    public String duracionTotalPlaylist (Cancion[] canciones) {
        int minutos=0;
        int segundos=0;
        for (int i = 0; i < canciones.length; i++) {
          String[] minysec=  canciones[i].getDuracionCancion().split(":");
          minutos += Integer.parseInt(minysec[0]);
          segundos += Integer.parseInt(minysec[1]);

        }

        minutos += segundos/60;
        segundos = segundos%60;



        return this.duracionTotal=" "+minutos+" minutos y "+ segundos+ " segundos.";
    }


    public String imprimirPlaylist() {
        return "Playlist{" +
                "nombrePlaylist='" + nombrePlaylist + '\'' +
                ", canciones=" + Arrays.toString(canciones) +
                ", duracionTotal=" + duracionTotal +
                '}';
    }



    public void reproducir() {
        if (canciones == null || canciones.length == 0) {
            System.out.println("La lista de reproducción está vacía.");
        } else{

        System.out.println("Reproduciendo lista de reproducción: " + nombrePlaylist);
        for (int i = 0; i < canciones.length; i++) {
            System.out.println("Reproduciendo: " + canciones[i].getNombreCancion());
        }
        System.out.println("Lista de reproducción reproducida completamente.");
    }
    }


}
