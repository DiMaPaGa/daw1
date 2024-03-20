public abstract class Poligono {

    public int vertices;

    public Poligono(){


    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        if (vertices>0){
        this.vertices = vertices;
        }
    }

    public abstract float calcularArea ();
}
