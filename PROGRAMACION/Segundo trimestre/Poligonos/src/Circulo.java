public class Circulo extends Poligono {

    private float radio;

    public Circulo(float radio) {
        super(0);
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio>0) {
            this.radio = radio;
        }
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI*((float)Math.pow(2,radio));
    }
}
