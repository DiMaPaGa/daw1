public class Coleccion {

    private String nombreColeccion;
    private Figura[] figuras;
    private final int CANTIDAD=20;
    private int contador=0;

    public Coleccion(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        this.figuras= new Figura[CANTIDAD];
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public int buscarFigura(Figura figura){
        int posicion=-1;
        for (int i = 0; i < figuras.length; i++) {
            if (figura.equals(figuras[i])){
                posicion=i;
            }
        }
        return posicion;
    }

    public void anadirFigura (Figura figura){
        if(figuras==null){
            System.out.println("La lista no está inicializada");
        } else {
            int posicion = this.buscarFigura(figura);
            if (posicion > -1) {
                System.out.println("Esta figura ya se encuentra en la lista");
            } else{
                figuras[posicion]=figura;
            }
        }

    }

    public void subirPrecio (double cantidad, String id){
        
    }


    /*
Programe un método subirPrecio(double cantidad, String id) que reciba una
cantidad de dinero y el identificador de una de las figuras de la colección. El
método subirá el precio de dicha figura en la cantidad pasada como
parámetro.*/
}
