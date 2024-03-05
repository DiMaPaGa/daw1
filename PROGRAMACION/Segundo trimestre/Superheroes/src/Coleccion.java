import java.util.Arrays;

public class Coleccion{

    private String nombreColeccion;
    private Figura[] figuras;
    private final int CANTIDAD=20;
    private int contadorFiguras;

    public Coleccion(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        this.figuras= new Figura[CANTIDAD];
        this.contadorFiguras=0;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public Figura[] getFiguras() {
        return figuras;
    }

    public void setFiguras(Figura[] figuras) {
        this.figuras = figuras;
    }


    public int getContadorFiguras() {
        return contadorFiguras;
    }


    public int buscarFigura(Figura figura){
        int posicion=-1;
        for (int i = 0; i < contadorFiguras; i++) {
            if (figura.equals(figuras[i])){
                posicion=i;
                break;
            }
        }
        return posicion;
    }

    public void anadirFigura (Figura figura){
            if (figuras == null) {
                System.out.println("La lista no está inicializada");
            } else {
                boolean figuraExistente = false;
                for (int i = 0; i < contadorFiguras; i++) {
                    if (figura.equals(figuras[i])) {
                        figuraExistente = true;
                        break;
                    }
                }
                if (!figuraExistente) {
                    if (contadorFiguras < 20) {
                        figuras[contadorFiguras] = figura;
                        contadorFiguras++;
                    } else {
                        System.out.println("No se pueden añadir más figuras, la colección está llena");
                    }
                } else {
                    System.out.println("Esta figura ya se encuentra en la lista");
                }
            }
        }


    public void subirPrecio (double cantidad, String id){
        for (int i = 0; i < contadorFiguras; i++) {
            if(figuras[i].getCodigo().equals(id)){
                figuras[i].subirPrecio(cantidad);
                break;
            }

        }

        
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", figuras=" + Arrays.toString(figuras) +
                '}';
    }

    public String conCapa() {
        String title ="Tienen capa: \n";
        String body="";
        for (Figura elemento: figuras) {
            if(elemento!= null && elemento.getSuperheroe().tieneCapa()){
                body+= elemento.toString();
            }
        }
        if(body.length()==0){
            title="";
            body="No hay ningún superhéroe con capa";
        }

        return title+body;
    }

    public Figura masValioso(){

      Arrays.sort(figuras);
      System.out.println("La figura más valiosa es: ");

      return figuras[0];
    }

    public double getValorColeccion(){
        double precioColeccion = 0;
        for (int i = 0; i < contadorFiguras; i++) {
            precioColeccion += figuras[i].getPrecio();
        }
        return precioColeccion;
    }

    public double getVolumenColeccion(){
        double volumenColeccion=0;

        for (int i = 0; i < contadorFiguras; i++) {
            volumenColeccion+= figuras[i].getDimension().getVolumen();
        }
        volumenColeccion+=200;


        return volumenColeccion;
    }






}
