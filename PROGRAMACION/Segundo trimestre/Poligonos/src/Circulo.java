public class Circulo extends Poligono {

    public float radio;

    @Override
    public float calcularArea() {
        return (float) (3.1416*(radio*radio));
    }
}
