public abstract class Polygon {
    protected int width;
    protected int height;

    public void set_values (int a, int b) {

        width=a; height=b;}


    public abstract int area(); //obliga a crear los metodos que se heredan en las clases.
}


