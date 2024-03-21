public abstract class Poligono {

    protected int vertices;

    public Poligono(int vertices){
        setVertices(vertices);

    }

    public int getVertices() {

        return vertices;
    }

    public void setVertices(int vertices) {
        if (vertices >= 3){
        this.vertices = vertices;
        }
    }

    public abstract float calcularArea ();
}
